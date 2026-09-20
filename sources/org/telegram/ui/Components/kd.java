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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class kd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kd(Object obj, int i10, int i11) {
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
        org.telegram.ui.vu0 vu0Var;
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
                ld ldVar = (ld) obj;
                ci.f4 f4Var = ldVar.d1;
                if (ldVar.b1 != i18) {
                    ldVar.setTimer(i18);
                    Utilities.Callback callback = ldVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        replaceTags = LocaleController.getString(ldVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        f4Var.h = ldVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.e0 = AndroidUtilities.dp(0);
                        f4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(ldVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        f4Var.h = ldVar.getMeasuredWidth();
                        f4Var.p(false);
                        f4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        f4Var.e0 = AndroidUtilities.dp(0);
                        f4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(ldVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i18, new Object[0]));
                        f4Var.p(true);
                        f4Var.h = ci.f4.a(replaceTags, f4Var.getTextPaint());
                        f4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        f4Var.e0 = AndroidUtilities.dp(2);
                        f4Var.d0 = 0.0f;
                    }
                    f4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), ldVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (ldVar instanceof org.telegram.ui.ct0 ? -1.0f : 1.0f));
                    f4Var.s(replaceTags);
                    hj0 hj0Var = new hj0(i18 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    hj0Var.start();
                    f4Var.j(hj0Var);
                    f4Var.u();
                    ldVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(ldVar.p1);
                    ldVar.invalidate();
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.z2 = 0;
                }
                chatActivityEnterView.V0 = null;
                dg dgVar = chatActivityEnterView.U0;
                if (dgVar != null) {
                    if (chatActivityEnterView.c5 == null) {
                        dgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.m1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.F3) {
                        chatActivityEnterView.F3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                ng ngVar = chatActivityEnterView.Y2;
                if (ngVar != null) {
                    ngVar.y(0.0f);
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
                    ly lyVar = kzVar.t1;
                    if (lyVar != null && lyVar.k()) {
                        try {
                            kzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    kzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new kd(kzVar, max, i14), max);
                    break;
                }
                break;
            case 4:
                ((wa0) obj).b.run(Integer.valueOf(i18));
                break;
            case 5:
                xf0 xf0Var = (xf0) obj;
                org.telegram.ui.iu0 iu0Var = xf0Var.a;
                TextView textView = iu0Var.e;
                ci.eb ebVar = iu0Var.h;
                RadialProgressView radialProgressView = iu0Var.n;
                TextView textView2 = iu0Var.d;
                textView.setVisibility(8);
                iu0Var.f.setVisibility(8);
                LinearLayout linearLayout = iu0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new wf0(xf0Var, i17));
                }
                if (ebVar.getAlpha() == 1.0f) {
                    ebVar.animate().cancel();
                    ebVar.animate().alpha(0.0f).setDuration(150L).setListener(new wf0(xf0Var, i16));
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
                        textView.setOnClickListener(new f80(xf0Var, 7));
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
                fj0 fj0Var = (fj0) obj;
                fj0Var.V0 = false;
                if (fj0Var.W0) {
                    fj0Var.C(true);
                    break;
                } else {
                    fj0Var.a1 = i18;
                    fj0Var.I();
                    fj0Var.x();
                    break;
                }
            case 7:
                ((jv0) obj).d1(i18);
                break;
            case 8:
                ((cu0) obj).h.scrollBy(0, i18);
                break;
            case 9:
                jv0 jv0Var = ((bt0) obj).a;
                org.telegram.ui.ActionBar.n2 n2Var = jv0Var.v1;
                if (n2Var != null) {
                    if (jv0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = jv0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(jv0Var.d1.id);
                        TLRPC.ChatFull chatFull = jv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = jv0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = jv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(jv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    jv0Var.v1(true);
                    break;
                }
                break;
            case 10:
                ((hx0) obj).l0(i18, 0);
                break;
            case 11:
                u41 u41Var = (u41) obj;
                u41Var.U();
                u41Var.g0 = i18;
                j41.I(u41Var.f0);
                u41Var.V();
                break;
            case 12:
                ((w81) obj).v.y0(i18);
                break;
            case 13:
                p91 p91Var = (p91) obj;
                t71 t71Var = p91Var.a;
                if (i18 == -1) {
                    if (t71Var.y()) {
                        t71Var.B();
                        p91Var.n();
                    }
                    p91Var.J = false;
                    break;
                } else if (i18 == 1) {
                    if (p91Var.K) {
                        p91Var.K = false;
                        t71Var.C();
                        break;
                    }
                } else if (i18 != -3 && i18 == -2 && t71Var.y()) {
                    p91Var.K = true;
                    t71Var.B();
                    p91Var.n();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.i60 i60Var = (org.telegram.ui.i60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    i60Var.y3 = Integer.valueOf(i18);
                }
                xc xcVar = new xc(i60Var.topBulletinContainer, new ai.a1());
                Resources resources = i60Var.getContext().getResources();
                if (i18 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.i60.g1(i18)).k(i60Var.n1());
                break;
            case 15:
                org.telegram.ui.i60 i60Var2 = ((org.telegram.ui.l50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    i60Var2.y3 = Integer.valueOf(i18);
                }
                xc xcVar2 = new xc(i60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = i60Var2.getContext().getResources();
                if (i18 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.i60.g1(i18)).k(i60Var2.n1());
                break;
            case 16:
                org.telegram.ui.e70 e70Var = (org.telegram.ui.e70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = e70Var.n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = e70Var.n.getChildAt(i19);
                    e70Var.n.getClass();
                    if (RecyclerView.S(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(e70Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / e70Var.n.getMeasuredHeight()) * 100.0f);
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
                ((org.telegram.ui.il0) obj).run(Integer.valueOf(i18));
                break;
            case 21:
                ((org.telegram.ui.pp0) obj).e.p0.I.E(1 - i18);
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (vu0Var = photoViewer.e0) != null) {
                    vu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new kd(photoViewer, i20, 22), 100L);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 17));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 24:
                org.telegram.ui.y01 y01Var = (org.telegram.ui.y01) obj;
                org.telegram.ui.z01 z01Var = y01Var.h;
                NotificationCenter notificationCenter = z01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = z01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(y01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i18 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i21);
                profileActivity2.e5(false, false);
                break;
            case 25:
                org.telegram.ui.o21 o21Var = (org.telegram.ui.o21) obj;
                AndroidUtilities.hideKeyboard(o21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = o21Var.a;
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
                org.telegram.ui.e31 e31Var = (org.telegram.ui.e31) obj;
                s4.o0 layoutManager = e31Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = e31Var.R ? i18 > e31Var.L ? Math.min(i18 + 1, e31Var.b.d.size() - 1) : Math.max(i18 - 1, 0) : i18;
                    org.telegram.ui.b31 b31Var = e31Var.c;
                    b31Var.a = min2;
                    layoutManager.w0(b31Var);
                }
                e31Var.L = i18;
                break;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.t81 t81Var = sessionsActivity.a;
                if (t81Var != null) {
                    t81Var.l();
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
