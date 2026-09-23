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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
        org.telegram.ui.ou0 ou0Var;
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
                ci.e4 e4Var = ldVar.d1;
                if (ldVar.b1 != i18) {
                    ldVar.setTimer(i18);
                    Utilities.Callback callback = ldVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i18));
                    }
                    if (i18 == 0) {
                        replaceTags = LocaleController.getString(ldVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        e4Var.h = ldVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.e0 = AndroidUtilities.dp(0);
                        e4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(ldVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        e4Var.h = ldVar.getMeasuredWidth();
                        e4Var.p(false);
                        e4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        e4Var.e0 = AndroidUtilities.dp(0);
                        e4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i18 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(ldVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i18, new Object[0]));
                        e4Var.p(true);
                        e4Var.h = ci.e4.a(replaceTags, e4Var.getTextPaint());
                        e4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        e4Var.e0 = AndroidUtilities.dp(2);
                        e4Var.d0 = 0.0f;
                    }
                    e4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), ldVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (ldVar instanceof org.telegram.ui.vs0 ? -1.0f : 1.0f));
                    e4Var.s(replaceTags);
                    yi0 yi0Var = new yi0(i18 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yi0Var.start();
                    e4Var.j(yi0Var);
                    e4Var.u();
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
                    if (chatActivityEnterView.d5 == null) {
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
                qm qmVar = (qm) obj;
                rm rmVar = qmVar.P;
                if (i18 == qmVar.O && rmVar.w.isShown()) {
                    rmVar.w.e(1, true);
                    break;
                }
                break;
            case 3:
                lz lzVar = (lz) obj;
                if (lzVar.P1) {
                    ly lyVar = lzVar.t1;
                    if (lyVar != null && lyVar.k()) {
                        try {
                            lzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    lzVar.Q1 = true;
                    int max = Math.max(50, i18 - 100);
                    AndroidUtilities.runOnUIThread(new kd(lzVar, max, i14), max);
                    break;
                }
                break;
            case 4:
                ((pa0) obj).b.run(Integer.valueOf(i18));
                break;
            case 5:
                pf0 pf0Var = (pf0) obj;
                org.telegram.ui.bu0 bu0Var = pf0Var.a;
                TextView textView = bu0Var.e;
                ci.bb bbVar = bu0Var.h;
                RadialProgressView radialProgressView = bu0Var.n;
                TextView textView2 = bu0Var.d;
                textView.setVisibility(8);
                bu0Var.f.setVisibility(8);
                LinearLayout linearLayout = bu0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, i17));
                }
                if (bbVar.getAlpha() == 1.0f) {
                    bbVar.animate().cancel();
                    bbVar.animate().alpha(0.0f).setDuration(150L).setListener(new of0(pf0Var, i16));
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
                        textView.setOnClickListener(new y70(pf0Var, 7));
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
                ((yu0) obj).d1(i18);
                break;
            case 8:
                ((rt0) obj).h.scrollBy(0, i18);
                break;
            case 9:
                yu0 yu0Var = ((qs0) obj).a;
                org.telegram.ui.ActionBar.n2 n2Var = yu0Var.v1;
                if (n2Var != null) {
                    if (yu0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = yu0.d0(i18, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(yu0Var.d1.id);
                        TLRPC.ChatFull chatFull = yu0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = yu0.d0(i18, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = yu0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(yu0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    yu0Var.v1(true);
                    break;
                }
                break;
            case 10:
                ((vw0) obj).k0(i18, 0);
                break;
            case 11:
                f41 f41Var = (f41) obj;
                f41Var.U();
                f41Var.g0 = i18;
                u31.I(f41Var.f0);
                f41Var.V();
                break;
            case 12:
                ((g81) obj).v.x0(i18);
                break;
            case 13:
                b91 b91Var = (b91) obj;
                f71 f71Var = b91Var.a;
                if (i18 == -1) {
                    if (f71Var.y()) {
                        f71Var.B();
                        b91Var.n();
                    }
                    b91Var.J = false;
                    break;
                } else if (i18 == 1) {
                    if (b91Var.K) {
                        b91Var.K = false;
                        f71Var.C();
                        break;
                    }
                } else if (i18 != -3 && i18 == -2 && f71Var.y()) {
                    b91Var.K = true;
                    f71Var.B();
                    b91Var.n();
                    break;
                }
                break;
            case 14:
                org.telegram.ui.f60 f60Var = (org.telegram.ui.f60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i18);
                    f60Var.y3 = Integer.valueOf(i18);
                }
                xc xcVar = new xc(f60Var.topBulletinContainer, new ai.a1());
                Resources resources = f60Var.getContext().getResources();
                if (i18 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.f60.g1(i18)).k(f60Var.n1());
                break;
            case 15:
                org.telegram.ui.f60 f60Var2 = ((org.telegram.ui.i50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i18);
                    f60Var2.y3 = Integer.valueOf(i18);
                }
                xc xcVar2 = new xc(f60Var2.topBulletinContainer, new ai.a1());
                Resources resources2 = f60Var2.getContext().getResources();
                if (i18 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i18 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                xcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.f60.g1(i18)).k(f60Var2.n1());
                break;
            case 16:
                org.telegram.ui.b70 b70Var = (org.telegram.ui.b70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = b70Var.n.getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    View childAt = b70Var.n.getChildAt(i19);
                    b70Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i18) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(b70Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / b70Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 17:
                org.telegram.ui.dd0 dd0Var = (org.telegram.ui.dd0) obj;
                dd0Var.Y.h1(0, -AndroidUtilities.dp(i18));
                dd0Var.A0(false);
                break;
            case 18:
                ((org.telegram.ui.be0) obj).a.f[i18].l(1.0f);
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
                ((org.telegram.ui.hp0) obj).e.p0.I.D(1 - i18);
                break;
            case 22:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i20 = i18 + 1;
                if (i20 < 6 && (ou0Var = photoViewer.e0) != null) {
                    ou0Var.invalidate();
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
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.s(profileActivity, i18, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 24:
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
            case 25:
                org.telegram.ui.h21 h21Var = (org.telegram.ui.h21) obj;
                AndroidUtilities.hideKeyboard(h21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = h21Var.a;
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
                org.telegram.ui.w21 w21Var = (org.telegram.ui.w21) obj;
                s4.o0 layoutManager = w21Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = w21Var.R ? i18 > w21Var.L ? Math.min(i18 + 1, w21Var.b.d.size() - 1) : Math.max(i18 - 1, 0) : i18;
                    org.telegram.ui.t21 t21Var = w21Var.c;
                    t21Var.a = min2;
                    layoutManager.w0(t21Var);
                }
                w21Var.L = i18;
                break;
            case 27:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i18);
                sessionsActivity.m0();
                org.telegram.ui.i81 i81Var = sessionsActivity.a;
                if (i81Var != null) {
                    i81Var.l();
                    break;
                }
                break;
            case 28:
                mi1 mi1Var = (mi1) obj;
                mi1Var.F.setSignalBarCount(i18);
                if (i18 <= 1) {
                    org.telegram.ui.Components.voip.c3 c3Var = mi1Var.v;
                    if (c3Var.V != 3) {
                        c3Var.V = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(c3Var.H, 255);
                        c3Var.O = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.a3(c3Var, 2));
                        c3Var.O.setDuration(500L);
                        c3Var.O.start();
                    }
                    mi1Var.F.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.c3 c3Var2 = mi1Var.v;
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
                duration.setInterpolator(rr.f);
                jVar.P.addUpdateListener(new qg.f(jVar, i13));
                jVar.P.addListener(new qg.g(jVar, i15));
                jVar.P.start();
                break;
        }
    }
}
