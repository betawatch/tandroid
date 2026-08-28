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
import org.telegram.ui.mh1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qd(Object obj, int i9, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = i9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab;
        int i9;
        int i10;
        org.telegram.ui.tt0 tt0Var;
        int i11 = this.a;
        int i12 = 0;
        int i13 = this.b;
        Object obj = this.c;
        switch (i11) {
            case 0:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj;
                if (i13 == 0) {
                    chatActivityEnterView.v2 = 0;
                }
                chatActivityEnterView.R0 = null;
                uf ufVar = chatActivityEnterView.Q0;
                if (ufVar != null) {
                    if (chatActivityEnterView.Y4 == null) {
                        ufVar.setTranslationY(0.0f);
                    }
                    chatActivityEnterView.Q0.setVisibility(8);
                    chatActivityEnterView.i1.removeView(chatActivityEnterView.Q0);
                    if (chatActivityEnterView.B3) {
                        chatActivityEnterView.B3 = false;
                        chatActivityEnterView.Q0 = null;
                    }
                }
                eg egVar = chatActivityEnterView.U2;
                if (egVar != null) {
                    egVar.o(0.0f);
                }
                chatActivityEnterView.requestLayout();
                break;
            case 1:
                gm gmVar = (gm) obj;
                hm hmVar = gmVar.L;
                if (i13 == gmVar.K && hmVar.w.isShown()) {
                    hmVar.w.e(1, true);
                    break;
                }
                break;
            case 2:
                wy wyVar = (wy) obj;
                if (wyVar.L1) {
                    wx wxVar = wyVar.p1;
                    if (wxVar != null && wxVar.k()) {
                        try {
                            wyVar.x.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                    }
                    wyVar.M1 = true;
                    int max = Math.max(50, i13 - 100);
                    AndroidUtilities.runOnUIThread(new qd(wyVar, max, 2), max);
                    break;
                }
                break;
            case 3:
                ((x90) obj).b.run(Integer.valueOf(i13));
                break;
            case 4:
                ye0 ye0Var = (ye0) obj;
                org.telegram.ui.gt0 gt0Var = ye0Var.a;
                TextView textView = gt0Var.e;
                fh.l2 l2Var = gt0Var.h;
                RadialProgressView radialProgressView = gt0Var.n;
                TextView textView2 = gt0Var.d;
                textView.setVisibility(8);
                gt0Var.f.setVisibility(8);
                LinearLayout linearLayout = gt0Var.c;
                if (linearLayout.getVisibility() == 8) {
                    linearLayout.setVisibility(0);
                    linearLayout.animate().cancel();
                    linearLayout.animate().alpha(1.0f).setDuration(150L).start();
                }
                if (radialProgressView.getAlpha() == 1.0f) {
                    radialProgressView.animate().cancel();
                    radialProgressView.animate().alpha(0.0f).setDuration(150L).setListener(new xe0(ye0Var, i12));
                }
                if (l2Var.getAlpha() == 1.0f) {
                    l2Var.animate().cancel();
                    l2Var.animate().alpha(0.0f).setDuration(150L).setListener(new xe0(ye0Var, 1));
                }
                if (i13 != 2) {
                    if (i13 != 5) {
                        if (i13 != 150) {
                            if (i13 == 100) {
                                textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotFound));
                                break;
                            } else if (i13 != 101) {
                            }
                        }
                        textView2.setText(LocaleController.getString(R.string.YouTubeVideoErrorNotAvailableInApp));
                        textView.setText(LocaleController.getString(R.string.YouTubeVideoErrorOpenExternal));
                        textView.setVisibility(0);
                        textView.setOnClickListener(new h70(ye0Var, 7));
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
            case 5:
                ii0 ii0Var = (ii0) obj;
                ii0Var.R0 = false;
                if (ii0Var.S0) {
                    ii0Var.A(true);
                    break;
                } else {
                    ii0Var.W0 = i13;
                    ii0Var.G();
                    ii0Var.v();
                    break;
                }
            case 6:
                ((eu0) obj).d1(i13);
                break;
            case 7:
                ((xs0) obj).h.scrollBy(0, i13);
                break;
            case 8:
                eu0 eu0Var = ((wr0) obj).a;
                org.telegram.ui.ActionBar.o2 o2Var = eu0Var.r1;
                if (o2Var != null) {
                    if (eu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                        TLRPC.TL_channels_setMainProfileTab tL_channels_setMainProfileTab = new TLRPC.TL_channels_setMainProfileTab();
                        tL_channels_setMainProfileTab.tab = eu0.d0(i13, true);
                        tL_channels_setMainProfileTab.channel = o2Var.getMessagesController().getInputChannel(eu0Var.Z0.id);
                        TLRPC.ChatFull chatFull = eu0Var.Z0;
                        chatFull.flags2 |= TLObject.FLAG_22;
                        chatFull.main_tab = tL_channels_setMainProfileTab.tab;
                        tL_account_setMainProfileTab = tL_channels_setMainProfileTab;
                    } else {
                        TLRPC.TL_account_setMainProfileTab tL_account_setMainProfileTab2 = new TLRPC.TL_account_setMainProfileTab();
                        TLRPC.ProfileTab d02 = eu0.d0(i13, true);
                        tL_account_setMainProfileTab2.tab = d02;
                        TLRPC.UserFull userFull = eu0Var.a1;
                        tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        if (userFull != null) {
                            userFull.flags2 |= 1048576;
                            userFull.main_tab = d02;
                            o2Var.getMessagesStorage().updateUserInfo(eu0Var.a1, true);
                            tL_account_setMainProfileTab = tL_account_setMainProfileTab2;
                        }
                    }
                    o2Var.getConnectionsManager().sendRequest(tL_account_setMainProfileTab, null);
                    eu0Var.v1(true);
                    break;
                }
                break;
            case 9:
                ((ew0) obj).k0(i13, 0);
                break;
            case 10:
                k31 k31Var = (k31) obj;
                k31Var.T();
                k31Var.c0 = i13;
                z21.H(k31Var.b0);
                k31Var.U();
                break;
            case 11:
                ((m71) obj).v.x0(i13);
                break;
            case 12:
                g81 g81Var = (g81) obj;
                k61 k61Var = g81Var.a;
                if (i13 == -1) {
                    if (k61Var.z()) {
                        k61Var.C();
                        g81Var.n();
                    }
                    g81Var.F = false;
                    break;
                } else if (i13 == 1) {
                    if (g81Var.G) {
                        g81Var.G = false;
                        k61Var.D();
                        break;
                    }
                } else if (i13 != -3 && i13 == -2 && k61Var.z()) {
                    g81Var.G = true;
                    k61Var.C();
                    g81Var.n();
                    break;
                }
                break;
            case 13:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) obj;
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    sharedInstance.setAudioOutput(i13);
                    o50Var.u3 = Integer.valueOf(i13);
                }
                oc ocVar = new oc(o50Var.topBulletinContainer, new ih.j0());
                Resources resources = o50Var.getContext().getResources();
                if (i13 == 2) {
                    i9 = R.drawable.msg_voice_bluetooth;
                } else if (i13 == 0) {
                    i9 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    i9 = (sharedInstance2 == null || !sharedInstance2.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ocVar.L(resources.getDrawable(i9).mutate(), org.telegram.ui.o50.g1(i13)).k(o50Var.n1());
                break;
            case 14:
                org.telegram.ui.o50 o50Var2 = ((org.telegram.ui.r40) obj).b;
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null) {
                    sharedInstance3.setAudioOutput(i13);
                    o50Var2.u3 = Integer.valueOf(i13);
                }
                oc ocVar2 = new oc(o50Var2.topBulletinContainer, new ih.j0());
                Resources resources2 = o50Var2.getContext().getResources();
                if (i13 == 2) {
                    i10 = R.drawable.msg_voice_bluetooth;
                } else if (i13 == 0) {
                    i10 = R.drawable.msg_voice_speaker;
                } else {
                    VoIPService sharedInstance4 = VoIPService.getSharedInstance();
                    i10 = (sharedInstance4 == null || !sharedInstance4.isHeadsetPlugged()) ? R.drawable.msg_voice_phone : R.drawable.msg_voice_headphones;
                }
                ocVar2.L(resources2.getDrawable(i10).mutate(), org.telegram.ui.o50.g1(i13)).k(o50Var2.n1());
                break;
            case 15:
                org.telegram.ui.k60 k60Var = (org.telegram.ui.k60) obj;
                AnimatorSet animatorSet = new AnimatorSet();
                int childCount = k60Var.n.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = k60Var.n.getChildAt(i14);
                    k60Var.n.getClass();
                    if (RecyclerView.R(childAt) >= i13) {
                        childAt.setAlpha(0.0f);
                        int min = (int) ((Math.min(k60Var.n.getMeasuredHeight(), Math.max(0, childAt.getTop())) / k60Var.n.getMeasuredHeight()) * 100.0f);
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                        ofFloat.setStartDelay(min);
                        ofFloat.setDuration(200L);
                        animatorSet.playTogether(ofFloat);
                    }
                }
                animatorSet.start();
                break;
            case 16:
                org.telegram.ui.pc0 pc0Var = (org.telegram.ui.pc0) obj;
                pc0Var.U.h1(0, -AndroidUtilities.dp(i13));
                pc0Var.z0(false);
                break;
            case 17:
                ((org.telegram.ui.pd0) obj).a.f[i13].l(1.0f);
                break;
            case 18:
                NotificationsSettingsActivity notificationsSettingsActivity = (NotificationsSettingsActivity) obj;
                notificationsSettingsActivity.R = true;
                notificationsSettingsActivity.c.m(i13);
                break;
            case 19:
                ((org.telegram.ui.qk0) obj).run(Integer.valueOf(i13));
                break;
            case 20:
                ((org.telegram.ui.oo0) obj).e.f0.y.D(1 - i13);
                break;
            case 21:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.P8;
                int i15 = i13 + 1;
                if (i15 < 6 && (tt0Var = photoViewer.a0) != null) {
                    tt0Var.invalidate();
                    AndroidUtilities.runOnUIThread(new qd(photoViewer, i15, 21), 100L);
                    break;
                }
                break;
            case 22:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(profileActivity.getParentActivity(), 0, profileActivity.v0);
                String string = LocaleController.getString(R.string.ProfileNotesRemoveTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.N = string;
                c2Var.P = LocaleController.getString(R.string.ProfileNotesRemoveText);
                alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new bg.x2(profileActivity, i13, 16));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.o();
                break;
            case 23:
                org.telegram.ui.uz0 uz0Var = (org.telegram.ui.uz0) obj;
                org.telegram.ui.vz0 vz0Var = uz0Var.h;
                NotificationCenter notificationCenter = vz0Var.e.getNotificationCenter();
                ProfileActivity profileActivity2 = vz0Var.e;
                int i16 = NotificationCenter.newSuggestionsAvailable;
                notificationCenter.removeObserver(profileActivity2, i16);
                if (i13 == 2) {
                    profileActivity2.getMessagesController().removeSuggestion(0L, "PREMIUM_GRACE");
                    ve.e.s(uz0Var.getContext(), profileActivity2.getMessagesController().premiumManageSubscriptionUrl);
                } else {
                    profileActivity2.getMessagesController().removeSuggestion(0L, i13 == 0 ? "VALIDATE_PHONE_NUMBER" : "VALIDATE_PASSWORD");
                }
                profileActivity2.getNotificationCenter().addObserver(profileActivity2, i16);
                profileActivity2.e5(false, false);
                break;
            case 24:
                org.telegram.ui.y11 y11Var = (org.telegram.ui.y11) obj;
                f2.z0 layoutManager = y11Var.y.getLayoutManager();
                if (layoutManager != null) {
                    int min2 = y11Var.N ? i13 > y11Var.H ? Math.min(i13 + 1, y11Var.b.d.size() - 1) : Math.max(i13 - 1, 0) : i13;
                    org.telegram.ui.v11 v11Var = y11Var.c;
                    v11Var.a = min2;
                    layoutManager.w0(v11Var);
                }
                y11Var.H = i13;
                break;
            case 25:
                SessionsActivity sessionsActivity = (SessionsActivity) obj;
                sessionsActivity.h.remove(i13);
                sessionsActivity.l0();
                org.telegram.ui.k71 k71Var = sessionsActivity.a;
                if (k71Var != null) {
                    k71Var.l();
                    break;
                }
                break;
            case 26:
                mh1 mh1Var = (mh1) obj;
                mh1Var.B.setSignalBarCount(i13);
                if (i13 <= 1) {
                    org.telegram.ui.Components.voip.b3 b3Var = mh1Var.v;
                    if (b3Var.R != 3) {
                        b3Var.R = 3;
                        ValueAnimator ofInt = ValueAnimator.ofInt(b3Var.D, 255);
                        b3Var.K = ofInt;
                        ofInt.addUpdateListener(new org.telegram.ui.Components.voip.z2(b3Var, 2));
                        b3Var.K.setDuration(500L);
                        b3Var.K.start();
                    }
                    mh1Var.B.c(true);
                    break;
                } else {
                    org.telegram.ui.Components.voip.b3 b3Var2 = mh1Var.v;
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
                    mh1Var.B.c(false);
                    break;
                }
            case 27:
                try {
                    SQLiteDatabase database = ((MessagesStorage) obj).getDatabase();
                    database.executeFast("DELETE FROM business_replies WHERE topic_id = " + i13).stepThis().dispose();
                    database.executeFast("DELETE FROM quick_replies_messages WHERE topic_id = " + i13).stepThis().dispose();
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 28:
                f2.x0 x0Var = (f2.x0) obj;
                x0Var.getClass();
                try {
                    x0Var.a.scrollBy(0, i13);
                    break;
                } catch (Throwable th) {
                    FileLog.e(th);
                    return;
                }
            default:
                qh.b0 b0Var = (qh.b0) obj;
                qh.e0 e0Var = b0Var.f;
                if (b0Var.c && e0Var.A != null && e0Var.a != null) {
                    b0Var.d = true;
                    b0Var.a.setPressed(false);
                    try {
                        b0Var.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                    qh.c0 c0Var = e0Var.A;
                    qh.a aVar = e0Var.a;
                    qh.o3 o3Var = ((qh.g3) c0Var).a;
                    o3Var.o3(false);
                    o3Var.d3.d2(new qh.l3(o3Var, aVar, i13), b0Var);
                    break;
                }
                break;
        }
    }
}
