package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
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
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o2(int i3, Object obj, int i10) {
        this.a = i10;
        this.b = i3;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        CharSequence charSequence;
        float f11;
        int i3;
        int i10;
        org.telegram.ui.gq0 gq0Var;
        int i11 = this.a;
        int i12 = 6;
        int i13 = 1;
        int i14 = 0;
        Object obj = this.c;
        int i15 = this.b;
        switch (i11) {
            case 0:
                s70 s70Var = (s70) obj;
                ArrayList v = org.telegram.messenger.g5.r(i15).v(11);
                String str = null;
                String M0 = org.telegram.messenger.bd.M0(2131751242, null);
                if (v != null && !v.isEmpty()) {
                    int i16 = 0;
                    while (true) {
                        if (i16 < v.size()) {
                            if (v.get(i16) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.bd.M0(2131751242, str);
                            } else {
                                if ((v.get(i16) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i16) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str = null;
                                    M0 = org.telegram.messenger.bd.M0(2131751243, null);
                                } else {
                                    str = null;
                                }
                                i16++;
                            }
                        }
                    }
                }
                s70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(M0, new e1(i14, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                break;
            case 1:
                ((o4.m0) obj).t(i15);
                break;
            case 2:
                sc scVar = (sc) obj;
                gi.l3 l3Var = scVar.d1;
                if (scVar.b1 != i15) {
                    scVar.setTimer(i15);
                    org.telegram.messenger.u10 u10Var = scVar.r1;
                    if (u10Var != null) {
                        u10Var.a(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        charSequence = org.telegram.messenger.bd.M0(scVar.q1 ? 2131744138 : 2131744143, null);
                        l3Var.h = scVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f0 = org.telegram.messenger.g0.L(0);
                        l3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                        f10 = 1.0f;
                    } else if (i15 == Integer.MAX_VALUE) {
                        charSequence = org.telegram.messenger.bd.M0(scVar.q1 ? 2131744137 : 2131744142, null);
                        l3Var.h = scVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f0 = org.telegram.messenger.g0.L(0);
                        f10 = 1.0f;
                        l3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else {
                        f10 = 1.0f;
                        if (i15 > 0) {
                            SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.G(i15, scVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                            l3Var.r(true);
                            l3Var.h = gi.l3.a(X2, l3Var.getTextPaint());
                            l3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                            l3Var.f0 = org.telegram.messenger.g0.L(2);
                            l3Var.e0 = 0.0f;
                            charSequence = X2;
                        }
                    }
                    l3Var.setTranslationY(((-Math.min(org.telegram.messenger.g0.L(34.0f), scVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f)) * (scVar instanceof org.telegram.ui.ro0 ? -1.0f : f10));
                    l3Var.u(charSequence);
                    ch0 ch0Var = new ch0(i15 > 0 ? R.raw.fire_on : R.raw.fire_off, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    ch0Var.start();
                    l3Var.m(ch0Var);
                    l3Var.w();
                    scVar.o1 = false;
                    org.telegram.messenger.g0.r(scVar.p1);
                    scVar.invalidate();
                    break;
                }
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
                    chatActivityEnterView.B2 = 0;
                }
                chatActivityEnterView.W0 = null;
                kf kfVar = chatActivityEnterView.V0;
                if (kfVar != null) {
                    if (chatActivityEnterView.i5 == null) {
                        kfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.o1.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.H3) {
                        chatActivityEnterView.H3 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                uf ufVar = chatActivityEnterView.a3;
                if (ufVar != null) {
                    ufVar.x(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 4:
                zl zlVar = (zl) obj;
                am amVar = zlVar.Q;
                if (i15 == zlVar.P && amVar.x.isShown()) {
                    amVar.x.d(1, true);
                    break;
                }
                break;
            case 5:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    t2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i15);
                    T.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 6:
                ey eyVar = (ey) obj;
                if (eyVar.Q1) {
                    fx fxVar = eyVar.u1;
                    if (fxVar != null && fxVar.k()) {
                        try {
                            eyVar.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    eyVar.R1 = true;
                    int max = Math.max(50, i15 - 100);
                    org.telegram.messenger.g0.i3(new o2(eyVar, max, i12), max);
                    break;
                }
                break;
            case 7:
                ((d90) obj).b.a(Integer.valueOf(i15));
                break;
            case 8:
                td0 td0Var = (td0) obj;
                org.telegram.ui.tp0 tp0Var = td0Var.a;
                TextView textView = tp0Var.e;
                ai.x2 x2Var = tp0Var.h;
                RadialProgressView radialProgressView = tp0Var.n;
                TextView textView2 = tp0Var.d;
                textView.setVisibility(8);
                tp0Var.f.setVisibility(8);
                LinearLayout linearLayout = tp0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    f11 = 1.0f;
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                } else {
                    f11 = 1.0f;
                }
                if (radialProgressView.getAlpha() == f11) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new sd0(td0Var, i14));
                }
                if (x2Var.getAlpha() == 1.0f) {
                    x2Var.animate().cancel();
                    x2Var.animate().alpha(0.0f).setDuration(150L).setListener(new sd0(td0Var, i13));
                }
                if (i15 != 2) {
                    if (i15 != 5) {
                        if (i15 != 150) {
                            if (i15 == 100) {
                                textView2.setText(org.telegram.messenger.bd.M0(2131742841, null));
                                break;
                            } else if (i15 != 101) {
                            }
                        }
                        textView2.setText(org.telegram.messenger.bd.M0(2131742842, null));
                        textView.setText(org.telegram.messenger.bd.M0(2131742840, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new ga0(td0Var, 4));
                        break;
                    } else {
                        textView2.setText(org.telegram.messenger.bd.M0(2131742844, null));
                        break;
                    }
                } else {
                    textView2.setText(org.telegram.messenger.bd.M0(2131742843, null));
                    break;
                }
                break;
            case 9:
                ah0 ah0Var = (ah0) obj;
                ah0Var.W0 = false;
                if (ah0Var.X0) {
                    ah0Var.C(true);
                    break;
                } else {
                    ah0Var.b1 = i15;
                    ah0Var.I();
                    ah0Var.x();
                    break;
                }
            case 10:
                q21 q21Var = (q21) obj;
                q21Var.e1();
                q21Var.Z1 = i15;
                f21.S0(q21Var.Y1);
                q21Var.f1();
                break;
            case 11:
                ((m61) obj).w.y0(i15);
                break;
            case 12:
                d71 d71Var = (d71) obj;
                m51 m51Var = d71Var.a;
                if (i15 == -1) {
                    if (m51Var.d0()) {
                        m51Var.g0();
                        d71Var.n();
                    }
                    d71Var.K = false;
                    break;
                } else if (i15 == 1) {
                    if (d71Var.L) {
                        d71Var.L = false;
                        m51Var.h0();
                        break;
                    }
                } else if (i15 != -3 && i15 == -2 && m51Var.d0()) {
                    d71Var.L = true;
                    m51Var.g0();
                    d71Var.n();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.x30 x30Var = (org.telegram.ui.x30) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    x30Var.q5 = Integer.valueOf(i15);
                }
                fc fcVar = new fc(x30Var.F, new ei.k0());
                Resources resources = x30Var.getContext().getResources();
                if (i15 == 2) {
                    i3 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i3 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i3 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                fcVar.M(resources.getDrawable(i3).mutate(), org.telegram.ui.x30.i1(i15)).k(x30Var.p1());
                break;
            case 14:
                org.telegram.ui.x30 x30Var2 = ((org.telegram.ui.c30) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    x30Var2.q5 = Integer.valueOf(i15);
                }
                fc fcVar2 = new fc(x30Var2.F, new ei.k0());
                Resources resources2 = x30Var2.getContext().getResources();
                if (i15 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                fcVar2.M(resources2.getDrawable(i10).mutate(), org.telegram.ui.x30.i1(i15)).k(x30Var2.p1());
                break;
            case 15:
                org.telegram.ui.r40 r40Var = (org.telegram.ui.r40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = r40Var.n.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    View childAt = r40Var.n.getChildAt(i17);
                    r40Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(r40Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / r40Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 16:
                org.telegram.ui.n50 n50Var = (org.telegram.ui.n50) obj;
                int i18 = org.telegram.ui.n50.E;
                n50Var.a(R.drawable.intro_powerful_mask, 17, i15, true);
                n50Var.c();
                n50Var.b(n50Var.w, 23, true);
                n50Var.e();
                Intro.a(i15);
                break;
            case 17:
                org.telegram.ui.la0 la0Var = (org.telegram.ui.la0) obj;
                la0Var.V.h1(0, -org.telegram.messenger.g0.L(i15));
                la0Var.K0(false);
                break;
            case 18:
                ((org.telegram.ui.lb0) obj).a.f[i15].C(1.0f);
                break;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.c.g(i15);
                break;
            case 20:
                ((org.telegram.ui.vh0) obj).a(Integer.valueOf(i15));
                break;
            case 21:
                ((org.telegram.ui.pl0) obj).e.q0.J.D(1 - i15);
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.V8;
                int i19 = i15 + 1;
                if (i19 < 6 && (gq0Var = photoViewer.f0) != null) {
                    gq0Var.invalidate();
                    org.telegram.messenger.g0.i3(new o2(photoViewer, i19, 22), 100L);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.T6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String M02 = org.telegram.messenger.bd.M0(2131746655, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M02;
                s1Var.U = org.telegram.messenger.bd.M0(2131746656, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new k2.q(profileActivity, i15, 18));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 24:
                org.telegram.ui.aw0 aw0Var = (org.telegram.ui.aw0) obj;
                ProfileActivity profileActivity2 = aw0Var.h.e;
                profileActivity2.getNotificationCenter().n(profileActivity2, org.telegram.messenger.hs.s1);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().k4(0L, "PREMIUM_GRACE");
                    sf.c.t(aw0Var.getContext(), profileActivity2.getMessagesController().L5);
                } else {
                    profileActivity2.getMessagesController().k4(0L, i15 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, org.telegram.messenger.hs.s1);
                profileActivity2.D5(false, false);
                break;
            case 25:
                org.telegram.ui.mx0 mx0Var = (org.telegram.ui.mx0) obj;
                org.telegram.messenger.g0.v1(mx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = mx0Var.a;
                    if (i14 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i14 != 0 && ((i15 != 3 || i14 != 4) && ((i15 != 2 || (i14 != 4 && i14 != 1)) && (i15 != 1 || (i14 != 1 && i14 != 2 && i14 != 3))))) {
                            editTextBoldCursorArr[i14].setText((CharSequence) null);
                        }
                        i14++;
                    }
                }
                break;
            case 26:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f.remove(i15);
                sessionsActivity.r0();
                org.telegram.ui.o21 o21Var = sessionsActivity.a;
                if (o21Var != null) {
                    o21Var.f();
                    break;
                }
                break;
            case 27:
                zb1 zb1Var = (zb1) obj;
                zb1Var.G.setSignalBarCount(i15);
                if (i15 <= 1) {
                    org.telegram.ui.Components.voip.j2 j2Var = zb1Var.w;
                    if (j2Var.W != 3) {
                        j2Var.W = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(j2Var.I, org.telegram.messenger.hs.e4);
                        j2Var.P = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.h2(j2Var, 2));
                        j2Var.P.setDuration(500L);
                        j2Var.P.start();
                    }
                    zb1Var.G.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.j2 j2Var2 = zb1Var.w;
                    if (j2Var2.W != 2) {
                        j2Var2.W = 2;
                        j2Var2.c();
                        ValueAnimator valueAnimator = j2Var2.P;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            j2Var2.P.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(j2Var2.I, 0);
                        j2Var2.P = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.h2(j2Var2, 0));
                        j2Var2.P.setDuration(500L);
                        j2Var2.P.start();
                    }
                    zb1Var.G.c(false);
                    break;
                }
            case 28:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) obj;
                HashSet hashSet = k0Var.E;
                hashSet.remove(Integer.valueOf(i15));
                if (hashSet.isEmpty()) {
                    k0Var.S();
                    break;
                }
                break;
            default:
                org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i15);
                org.telegram.messenger.hs f12 = org.telegram.messenger.hs.f(i15);
                org.telegram.ui.Wallet.z zVar = new org.telegram.ui.Wallet.z(f12, (org.telegram.ui.tb0) obj, x10);
                f12.b(zVar, org.telegram.messenger.hs.a4);
                org.telegram.messenger.g0.i3(zVar, 10000L);
                if (x10.e == null && x10.A < 0) {
                    x10.Y();
                }
                x10.W();
                zVar.a();
                break;
        }
    }

    public /* synthetic */ o2(Object obj, int i3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i3;
    }
}
