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
import org.telegram.ui.mi1;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ld implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ld(Object obj, int i10, int i11) {
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
        org.telegram.ui.nu0 nu0Var;
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
                md mdVar = (md) obj;
                ci.e4 e4Var = mdVar.d1;
                if (mdVar.b1 != i18) {
                    mdVar.setTimer(i18);
                    Utilities.Callback callback = mdVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        replaceTags = LocaleController.getString(mdVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        e4Var.h = mdVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.e0 = AndroidUtilities.dp(0);
                        e4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(mdVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        e4Var.h = mdVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.e0 = AndroidUtilities.dp(0);
                        e4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(mdVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i18, new Object[0]));
                        e4Var.p(true);
                        e4Var.h = ci.e4.a(replaceTags, e4Var.getTextPaint());
                        e4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        e4Var.e0 = AndroidUtilities.dp(2);
                        e4Var.d0 = 0.0f;
                    }
                    e4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), mdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (mdVar instanceof org.telegram.ui.us0 ? -1.0f : 1.0f));
                    e4Var.s(replaceTags);
                    kj0 kj0Var = new kj0(i18 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    kj0Var.start();
                    e4Var.j(kj0Var);
                    e4Var.u();
                    mdVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(mdVar.p1);
                    mdVar.invalidate();
                    break;
                }
                break;
            case 1:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i18 == 0) {
                    chatActivityEnterView.A2 = 0;
                }
                chatActivityEnterView.V0 = null;
                eg egVar = chatActivityEnterView.U0;
                if (egVar != null) {
                    if (chatActivityEnterView.d5 == null) {
                        egVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                og ogVar = chatActivityEnterView.Z2;
                if (ogVar != null) {
                    ogVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 2:
                rm rmVar = (rm) obj;
                sm smVar = rmVar.P;
                if (i18 == rmVar.O && smVar.w.isShown()) {
                    smVar.w.e(1, true);
                    break;
                }
                break;
            case 3:
                mz mzVar = (mz) obj;
                if (mzVar.P1) {
                    ny nyVar = mzVar.t1;
                    if (nyVar != null && nyVar.k()) {
                        try {
                            mzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    mzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new ld(mzVar, max, i14), max);
                    break;
                }
                break;
            case 4:
                ((cb0) obj).b.run(Integer.valueOf(i18));
                break;
            case 5:
                bg0 bg0Var = (bg0) obj;
                org.telegram.ui.au0 au0Var = bg0Var.a;
                TextView textView = au0Var.e;
                ci.bb bbVar = au0Var.h;
                RadialProgressView radialProgressView = au0Var.n;
                TextView textView2 = au0Var.d;
                textView.setVisibility(8);
                au0Var.f.setVisibility(8);
                LinearLayout linearLayout = au0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new ag0(bg0Var, i17));
                }
                if (bbVar.getAlpha() == 1.0f) {
                    bbVar.animate().cancel();
                    bbVar.animate().alpha(0.0f).setDuration(150L).setListener(new ag0(bg0Var, i16));
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
                        textView.setOnClickListener(new k80(bg0Var, 7));
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
                ij0 ij0Var = (ij0) obj;
                ij0Var.V0 = false;
                if (ij0Var.W0) {
                    ij0Var.C(true);
                    break;
                } else {
                    ij0Var.a1 = i18;
                    ij0Var.I();
                    ij0Var.x();
                    break;
                }
            case 7:
                ((lv0) obj).d1(i18);
                break;
            case 8:
                ((eu0) obj).h.scrollBy(0, i18);
                break;
            case 9:
                lv0 lv0Var = ((dt0) obj).a;
                org.telegram.ui.ActionBar.m2 m2Var = lv0Var.v1;
                if (m2Var != null) {
                    if (lv0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = lv0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = m2Var.getMessagesController().getInputChannel(lv0Var.d1.id);
                        TLRPC.ChatFull chatFull = lv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = lv0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = lv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            m2Var.getMessagesStorage().updateUserInfo(lv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    m2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    lv0Var.v1(true);
                    break;
                }
                break;
            case 10:
                ((ix0) obj).k0(i18, 0);
                break;
            case 11:
                v41 v41Var = (v41) obj;
                v41Var.U();
                v41Var.g0 = i18;
                k41.I(v41Var.f0);
                v41Var.V();
                break;
            case 12:
                ((x81) obj).v.x0(i18);
                break;
            case 13:
                q91 q91Var = (q91) obj;
                u71 u71Var = q91Var.a;
                if (i18 == -1) {
                    if (u71Var.y()) {
                        u71Var.B();
                        q91Var.n();
                    }
                    q91Var.J = false;
                    break;
                } else if (i18 == 1) {
                    if (q91Var.K) {
                        q91Var.K = false;
                        u71Var.C();
                        break;
                    }
                } else if (i18 != -3 && i18 == -2 && u71Var.y()) {
                    q91Var.K = true;
                    u71Var.B();
                    q91Var.n();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    d60Var.y3 = Integer.valueOf(i18);
                }
                xc xcVar = new xc(d60Var.topBulletinContainer, new ai.a1());
                Resources resources = d60Var.getContext().getResources();
                if (i18 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.d60.g1(i18)).k(d60Var.n1());
                break;
            case 15:
                org.telegram.ui.d60 d60Var2 = ((org.telegram.ui.g50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    d60Var2.y3 = Integer.valueOf(i18);
                }
                xc xcVar2 = new xc(d60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = d60Var2.getContext().getResources();
                if (i18 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.d60.g1(i18)).k(d60Var2.n1());
                break;
            case 16:
                org.telegram.ui.z60 z60Var = (org.telegram.ui.z60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = z60Var.n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = z60Var.n.getChildAt(i19);
                    z60Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(z60Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / z60Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 17:
                org.telegram.ui.cd0 cd0Var = (org.telegram.ui.cd0) obj;
                cd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                cd0Var.A0(false);
                break;
            case 18:
                ((org.telegram.ui.ae0) obj).a.f[i18].l(1.0f);
                break;
            case 19:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i18);
                break;
            case 20:
                ((org.telegram.ui.zk0) obj).run(Integer.valueOf(i18));
                break;
            case 21:
                ((org.telegram.ui.gp0) obj).e.p0.I.D(1 - i18);
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (nu0Var = photoViewer.e0) != null) {
                    nu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new ld(photoViewer, i20, 22), 100L);
                    break;
                }
                break;
            case 23:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 24:
                org.telegram.ui.p01 p01Var = (org.telegram.ui.p01) obj;
                org.telegram.ui.q01 q01Var = p01Var.h;
                NotificationCenter notificationCenter = q01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = q01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(p01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i18 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i21);
                profileActivity2.e5(false, false);
                break;
            case 25:
                org.telegram.ui.f21 f21Var = (org.telegram.ui.f21) obj;
                AndroidUtilities.hideKeyboard(f21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = f21Var.a;
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
                org.telegram.ui.v21 v21Var = (org.telegram.ui.v21) obj;
                s4.o0 layoutManager = v21Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = v21Var.R ? i18 > v21Var.L ? Math.min(i18 + 1, v21Var.b.d.size() - 1) : Math.max(i18 - 1, 0) : i18;
                    org.telegram.ui.s21 s21Var = v21Var.c;
                    s21Var.a = min2;
                    layoutManager.w0(s21Var);
                }
                v21Var.L = i18;
                break;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.k81 k81Var = sessionsActivity.a;
                if (k81Var != null) {
                    k81Var.l();
                    break;
                }
                break;
            case 28:
                mi1 mi1Var = (mi1) obj;
                mi1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = mi1Var.v;
                    if (d3Var.V != 3) {
                        d3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.H, 255);
                        d3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.O.setDuration(500L);
                        d3Var.O.start();
                    }
                    mi1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.d3 d3Var2 = mi1Var.v;
                    if (d3Var2.V != 2) {
                        d3Var2.V = 2;
                        d3Var2.c();
                        ValueAnimator valueAnimator = d3Var2.O;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            d3Var2.O.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(d3Var2.H, 0);
                        d3Var2.O = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var2, 0));
                        d3Var2.O.setDuration(500L);
                        d3Var2.O.start();
                    }
                    mi1Var.F.c(false);
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
                duration.setInterpolator(sr.f);
                jVar.P.addUpdateListener(new qg.f(jVar, i13));
                jVar.P.addListener(new qg.g(jVar, i15));
                jVar.P.start();
                break;
        }
    }
}
