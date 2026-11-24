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
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.webrtc.SurfaceTextureHelper;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class on7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ on7(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        k98 k98Var;
        int i;
        jjc jjcVar;
        CharSequence text;
        byte b = 18;
        byte b2 = 3;
        byte b3 = 2;
        byte b4 = 0;
        byte b5 = 1;
        switch (this.a) {
            case 0:
                ((rn7) this.c).a(Integer.valueOf(this.b));
                break;
            case 1:
                ((iq7) this.c).F0(this.b);
                break;
            case 2:
                int i2 = this.b;
                ui5 ui5Var = (ui5) this.c;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", y6c.h(i2).n);
                ui5Var.getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                int i3 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                int i4 = i3 + 1;
                if (i4 < 6 && (k98Var = photoViewer.f0) != null) {
                    k98Var.invalidate();
                    gl.d3(new on7(photoViewer, i4, b2), 100L);
                    break;
                }
                break;
            case 4:
                z98 z98Var = (z98) this.c;
                int i5 = this.b;
                x88 x88Var = z98Var.a;
                TextView textView = x88Var.e;
                sb sbVar = x88Var.h;
                RadialProgressView radialProgressView = x88Var.n;
                TextView textView2 = x88Var.d;
                textView.setVisibility(8);
                x88Var.f.setVisibility(8);
                LinearLayout linearLayout = x88Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new y98(z98Var, b4));
                }
                if (sbVar.getAlpha() == 1.0f) {
                    sbVar.animate().cancel();
                    sbVar.animate().alpha(0.0f).setDuration(150L).setListener(new y98(z98Var, b5));
                }
                if (i5 != 2) {
                    if (i5 != 5) {
                        if (i5 != 150) {
                            if (i5 == 100) {
                                textView2.setText(k96.M0(2131742568, null));
                                break;
                            } else if (i5 != 101) {
                            }
                        }
                        textView2.setText(k96.M0(2131742569, null));
                        textView.setText(k96.M0(2131742567, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new fr7(z98Var, (byte) 16));
                        break;
                    } else {
                        textView2.setText(k96.M0(2131742571, null));
                        break;
                    }
                } else {
                    textView2.setText(k96.M0(2131742570, null));
                    break;
                }
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                int i6 = this.b;
                RectF rectF = ProfileActivity.Z6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                alertDialog$Builder.a.S = k96.M0(2131746454, null);
                alertDialog$Builder.a.U = k96.M0(2131746455, null);
                alertDialog$Builder.j(k96.M0(2131751586, null), new jh(profileActivity, i6, b));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                break;
            case 6:
                jo8 jo8Var = (jo8) this.c;
                int i7 = this.b;
                jo8Var.h.e.getNotificationCenter().n(jo8Var.h.e, kk7.r1);
                ProfileActivity profileActivity2 = jo8Var.h.e;
                if (i7 == 2) {
                    profileActivity2.getMessagesController().n4(0L, "PREMIUM_GRACE");
                    d01.t(jo8Var.getContext(), jo8Var.h.e.getMessagesController().k4.o2.f);
                } else {
                    profileActivity2.getMessagesController().n4(0L, i7 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                jo8Var.h.e.getNotificationCenter().b(jo8Var.h.e, kk7.r1);
                jo8Var.h.e.Y3(false, false);
                break;
            case 7:
                fu8 fu8Var = (fu8) this.c;
                int i8 = this.b;
                gl.t1(fu8Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = fu8Var.a;
                    if (b4 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (b4 != 0 && ((i8 != 3 || b4 != 4) && ((i8 != 2 || (b4 != 4 && b4 != 1)) && (i8 != 1 || (b4 != 1 && b4 != 2 && b4 != 3))))) {
                            editTextBoldCursorArr[b4].setText((CharSequence) null);
                        }
                        b4++;
                    }
                }
                break;
            case 8:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                break;
            case 9:
                ny8 ny8Var = (ny8) this.c;
                int i9 = this.b;
                ny8Var.W0 = false;
                if (ny8Var.X0) {
                    ny8Var.x(true);
                    break;
                } else {
                    ny8Var.b1 = i9;
                    ny8Var.D();
                    ny8Var.s();
                    break;
                }
            case 10:
                t19 t19Var = (t19) this.c;
                int i10 = this.b;
                l46 l46Var = t19Var.e;
                try {
                    if (l46Var.getLayout().getLineForOffset(i10) == 0) {
                        l46Var.getEditableText().insert(i10, "\n");
                        break;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
                break;
            case 11:
                mb9 mb9Var = (mb9) this.c;
                int i11 = this.b;
                pb9 pb9Var = mb9Var.f;
                if (mb9Var.c && pb9Var.F != null && pb9Var.a != null) {
                    mb9Var.d = true;
                    mb9Var.a.m(false);
                    try {
                        mb9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    nb9 nb9Var = pb9Var.F;
                    lk0 lk0Var = pb9Var.a;
                    ye9 ye9Var = ((qe9) nb9Var).a;
                    ye9Var.k3(false);
                    ye9Var.p3.P(new ve9(ye9Var, lk0Var, i11), mb9Var);
                    break;
                }
                break;
            case 12:
                jk9 jk9Var = (jk9) this.c;
                int i12 = this.b;
                tk9 tk9Var = jk9Var.N;
                if (tk9Var != null && tk9Var.s != (i = ((i12 % 360) + 360) % 360)) {
                    tk9Var.s = i;
                    tk9Var.v();
                    break;
                }
                break;
            case 13:
                int i13 = this.b;
                j5 j5Var = (j5) this.c;
                try {
                    if (i13 == 1) {
                        kk7.e().k(kk7.R4, 1, k96.M0(2131743594, null));
                    } else if (i13 == 2) {
                        kk7.f(j5Var.a).k(kk7.k5, 6);
                    }
                    break;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
                break;
            case 14:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                sessionsActivity.f.remove(this.b);
                sessionsActivity.q0();
                g7a g7aVar = sessionsActivity.a;
                if (g7aVar != null) {
                    g7aVar.f();
                    break;
                }
                break;
            case 15:
                ConnectionsManager.getInstance(((gta) this.c).a).cancelRequest(this.b, true);
                break;
            case 16:
                mza mzaVar = (mza) this.c;
                kk7.f(this.b).k(kk7.t3, Boolean.FALSE);
                mzaVar.h();
                break;
            case 17:
                g2b g2bVar = (g2b) this.c;
                int i14 = this.b;
                ArrayList arrayList = g2bVar.g;
                g2bVar.u(arrayList);
                bz0 bz0Var = g2bVar.J;
                Collections.sort(arrayList, bz0Var);
                ArrayList arrayList2 = g2bVar.h;
                g2bVar.u(arrayList2);
                Collections.sort(arrayList2, bz0Var);
                kk7.f(i14).k(kk7.x5, new Object[0]);
                break;
            case 18:
                t7b t7bVar = (t7b) this.c;
                int i15 = this.b;
                int i16 = t7bVar.c;
                t7bVar.j();
                t7bVar.Y1 = false;
                f4b f4bVar = t7bVar.L1;
                File file = f4bVar.O0;
                if (file != null) {
                    file.delete();
                    f4bVar = t7bVar.L1;
                    f4bVar.O0 = null;
                }
                t7bVar.V(f4bVar, true);
                CharSequence[] charSequenceArr = {t7bVar.d1.getText()};
                ArrayList Y = na7.q1(i16).d5() ? hq6.d0(i16).Y(charSequenceArr, true, true) : new ArrayList();
                ArrayList Y2 = na7.q1(i16).d5() ? hq6.d0(i16).Y(new CharSequence[]{t7bVar.L1.C0}, true, true) : new ArrayList();
                f4b f4bVar2 = t7bVar.L1;
                f4bVar2.k = (TextUtils.equals(f4bVar2.C0, charSequenceArr[0]) && hq6.M(Y, Y2)) ? false : true;
                t7bVar.L1.C0 = new SpannableString(t7bVar.d1.getText());
                t7bVar.x();
                t7bVar.w();
                f4b f4bVar3 = t7bVar.L1;
                t7bVar.P1 = (f4bVar3 == null || !f4bVar3.K) ? 0 : 1;
                t7bVar.L1 = (f4b) t7bVar.I1.get(i15);
                t7bVar.M(0, 1);
                t7bVar.L(0, 1);
                t7bVar.e1.b.g3.O(false);
                t7bVar.d1.setText(t7bVar.L1.C0);
                break;
            case 19:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                break;
            case 20:
                c0c c0cVar = (c0c) this.c;
                int i17 = this.b;
                c0cVar.Z0();
                c0cVar.b2 = i17;
                rzb.O0(c0cVar.a2);
                c0cVar.a1();
                break;
            case 21:
                Utilities.u(this.b + 1, (p8c[]) this.c);
                break;
            case 22:
                ((vec) this.c).w.z0(this.b);
                break;
            case 23:
                hgc hgcVar = (hgc) this.c;
                int i18 = this.b;
                hgcVar.G.setSignalBarCount(i18);
                kic kicVar = hgcVar.w;
                if (i18 <= 1) {
                    if (kicVar.W != 3) {
                        kicVar.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(kicVar.I, kk7.d4);
                        kicVar.P = ofInt;
                        ofInt.addUpdateListener(new iic(kicVar, b3));
                        kicVar.P.setDuration(500L);
                        kicVar.P.start();
                    }
                    hgcVar.G.c(true);
                    break;
                } else {
                    if (kicVar.W != 2) {
                        kicVar.W = 2;
                        kicVar.c();
                        ValueAnimator valueAnimator = kicVar.P;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            kicVar.P.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(kicVar.I, 0);
                        kicVar.P = ofInt2;
                        ofInt2.addUpdateListener(new iic(kicVar, b4));
                        kicVar.P.setDuration(500L);
                        kicVar.P.start();
                    }
                    hgcVar.G.c(false);
                    break;
                }
            case 24:
                jjc jjcVar2 = (jjc) this.c;
                int i19 = this.b;
                gjc gjcVar = jjcVar2.a;
                if (jjcVar2.p0) {
                    if (i19 == 0) {
                        String trim = gjcVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            c cVar = gjcVar.b;
                            gjcVar.j("edit", true);
                            ChatActivityEnterView chatActivityEnterView = cVar.a;
                            int i20 = ChatActivityEnterView.r7;
                            chatActivityEnterView.z2(trim, null);
                            break;
                        }
                    } else if (i19 == 1) {
                        String trim2 = gjcVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            c cVar2 = gjcVar.b;
                            gjcVar.j("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = cVar2.a;
                            int i21 = ChatActivityEnterView.r7;
                            chatActivityEnterView2.z2(trim2, new av1(chatActivityEnterView2, (byte) 20));
                            break;
                        }
                    } else if (i19 != 3) {
                        if (i19 != 4) {
                            if (i19 == 5) {
                                c cVar3 = gjcVar.b;
                                if (gjcVar.c == 2) {
                                    cVar3.e();
                                    mu1 mu1Var = cVar3.a.F3;
                                    if (mu1Var != null) {
                                        mu1Var.presentFragment(new zka());
                                        break;
                                    }
                                }
                            } else {
                                RectF rectF2 = jjcVar2.f1;
                                float f = rectF2.left;
                                float f2 = rectF2.top;
                                float f3 = jjcVar2.j1;
                                new RectF(f, f2 + f3, rectF2.right, rectF2.bottom + f3);
                                if (!gjcVar.n.trim().isEmpty() && (jjcVar = gjcVar.h) != null) {
                                    c cVar4 = gjcVar.b;
                                    ajc ajcVar = new ajc(gjcVar, b5);
                                    ChatActivityEnterView chatActivityEnterView3 = cVar4.a;
                                    if (chatActivityEnterView3.F3 != null) {
                                        RectF rectF3 = new RectF();
                                        jjcVar.l(rectF3);
                                        hjc hjcVar = new hjc(jjcVar, jjcVar.getContext(), b5);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                        layoutParams.gravity = 51;
                                        layoutParams.leftMargin = (int) (rectF3.left + jjcVar.getLeft());
                                        layoutParams.topMargin = (int) (rectF3.top + jjcVar.getTop());
                                        hjcVar.setAlpha(0.0f);
                                        chatActivityEnterView3.c2.addView(hjcVar, layoutParams);
                                        hjcVar.post(new b87((Object) cVar4, (Object) hjcVar, (Object) new i4d(jjcVar), (Object) ajcVar, (Object) jjcVar, (byte) 20));
                                        break;
                                    }
                                }
                            }
                        } else if (gjcVar.h != null && gjcVar.c == 2) {
                            String[] G = DictationAsr.G();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(k96.M0(2131745072, null));
                            boolean x = DictationAsr.x();
                            int i22 = x ? 0 : -1;
                            for (int i23 = 0; i23 < G.length; i23++) {
                                arrayList3.add(jm3.r(G[i23]));
                                if (!x && i22 < 0 && DictationAsr.z(G[i23])) {
                                    i22 = i23 + 1;
                                }
                            }
                            zic zicVar = new zic(gjcVar, G, b4);
                            c cVar5 = gjcVar.b;
                            jjc jjcVar3 = gjcVar.h;
                            ArrayList w = gjc.w(G, x, zicVar);
                            ChatActivityEnterView chatActivityEnterView4 = cVar5.a;
                            if (chatActivityEnterView4.F3 != null) {
                                RectF rectF4 = new RectF();
                                rectF4.set(jjcVar3.R);
                                if (!rectF4.isEmpty()) {
                                    hjc hjcVar2 = new hjc(jjcVar3, jjcVar3.getContext(), b4);
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF4.width(), (int) rectF4.height());
                                    layoutParams2.gravity = 51;
                                    layoutParams2.leftMargin = (int) (rectF4.left + jjcVar3.getLeft());
                                    layoutParams2.topMargin = (int) (rectF4.top + jjcVar3.getTop());
                                    hjcVar2.setAlpha(0.0f);
                                    chatActivityEnterView4.c2.addView(hjcVar2, layoutParams2);
                                    hjcVar2.post(new qt(cVar5, hjcVar2, new lj9(jjcVar3, b), arrayList3, w, i22, zicVar));
                                    break;
                                }
                            }
                        }
                    } else if (gjcVar.c == 3 && gjcVar.h != null && gjcVar.H != null) {
                        Log.d("VoiceLive", "review: back to the text before the style");
                        gjcVar.n = gjcVar.H;
                        gjcVar.H = null;
                        gjcVar.h.setStyleIcon(null);
                        gjcVar.h.setStyleLabel(null);
                        gjcVar.h.r(gjcVar.n);
                        break;
                    }
                }
                break;
            case 25:
                jmc jmcVar = (jmc) this.c;
                int i24 = this.b;
                gl.c3(new clc(jmcVar, i24, jmc.h(jmcVar.R, i24), b5));
                break;
            case 26:
                lnc lncVar = (lnc) this.c;
                int i25 = this.b;
                if (lncVar.r && !lncVar.y && i25 == lncVar.l0) {
                    lncVar.postDelayed(lncVar.m0, 500L);
                    break;
                }
                break;
            case 27:
                noc nocVar = (noc) this.c;
                int i26 = this.b;
                ArrayList arrayList4 = nocVar.w;
                try {
                    ClipboardManager clipboardManager = (ClipboardManager) nocVar.getParentActivity().getSystemService("clipboard");
                    if (clipboardManager != null && clipboardManager.getPrimaryClip() != null && clipboardManager.getPrimaryClip().getItemCount() != 0 && (text = clipboardManager.getPrimaryClip().getItemAt(0).getText()) != null) {
                        String[] split = text.toString().trim().toLowerCase().split("\\s+");
                        for (int i27 = 0; i26 < arrayList4.size() && i27 < split.length; i27++) {
                            ((lqc) arrayList4.get(i26)).setText(split[i27]);
                            i26++;
                        }
                        nocVar.c0();
                        break;
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 28:
                ypc ypcVar = (ypc) this.c;
                int i28 = this.b;
                if (!ypcVar.r && i28 == ypcVar.K) {
                    ypcVar.M = false;
                    ypcVar.a.g3.O(true);
                    break;
                }
                break;
            default:
                stc stcVar = (stc) this.c;
                int i29 = this.b;
                lbc lbcVar = stcVar.a;
                if (i29 == -1) {
                    if (lbcVar.c0()) {
                        lbcVar.f0();
                        stcVar.n();
                    }
                    stcVar.K = false;
                    break;
                } else if (i29 == 1) {
                    if (stcVar.L) {
                        stcVar.L = false;
                        lbcVar.g0();
                        break;
                    }
                } else if (i29 != -3 && i29 == -2 && lbcVar.c0()) {
                    stcVar.L = true;
                    lbcVar.f0();
                    stcVar.n();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ on7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
