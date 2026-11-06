package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Intro;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ec1;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r2(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence X2;
        int i7;
        int i10;
        org.telegram.ui.oq0 oq0Var;
        int i11 = this.a;
        int i12 = 6;
        int i13 = 17;
        int i14 = 2;
        int i15 = 0;
        Object obj = this.c;
        int i16 = this.b;
        switch (i11) {
            case 0:
                w70 w70Var = (w70) obj;
                ArrayList v = org.telegram.messenger.g5.r(i16).v(11);
                String M0 = org.telegram.messenger.hd.M0(2131751242, null);
                if (v != null && !v.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < v.size()) {
                            if (v.get(i17) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.hd.M0(2131751242, null);
                            } else {
                                if ((v.get(i17) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i17) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    M0 = org.telegram.messenger.hd.M0(2131751243, null);
                                }
                                i17++;
                            }
                        }
                    }
                }
                w70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(M0, new f1(i15, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                break;
            case 1:
                ((org.telegram.messenger.re) obj).t(i16);
                break;
            case 2:
                uc ucVar = (uc) obj;
                fi.m3 m3Var = ucVar.c1;
                if (ucVar.a1 != i16) {
                    ucVar.setTimer(i16);
                    org.telegram.messenger.c20 c20Var = ucVar.q1;
                    if (c20Var != null) {
                        c20Var.a(Integer.valueOf(i16));
                    }
                    if (i16 == 0) {
                        X2 = org.telegram.messenger.hd.M0(ucVar.p1 ? 2131744129 : 2131744134, null);
                        m3Var.h = ucVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.e0 = org.telegram.messenger.g0.L(0);
                        m3Var.d0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 == Integer.MAX_VALUE) {
                        X2 = org.telegram.messenger.hd.M0(ucVar.p1 ? 2131744128 : 2131744133, null);
                        m3Var.h = ucVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.e0 = org.telegram.messenger.g0.L(0);
                        m3Var.d0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 > 0) {
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i16, ucVar.p1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                        m3Var.r(true);
                        m3Var.h = fi.m3.a(X2, m3Var.getTextPaint());
                        m3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                        m3Var.e0 = org.telegram.messenger.g0.L(2);
                        m3Var.d0 = 0.0f;
                    }
                    m3Var.setTranslationY(((-Math.min(org.telegram.messenger.g0.L(34.0f), ucVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f)) * (ucVar instanceof org.telegram.ui.zo0 ? -1.0f : 1.0f));
                    m3Var.u(X2);
                    zg0 zg0Var = new zg0(i16 > 0 ? R.raw.fire_on : R.raw.fire_off, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    zg0Var.start();
                    m3Var.m(zg0Var);
                    m3Var.w();
                    ucVar.n1 = false;
                    org.telegram.messenger.g0.r(ucVar.o1);
                    ucVar.invalidate();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i16 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                mf mfVar = chatActivityEnterView.U0;
                if (mfVar != null) {
                    if (chatActivityEnterView.h5 == null) {
                        mfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                wf wfVar = chatActivityEnterView.Z2;
                if (wfVar != null) {
                    wfVar.w(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 4:
                am amVar = (am) obj;
                bm bmVar = amVar.P;
                if (i16 == amVar.O && bmVar.x.isShown()) {
                    bmVar.x.d(1, true);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj;
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    v2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i16);
                    T.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 6:
                gy gyVar = (gy) obj;
                if (gyVar.P1) {
                    hx hxVar = gyVar.t1;
                    if (hxVar != null && hxVar.k()) {
                        try {
                            gyVar.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    gyVar.Q1 = true;
                    int max = Math.max(50, i16 - 100);
                    org.telegram.messenger.g0.i3(new r2(gyVar, max, i12), max);
                    break;
                }
                break;
            case 7:
                ((h90) obj).b.a(Integer.valueOf(i16));
                break;
            case 8:
                zd0 zd0Var = (zd0) obj;
                org.telegram.ui.bq0 bq0Var = zd0Var.a;
                TextView textView = bq0Var.e;
                bi.ec ecVar = bq0Var.h;
                RadialProgressView radialProgressView = bq0Var.n;
                TextView textView2 = bq0Var.d;
                textView.setVisibility(8);
                bq0Var.f.setVisibility(8);
                LinearLayout linearLayout = bq0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new yd0(zd0Var, i15));
                }
                if (ecVar.getAlpha() == 1.0f) {
                    ecVar.animate().cancel();
                    ecVar.animate().alpha(0.0f).setDuration(150L).setListener(new yd0(zd0Var, 1));
                }
                if (i16 != 2) {
                    if (i16 != 5) {
                        if (i16 != 150) {
                            if (i16 == 100) {
                                textView2.setText(org.telegram.messenger.hd.M0(2131742832, null));
                                break;
                            } else if (i16 != 101) {
                            }
                        }
                        textView2.setText(org.telegram.messenger.hd.M0(2131742833, null));
                        textView.setText(org.telegram.messenger.hd.M0(2131742831, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new la0(zd0Var, 4));
                        break;
                    } else {
                        textView2.setText(org.telegram.messenger.hd.M0(2131742835, null));
                        break;
                    }
                } else {
                    textView2.setText(org.telegram.messenger.hd.M0(2131742834, null));
                    break;
                }
                break;
            case 9:
                xg0 xg0Var = (xg0) obj;
                xg0Var.V0 = false;
                if (xg0Var.W0) {
                    xg0Var.C(true);
                    break;
                } else {
                    xg0Var.a1 = i16;
                    xg0Var.I();
                    xg0Var.x();
                    break;
                }
            case 10:
                p21 p21Var = (p21) obj;
                p21Var.e1();
                p21Var.Y1 = i16;
                e21.S0(p21Var.X1);
                p21Var.f1();
                break;
            case 11:
                ((o61) obj).w.y0(i16);
                break;
            case 12:
                f71 f71Var = (f71) obj;
                n51 n51Var = f71Var.a;
                if (i16 == -1) {
                    if (n51Var.d0()) {
                        n51Var.g0();
                        f71Var.n();
                    }
                    f71Var.J = false;
                    break;
                } else if (i16 == 1) {
                    if (f71Var.K) {
                        f71Var.K = false;
                        n51Var.h0();
                        break;
                    }
                } else if (i16 != -3 && i16 == -2 && n51Var.d0()) {
                    f71Var.K = true;
                    n51Var.g0();
                    f71Var.n();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i16);
                    c40Var.p5 = Integer.valueOf(i16);
                }
                hc hcVar = new hc(c40Var.E, new di.i0());
                Resources resources = c40Var.getContext().getResources();
                if (i16 == 2) {
                    i7 = R.drawable.msg_voice_bluetooth;
                } else if (i16 == 0) {
                    i7 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i7 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                hcVar.M(resources.getDrawable(i7).mutate(), org.telegram.ui.c40.j1(i16)).k(c40Var.q1());
                break;
            case 14:
                org.telegram.ui.c40 c40Var2 = ((org.telegram.ui.h30) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i16);
                    c40Var2.p5 = Integer.valueOf(i16);
                }
                hc hcVar2 = new hc(c40Var2.E, new di.i0());
                Resources resources2 = c40Var2.getContext().getResources();
                if (i16 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i16 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                hcVar2.M(resources2.getDrawable(i10).mutate(), org.telegram.ui.c40.j1(i16)).k(c40Var2.q1());
                break;
            case 15:
                org.telegram.ui.w40 w40Var = (org.telegram.ui.w40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = w40Var.n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = w40Var.n.getChildAt(i18);
                    w40Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i16) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(w40Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / w40Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 16:
                org.telegram.ui.t50 t50Var = (org.telegram.ui.t50) obj;
                int i19 = org.telegram.ui.t50.D;
                t50Var.a(R.drawable.intro_powerful_mask, 17, i16, true);
                t50Var.c();
                t50Var.b(t50Var.w, 23, true);
                t50Var.d();
                Intro.a(i16);
                break;
            case 17:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) obj;
                pa0Var.U.h1(0, -org.telegram.messenger.g0.L(i16));
                pa0Var.K0(false);
                break;
            case 18:
                ((org.telegram.ui.ob0) obj).a.f[i16].C(1.0f);
                break;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.g(i16);
                break;
            case 20:
                ((org.telegram.ui.yh0) obj).a(Integer.valueOf(i16));
                break;
            case 21:
                ((org.telegram.ui.ul0) obj).e.p0.I.E(1 - i16);
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                int i20 = i16 + 1;
                if (i20 < 6 && (oq0Var = photoViewer.e0) != null) {
                    oq0Var.invalidate();
                    org.telegram.messenger.g0.i3(new r2(photoViewer, i20, 22), 100L);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.S6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                String M02 = org.telegram.messenger.hd.M0(2131746646, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M02;
                u1Var.T = org.telegram.messenger.hd.M0(2131746647, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new l2.q(profileActivity, i16, i13));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 24:
                org.telegram.ui.iw0 iw0Var = (org.telegram.ui.iw0) obj;
                ProfileActivity profileActivity2 = iw0Var.h.e;
                profileActivity2.getNotificationCenter().n(profileActivity2, org.telegram.messenger.qs.s1);
                if (i16 == 2) {
                    profileActivity2.getMessagesController().k4(0L, "PREMIUM_GRACE");
                    vf.c.t(iw0Var.getContext(), profileActivity2.getMessagesController().L5);
                } else {
                    profileActivity2.getMessagesController().k4(0L, i16 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, org.telegram.messenger.qs.s1);
                profileActivity2.D5(false, false);
                break;
            case 25:
                org.telegram.ui.ux0 ux0Var = (org.telegram.ui.ux0) obj;
                org.telegram.messenger.g0.v1(ux0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = ux0Var.a;
                    if (i15 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i15 != 0 && ((i16 != 3 || i15 != 4) && ((i16 != 2 || (i15 != 4 && i15 != 1)) && (i16 != 1 || (i15 != 1 && i15 != 2 && i15 != 3))))) {
                            editTextBoldCursorArr[i15].setText((CharSequence) null);
                        }
                        i15++;
                    }
                }
                break;
            case 26:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f.remove(i16);
                sessionsActivity.r0();
                org.telegram.ui.y21 y21Var = sessionsActivity.a;
                if (y21Var != null) {
                    y21Var.f();
                    break;
                }
                break;
            case 27:
                ec1 ec1Var = (ec1) obj;
                ec1Var.F.setSignalBarCount(i16);
                if (i16 <= 1) {
                    org.telegram.ui.Components.voip.u2 u2Var = ec1Var.w;
                    if (u2Var.V != 3) {
                        u2Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(u2Var.H, org.telegram.messenger.qs.e4);
                        u2Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.s2(u2Var, i14));
                        u2Var.O.setDuration(500L);
                        u2Var.O.start();
                    }
                    ec1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.u2 u2Var2 = ec1Var.w;
                    if (u2Var2.V != 2) {
                        u2Var2.V = 2;
                        u2Var2.c();
                        ValueAnimator valueAnimator = u2Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            u2Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(u2Var2.H, 0);
                        u2Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.s2(u2Var2, i15));
                        u2Var2.O.setDuration(500L);
                        u2Var2.O.start();
                    }
                    ec1Var.F.c(false);
                    break;
                }
            case 28:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) obj;
                HashSet hashSet = n0Var.E;
                hashSet.remove(Integer.valueOf(i16));
                if (hashSet.isEmpty()) {
                    n0Var.S();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(i16);
                org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i16);
                org.telegram.ui.Wallet.c0 c0Var = new org.telegram.ui.Wallet.c0(f10, (org.telegram.ui.zc0) obj, x10);
                f10.b(c0Var, org.telegram.messenger.qs.a4);
                org.telegram.messenger.g0.i3(c0Var, 10000L);
                if (x10.e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                c0Var.a();
                break;
        }
    }

    public /* synthetic */ r2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
