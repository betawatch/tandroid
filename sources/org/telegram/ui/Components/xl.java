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
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SessionsActivity;
import org.telegram.ui.lh1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xl implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xl(Object obj, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i10;
        int i11;
        org.telegram.ui.ut0 ut0Var;
        int i12 = this.a;
        int i13 = 0;
        int i14 = this.b;
        Object obj = this.c;
        switch (i12) {
            case 0:
                dm dmVar = (dm) obj;
                em emVar = dmVar.L;
                if (i14 == dmVar.K && emVar.w.isShown()) {
                    emVar.w.e(1, true);
                    break;
                }
                break;
            case 1:
                yy yyVar = (yy) obj;
                if (yyVar.L1) {
                    xx xxVar = yyVar.p1;
                    if (xxVar != null && xxVar.k()) {
                        try {
                            yyVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    yyVar.M1 = true;
                    int max = Math.max(50, i14 - 100);
                    AndroidUtilities.runOnUIThread(new xl(yyVar, max, 1), max);
                    break;
                }
                break;
            case 2:
                ((ba0) obj).b.run(Integer.valueOf(i14));
                break;
            case 3:
                cf0 cf0Var = (cf0) obj;
                org.telegram.ui.ht0 ht0Var = cf0Var.a;
                TextView textView = ht0Var.e;
                ag.s0 s0Var = ht0Var.h;
                RadialProgressView radialProgressView = ht0Var.n;
                TextView textView2 = ht0Var.d;
                textView.setVisibility(8);
                ht0Var.f.setVisibility(8);
                LinearLayout linearLayout = ht0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new bf0(cf0Var, i13));
                }
                if (s0Var.getAlpha() == 1.0f) {
                    s0Var.animate().cancel();
                    s0Var.animate().alpha(0.0f).setDuration(150L).setListener(new bf0(cf0Var, 1));
                }
                if (i14 != 2) {
                    if (i14 != 5) {
                        if (i14 != 150) {
                            if (i14 == 100) {
                                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                                break;
                            } else if (i14 != 101) {
                            }
                        }
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                        textView.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new l70(cf0Var, 7));
                        break;
                    } else {
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorHTML));
                        break;
                    }
                } else {
                    textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorInvalid));
                    break;
                }
            case 4:
                ki0 ki0Var = (ki0) obj;
                ki0Var.R0 = false;
                if (ki0Var.S0) {
                    ki0Var.A(true);
                    break;
                } else {
                    ki0Var.W0 = i14;
                    ki0Var.G();
                    ki0Var.v();
                    break;
                }
            case 5:
                ((hu0) obj).d1(i14);
                break;
            case 6:
                ((zs0) obj).h.scrollBy(0, i14);
                break;
            case 7:
                hu0 hu0Var = ((xr0) obj).a;
                org.telegram.ui.ActionBar.n2 n2Var = hu0Var.r1;
                if (n2Var != null) {
                    if (hu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = hu0.d0(i14, true);
                        tL_channels_setMainProfileTab.channel = n2Var.getMessagesController().getInputChannel(hu0Var.Z0.id);
                        TLRPC.ChatFull chatFull = hu0Var.Z0;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = hu0.d0(i14, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = hu0Var.a1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            n2Var.getMessagesStorage().updateUserInfo(hu0Var.a1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    n2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    hu0Var.v1(true);
                    break;
                }
                break;
            case 8:
                ((gw0) obj).k0(i14, 0);
                break;
            case 9:
                m31 m31Var = (m31) obj;
                m31Var.U();
                m31Var.c0 = i14;
                b31.I(m31Var.b0);
                m31Var.V();
                break;
            case 10:
                ((o71) obj).v.x0(i14);
                break;
            case 11:
                i81 i81Var = (i81) obj;
                m61 m61Var = i81Var.a;
                if (i14 == -1) {
                    if (m61Var.z()) {
                        m61Var.C();
                        i81Var.n();
                    }
                    i81Var.F = false;
                    break;
                } else if (i14 == 1) {
                    if (i81Var.G) {
                        i81Var.G = false;
                        m61Var.D();
                        break;
                    }
                } else if (i14 != -3 && i14 == -2 && m61Var.z()) {
                    i81Var.G = true;
                    m61Var.C();
                    i81Var.n();
                    break;
                }
                break;
            case 12:
                org.telegram.ui.s50 s50Var = (org.telegram.ui.s50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i14);
                    s50Var.u3 = Integer.valueOf(i14);
                }
                mc mcVar = new mc(s50Var.topBulletinContainer, new jh.h0());
                Resources resources = s50Var.getContext().getResources();
                if (i14 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i14 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                mcVar.L(resources.getDrawable(i10).mutate(), org.telegram.ui.s50.g1(i14)).k(s50Var.n1());
                break;
            case 13:
                org.telegram.ui.s50 s50Var2 = ((org.telegram.ui.v40) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i14);
                    s50Var2.u3 = Integer.valueOf(i14);
                }
                mc mcVar2 = new mc(s50Var2.topBulletinContainer, new jh.h0());
                Resources resources2 = s50Var2.getContext().getResources();
                if (i14 == 2) {
                    i11 = R.drawable.msg_voice_bluetooth;
                } else if (i14 == 0) {
                    i11 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i11 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                mcVar2.L(resources2.getDrawable(i11).mutate(), org.telegram.ui.s50.g1(i14)).k(s50Var2.n1());
                break;
            case 14:
                org.telegram.ui.o60 o60Var = (org.telegram.ui.o60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = o60Var.n.getChildCount();
                for (int i15 = 0; i15 < childCount; i15++) {
                    View childAt = o60Var.n.getChildAt(i15);
                    o60Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i14) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(o60Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / o60Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 15:
                org.telegram.ui.tc0 tc0Var = (org.telegram.ui.tc0) obj;
                tc0Var.U.h1(0, -AndroidUtilities.dp(i14));
                tc0Var.A0(false);
                break;
            case 16:
                ((org.telegram.ui.sd0) obj).a.f[i14].l(1.0f);
                break;
            case 17:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.R = true;
                notificationsSettingsActivity.c.m(i14);
                break;
            case 18:
                ((org.telegram.ui.qk0) obj).run(Integer.valueOf(i14));
                break;
            case 19:
                ((org.telegram.ui.po0) obj).e.f0.y.D(1 - i14);
                break;
            case 20:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                int i16 = i14 + 1;
                if (i16 < 6 && (ut0Var = photoViewer.a0) != null) {
                    ut0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new xl(photoViewer, i16, 20), 100L);
                    break;
                }
                break;
            case 21:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.a;
                b2Var.N = string;
                b2Var.P = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cg.p2(profileActivity, i14, 16));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 22:
                org.telegram.ui.uz0 uz0Var = (org.telegram.ui.uz0) obj;
                org.telegram.ui.vz0 vz0Var = uz0Var.h;
                NotificationCenter notificationCenter = vz0Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = vz0Var.e;
                int i17 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i17);
                if (i14 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    we.e.s(uz0Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i14 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i17);
                profileActivity2.e5(false, false);
                break;
            case 23:
                org.telegram.ui.x11 x11Var = (org.telegram.ui.x11) obj;
                f2.x0 layoutManager = x11Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = x11Var.N ? i14 > x11Var.H ? Math.min(i14 + 1, x11Var.b.d.size() - 1) : Math.max(i14 - 1, 0) : i14;
                    org.telegram.ui.u11 u11Var = x11Var.c;
                    u11Var.a = min2;
                    layoutManager.w0(u11Var);
                }
                x11Var.H = i14;
                break;
            case 24:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i14);
                sessionsActivity.m0();
                org.telegram.ui.j71 j71Var = sessionsActivity.a;
                if (j71Var != null) {
                    j71Var.l();
                    break;
                }
                break;
            case 25:
                lh1 lh1Var = (lh1) obj;
                lh1Var.B.setSignalBarCount(i14);
                if (i14 <= 1) {
                    org.telegram.ui.Components.voip.b3 b3Var = lh1Var.v;
                    if (b3Var.R != 3) {
                        b3Var.R = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(b3Var.D, 255);
                        b3Var.K = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var, 2));
                        b3Var.K.setDuration(500L);
                        b3Var.K.start();
                    }
                    lh1Var.B.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.b3 b3Var2 = lh1Var.v;
                    if (b3Var2.R != 2) {
                        b3Var2.R = 2;
                        b3Var2.c();
                        ValueAnimator valueAnimator = b3Var2.K;
                        if (valueAnimator != null) {
                            valueAnimator.removeAllUpdateListeners();
                            b3Var2.K.cancel();
                        }
                        ValueAnimator ofInt2 = ValueAnimator.ofInt(b3Var2.D, 0);
                        b3Var2.K = ofInt2;
                        ofInt2.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var2, 0));
                        b3Var2.K.setDuration(500L);
                        b3Var2.K.start();
                    }
                    lh1Var.B.c(false);
                    break;
                }
            case 26:
                ((pf.z) obj).m(i14);
                break;
            case 27:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i14).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i14).stepThis().dispose();
                    break;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 28:
                f2.p0 p0Var = (f2.p0) obj;
                p0Var.getClass();
                try {
                    p0Var.a.scrollBy(0, i14);
                    break;
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
            default:
                rh.b0 b0Var = (rh.b0) obj;
                rh.e0 e0Var = b0Var.f;
                if (b0Var.c && e0Var.A != null && e0Var.a != null) {
                    b0Var.d = true;
                    b0Var.a.setPressed(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    rh.c0 c0Var = e0Var.A;
                    rh.a aVar = e0Var.a;
                    rh.p3 p3Var = ((rh.h3) c0Var).a;
                    p3Var.o3(false);
                    p3Var.d3.C(new rh.m3(p3Var, aVar, i14), b0Var);
                    break;
                }
                break;
        }
    }
}
