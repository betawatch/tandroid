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
import org.telegram.ui.ki1;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
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
        org.telegram.ui.qu0 qu0Var;
        int i12 = this.a;
        int i13 = 5;
        int i14 = 3;
        int i15 = 2;
        int i16 = 0;
        int i17 = 1;
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
                    e4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), mdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (mdVar instanceof org.telegram.ui.xs0 ? -1.0f : 1.0f));
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
                fg fgVar = chatActivityEnterView.U0;
                if (fgVar != null) {
                    if (chatActivityEnterView.d5 == null) {
                        fgVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.U0.setVisibility(8);
                    chatActivityEnterView.n1.removeView(chatActivityEnterView.U0);
                    if (chatActivityEnterView.G3) {
                        chatActivityEnterView.G3 = false;
                        chatActivityEnterView.U0 = null;
                    }
                }
                pg pgVar = chatActivityEnterView.Z2;
                if (pgVar != null) {
                    pgVar.y(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 2:
                sm smVar = (sm) obj;
                tm tmVar = smVar.P;
                if (i18 == smVar.O && tmVar.w.isShown()) {
                    tmVar.w.e(1, true);
                    break;
                }
                break;
            case 3:
                nz nzVar = (nz) obj;
                if (nzVar.P1) {
                    oy oyVar = nzVar.t1;
                    if (oyVar != null && oyVar.k()) {
                        try {
                            nzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    nzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new ld(nzVar, max, i14), max);
                    break;
                }
                break;
            case 4:
                ((cb0) obj).b.run(Integer.valueOf(i18));
                break;
            case 5:
                cg0 cg0Var = (cg0) obj;
                org.telegram.ui.du0 du0Var = cg0Var.a;
                TextView textView = du0Var.e;
                ci.ab abVar = du0Var.h;
                RadialProgressView radialProgressView = du0Var.n;
                TextView textView2 = du0Var.d;
                textView.setVisibility(8);
                du0Var.f.setVisibility(8);
                LinearLayout linearLayout = du0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new bg0(cg0Var, i16));
                }
                if (abVar.getAlpha() == 1.0f) {
                    abVar.animate().cancel();
                    abVar.animate().alpha(0.0f).setDuration(150L).setListener(new bg0(cg0Var, i17));
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
                        textView.setOnClickListener(new l80(cg0Var, 7));
                        break;
                    } else {
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                        break;
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                    break;
                }
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
                ((qv0) obj).d1(i18);
                break;
            case 8:
                ((ju0) obj).h.scrollBy(0, i18);
                break;
            case 9:
                qv0 qv0Var = ((it0) obj).a;
                org.telegram.ui.ActionBar.n2 n2Var = qv0Var.v1;
                if (n2Var != null) {
                    if (qv0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = qv0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(qv0Var.d1.id);
                        TLRPC.ChatFull chatFull = qv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = qv0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = qv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(qv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    qv0Var.v1(true);
                    break;
                }
                break;
            case 10:
                f51 f51Var = (f51) obj;
                f51Var.S();
                f51Var.g0 = i18;
                u41.G(f51Var.f0);
                f51Var.T();
                break;
            case 11:
                ((g91) obj).v.y0(i18);
                break;
            case 12:
                aa1 aa1Var = (aa1) obj;
                e81 e81Var = aa1Var.a;
                if (i18 == -1) {
                    if (e81Var.y()) {
                        e81Var.B();
                        aa1Var.n();
                    }
                    aa1Var.J = false;
                    break;
                } else if (i18 == 1) {
                    if (aa1Var.K) {
                        aa1Var.K = false;
                        e81Var.C();
                        break;
                    }
                } else if (i18 != -3 && i18 == -2 && e81Var.y()) {
                    aa1Var.K = true;
                    e81Var.B();
                    aa1Var.n();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.h60 h60Var = (org.telegram.ui.h60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    h60Var.y3 = Integer.valueOf(i18);
                }
                yc ycVar = new yc(h60Var.topBulletinContainer, new ai.a1());
                Resources resources = h60Var.getContext().getResources();
                if (i18 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ycVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.h60.g1(i18)).k(h60Var.n1());
                break;
            case 14:
                org.telegram.ui.h60 h60Var2 = ((org.telegram.ui.l50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    h60Var2.y3 = Integer.valueOf(i18);
                }
                yc ycVar2 = new yc(h60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = h60Var2.getContext().getResources();
                if (i18 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ycVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.h60.g1(i18)).k(h60Var2.n1());
                break;
            case 15:
                org.telegram.ui.d70 d70Var = (org.telegram.ui.d70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = d70Var.n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = d70Var.n.getChildAt(i19);
                    d70Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(d70Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / d70Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 16:
                org.telegram.ui.gd0 gd0Var = (org.telegram.ui.gd0) obj;
                gd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                gd0Var.A0(false);
                break;
            case 17:
                ((org.telegram.ui.ee0) obj).a.f[i18].l(1.0f);
                break;
            case 18:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i18);
                break;
            case 19:
                ((org.telegram.ui.dl0) obj).run(Integer.valueOf(i18));
                break;
            case 20:
                ((org.telegram.ui.jp0) obj).e.p0.I.E(1 - i18);
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (qu0Var = photoViewer.e0) != null) {
                    qu0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new ld(photoViewer, i20, 21), 100L);
                    break;
                }
                break;
            case 22:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.R = string;
                b2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 23:
                org.telegram.ui.r01 r01Var = (org.telegram.ui.r01) obj;
                org.telegram.ui.s01 s01Var = r01Var.h;
                NotificationCenter notificationCenter = s01Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = s01Var.e;
                int i21 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i21);
                if (i18 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    nf.f.s(r01Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i18 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i21);
                profileActivity2.e5(false, false);
                break;
            case 24:
                org.telegram.ui.h21 h21Var = (org.telegram.ui.h21) obj;
                AndroidUtilities.hideKeyboard(h21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = h21Var.a;
                    if (i16 >= editTextBoldCursorArr.length) {
                        break;
                    } else {
                        if (i16 != 0 && ((i18 != 3 || i16 != 4) && ((i18 != 2 || (i16 != 4 && i16 != 1)) && (i18 != 1 || (i16 != 1 && i16 != 2 && i16 != 3))))) {
                            editTextBoldCursorArr[i16].setText((CharSequence) null);
                        }
                        i16++;
                    }
                }
                break;
            case 25:
                org.telegram.ui.x21 x21Var = (org.telegram.ui.x21) obj;
                s4.o0 layoutManager = x21Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = x21Var.R ? i18 > x21Var.L ? Math.min(i18 + 1, x21Var.b.d.size() - 1) : Math.max(i18 - 1, 0) : i18;
                    org.telegram.ui.u21 u21Var = x21Var.c;
                    u21Var.a = min2;
                    layoutManager.w0(u21Var);
                }
                x21Var.L = i18;
                break;
            case 26:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.j81 j81Var = sessionsActivity.a;
                if (j81Var != null) {
                    j81Var.l();
                    break;
                }
                break;
            case 27:
                ki1 ki1Var = (ki1) obj;
                ki1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.d3 d3Var = ki1Var.v;
                    if (d3Var.V != 3) {
                        d3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(d3Var.H, 255);
                        d3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.b3(d3Var, 2));
                        d3Var.O.setDuration(500L);
                        d3Var.O.start();
                    }
                    ki1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.d3 d3Var2 = ki1Var.v;
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
                    ki1Var.F.c(false);
                    break;
                }
            case 28:
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
                duration.setInterpolator(tr.f);
                jVar.P.addUpdateListener(new qg.f(jVar, i13));
                jVar.P.addListener(new qg.g(jVar, i15));
                jVar.P.start();
                break;
            default:
                org.telegram.ui.vt0 vt0Var = (org.telegram.ui.vt0) obj;
                pg.t1 t1Var = vt0Var.K1;
                vt0Var.t0(t1Var, null);
                pg.u0.e(i18).j(t1Var.c);
                break;
        }
    }
}
