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
import org.telegram.ui.ic1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        org.telegram.ui.rq0 rq0Var;
        int i11 = this.a;
        int i12 = 6;
        int i13 = 17;
        int i14 = 2;
        int i15 = 0;
        Object obj = this.c;
        int i16 = this.b;
        switch (i11) {
            case 0:
                x70 x70Var = (x70) obj;
                ArrayList v = org.telegram.messenger.g5.r(i16).v(11);
                String M0 = org.telegram.messenger.id.M0(2131751241, null);
                if (v != null && !v.isEmpty()) {
                    int i17 = 0;
                    while (true) {
                        if (i17 < v.size()) {
                            if (v.get(i17) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.id.M0(2131751241, null);
                            } else {
                                if ((v.get(i17) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i17) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    M0 = org.telegram.messenger.id.M0(2131751242, null);
                                }
                                i17++;
                            }
                        }
                    }
                }
                x70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(M0, new f1(i15, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                break;
            case 1:
                ((org.telegram.messenger.re) obj).u(i16);
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
                        X2 = org.telegram.messenger.id.M0(ucVar.p1 ? 2131744128 : 2131744133, null);
                        m3Var.h = ucVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.e0 = org.telegram.messenger.g0.L(0);
                        m3Var.d0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 == Integer.MAX_VALUE) {
                        X2 = org.telegram.messenger.id.M0(ucVar.p1 ? 2131744127 : 2131744132, null);
                        m3Var.h = ucVar.getMeasuredWidth();
                        m3Var.r(false);
                        m3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        m3Var.e0 = org.telegram.messenger.g0.L(0);
                        m3Var.d0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i16 > 0) {
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(i16, ucVar.p1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                        m3Var.r(true);
                        m3Var.h = fi.m3.a(X2, m3Var.getTextPaint());
                        m3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                        m3Var.e0 = org.telegram.messenger.g0.L(2);
                        m3Var.d0 = 0.0f;
                    }
                    m3Var.setTranslationY(((-Math.min(org.telegram.messenger.g0.L(34.0f), ucVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f)) * (ucVar instanceof org.telegram.ui.cp0 ? -1.0f : 1.0f));
                    m3Var.u(X2);
                    ah0 ah0Var = new ah0(i16 > 0 ? R.raw.fire_on : R.raw.fire_off, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    ah0Var.start();
                    m3Var.m(ah0Var);
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
                hy hyVar = (hy) obj;
                if (hyVar.P1) {
                    ix ixVar = hyVar.t1;
                    if (ixVar != null && ixVar.k()) {
                        try {
                            hyVar.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    hyVar.Q1 = true;
                    int max = Math.max(50, i16 - 100);
                    org.telegram.messenger.g0.i3(new r2(hyVar, max, i12), max);
                    break;
                }
                break;
            case 7:
                ((i90) obj).b.a(Integer.valueOf(i16));
                break;
            case 8:
                ae0 ae0Var = (ae0) obj;
                org.telegram.ui.eq0 eq0Var = ae0Var.a;
                TextView textView = eq0Var.e;
                bi.ec ecVar = eq0Var.h;
                RadialProgressView radialProgressView = eq0Var.n;
                TextView textView2 = eq0Var.d;
                textView.setVisibility(8);
                eq0Var.f.setVisibility(8);
                LinearLayout linearLayout = eq0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new zd0(ae0Var, i15));
                }
                if (ecVar.getAlpha() == 1.0f) {
                    ecVar.animate().cancel();
                    ecVar.animate().alpha(0.0f).setDuration(150L).setListener(new zd0(ae0Var, 1));
                }
                if (i16 != 2) {
                    if (i16 != 5) {
                        if (i16 != 150) {
                            if (i16 == 100) {
                                textView2.setText(org.telegram.messenger.id.M0(2131742831, null));
                                break;
                            } else if (i16 != 101) {
                            }
                        }
                        textView2.setText(org.telegram.messenger.id.M0(2131742832, null));
                        textView.setText(org.telegram.messenger.id.M0(2131742830, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new ma0(ae0Var, 4));
                        break;
                    } else {
                        textView2.setText(org.telegram.messenger.id.M0(2131742834, null));
                        break;
                    }
                } else {
                    textView2.setText(org.telegram.messenger.id.M0(2131742833, null));
                    break;
                }
                break;
            case 9:
                yg0 yg0Var = (yg0) obj;
                yg0Var.V0 = false;
                if (yg0Var.W0) {
                    yg0Var.C(true);
                    break;
                } else {
                    yg0Var.a1 = i16;
                    yg0Var.I();
                    yg0Var.x();
                    break;
                }
            case 10:
                w21 w21Var = (w21) obj;
                w21Var.e1();
                w21Var.Y1 = i16;
                l21.S0(w21Var.X1);
                w21Var.f1();
                break;
            case 11:
                ((v61) obj).w.y0(i16);
                break;
            case 12:
                m71 m71Var = (m71) obj;
                u51 u51Var = m71Var.a;
                if (i16 == -1) {
                    if (u51Var.d0()) {
                        u51Var.g0();
                        m71Var.n();
                    }
                    m71Var.J = false;
                    break;
                } else if (i16 == 1) {
                    if (m71Var.K) {
                        m71Var.K = false;
                        u51Var.h0();
                        break;
                    }
                } else if (i16 != -3 && i16 == -2 && u51Var.d0()) {
                    m71Var.K = true;
                    u51Var.g0();
                    m71Var.n();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.e40 e40Var = (org.telegram.ui.e40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i16);
                    e40Var.p5 = Integer.valueOf(i16);
                }
                hc hcVar = new hc(e40Var.E, new di.i0());
                Resources resources = e40Var.getContext().getResources();
                if (i16 == 2) {
                    i7 = R.drawable.msg_voice_bluetooth;
                } else if (i16 == 0) {
                    i7 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i7 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                hcVar.M(resources.getDrawable(i7).mutate(), org.telegram.ui.e40.j1(i16)).k(e40Var.q1());
                break;
            case 14:
                org.telegram.ui.e40 e40Var2 = ((org.telegram.ui.j30) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i16);
                    e40Var2.p5 = Integer.valueOf(i16);
                }
                hc hcVar2 = new hc(e40Var2.E, new di.i0());
                Resources resources2 = e40Var2.getContext().getResources();
                if (i16 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i16 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                hcVar2.M(resources2.getDrawable(i10).mutate(), org.telegram.ui.e40.j1(i16)).k(e40Var2.q1());
                break;
            case 15:
                org.telegram.ui.y40 y40Var = (org.telegram.ui.y40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = y40Var.n.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    View childAt = y40Var.n.getChildAt(i18);
                    y40Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i16) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(y40Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / y40Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 16:
                org.telegram.ui.v50 v50Var = (org.telegram.ui.v50) obj;
                int i19 = org.telegram.ui.v50.D;
                v50Var.a(R.drawable.intro_powerful_mask, 17, i16, true);
                v50Var.c();
                v50Var.b(v50Var.w, 23, true);
                v50Var.d();
                Intro.a(i16);
                break;
            case 17:
                org.telegram.ui.ra0 ra0Var = (org.telegram.ui.ra0) obj;
                ra0Var.U.h1(0, -org.telegram.messenger.g0.L(i16));
                ra0Var.K0(false);
                break;
            case 18:
                ((org.telegram.ui.qb0) obj).a.f[i16].C(1.0f);
                break;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.g(i16);
                break;
            case 20:
                ((org.telegram.ui.ai0) obj).a(Integer.valueOf(i16));
                break;
            case 21:
                ((org.telegram.ui.wl0) obj).e.p0.I.E(1 - i16);
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Y8;
                int i20 = i16 + 1;
                if (i20 < 6 && (rq0Var = photoViewer.e0) != null) {
                    rq0Var.invalidate();
                    org.telegram.messenger.g0.i3(new r2(photoViewer, i20, 22), 100L);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.V6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.z0);
                String M02 = org.telegram.messenger.id.M0(2131746647, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M02;
                u1Var.T = org.telegram.messenger.id.M0(2131746648, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new l2.q(profileActivity, i16, i13));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 24:
                org.telegram.ui.kw0 kw0Var = (org.telegram.ui.kw0) obj;
                ProfileActivity profileActivity2 = kw0Var.h.e;
                profileActivity2.getNotificationCenter().n(profileActivity2, org.telegram.messenger.qs.s1);
                if (i16 == 2) {
                    profileActivity2.getMessagesController().k4(0L, "PREMIUM_GRACE");
                    vf.c.t(kw0Var.getContext(), profileActivity2.getMessagesController().L5);
                } else {
                    profileActivity2.getMessagesController().k4(0L, i16 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, org.telegram.messenger.qs.s1);
                profileActivity2.G5(false, false);
                break;
            case 25:
                org.telegram.ui.yx0 yx0Var = (org.telegram.ui.yx0) obj;
                org.telegram.messenger.g0.v1(yx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = yx0Var.a;
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
                org.telegram.ui.a31 a31Var = sessionsActivity.a;
                if (a31Var != null) {
                    a31Var.f();
                    break;
                }
                break;
            case 27:
                ic1 ic1Var = (ic1) obj;
                ic1Var.F.setSignalBarCount(i16);
                if (i16 <= 1) {
                    org.telegram.ui.Components.voip.u2 u2Var = ic1Var.w;
                    if (u2Var.V != 3) {
                        u2Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(u2Var.H, org.telegram.messenger.qs.e4);
                        u2Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.s2(u2Var, i14));
                        u2Var.O.setDuration(500L);
                        u2Var.O.start();
                    }
                    ic1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.u2 u2Var2 = ic1Var.w;
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
                    ic1Var.F.c(false);
                    break;
                }
            case 28:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) obj;
                HashSet hashSet = l0Var.E;
                hashSet.remove(Integer.valueOf(i16));
                if (hashSet.isEmpty()) {
                    l0Var.S();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.l0 x10 = org.telegram.ui.Wallet.l0.x(i16);
                org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i16);
                org.telegram.ui.Wallet.a0 a0Var = new org.telegram.ui.Wallet.a0(f10, (org.telegram.ui.bd0) obj, x10);
                f10.b(a0Var, org.telegram.messenger.qs.a4);
                org.telegram.messenger.g0.i3(a0Var, 10000L);
                if (x10.e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                a0Var.a();
                break;
        }
    }

    public /* synthetic */ r2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
