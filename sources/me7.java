// default package

import android.animation.ValueAnimator;
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

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class me7 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ me7(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ad8 ad8Var;
        int i;
        vnc vncVar;
        byte b = 18;
        byte b2 = 6;
        byte b3 = 2;
        int i2 = 0;
        byte b4 = 1;
        switch (this.a) {
            case 0:
                ((cn1) this.c).a(this.b);
                break;
            case 1:
                bn0 bn0Var = (bn0) this.c;
                int i3 = this.b;
                lm7 lm7Var = (lm7) bn0Var.c;
                lm7Var.y0(i3, true);
                if (i3 == 0) {
                    lm7Var.x0();
                    break;
                }
                break;
            case 2:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) this.c;
                int i4 = this.b;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.c.g(i4);
                break;
            case 3:
                ((rq7) this.c).a(Integer.valueOf(this.b));
                break;
            case 4:
                ((ot7) this.c).G0(this.b);
                break;
            case 5:
                int i5 = this.b;
                wk5 wk5Var = (wk5) this.c;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", yac.h(i5).n);
                wk5Var.getLastFragment().presentFragment(new ProfileActivity(bundle, null));
                break;
            case 6:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                int i6 = this.b;
                Drawable[] drawableArr = PhotoViewer.d9;
                int i7 = i6 + 1;
                if (i7 < 6 && (ad8Var = photoViewer.f0) != null) {
                    ad8Var.invalidate();
                    hl.d3(new me7(photoViewer, i7, b2), 100L);
                    break;
                }
                break;
            case 7:
                pd8 pd8Var = (pd8) this.c;
                int i8 = this.b;
                nc8 nc8Var = pd8Var.a;
                TextView textView = nc8Var.e;
                tb tbVar = nc8Var.h;
                RadialProgressView radialProgressView = nc8Var.n;
                TextView textView2 = nc8Var.d;
                textView.setVisibility(8);
                nc8Var.f.setVisibility(8);
                LinearLayout linearLayout = nc8Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new od8(pd8Var, null == true ? 1 : 0));
                }
                if (tbVar.getAlpha() == 1.0f) {
                    tbVar.animate().cancel();
                    tbVar.animate().alpha(0.0f).setDuration(150L).setListener(new od8(pd8Var, b4));
                }
                if (i8 != 2) {
                    if (i8 != 5) {
                        if (i8 != 150) {
                            if (i8 == 100) {
                                textView2.setText(ob6.M0(2131742462, null));
                                break;
                            } else if (i8 != 101) {
                            }
                        }
                        textView2.setText(ob6.M0(2131742463, null));
                        textView.setText(ob6.M0(2131742461, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new am7(pd8Var, (byte) 18));
                        break;
                    } else {
                        textView2.setText(ob6.M0(2131742465, null));
                        break;
                    }
                } else {
                    textView2.setText(ob6.M0(2131742464, null));
                    break;
                }
                break;
            case 8:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                int i9 = this.b;
                RectF rectF = ProfileActivity.Z6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.A0, profileActivity.getParentActivity());
                alertDialog$Builder.a.S = ob6.M0(2131746374, null);
                alertDialog$Builder.a.U = ob6.M0(2131746375, null);
                alertDialog$Builder.j(ob6.M0(2131751563, null), new wg((Object) profileActivity, i9, (byte) 19));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.c(-1);
                alertDialog$Builder.o();
                break;
            case 9:
                vr8 vr8Var = (vr8) this.c;
                int i10 = this.b;
                vr8Var.h.e.getNotificationCenter().n(vr8Var.h.e, jn7.s1);
                ProfileActivity profileActivity2 = vr8Var.h.e;
                if (i10 == 2) {
                    profileActivity2.getMessagesController().v4(0L, "PREMIUM_GRACE");
                    m01.u(vr8Var.getContext(), vr8Var.h.e.getMessagesController().k4.w2.f);
                } else {
                    profileActivity2.getMessagesController().v4(0L, i10 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                vr8Var.h.e.getNotificationCenter().b(vr8Var.h.e, jn7.s1);
                vr8Var.h.e.Z3(false, false);
                break;
            case 10:
                ox8 ox8Var = (ox8) this.c;
                int i11 = this.b;
                hl.t1(ox8Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = ox8Var.a;
                    if (i2 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i2 != 0 && ((i11 != 3 || i2 != 4) && ((i11 != 2 || (i2 != 4 && i2 != 1)) && (i11 != 1 || (i2 != 1 && i2 != 2 && i2 != 3))))) {
                            editTextBoldCursorArr[i2].setText((CharSequence) null);
                        }
                        i2++;
                    }
                }
                break;
            case 11:
                PushListenerController.lambda$processRemoteMessage$2(this.b, (TLRPC.TL_updates) this.c);
                break;
            case 12:
                a29 a29Var = (a29) this.c;
                int i12 = this.b;
                a29Var.W0 = false;
                if (a29Var.X0) {
                    a29Var.x(true);
                    break;
                } else {
                    a29Var.b1 = i12;
                    a29Var.D();
                    a29Var.s();
                    break;
                }
            case 13:
                i59 i59Var = (i59) this.c;
                int i13 = this.b;
                p66 p66Var = i59Var.e;
                try {
                    if (p66Var.getLayout().getLineForOffset(i13) == 0) {
                        p66Var.getEditableText().insert(i13, "\n");
                        break;
                    }
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
                break;
            case 14:
                cf9 cf9Var = (cf9) this.c;
                int i14 = this.b;
                ff9 ff9Var = cf9Var.f;
                if (cf9Var.c && ff9Var.F != null && ff9Var.a != null) {
                    cf9Var.d = true;
                    cf9Var.a.m(false);
                    try {
                        cf9Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    df9 df9Var = ff9Var.F;
                    mk0 mk0Var = ff9Var.a;
                    pi9 pi9Var = ((hi9) df9Var).a;
                    pi9Var.l3(false);
                    pi9Var.p3.S(new mi9(pi9Var, mk0Var, i14), cf9Var);
                    break;
                }
                break;
            case 15:
                xn9 xn9Var = (xn9) this.c;
                int i15 = this.b;
                ho9 ho9Var = xn9Var.N;
                if (ho9Var != null && ho9Var.s != (i = ((i15 % 360) + 360) % 360)) {
                    ho9Var.s = i;
                    ho9Var.v();
                    break;
                }
                break;
            case 16:
                int i16 = this.b;
                k5 k5Var = (k5) this.c;
                try {
                    if (i16 == 1) {
                        jn7.e().k(jn7.S4, 1, ob6.M0(2131743488, null));
                    } else if (i16 == 2) {
                        jn7.f(k5Var.a).k(jn7.l5, 6);
                    }
                    break;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
                break;
            case 17:
                SessionsActivity sessionsActivity = (SessionsActivity) this.c;
                sessionsActivity.f.remove(this.b);
                sessionsActivity.q0();
                xaa xaaVar = sessionsActivity.a;
                if (xaaVar != null) {
                    xaaVar.f();
                    break;
                }
                break;
            case 18:
                ConnectionsManager.getInstance(((jxa) this.c).a).cancelRequest(this.b, true);
                break;
            case 19:
                k3b k3bVar = (k3b) this.c;
                jn7.f(this.b).k(jn7.u3, Boolean.FALSE);
                k3bVar.h();
                break;
            case 20:
                c6b c6bVar = (c6b) this.c;
                int i17 = this.b;
                ArrayList arrayList = c6bVar.g;
                c6bVar.u(arrayList);
                jz0 jz0Var = c6bVar.J;
                Collections.sort(arrayList, jz0Var);
                ArrayList arrayList2 = c6bVar.h;
                c6bVar.u(arrayList2);
                Collections.sort(arrayList2, jz0Var);
                jn7.f(i17).k(jn7.y5, new Object[0]);
                break;
            case 21:
                rbb rbbVar = (rbb) this.c;
                int i18 = this.b;
                int i19 = rbbVar.c;
                rbbVar.j();
                rbbVar.Y1 = false;
                c8b c8bVar = rbbVar.L1;
                File file = c8bVar.O0;
                if (file != null) {
                    file.delete();
                    c8bVar = rbbVar.L1;
                    c8bVar.O0 = null;
                }
                rbbVar.V(c8bVar, true);
                CharSequence[] charSequenceArr = {rbbVar.d1.getText()};
                ArrayList Y = uc7.s1(i19).l5() ? ls6.d0(i19).Y(charSequenceArr, true, true) : new ArrayList();
                ArrayList Y2 = uc7.s1(i19).l5() ? ls6.d0(i19).Y(new CharSequence[]{rbbVar.L1.C0}, true, true) : new ArrayList();
                c8b c8bVar2 = rbbVar.L1;
                c8bVar2.k = (TextUtils.equals(c8bVar2.C0, charSequenceArr[0]) && ls6.M(Y, Y2)) ? false : true;
                rbbVar.L1.C0 = new SpannableString(rbbVar.d1.getText());
                rbbVar.x();
                rbbVar.w();
                c8b c8bVar3 = rbbVar.L1;
                rbbVar.P1 = (c8bVar3 == null || !c8bVar3.K) ? 0 : 1;
                rbbVar.L1 = (c8b) rbbVar.I1.get(i18);
                rbbVar.M(0, 1);
                rbbVar.L(0, 1);
                rbbVar.e1.b.g3.O(false);
                rbbVar.d1.setText(rbbVar.L1.C0);
                break;
            case 22:
                ((SurfaceTextureHelper) this.c).lambda$setFrameRotation$4(this.b);
                break;
            case 23:
                b4c b4cVar = (b4c) this.c;
                int i20 = this.b;
                b4cVar.a1();
                b4cVar.b2 = i20;
                r3c.P0(b4cVar.a2);
                b4cVar.b1();
                break;
            case 24:
                Utilities.u(this.b + 1, (pcc[]) this.c);
                break;
            case 25:
                ((uic) this.c).w.A0(this.b);
                break;
            case 26:
                mkc mkcVar = (mkc) this.c;
                int i21 = this.b;
                mkcVar.G.setSignalBarCount(i21);
                wmc wmcVar = mkcVar.w;
                if (i21 <= 1) {
                    if (wmcVar.W != 3) {
                        wmcVar.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(wmcVar.I, jn7.d4);
                        wmcVar.P = ofInt;
                        ofInt.addUpdateListener(new umc(wmcVar, b3));
                        wmcVar.P.setDuration(500L);
                        wmcVar.P.start();
                    }
                    mkcVar.G.c(true);
                    break;
                } else {
                    if (wmcVar.W != 2) {
                        wmcVar.W = 2;
                        wmcVar.c();
                        ValueAnimator valueAnimator = wmcVar.P;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            wmcVar.P.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(wmcVar.I, 0);
                        wmcVar.P = ofInt2;
                        ofInt2.addUpdateListener(new umc(wmcVar, null == true ? 1 : 0));
                        wmcVar.P.setDuration(500L);
                        wmcVar.P.start();
                    }
                    mkcVar.G.c(false);
                    break;
                }
            case 27:
                vnc vncVar2 = (vnc) this.c;
                int i22 = this.b;
                snc sncVar = vncVar2.a;
                if (vncVar2.q0) {
                    if (i22 == 0) {
                        String trim = sncVar.n.trim();
                        if (!trim.isEmpty()) {
                            Log.d("VoiceLive", "Edit: " + trim.length() + " chars → field");
                            c cVar = sncVar.b;
                            sncVar.k("edit", true);
                            ChatActivityEnterView chatActivityEnterView = cVar.a;
                            int i23 = ChatActivityEnterView.X7;
                            chatActivityEnterView.N2(trim, null);
                            break;
                        }
                    } else if (i22 == 1) {
                        String trim2 = sncVar.n.trim();
                        if (!trim2.isEmpty()) {
                            Log.d("VoiceLive", "Send: " + trim2.length() + " chars as text");
                            c cVar2 = sncVar.b;
                            sncVar.k("send", true);
                            ChatActivityEnterView chatActivityEnterView2 = cVar2.a;
                            int i24 = ChatActivityEnterView.X7;
                            chatActivityEnterView2.N2(trim2, new mv1(chatActivityEnterView2, (byte) 21));
                            break;
                        }
                    } else if (i22 != 3) {
                        if (i22 != 4) {
                            if (i22 == 5) {
                                c cVar3 = sncVar.b;
                                if (sncVar.c == 2) {
                                    cVar3.e();
                                    zu1 zu1Var = cVar3.a.E3;
                                    if (zu1Var != null) {
                                        zu1Var.presentFragment(new woa());
                                        break;
                                    }
                                }
                            } else {
                                RectF rectF2 = vncVar2.g1;
                                float f = rectF2.left;
                                float f2 = rectF2.top;
                                float f3 = vncVar2.k1;
                                new RectF(f, f2 + f3, rectF2.right, rectF2.bottom + f3);
                                if (!sncVar.n.trim().isEmpty() && (vncVar = sncVar.h) != null) {
                                    c cVar4 = sncVar.b;
                                    mnc mncVar = new mnc(sncVar, b4);
                                    ChatActivityEnterView chatActivityEnterView3 = cVar4.a;
                                    if (chatActivityEnterView3.E3 != null) {
                                        RectF rectF3 = new RectF();
                                        vncVar.l(rectF3);
                                        tnc tncVar = new tnc(vncVar, vncVar.getContext(), b4);
                                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) rectF3.width(), (int) rectF3.height());
                                        layoutParams.gravity = 51;
                                        layoutParams.leftMargin = (int) (rectF3.left + vncVar.getLeft());
                                        layoutParams.topMargin = (int) (rectF3.top + vncVar.getTop());
                                        tncVar.setAlpha(0.0f);
                                        chatActivityEnterView3.b2.addView(tncVar, layoutParams);
                                        tncVar.post(new la7((Object) cVar4, (Object) tncVar, (Object) new zm9(vncVar, b), (Object) mncVar, (Object) vncVar, (byte) 21));
                                        break;
                                    }
                                }
                            }
                        } else if (sncVar.h != null && sncVar.c == 2) {
                            String[] I = DictationAsr.I();
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(ob6.M0(2131744990, null));
                            boolean y = DictationAsr.y();
                            int i25 = y ? 0 : -1;
                            for (int i26 = 0; i26 < I.length; i26++) {
                                arrayList3.add(bn3.t(I[i26]));
                                if (!y && i25 < 0 && DictationAsr.A(I[i26])) {
                                    i25 = i26 + 1;
                                }
                            }
                            nnc nncVar = new nnc(sncVar, I, b4);
                            c cVar5 = sncVar.b;
                            vnc vncVar3 = sncVar.h;
                            ArrayList x = snc.x(I, y, nncVar);
                            ChatActivityEnterView chatActivityEnterView4 = cVar5.a;
                            if (chatActivityEnterView4.E3 != null) {
                                RectF rectF4 = new RectF();
                                rectF4.set(vncVar3.R);
                                if (!rectF4.isEmpty()) {
                                    tnc tncVar2 = new tnc(vncVar3, vncVar3.getContext(), null == true ? 1 : 0);
                                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) rectF4.width(), (int) rectF4.height());
                                    layoutParams2.gravity = 51;
                                    layoutParams2.leftMargin = (int) (rectF4.left + vncVar3.getLeft());
                                    layoutParams2.topMargin = (int) (rectF4.top + vncVar3.getTop());
                                    tncVar2.setAlpha(0.0f);
                                    chatActivityEnterView4.b2.addView(tncVar2, layoutParams2);
                                    tncVar2.post(new st(cVar5, tncVar2, new wz4(vncVar3), arrayList3, x, i25, nncVar));
                                    break;
                                }
                            }
                        }
                    } else if (sncVar.c == 3 && sncVar.h != null && sncVar.H != null) {
                        Log.d("VoiceLive", "review: back to the text before the style");
                        sncVar.n = sncVar.H;
                        sncVar.H = null;
                        sncVar.h.setStyleIcon(null);
                        sncVar.h.setStyleLabel(null);
                        sncVar.h.r(sncVar.n);
                        break;
                    }
                }
                break;
            case 28:
                wqc wqcVar = (wqc) this.c;
                int i27 = this.b;
                hl.c3(new mpc(wqcVar, i27, wqc.h(wqcVar.R, i27), b3));
                break;
            default:
                yrc yrcVar = (yrc) this.c;
                int i28 = this.b;
                if (yrcVar.r && !yrcVar.y && i28 == yrcVar.l0) {
                    yrcVar.postDelayed(yrcVar.m0, 500L);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ me7(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
