// default package

import android.animation.ValueAnimator;
import android.content.ClipboardManager;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.c;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ge7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ge7(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        lb8 lb8Var;
        int i;
        jlc jlcVar;
        CharSequence text;
        byte b = 18;
        byte b2 = 5;
        byte b3 = 2;
        byte b4 = 0;
        byte b5 = 1;
        switch (this.a) {
            case 0:
                ((oo1) this.c).a(this.b);
                break;
            case 1:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.c;
                int i2 = this.b;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.c.g(i2);
                break;
            case 2:
                ((up7) this.c).a(Integer.valueOf(this.b));
                break;
            case 3:
                ((ls7) this.c).F0(this.b);
                break;
            case 4:
                int i3 = this.b;
                tk5 tk5Var = (tk5) this.c;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", z8c.h(i3).n);
                tk5Var.getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                int i4 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                int i5 = i4 + 1;
                if (i5 < 6 && (lb8Var = photoViewer.f0) != null) {
                    lb8Var.invalidate();
                    gm.d3(new ge7(photoViewer, i5, b2), 100L);
                    break;
                }
                break;
            case 6:
                ac8 ac8Var = (ac8) this.c;
                int i6 = this.b;
                ya8 ya8Var = ac8Var.a;
                TextView textView = ya8Var.e;
                sb sbVar = ya8Var.h;
                RadialProgressView radialProgressView = ya8Var.n;
                TextView textView2 = ya8Var.d;
                textView.setVisibility(8);
                ya8Var.f.setVisibility(8);
                LinearLayout linearLayout = ya8Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new zb8(ac8Var, b4));
                }
                if (sbVar.getAlpha() == 1.0f) {
                    sbVar.animate().cancel();
                    sbVar.animate().alpha(0.0f).setDuration(150L).setListener(new zb8(ac8Var, b5));
                }
                if (i6 != 2) {
                    if (i6 != 5) {
                        if (i6 != 150) {
                            if (i6 == 100) {
                                textView2.setText(jb6.M0(2131742494, null));
                                break;
                            } else if (i6 != 101) {
                            }
                        }
                        textView2.setText(jb6.M0(2131742495, null));
                        textView.setText(jb6.M0(2131742493, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new m67(ac8Var, (byte) 19));
                        break;
                    } else {
                        textView2.setText(jb6.M0(2131742497, null));
                        break;
                    }
                } else {
                    textView2.setText(jb6.M0(2131742496, null));
                    break;
                }
                break;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                int i7 = this.b;
                RectF rectF = ProfileActivity.e7;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                alertDialog$Builder.a.S = jb6.M0(2131746380, null);
                alertDialog$Builder.a.U = jb6.M0(2131746381, null);
                alertDialog$Builder.j(jb6.M0(2131751535, null), new ji(profileActivity, i7, b));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                break;
            case 8:
                kq8 kq8Var = (kq8) this.c;
                int i8 = this.b;
                kq8Var.h.e.getNotificationCenter().n(kq8Var.h.e, nm7.s1);
                ProfileActivity profileActivity2 = kq8Var.h.e;
                if (i8 == 2) {
                    profileActivity2.getMessagesController().p4(0L, "PREMIUM_GRACE");
                    l11.u(kq8Var.getContext(), kq8Var.h.e.getMessagesController().l4.o2.f);
                } else {
                    profileActivity2.getMessagesController().p4(0L, i8 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                kq8Var.h.e.getNotificationCenter().b(kq8Var.h.e, nm7.s1);
                kq8Var.h.e.c4(false, false);
                break;
            case 9:
                gw8 gw8Var = (gw8) this.c;
                int i9 = this.b;
                gm.t1(gw8Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = gw8Var.a;
                    if (b4 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (b4 != 0 && ((i9 != 3 || b4 != 4) && ((i9 != 2 || (b4 != 4 && b4 != 1)) && (i9 != 1 || (b4 != 1 && b4 != 2 && b4 != 3))))) {
                            editTextBoldCursorArr[b4].setText((CharSequence) null);
                        }
                        b4++;
                    }
                }
                break;
            case 10:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                break;
            case 11:
                o09 o09Var = (o09) this.c;
                int i10 = this.b;
                o09Var.W0 = false;
                if (o09Var.X0) {
                    o09Var.x(true);
                    break;
                } else {
                    o09Var.b1 = i10;
                    o09Var.D();
                    o09Var.s();
                    break;
                }
            case 12:
                x39 x39Var = (x39) this.c;
                int i11 = this.b;
                l66 l66Var = x39Var.e;
                try {
                    if (l66Var.getLayout().getLineForOffset(i11) == 0) {
                        l66Var.getEditableText().insert(i11, "\n");
                        break;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
                break;
            case 13:
                md9 md9Var = (md9) this.c;
                int i12 = this.b;
                pd9 pd9Var = md9Var.f;
                if (md9Var.c && pd9Var.F != null && pd9Var.a != null) {
                    md9Var.d = true;
                    md9Var.a.n(false);
                    try {
                        md9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    nd9 nd9Var = pd9Var.F;
                    ll0 ll0Var = pd9Var.a;
                    ch9 ch9Var = ((ug9) nd9Var).a;
                    ch9Var.k3(false);
                    ch9Var.p3.I(new zg9(ch9Var, ll0Var, i12), md9Var);
                    break;
                }
                break;
            case 14:
                km9 km9Var = (km9) this.c;
                int i13 = this.b;
                um9 um9Var = km9Var.N;
                if (um9Var != null && um9Var.s != (i = ((i13 % 360) + 360) % 360)) {
                    um9Var.s = i;
                    um9Var.v();
                    break;
                }
                break;
            case 15:
                int i14 = this.b;
                j5 j5Var = (j5) this.c;
                try {
                    if (i14 == 1) {
                        nm7.e().k(nm7.T4, 1, jb6.M0(2131743520, null));
                    } else if (i14 == 2) {
                        nm7.f(j5Var.a).k(nm7.m5, 6);
                    }
                    break;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
                break;
            case 16:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                sessionsActivity.f.remove(this.b);
                sessionsActivity.r0();
                h9a h9aVar = sessionsActivity.a;
                if (h9aVar != null) {
                    h9aVar.f();
                    break;
                }
                break;
            case 17:
                ConnectionsManager.getInstance(((jva) this.c).a).cancelRequest(this.b, true);
                break;
            case 18:
                n1b n1bVar = (n1b) this.c;
                nm7.f(this.b).k(nm7.u3, Boolean.FALSE);
                n1bVar.h();
                break;
            case 19:
                h4b h4bVar = (h4b) this.c;
                int i15 = this.b;
                ArrayList arrayList = h4bVar.g;
                h4bVar.u(arrayList);
                i01 i01Var = h4bVar.J;
                Collections.sort(arrayList, i01Var);
                ArrayList arrayList2 = h4bVar.h;
                h4bVar.u(arrayList2);
                Collections.sort(arrayList2, i01Var);
                nm7.f(i15).k(nm7.z5, new Object[0]);
                break;
            case 20:
                v9b v9bVar = (v9b) this.c;
                int i16 = this.b;
                int i17 = v9bVar.c;
                v9bVar.j();
                v9bVar.Y1 = false;
                g6b g6bVar = v9bVar.L1;
                File file = g6bVar.O0;
                if (file != null) {
                    file.delete();
                    g6bVar = v9bVar.L1;
                    g6bVar.O0 = null;
                }
                v9bVar.V(g6bVar, true);
                CharSequence[] charSequenceArr = {v9bVar.d1.getText()};
                ArrayList Y = oc7.r1(i17).f5() ? hs6.d0(i17).Y(charSequenceArr, true, true) : new ArrayList();
                ArrayList Y2 = oc7.r1(i17).f5() ? hs6.d0(i17).Y(new CharSequence[]{v9bVar.L1.C0}, true, true) : new ArrayList();
                g6b g6bVar2 = v9bVar.L1;
                g6bVar2.k = (TextUtils.equals(g6bVar2.C0, charSequenceArr[0]) && hs6.M(Y, Y2)) ? false : true;
                v9bVar.L1.C0 = new SpannableString(v9bVar.d1.getText());
                v9bVar.x();
                v9bVar.w();
                g6b g6bVar3 = v9bVar.L1;
                v9bVar.P1 = (g6bVar3 == null || !g6bVar3.K) ? 0 : 1;
                v9bVar.L1 = (g6b) v9bVar.I1.get(i16);
                v9bVar.M(0, 1);
                v9bVar.L(0, 1);
                v9bVar.e1.b.g3.O(false);
                v9bVar.d1.setText(v9bVar.L1.C0);
                break;
            case 21:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                break;
            case 22:
                c2c c2cVar = (c2c) this.c;
                int i18 = this.b;
                c2cVar.Z0();
                c2cVar.b2 = i18;
                s1c.O0(c2cVar.a2);
                c2cVar.a1();
                break;
            case 23:
                Utilities.u(this.b + 1, (qac[]) this.c);
                break;
            case 24:
                ((vgc) this.c).w.z0(this.b);
                break;
            case 25:
                iic iicVar = (iic) this.c;
                int i19 = this.b;
                iicVar.G.setSignalBarCount(i19);
                kkc kkcVar = iicVar.w;
                if (i19 <= 1) {
                    if (kkcVar.W != 3) {
                        kkcVar.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(kkcVar.I, nm7.d4);
                        kkcVar.P = ofInt;
                        ofInt.addUpdateListener(new ikc(kkcVar, b3));
                        kkcVar.P.setDuration(500L);
                        kkcVar.P.start();
                    }
                    iicVar.G.c(true);
                    break;
                } else {
                    if (kkcVar.W != 2) {
                        kkcVar.W = 2;
                        kkcVar.c();
                        ValueAnimator valueAnimator = kkcVar.P;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            kkcVar.P.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(kkcVar.I, 0);
                        kkcVar.P = ofInt2;
                        ofInt2.addUpdateListener(new ikc(kkcVar, b4));
                        kkcVar.P.setDuration(500L);
                        kkcVar.P.start();
                    }
                    iicVar.G.c(false);
                    break;
                }
            case 26:
                jlc jlcVar2 = (jlc) this.c;
                int i20 = this.b;
                glc glcVar = jlcVar2.a;
                if (jlcVar2.p0) {
                    if (i20 == 0) {
                        String trim = glcVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            c cVar = glcVar.b;
                            glcVar.j("edit", true);
                            ChatActivityEnterView chatActivityEnterView = cVar.a;
                            int i21 = ChatActivityEnterView.z7;
                            chatActivityEnterView.E2(trim, null);
                            break;
                        }
                    } else if (i20 == 1) {
                        String trim2 = glcVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            c cVar2 = glcVar.b;
                            glcVar.j("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = cVar2.a;
                            int i22 = ChatActivityEnterView.z7;
                            chatActivityEnterView2.E2(trim2, new mw1(chatActivityEnterView2, (byte) 23));
                            break;
                        }
                    } else if (i20 != 3) {
                        if (i20 != 4) {
                            if (i20 == 5) {
                                c cVar3 = glcVar.b;
                                if (glcVar.c == 2) {
                                    cVar3.e();
                                    yv1 yv1Var = cVar3.a.F3;
                                    if (yv1Var != null) {
                                        yv1Var.presentFragment(new ana());
                                        break;
                                    }
                                }
                            } else {
                                RectF rectF2 = jlcVar2.f1;
                                float f = rectF2.left;
                                float f2 = rectF2.top;
                                float f3 = jlcVar2.j1;
                                new RectF(f, f2 + f3, rectF2.right, rectF2.bottom + f3);
                                if (!glcVar.n.trim().isEmpty() && (jlcVar = glcVar.h) != null) {
                                    c cVar4 = glcVar.b;
                                    alc alcVar = new alc(glcVar, b5);
                                    ChatActivityEnterView chatActivityEnterView3 = cVar4.a;
                                    if (chatActivityEnterView3.F3 != null) {
                                        RectF rectF3 = new RectF();
                                        jlcVar.l(rectF3);
                                        hlc hlcVar = new hlc(jlcVar, jlcVar.getContext(), b5);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                        layoutParams.gravity = 51;
                                        layoutParams.leftMargin = (int) (rectF3.left + jlcVar.getLeft());
                                        layoutParams.topMargin = (int) (rectF3.top + jlcVar.getTop());
                                        hlcVar.setAlpha(0.0f);
                                        chatActivityEnterView3.c2.addView(hlcVar, layoutParams);
                                        hlcVar.post(new da7((Object) cVar4, (Object) hlcVar, (Object) new nl9(jlcVar, b), (Object) alcVar, (Object) jlcVar, (byte) 20));
                                        break;
                                    }
                                }
                            }
                        } else if (glcVar.h != null && glcVar.c == 2) {
                            String[] G = DictationAsr.G();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(jb6.M0(2131744998, null));
                            boolean x = DictationAsr.x();
                            int i23 = x ? 0 : -1;
                            for (int i24 = 0; i24 < G.length; i24++) {
                                arrayList3.add(un3.r(G[i24]));
                                if (!x && i23 < 0 && DictationAsr.z(G[i24])) {
                                    i23 = i24 + 1;
                                }
                            }
                            zkc zkcVar = new zkc(glcVar, G, b4);
                            c cVar5 = glcVar.b;
                            jlc jlcVar3 = glcVar.h;
                            ArrayList w = glc.w(G, x, zkcVar);
                            ChatActivityEnterView chatActivityEnterView4 = cVar5.a;
                            if (chatActivityEnterView4.F3 != null) {
                                RectF rectF4 = new RectF();
                                rectF4.set(jlcVar3.R);
                                if (!rectF4.isEmpty()) {
                                    hlc hlcVar2 = new hlc(jlcVar3, jlcVar3.getContext(), b4);
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF4.width(), (int) rectF4.height());
                                    layoutParams2.gravity = 51;
                                    layoutParams2.leftMargin = (int) (rectF4.left + jlcVar3.getLeft());
                                    layoutParams2.topMargin = (int) (rectF4.top + jlcVar3.getTop());
                                    hlcVar2.setAlpha(0.0f);
                                    chatActivityEnterView4.c2.addView(hlcVar2, layoutParams2);
                                    hlcVar2.post(new qu(cVar5, hlcVar2, new sz4(jlcVar3), arrayList3, w, i23, zkcVar));
                                    break;
                                }
                            }
                        }
                    } else if (glcVar.c == 3 && glcVar.h != null && glcVar.H != null) {
                        Log.d("VoiceLive", "review: back to the text before the style");
                        glcVar.n = glcVar.H;
                        glcVar.H = null;
                        glcVar.h.setStyleIcon(null);
                        glcVar.h.setStyleLabel(null);
                        glcVar.h.r(glcVar.n);
                        break;
                    }
                }
                break;
            case 27:
                ioc iocVar = (ioc) this.c;
                int i25 = this.b;
                gm.c3(new bnc(iocVar, i25, ioc.h(iocVar.R, i25), b5));
                break;
            case 28:
                npc npcVar = (npc) this.c;
                int i26 = this.b;
                if (npcVar.r && !npcVar.y && i26 == npcVar.l0) {
                    npcVar.postDelayed(npcVar.m0, 500L);
                    break;
                }
                break;
            default:
                pqc pqcVar = (pqc) this.c;
                int i27 = this.b;
                ArrayList arrayList4 = pqcVar.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) pqcVar.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i28 = 0; i27 < arrayList4.size() && i28 < split.length; i28++) {
                            ((nsc) arrayList4.get(i27)).setText(split[i28]);
                            i27++;
                        }
                        pqcVar.d0();
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }

    public /* synthetic */ ge7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
