package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.ti1;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class id implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ id(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        CharSequence replaceTags;
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        int i11;
        org.telegram.ui.xu0 xu0Var;
        int i12 = this.a;
        int i13 = 5;
        int i14 = 3;
        int i15 = 2;
        int i16 = 1;
        int i17 = 0;
        int i18 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                jd jdVar = (jd) obj;
                ci.f4 f4Var = jdVar.d1;
                if (jdVar.b1 != i18) {
                    jdVar.setTimer(i18);
                    Utilities.Callback callback = jdVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        replaceTags = LocaleController.getString(jdVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        f4Var.h = jdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.e0 = AndroidUtilities.dp(0);
                        f4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(jdVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        f4Var.h = jdVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.e0 = AndroidUtilities.dp(0);
                        f4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(jdVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i18, new Object[0]));
                        f4Var.p(true);
                        f4Var.h = ci.f4.a(replaceTags, f4Var.getTextPaint());
                        f4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f4Var.e0 = AndroidUtilities.dp(2);
                        f4Var.d0 = 0.0f;
                    }
                    f4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), jdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (jdVar instanceof org.telegram.ui.et0 ? -1.0f : 1.0f));
                    f4Var.s(replaceTags);
                    yi0 yi0Var = new yi0(i18 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yi0Var.start();
                    f4Var.j(yi0Var);
                    f4Var.u();
                    jdVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(jdVar.p1);
                    jdVar.invalidate();
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                cg cgVar = chatActivityEnterView.U0;
                if (cgVar != null) {
                    if (chatActivityEnterView.d5 == null) {
                        cgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                mg mgVar = chatActivityEnterView.Y2;
                if (mgVar != null) {
                    mgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 2:
                pm pmVar = (pm) obj;
                qm qmVar = pmVar.P;
                if (i18 == pmVar.O && qmVar.w.isShown()) {
                    qmVar.w.e(1, true);
                    break;
                }
                break;
            case 3:
                kz kzVar = (kz) obj;
                if (kzVar.P1) {
                    ky kyVar = kzVar.t1;
                    if (kyVar != null && kyVar.k()) {
                        try {
                            kzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new id(kzVar, max, i14), max);
                    break;
                }
                break;
            case 4:
                ((oa0) obj).b.run(Integer.valueOf(i18));
                break;
            case 5:
                pf0 pf0Var = (pf0) obj;
                org.telegram.ui.ku0 ku0Var = pf0Var.a;
                TextView textView = ku0Var.e;
                ci.eb ebVar = ku0Var.h;
                RadialProgressView radialProgressView = ku0Var.n;
                TextView textView2 = ku0Var.d;
                textView.setVisibility(8);
                ku0Var.f.setVisibility(8);
                LinearLayout linearLayout = ku0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, i17));
                }
                if (ebVar.getAlpha() == 1.0f) {
                    ebVar.animate().cancel();
                    ebVar.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, i16));
                }
                if (i18 != 2) {
                    if (i18 != 5) {
                        if (i18 != 150) {
                            if (i18 == 100) {
                                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                                break;
                            } else if (i18 != 101) {
                            }
                        }
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                        textView.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new x70(pf0Var, 7));
                        break;
                    } else {
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                        break;
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                    break;
                }
                break;
            case 6:
                wi0 wi0Var = (wi0) obj;
                wi0Var.V0 = false;
                if (wi0Var.W0) {
                    wi0Var.C(true);
                    break;
                } else {
                    wi0Var.a1 = i18;
                    wi0Var.I();
                    wi0Var.x();
                    break;
                }
            case 7:
                ((zu0) obj).d1(i18);
                break;
            case 8:
                ((st0) obj).h.scrollBy(0, i18);
                break;
            case 9:
                zu0 zu0Var = ((rs0) obj).a;
                org.telegram.ui.ActionBar.o2 o2Var = zu0Var.v1;
                if (o2Var != null) {
                    if (zu0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = zu0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = o2Var.getMessagesController().getInputChannel(zu0Var.d1.id);
                        TLRPC.ChatFull chatFull = zu0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = zu0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = zu0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            o2Var.getMessagesStorage().updateUserInfo(zu0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    o2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    zu0Var.v1(true);
                    break;
                }
                break;
            case 10:
                ((xw0) obj).l0(i18, 0);
                break;
            case 11:
                h41 h41Var = (h41) obj;
                h41Var.U();
                h41Var.g0 = i18;
                w31.I(h41Var.f0);
                h41Var.V();
                break;
            case 12:
                ((i81) obj).v.y0(i18);
                break;
            case 13:
                d91 d91Var = (d91) obj;
                h71 h71Var = d91Var.a;
                if (i18 == -1) {
                    if (h71Var.y()) {
                        h71Var.B();
                        d91Var.n();
                    }
                    d91Var.J = false;
                    break;
                } else if (i18 == 1) {
                    if (d91Var.K) {
                        d91Var.K = false;
                        h71Var.C();
                        break;
                    }
                } else if (i18 != -3 && i18 == -2 && h71Var.y()) {
                    d91Var.K = true;
                    h71Var.B();
                    d91Var.n();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    k60Var.y3 = Integer.valueOf(i18);
                }
                vc vcVar = new vc(k60Var.topBulletinContainer, new ai.a1());
                Resources resources = k60Var.getContext().getResources();
                if (i18 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                vcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.k60.g1(i18)).k(k60Var.n1());
                break;
            case 15:
                org.telegram.ui.k60 k60Var2 = ((org.telegram.ui.n50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    k60Var2.y3 = Integer.valueOf(i18);
                }
                vc vcVar2 = new vc(k60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = k60Var2.getContext().getResources();
                if (i18 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                vcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.k60.g1(i18)).k(k60Var2.n1());
                break;
            case 16:
                org.telegram.ui.g70 g70Var = (org.telegram.ui.g70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = g70Var.n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = g70Var.n.getChildAt(i19);
                    g70Var.n.getClass();
                    if (RecyclerView.S(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(g70Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / g70Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 17:
                org.telegram.ui.kd0 kd0Var = (org.telegram.ui.kd0) obj;
                kd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                kd0Var.A0(false);
                break;
            case 18:
                ((org.telegram.ui.ie0) obj).a.f[i18].l(1.0f);
                break;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i18);
                break;
            case 20:
                ((org.telegram.ui.hl0) obj).run(Integer.valueOf(i18));
                break;
            case 21:
                ((org.telegram.ui.pp0) obj).e.p0.I.E(1 - i18);
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (xu0Var = photoViewer.e0) != null) {
                    xu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new id(photoViewer, i20, 22), 100L);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 24:
                org.telegram.ui.a11 a11Var = (org.telegram.ui.a11) obj;
                org.telegram.ui.b11 b11Var = a11Var.h;
                NotificationCenter notificationCenter = b11Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = b11Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(a11Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i18 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i21);
                profileActivity2.e5(false, false);
                break;
            case 25:
                org.telegram.ui.q21 q21Var = (org.telegram.ui.q21) obj;
                AndroidUtilities.hideKeyboard(q21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = q21Var.a;
                    if (i17 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i17 != 0 && ((i18 != 3 || i17 != 4) && ((i18 != 2 || (i17 != 4 && i17 != 1)) && (i18 != 1 || (i17 != 1 && i17 != 2 && i17 != 3))))) {
                            editTextBoldCursorArr[i17].setText((CharSequence) null);
                        }
                        i17++;
                    }
                }
                break;
            case 26:
                org.telegram.ui.f31 f31Var = (org.telegram.ui.f31) obj;
                s4.o0 layoutManager = f31Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = f31Var.R ? i18 > f31Var.L ? Math.min(i18 + 1, f31Var.b.d.size() - 1) : Math.max(i18 - 1, 0) : i18;
                    org.telegram.ui.c31 c31Var = f31Var.c;
                    c31Var.a = min2;
                    layoutManager.w0(c31Var);
                }
                f31Var.L = i18;
                break;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.r81 r81Var = sessionsActivity.a;
                if (r81Var != null) {
                    r81Var.l();
                    break;
                }
                break;
            case 28:
                ti1 ti1Var = (ti1) obj;
                ti1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = ti1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    ti1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.c3 c3Var2 = ti1Var.v;
                    if (c3Var2.V != 2) {
                        c3Var2.V = 2;
                        c3Var2.c();
                        ValueAnimator valueAnimator = c3Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            c3Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(c3Var2.H, 0);
                        c3Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var2, 0));
                        c3Var2.O.setDuration(500L);
                        c3Var2.O.start();
                    }
                    ti1Var.F.c(false);
                    break;
                }
            default:
                qg.j jVar = (qg.j) obj;
                jVar.L = i18;
                jVar.K = true;
                try {
                    jVar.performHapticFeedback(3, 2);
                } catch (Exception unused2) {
                }
                ValueAnimator valueAnimator2 = jVar.P;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator3 = jVar.Q;
                if (valueAnimator3 != null) {
                    valueAnimator3.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                jVar.P = duration;
                duration.setInterpolator(qr.f);
                jVar.P.addUpdateListener(new qg.f(jVar, i13));
                jVar.P.addListener(new qg.g(jVar, i15));
                jVar.P.start();
                break;
        }
    }
}
