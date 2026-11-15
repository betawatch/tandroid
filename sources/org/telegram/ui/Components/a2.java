package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class a2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a2(int i7, Object obj, int i10) {
        this.a = i10;
        this.b = i7;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CharSequence X2;
        int i7;
        org.telegram.ui.oq0 oq0Var;
        int i10 = this.a;
        int i11 = R.drawable.msg_voice_bluetooth;
        int i12 = 0;
        int i13 = this.b;
        Object obj = this.c;
        switch (i10) {
            case 0:
                org.telegram.messenger.ns.f(i13).k(4, new Object[0]);
                org.telegram.messenger.g0.i3(new p1((org.telegram.messenger.nr) obj, 1), 250L);
                break;
            case 1:
                z70 z70Var = (z70) obj;
                ArrayList v = org.telegram.messenger.g5.r(i13).v(11);
                String str = null;
                String M0 = org.telegram.messenger.hd.M0(2131751241, null);
                if (v != null && !v.isEmpty()) {
                    int i14 = 0;
                    while (true) {
                        if (i14 < v.size()) {
                            if (v.get(i14) instanceof TLRPC.TL_privacyValueAllowContacts) {
                                M0 = org.telegram.messenger.hd.M0(2131751241, str);
                            } else {
                                if ((v.get(i14) instanceof TLRPC.TL_privacyValueAllowAll) || (v.get(i14) instanceof TLRPC.TL_privacyValueDisallowAll)) {
                                    str = null;
                                    M0 = org.telegram.messenger.hd.M0(2131751242, null);
                                } else {
                                    str = null;
                                }
                                i14++;
                            }
                        }
                    }
                }
                z70Var.setText(org.telegram.messenger.g0.I2(org.telegram.messenger.g0.U2(M0, new c1(i12, v)), true, org.telegram.messenger.g0.L(2.6666667f), org.telegram.messenger.g0.L(0.66f)));
                break;
            case 2:
                ((org.telegram.messenger.qe) obj).u(i13);
                break;
            case 3:
                pc pcVar = (pc) obj;
                hi.l3 l3Var = pcVar.d1;
                if (pcVar.b1 != i13) {
                    pcVar.setTimer(i13);
                    org.telegram.messenger.z10 z10Var = pcVar.r1;
                    if (z10Var != null) {
                        z10Var.a(Integer.valueOf(i13));
                    }
                    if (i13 == 0) {
                        X2 = org.telegram.messenger.hd.M0(pcVar.q1 ? 2131744128 : 2131744133, null);
                        l3Var.h = pcVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f0 = org.telegram.messenger.g0.L(0);
                        l3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i13 == Integer.MAX_VALUE) {
                        X2 = org.telegram.messenger.hd.M0(pcVar.q1 ? 2131744127 : 2131744132, null);
                        l3Var.h = pcVar.getMeasuredWidth();
                        l3Var.r(false);
                        l3Var.n(13.0f, 4.0f, 10.0f, 4.0f);
                        l3Var.f0 = org.telegram.messenger.g0.L(0);
                        l3Var.e0 = -org.telegram.messenger.g0.L(1.0f);
                    } else if (i13 > 0) {
                        X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.hd.G(i13, pcVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", new Object[0]));
                        l3Var.r(true);
                        l3Var.h = hi.l3.a(X2, l3Var.getTextPaint());
                        l3Var.n(12.0f, 7.0f, 11.0f, 7.0f);
                        l3Var.f0 = org.telegram.messenger.g0.L(2);
                        l3Var.e0 = 0.0f;
                    }
                    l3Var.setTranslationY(((-Math.min(org.telegram.messenger.g0.L(34.0f), pcVar.getEditTextHeight())) - org.telegram.messenger.g0.L(14.0f)) * (pcVar instanceof org.telegram.ui.yo0 ? -1.0f : 1.0f));
                    l3Var.u(X2);
                    ch0 ch0Var = new ch0(i13 > 0 ? R.raw.fire_on : R.raw.fire_off, org.telegram.messenger.g0.L(34.0f), org.telegram.messenger.g0.L(34.0f));
                    ch0Var.start();
                    l3Var.m(ch0Var);
                    l3Var.w();
                    pcVar.o1 = false;
                    org.telegram.messenger.g0.r(pcVar.p1);
                    pcVar.invalidate();
                    break;
                }
                break;
            case 4:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i13 == 0) {
                    chatActivityEnterView.i3 = 0;
                }
                chatActivityEnterView.W0 = null;
                sf sfVar = chatActivityEnterView.V0;
                if (sfVar != null) {
                    if (chatActivityEnterView.C6 == null) {
                        sfVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.V0.setVisibility(8);
                    chatActivityEnterView.V1.removeView(chatActivityEnterView.V0);
                    if (chatActivityEnterView.o4) {
                        chatActivityEnterView.o4 = false;
                        chatActivityEnterView.V0 = null;
                    }
                }
                cg cgVar = chatActivityEnterView.H3;
                if (cgVar != null) {
                    cgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 5:
                ((ji.g) obj).a(Integer.valueOf(i13));
                break;
            case 6:
                ((ji.g) obj).a(Integer.valueOf(i13));
                break;
            case 7:
                hm hmVar = (hm) obj;
                im imVar = hmVar.Q;
                if (i13 == hmVar.P && imVar.x.isShown()) {
                    imVar.x.d(1, true);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    u2Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i13);
                    T.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 9:
                ly lyVar = (ly) obj;
                if (lyVar.Q1) {
                    mx mxVar = lyVar.u1;
                    if (mxVar != null && mxVar.k()) {
                        try {
                            lyVar.y.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    lyVar.R1 = true;
                    int max = Math.max(50, i13 - 100);
                    org.telegram.messenger.g0.i3(new a2(lyVar, max, 9), max);
                    break;
                }
                break;
            case 10:
                ((k90) obj).b.a(Integer.valueOf(i13));
                break;
            case 11:
                zd0 zd0Var = (zd0) obj;
                org.telegram.ui.bq0 bq0Var = zd0Var.a;
                TextView textView = bq0Var.e;
                bi.o2 o2Var = bq0Var.h;
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
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new yd0(zd0Var, i12));
                }
                if (o2Var.getAlpha() == 1.0f) {
                    o2Var.animate().cancel();
                    o2Var.animate().alpha(0.0f).setDuration(150L).setListener(new yd0(zd0Var, 1));
                }
                if (i13 != 2) {
                    int i15 = 5;
                    if (i13 != 5) {
                        if (i13 != 150) {
                            if (i13 == 100) {
                                textView2.setText(org.telegram.messenger.hd.M0(2131742831, null));
                                break;
                            } else if (i13 != 101) {
                            }
                        }
                        textView2.setText(org.telegram.messenger.hd.M0(2131742832, null));
                        textView.setText(org.telegram.messenger.hd.M0(2131742830, null));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new y60(zd0Var, i15));
                        break;
                    } else {
                        textView2.setText(org.telegram.messenger.hd.M0(2131742834, null));
                        break;
                    }
                } else {
                    textView2.setText(org.telegram.messenger.hd.M0(2131742833, null));
                    break;
                }
                break;
            case 12:
                ah0 ah0Var = (ah0) obj;
                ah0Var.W0 = false;
                if (ah0Var.X0) {
                    ah0Var.C(true);
                    break;
                } else {
                    ah0Var.b1 = i13;
                    ah0Var.I();
                    ah0Var.x();
                    break;
                }
            case 13:
                a31 a31Var = (a31) obj;
                a31Var.e1();
                a31Var.c2 = i13;
                p21.T0(a31Var.b2);
                a31Var.f1();
                break;
            case 14:
                ((v61) obj).w.y0(i13);
                break;
            case 15:
                m71 m71Var = (m71) obj;
                u51 u51Var = m71Var.a;
                if (i13 == -1) {
                    if (u51Var.d0()) {
                        u51Var.g0();
                        m71Var.n();
                    }
                    m71Var.K = false;
                    break;
                } else if (i13 == 1) {
                    if (m71Var.L) {
                        m71Var.L = false;
                        u51Var.h0();
                        break;
                    }
                } else if (i13 != -3 && i13 == -2 && u51Var.d0()) {
                    m71Var.L = true;
                    u51Var.g0();
                    m71Var.n();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.c40 c40Var = (org.telegram.ui.c40) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i13);
                    c40Var.x5 = Integer.valueOf(i13);
                }
                cc ccVar = new cc(c40Var.F, new fi.i0());
                Resources resources = c40Var.getContext().getResources();
                if (i13 == 2) {
                    i7 = R.drawable.msg_voice_bluetooth;
                } else if (i13 == 0) {
                    i7 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i7 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ccVar.M(resources.getDrawable(i7).mutate(), org.telegram.ui.c40.j1(i13)).k(c40Var.q1());
                break;
            case 17:
                org.telegram.ui.c40 c40Var2 = ((org.telegram.ui.h30) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i13);
                    c40Var2.x5 = Integer.valueOf(i13);
                }
                cc ccVar2 = new cc(c40Var2.F, new fi.i0());
                Resources resources2 = c40Var2.getContext().getResources();
                if (i13 != 2) {
                    if (i13 == 0) {
                        i11 = R.drawable.msg_voice_speaker;
                    } else {
                        VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                        i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                    }
                }
                ccVar2.M(resources2.getDrawable(i11).mutate(), org.telegram.ui.c40.j1(i13)).k(c40Var2.q1());
                break;
            case 18:
                org.telegram.ui.w40 w40Var = (org.telegram.ui.w40) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = w40Var.n.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = w40Var.n.getChildAt(i16);
                    w40Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i13) {
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
            case 19:
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) obj;
                int i17 = org.telegram.ui.s50.E;
                s50Var.a(R.drawable.intro_powerful_mask, 17, i13, true);
                s50Var.c();
                s50Var.b(s50Var.w, 23, true);
                s50Var.d();
                Intro.a(i13);
                break;
            case 20:
                org.telegram.ui.pa0 pa0Var = (org.telegram.ui.pa0) obj;
                pa0Var.V.h1(0, -org.telegram.messenger.g0.L(i13));
                pa0Var.K0(false);
                break;
            case 21:
                ((org.telegram.ui.ob0) obj).a.f[i13].D(1.0f);
                break;
            case 22:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.W = true;
                notificationsSettingsActivity.c.g(i13);
                break;
            case 23:
                ((org.telegram.ui.ai0) obj).a(Integer.valueOf(i13));
                break;
            case 24:
                ((org.telegram.ui.wl0) obj).e.q0.J.C(1 - i13);
                break;
            case 25:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.Z8;
                int i18 = i13 + 1;
                if (i18 < 6 && (oq0Var = photoViewer.f0) != null) {
                    oq0Var.invalidate();
                    org.telegram.messenger.g0.i3(new a2(photoViewer, i18, 25), 100L);
                    break;
                }
                break;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.X6;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, profileActivity.getParentActivity(), profileActivity.A0);
                String M02 = org.telegram.messenger.hd.M0(2131746647, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M02;
                t1Var.U = org.telegram.messenger.hd.M0(2131746648, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new ai.s1(profileActivity, i13, 20));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            case 27:
                org.telegram.ui.hw0 hw0Var = (org.telegram.ui.hw0) obj;
                ProfileActivity profileActivity2 = hw0Var.h.e;
                profileActivity2.getNotificationCenter().n(profileActivity2, org.telegram.messenger.ns.s1);
                if (i13 == 2) {
                    profileActivity2.getMessagesController().k4(0L, "PREMIUM_GRACE");
                    vf.c.t(hw0Var.getContext(), profileActivity2.getMessagesController().M5);
                } else {
                    profileActivity2.getMessagesController().k4(0L, i13 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().c(profileActivity2, org.telegram.messenger.ns.s1);
                profileActivity2.G5(false, false);
                break;
            case 28:
                org.telegram.ui.tx0 tx0Var = (org.telegram.ui.tx0) obj;
                org.telegram.messenger.g0.v1(tx0Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = tx0Var.a;
                    if (i12 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i12 != 0 && ((i13 != 3 || i12 != 4) && ((i13 != 2 || (i12 != 4 && i12 != 1)) && (i13 != 1 || (i12 != 1 && i12 != 2 && i12 != 3))))) {
                            editTextBoldCursorArr[i12].setText((CharSequence) null);
                        }
                        i12++;
                    }
                }
                break;
            default:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.f.remove(i13);
                sessionsActivity.r0();
                org.telegram.ui.v21 v21Var = sessionsActivity.a;
                if (v21Var != null) {
                    v21Var.f();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ a2(Object obj, int i7, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i7;
    }
}
