package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class o8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o8(Object obj, int i10, int i11) {
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
        org.telegram.ui.cv0 cv0Var;
        int i12 = this.a;
        int i13 = 5;
        int i14 = 0;
        int i15 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                ((s8) obj).b(i15);
                break;
            case 1:
                md mdVar = (md) obj;
                di.d4 d4Var = mdVar.d1;
                if (mdVar.b1 != i15) {
                    mdVar.setTimer(i15);
                    Utilities.Callback callback = mdVar.r1;
                    if (callback != null) {
                        callback.run(Integer.valueOf(i15));
                    }
                    if (i15 == 0) {
                        replaceTags = LocaleController.getString(mdVar.q1 ? R.string.TimerPeriodVideoKeep : R.string.TimerPeriodPhotoKeep);
                        d4Var.h = mdVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.e0 = AndroidUtilities.dp(0);
                        d4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 == Integer.MAX_VALUE) {
                        replaceTags = LocaleController.getString(mdVar.q1 ? R.string.TimerPeriodVideoSetOnce : R.string.TimerPeriodPhotoSetOnce);
                        d4Var.h = mdVar.getMeasuredWidth();
                        d4Var.p(false);
                        d4Var.k(13.0f, 4.0f, 10.0f, 4.0f);
                        d4Var.e0 = AndroidUtilities.dp(0);
                        d4Var.d0 = -AndroidUtilities.dp(1.0f);
                    } else if (i15 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(mdVar.q1 ? "TimerPeriodVideoSetSeconds" : "TimerPeriodPhotoSetSeconds", i15, new Object[0]));
                        d4Var.p(true);
                        d4Var.h = di.d4.a(replaceTags, d4Var.getTextPaint());
                        d4Var.k(12.0f, 7.0f, 11.0f, 7.0f);
                        d4Var.e0 = AndroidUtilities.dp(2);
                        d4Var.d0 = 0.0f;
                    }
                    d4Var.setTranslationY(((-Math.min(AndroidUtilities.dp(34.0f), mdVar.getEditTextHeight())) - AndroidUtilities.dp(14.0f)) * (mdVar instanceof org.telegram.ui.jt0 ? -1.0f : 1.0f));
                    d4Var.s(replaceTags);
                    yj0 yj0Var = new yj0(i15 > 0 ? R.raw.fire_on : R.raw.fire_off, AndroidUtilities.dp(34.0f), AndroidUtilities.dp(34.0f));
                    yj0Var.start();
                    d4Var.j(yj0Var);
                    d4Var.u();
                    mdVar.o1 = false;
                    AndroidUtilities.cancelRunOnUIThread(mdVar.p1);
                    mdVar.invalidate();
                    break;
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i15 == 0) {
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
                    pgVar.z(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 3:
                dn dnVar = (dn) obj;
                en enVar = dnVar.P;
                if (i15 == dnVar.O && enVar.w.isShown()) {
                    enVar.w.e(1, true);
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) obj;
                org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                if (U != null) {
                    e3Var.dismiss();
                    PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, "create_bot");
                    premiumPreviewFragment.setCurrentAccount(i15);
                    U.presentFragment(premiumPreviewFragment);
                    break;
                }
                break;
            case 5:
                wz wzVar = (wz) obj;
                if (wzVar.P1) {
                    wy wyVar = wzVar.t1;
                    if (wyVar != null && wyVar.k()) {
                        try {
                            wzVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    wzVar.Q1 = true;
                    int max = Math.max(50, i15 - 100);
                    AndroidUtilities.runOnUIThread(new o8(wzVar, max, i13), max);
                    break;
                }
                break;
            case 6:
                ((pb0) obj).b.run(Integer.valueOf(i15));
                break;
            case 7:
                pg0 pg0Var = (pg0) obj;
                org.telegram.ui.pu0 pu0Var = pg0Var.a;
                TextView textView = pu0Var.e;
                di.ab abVar = pu0Var.h;
                RadialProgressView radialProgressView = pu0Var.n;
                TextView textView2 = pu0Var.d;
                textView.setVisibility(8);
                pu0Var.f.setVisibility(8);
                LinearLayout linearLayout = pu0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new og0(pg0Var, i14));
                }
                if (abVar.getAlpha() == 1.0f) {
                    abVar.animate().cancel();
                    abVar.animate().alpha(0.0f).setDuration(150L).setListener(new og0(pg0Var, 1));
                }
                if (i15 != 2) {
                    if (i15 != 5) {
                        if (i15 != 150) {
                            if (i15 == 100) {
                                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                                break;
                            } else if (i15 != 101) {
                            }
                        }
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                        textView.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new z80(pg0Var, 6));
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
            case 8:
                wj0 wj0Var = (wj0) obj;
                wj0Var.V0 = false;
                if (wj0Var.W0) {
                    wj0Var.C(true);
                    break;
                } else {
                    wj0Var.a1 = i15;
                    wj0Var.I();
                    wj0Var.x();
                    break;
                }
            case 9:
                ((xv0) obj).d1(i15);
                break;
            case 10:
                ((qu0) obj).h.scrollBy(0, i15);
                break;
            case 11:
                xv0 xv0Var = ((pt0) obj).a;
                org.telegram.ui.ActionBar.m2 m2Var = xv0Var.v1;
                if (m2Var != null) {
                    if (xv0Var.d1 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = xv0.d0(i15, true);
                        tL_channels_setMainProfileTab.channel = m2Var.getMessagesController().getInputChannel(xv0Var.d1.id);
                        TLRPC.ChatFull chatFull = xv0Var.d1;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = xv0.d0(i15, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = xv0Var.e1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            m2Var.getMessagesStorage().updateUserInfo(xv0Var.e1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    m2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    xv0Var.v1(true);
                    break;
                }
                break;
            case 12:
                ((ux0) obj).k0(i15, 0);
                break;
            case 13:
                i51 i51Var = (i51) obj;
                i51Var.V();
                i51Var.g0 = i15;
                x41.J(i51Var.f0);
                i51Var.W();
                break;
            case 14:
                ((j91) obj).v.x0(i15);
                break;
            case 15:
                ca1 ca1Var = (ca1) obj;
                h81 h81Var = ca1Var.a;
                if (i15 == -1) {
                    if (h81Var.y()) {
                        h81Var.B();
                        ca1Var.n();
                    }
                    ca1Var.J = false;
                    break;
                } else if (i15 == 1) {
                    if (ca1Var.K) {
                        ca1Var.K = false;
                        h81Var.C();
                        break;
                    }
                } else if (i15 != -3 && i15 == -2 && h81Var.y()) {
                    ca1Var.K = true;
                    h81Var.B();
                    ca1Var.n();
                    break;
                }
                break;
            case 16:
                org.telegram.ui.n60 n60Var = (org.telegram.ui.n60) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i15);
                    n60Var.y3 = Integer.valueOf(i15);
                }
                zc zcVar = new zc(n60Var.topBulletinContainer, new bi.s0());
                Resources resources = n60Var.getContext().getResources();
                if (i15 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                zcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.n60.h1(i15)).k(n60Var.o1());
                break;
            case 17:
                org.telegram.ui.n60 n60Var2 = ((org.telegram.ui.q50) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i15);
                    n60Var2.y3 = Integer.valueOf(i15);
                }
                zc zcVar2 = new zc(n60Var2.topBulletinContainer, new bi.s0());
                Resources resources2 = n60Var2.getContext().getResources();
                if (i15 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i15 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                zcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.n60.h1(i15)).k(n60Var2.o1());
                break;
            case 18:
                org.telegram.ui.j70 j70Var = (org.telegram.ui.j70) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = j70Var.n.getChildCount();
                for (int i16 = 0; i16 < childCount; i16++) {
                    View childAt = j70Var.n.getChildAt(i16);
                    j70Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i15) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(j70Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / j70Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 19:
                org.telegram.ui.nd0 nd0Var = (org.telegram.ui.nd0) obj;
                nd0Var.Y.h1(0, -AndroidUtilities.dp(i15));
                nd0Var.z0(false);
                break;
            case 20:
                ((org.telegram.ui.le0) obj).a.f[i15].l(1.0f);
                break;
            case 21:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.V = true;
                notificationsSettingsActivity.c.m(i15);
                break;
            case 22:
                ((org.telegram.ui.nl0) obj).run(Integer.valueOf(i15));
                break;
            case 23:
                ((org.telegram.ui.tp0) obj).e.p0.I.D(1 - i15);
                break;
            case 24:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.U8;
                int i17 = i15 + 1;
                if (i17 < 6 && (cv0Var = photoViewer.e0) != null) {
                    cv0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new o8(photoViewer, i17, 24), 100L);
                    break;
                }
                break;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.z0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.a;
                a2Var.R = string;
                a2Var.T = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i2.r(profileActivity, i15, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 26:
                org.telegram.ui.e11 e11Var = (org.telegram.ui.e11) obj;
                org.telegram.ui.f11 f11Var = e11Var.h;
                NotificationCenter notificationCenter = f11Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = f11Var.e;
                int i18 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i18);
                if (i15 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    pf.d.s(e11Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i15 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i18);
                profileActivity2.e5(false, false);
                break;
            case 27:
                org.telegram.ui.v21 v21Var = (org.telegram.ui.v21) obj;
                AndroidUtilities.hideKeyboard(v21Var.d.findFocus());
                while (true) {
                    EditTextBoldCursor[] editTextBoldCursorArr = v21Var.a;
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
            case 28:
                org.telegram.ui.k31 k31Var = (org.telegram.ui.k31) obj;
                s4.n0 layoutManager = k31Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = k31Var.R ? i15 > k31Var.L ? Math.min(i15 + 1, k31Var.b.d.size() - 1) : Math.max(i15 - 1, 0) : i15;
                    org.telegram.ui.h31 h31Var = k31Var.c;
                    h31Var.a = min2;
                    layoutManager.w0(h31Var);
                }
                k31Var.L = i15;
                break;
            default:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i15);
                sessionsActivity.m0();
                org.telegram.ui.a91 a91Var = sessionsActivity.a;
                if (a91Var != null) {
                    a91Var.l();
                    break;
                }
                break;
        }
    }
}
