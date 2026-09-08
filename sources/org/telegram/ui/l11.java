package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public class l11 extends org.telegram.ui.Components.kl0 {
    public TLRPC.WebPage E;
    public boolean F;
    public k11[] c;
    public final org.telegram.ui.ActionBar.n2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public rx0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public l11(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        this.e = n2Var;
        this.f = n2Var.getCurrentAccount();
        this.h = context;
        this.c = H(n2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() || UserConfig.getInstance(i10).isPremium()) {
            return i11 == -1 || MessagesController.getInstance(i10).premiumFeaturesTypesToPosition.get(i11, -1) != -1;
        }
        return false;
    }

    public static k11[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        k11 k11Var;
        k11 k11Var2;
        k11 k11Var3;
        k11 k11Var4;
        k11 k11Var5;
        k11 k11Var6;
        k11 k11Var7;
        k11 k11Var8;
        k11 k11Var9;
        k11 k11Var10;
        k11 k11Var11;
        k11 k11Var12;
        k11 k11Var13;
        k11 k11Var14;
        k11 k11Var15;
        k11 k11Var16;
        k11 k11Var17;
        k11 k11Var18;
        k11 k11Var19;
        k11 k11Var20;
        k11 k11Var21;
        final int currentAccount = n2Var.getCurrentAccount();
        k11 k11Var22 = new k11(LocaleController.getString(R.string.EditName), 500, 0, new rx0(16, n2Var, n2Var.getResourceProvider()));
        final int i10 = 26;
        k11 k11Var23 = new k11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i11)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i11, 12), 700, true);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var23.a("tg://settings/edit/change-number");
        final int i11 = 8;
        k11 k11Var24 = new k11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                i12 = -1;
                            } else if (UserConfig.getInstance(i12).isClientActivated()) {
                                i12++;
                            }
                        }
                        if (i12 >= 0) {
                            n2Var.presentFragment(new wg0(i12));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var24.a("tg://settings/edit/add-account");
        final int i12 = 19;
        final int i13 = 1;
        k11 k11Var25 = new k11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var25.a("tg://settings/notifications");
        k11 k11Var26 = new k11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        k11Var26.a("tg://settings/notifications/private-chats");
        final int i14 = 13;
        k11 k11Var27 = new k11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        k11Var27.a("tg://settings/notifications/groups");
        k11 k11Var28 = new k11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(i11, n2Var));
        k11Var28.a("tg://settings/notifications/channels");
        final int i15 = 20;
        k11 k11Var29 = new k11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(i15, n2Var));
        final int i16 = 2;
        k11 k11Var30 = new k11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i17 = 14;
        k11 k11Var31 = new k11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11 k11Var32 = new k11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(23, n2Var));
        k11Var32.a("tg://settings/notifications/new-contacts");
        final int i18 = 25;
        k11 k11Var33 = new k11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var33.a("tg://settings/notifications/pinned-messages");
        final int i19 = 7;
        k11 k11Var34 = new k11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var34.a("tg://settings/notifications/reset");
        k11 k11Var35 = new k11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11 k11Var36 = new k11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i20 = 21;
        k11 k11Var37 = new k11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i21 = 22;
        k11 k11Var38 = new k11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var38.a("tg://settings/privacy");
        final int i22 = 23;
        k11 k11Var39 = new k11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var39.a("tg://settings/privacy/2sv");
        final int i23 = 0;
        k11 k11Var40 = new k11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i23) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new q4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new di.ec(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.b.setText(spannableStringBuilder);
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            break;
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        k11Var40.a("tg://settings/privacy/auto-delete");
        final int i24 = 25;
        k11 k11Var41 = new k11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var41.a("tg://settings/privacy/passcode");
        k11 k11Var42 = null;
        if (SharedConfig.hasEmailLogin) {
            k11Var = k11Var39;
            final int i25 = 27;
            k11Var2 = new k11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i112)).f == 1) {
                                    nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            break;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            k11Var2.a("tg://settings/privacy/login-email");
        } else {
            k11Var = k11Var39;
            k11Var2 = null;
        }
        final int i26 = 28;
        k11 k11Var43 = new k11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var43.a("tg://settings/privacy/blocked");
        final int i27 = 29;
        k11 k11Var44 = new k11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var44.a("tg://settings/devices");
        final int i28 = 0;
        k11 k11Var45 = new k11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var45.a("tg://settings/privacy/phone-number/");
        final int i29 = 1;
        k11 k11Var46 = new k11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var46.a("tg://settings/privacy/last-seen");
        final int i30 = 2;
        k11 k11Var47 = new k11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var47.a("tg://settings/privacy/profile-photos");
        final int i31 = 3;
        k11 k11Var48 = new k11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var48.a("tg://settings/privacy/forwards");
        final int i32 = 4;
        k11 k11Var49 = new k11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var49.a("tg://settings/privacy/calls/p2p");
        final int i33 = 6;
        k11 k11Var50 = new k11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var50.a("tg://settings/privacy/calls");
        final int i34 = 7;
        k11 k11Var51 = new k11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i34) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var51.a("tg://settings/privacy/invites");
        final int i35 = 1;
        k11 k11Var52 = new k11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new q4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new di.ec(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.b.setText(spannableStringBuilder);
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            break;
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        k11Var52.a("tg://settings/privacy/voice");
        final int i36 = 9;
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            k11Var3 = new k11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i36) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                n2Var.presentFragment(new wg0(i122));
                                break;
                            }
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            n2Var.presentFragment(new z6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new z6());
                            break;
                        default:
                            n2Var.presentFragment(new z6());
                            break;
                    }
                }
            });
            k11Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            k11Var3 = null;
        }
        final int i37 = 10;
        k11 k11Var53 = new k11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var53.a("tg://settings/privacy/self-destruct");
        final int i38 = 11;
        k11 k11Var54 = new k11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var54.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i39 = 12;
        k11 k11Var55 = new k11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var55.a("tg://settings/privacy/active-websites");
        final int i40 = 13;
        k11 k11Var56 = new k11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var56.a("tg://settings/privacy/data-settings/delete-synced");
        final int i41 = 14;
        k11 k11Var57 = new k11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var57.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i42 = 16;
        k11 k11Var58 = new k11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var58.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i43 = 17;
        k11 k11Var59 = new k11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var59.a("tg://settings/privacy/data-settings/map-provider");
        final int i44 = 18;
        k11 k11Var60 = new k11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var60.a("tg://settings/privacy/data-settings/link-previews");
        final int i45 = 20;
        k11 k11Var61 = new k11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var61.a("tg://settings/devices");
        final int i46 = 21;
        k11 k11Var62 = new k11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var62.a("tg://settings/devices/terminate-sessions");
        final int i47 = 22;
        k11 k11Var63 = new k11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var63.a("tg://settings/devices/link-desktop");
        final int i48 = 23;
        k11 k11Var64 = new k11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var64.a("tg://settings/privacy/data-settings");
        final int i49 = 24;
        k11 k11Var65 = new k11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        final int i50 = 25;
        k11 k11Var66 = new k11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        k11Var66.a("tg://settings/data/storage");
        final int i51 = 27;
        k11 k11Var67 = new k11(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        final int i52 = 28;
        k11 k11Var68 = new k11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        final int i53 = 29;
        k11 k11Var69 = new k11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new wg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        n2Var.presentFragment(new z6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new z6());
                        break;
                    default:
                        n2Var.presentFragment(new z6());
                        break;
                }
            }
        });
        final int i54 = 0;
        k11 k11Var70 = new k11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        k11Var70.a("tg://settings/data/usage");
        final int i55 = 2;
        k11 k11Var71 = new k11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        k11 k11Var72 = new k11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        k11 k11Var73 = new k11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i58 = 5;
        k11 k11Var74 = new k11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i59 = 6;
        k11 k11Var75 = new k11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        k11Var75.a("tg://settings/data/auto-download/reset");
        final int i60 = 8;
        k11 k11Var76 = new k11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        k11 k11Var77 = new k11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i62 = 10;
        k11 k11Var78 = new k11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i63 = 11;
        k11 k11Var79 = new k11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        k11Var79.a("tg://settings/data/use-less-data");
        final int i64 = 12;
        k11 k11Var80 = new k11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i65 = 14;
        k11 k11Var81 = new k11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        k11Var81.a("tg://settings/data/proxy");
        final int i66 = 15;
        k11 k11Var82 = new k11(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        k11Var82.a("tg://settings/data/proxy/use-for-calls");
        final int i67 = 16;
        k11 k11Var83 = new k11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        k11Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i68 = 17;
        k11 k11Var84 = new k11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        n2Var.presentFragment(new av(null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        k11 k11Var85 = new k11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(2, n2Var));
        k11Var85.a("tg://settings/data/save-to-photos/chats");
        k11 k11Var86 = new k11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(3, n2Var));
        k11Var86.a("tg://settings/data/save-to-photos/groups");
        k11 k11Var87 = new k11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(4, n2Var));
        k11Var87.a("tg://settings/data/save-to-photos/channels");
        k11 k11Var88 = new k11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ri0(5, n2Var));
        k11Var88.a("tg://settings/appearance/themes");
        k11 k11Var89 = new k11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(6, n2Var));
        k11Var89.a("tg://settings/appearance/text-size");
        k11 k11Var90 = new k11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(7, n2Var));
        k11Var90.a("tg://settings/appearance/wallpapers");
        k11 k11Var91 = new k11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(9, n2Var));
        k11 k11Var92 = new k11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(10, n2Var));
        k11 k11Var93 = new k11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(11, n2Var));
        k11 k11Var94 = new k11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(13, n2Var));
        k11 k11Var95 = new k11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ri0(14, n2Var));
        k11Var95.a("tg://settings/appearance/themes/create");
        k11 k11Var96 = new k11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(15, n2Var));
        k11Var96.a("tg://settings/appearance/message-corners");
        k11 k11Var97 = new k11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(16, n2Var));
        k11 k11Var98 = new k11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(17, n2Var));
        k11 k11Var99 = new k11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(18, n2Var));
        k11Var99.a("tg://settings/appearance/app-icon");
        k11 k11Var100 = new k11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(19, n2Var));
        k11 k11Var101 = new k11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(21, n2Var));
        k11Var101.a("tg://settings/appearance/tap-for-next-media");
        k11 k11Var102 = new k11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(22, n2Var));
        k11Var102.a("tg://settings/data/raise-to-listen");
        k11 k11Var103 = new k11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(24, n2Var));
        k11Var103.a("tg://settings/data/raise-to-speak");
        k11 k11Var104 = new k11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(25, n2Var));
        k11Var104.a("tg://settings/data/pause-music");
        k11 k11Var105 = new k11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(26, n2Var));
        k11 k11Var106 = new k11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(27, n2Var));
        k11 k11Var107 = new k11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(28, n2Var));
        k11 k11Var108 = new k11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(29, n2Var));
        final int i69 = 0;
        k11 k11Var109 = new k11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var109.a("tg://settings/appearance/stickers-and-emoji");
        final int i70 = 1;
        k11 k11Var110 = new k11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i71 = 3;
        k11 k11Var111 = new k11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i72 = 5;
        k11 k11Var112 = new k11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i73 = 6;
        k11 k11Var113 = new k11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i74 = 7;
        k11 k11Var114 = new k11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i75 = 8;
        k11 k11Var115 = new k11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i76 = 9;
        k11 k11Var116 = new k11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i77 = 10;
        k11 k11Var117 = new k11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i78 = 11;
        k11 k11Var118 = new k11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i79 = 12;
        k11 k11Var119 = new k11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i80 = 13;
        k11 k11Var120 = new k11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i80) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i81 = 22;
        k11 k11Var121 = new k11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i81) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var121.a("tg://settings/folders");
        final int i82 = 3;
        k11 k11Var122 = new k11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i82) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            k11Var4 = k11Var122;
            k11Var5 = k11Var113;
            k11Var6 = k11Var115;
            k11Var7 = k11Var117;
            final int i83 = 14;
            k11Var8 = new k11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.g11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i112)).f == 1) {
                                    nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            break;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            k11Var4 = k11Var122;
            k11Var5 = k11Var113;
            k11Var6 = k11Var115;
            k11Var7 = k11Var117;
            k11Var8 = null;
        }
        if (F(currentAccount, 0)) {
            final int i84 = 24;
            k11Var9 = new k11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.g11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i112)).f == 1) {
                                    nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            break;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            k11Var9 = null;
        }
        if (F(currentAccount, 11)) {
            final int i85 = 5;
            k11Var10 = new k11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.i11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                n2Var.presentFragment(new wg0(i122));
                                break;
                            }
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            n2Var.presentFragment(new z6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new z6());
                            break;
                        default:
                            n2Var.presentFragment(new z6());
                            break;
                    }
                }
            });
        } else {
            k11Var10 = null;
        }
        if (F(currentAccount, 1)) {
            final int i86 = 15;
            k11Var11 = new k11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.i11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                n2Var.presentFragment(new wg0(i122));
                                break;
                            }
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            n2Var.presentFragment(new z6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new z6());
                            break;
                        default:
                            n2Var.presentFragment(new z6());
                            break;
                    }
                }
            });
        } else {
            k11Var11 = null;
        }
        if (F(currentAccount, 2)) {
            final int i87 = 26;
            k11Var12 = new k11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.i11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 11, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 6:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                n2Var.presentFragment(new wg0(i122));
                                break;
                            }
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 1, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            n2Var.presentFragment(new z6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 2, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new z6());
                            break;
                        default:
                            n2Var.presentFragment(new z6());
                            break;
                    }
                }
            });
        } else {
            k11Var12 = null;
        }
        if (F(currentAccount, 8)) {
            final int i88 = 7;
            k11Var13 = new k11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            n2Var.presentFragment(new av(null));
                            break;
                        case 1:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 8:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                    }
                }
            });
        } else {
            k11Var13 = null;
        }
        if (F(currentAccount, 3)) {
            final int i89 = 18;
            k11Var14 = new k11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            n2Var.presentFragment(new av(null));
                            break;
                        case 1:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 8, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 8:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 3, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                    }
                }
            });
        } else {
            k11Var14 = null;
        }
        k11 k11Var123 = F(currentAccount, 4) ? new k11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ri0(12, n2Var)) : null;
        if (F(currentAccount, 5)) {
            final int i90 = 4;
            k11Var15 = new k11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new n31());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            k11Var15 = null;
        }
        if (F(currentAccount, 9)) {
            final int i91 = 15;
            k11Var16 = new k11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new n31());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            k11Var16 = null;
        }
        if (F(currentAccount, 6)) {
            final int i92 = 16;
            k11Var17 = new k11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new n31());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            k11Var17 = null;
        }
        if (F(currentAccount, 7)) {
            final int i93 = 17;
            k11Var18 = new k11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i93) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new n31());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            k11Var18 = null;
        }
        if (F(currentAccount, 10)) {
            final int i94 = 18;
            k11Var19 = new k11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i94) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new n31());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            k11Var19 = null;
        }
        if (F(currentAccount, 12)) {
            final int i95 = 19;
            k11Var20 = new k11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i95) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                            a1Var.C();
                            n2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            n2Var.presentFragment(new n31());
                            break;
                        case 14:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                            a1Var2.C();
                            n2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                            a1Var3.C();
                            n2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                            a1Var4.C();
                            n2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                            a1Var5.C();
                            n2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                            sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                            a1Var6.C();
                            n2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            n2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            k11Var20 = null;
        }
        final int i96 = 20;
        k11 k11Var124 = new k11(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var124.a("tg://settings/power-saving");
        final int i97 = 21;
        k11 k11Var125 = new k11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var125.a("tg://settings/power-saving/stickers");
        final int i98 = 23;
        k11 k11Var126 = new k11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i99 = 24;
        k11 k11Var127 = new k11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i100 = 26;
        k11 k11Var128 = new k11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        k11Var128.a("tg://settings/power-saving/emoji");
        final int i101 = 27;
        k11 k11Var129 = new k11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i102 = 28;
        k11 k11Var130 = new k11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i103 = 29;
        k11 k11Var131 = new k11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var2, 5, false);
                        a1Var.C();
                        n2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        n2Var.presentFragment(new n31());
                        break;
                    case 14:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var2 = new sg.a1(n2Var3, 9, false);
                        a1Var2.C();
                        n2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.a1 a1Var3 = new sg.a1(n2Var4, 6, false);
                        a1Var3.C();
                        n2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.a1 a1Var4 = new sg.a1(n2Var5, 7, false);
                        a1Var4.C();
                        n2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.a1 a1Var5 = new sg.a1(n2Var6, 10, false);
                        a1Var5.C();
                        n2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.n2 n2Var7 = n2Var;
                        sg.a1 a1Var6 = new sg.a1(n2Var7, 12, false);
                        a1Var6.C();
                        n2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        n2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i104 = 0;
        k11 k11Var132 = new k11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var132.a("tg://settings/power-saving/effects");
        final int i105 = 1;
        k11 k11Var133 = new k11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i105) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var133.a("tg://settings/power-saving/background");
        final int i106 = 2;
        k11 k11Var134 = new k11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i107 = 4;
        k11 k11Var135 = new k11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i108 = 5;
            k11Var21 = new k11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i108) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i112)).f == 1) {
                                    nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            break;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            k11Var21 = null;
        }
        final int i109 = 6;
        k11 k11Var136 = new k11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i110 = 8;
        k11 k11Var137 = new k11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var137.a("tg://settings/power-saving/call-animations");
        final int i111 = 9;
        k11 k11Var138 = new k11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i112, 12), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var138.a("tg://settings/power-saving/videos");
        final int i112 = 10;
        k11 k11Var139 = new k11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var139.a("tg://settings/power-saving/gifs");
        final int i113 = 11;
        k11 k11Var140 = new k11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i113) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var140.a("tg://settings/power-saving/transitions");
        final int i114 = 12;
        k11 k11Var141 = new k11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var141.a("tg://settings/language");
        final int i115 = 13;
        k11 k11Var142 = new k11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i116 = 15;
            k11 k11Var143 = new k11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.g11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i116) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            n2Var.presentFragment(nc0Var10);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                    nc0Var10.b.d1(new i2.t(nc0Var10, i1122, 12), 700, true);
                                    break;
                                } else {
                                    i1122++;
                                }
                            }
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                            break;
                        case 17:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                            a1Var.C();
                            n2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
                            break;
                        default:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            k11Var143.a("tg://settings/language/do-not-translate");
            k11Var42 = k11Var143;
        }
        final int i117 = 16;
        k11 k11Var144 = new k11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i117) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var144.a("tg://settings/ask-question");
        final int i118 = 17;
        k11 k11Var145 = new k11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i118) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var145.a("tg://settings/faq");
        final int i119 = 18;
        k11 k11Var146 = new k11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.g11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i119) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        n2Var.presentFragment(nc0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var10.b.d1(new i2.t(nc0Var10, i1122, 12), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        n2Var2.showDialog(org.telegram.ui.Components.e5.U(n2Var2, null));
                        break;
                    case 17:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.a1 a1Var = new sg.a1(n2Var3, 0, false);
                        a1Var.C();
                        n2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
                        break;
                    default:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        k11Var146.a("tg://settings/privacy-policy");
        return new k11[]{k11Var22, k11Var23, k11Var24, k11Var25, k11Var26, k11Var27, k11Var28, k11Var29, k11Var30, k11Var31, k11Var32, k11Var33, k11Var34, k11Var35, k11Var36, k11Var37, k11Var38, k11Var, k11Var40, k11Var41, k11Var2, k11Var43, k11Var44, k11Var45, k11Var46, k11Var47, k11Var48, k11Var49, k11Var50, k11Var51, k11Var52, k11Var3, k11Var53, k11Var54, k11Var55, k11Var56, k11Var57, k11Var58, k11Var59, k11Var60, k11Var61, k11Var62, k11Var63, k11Var64, k11Var65, k11Var66, k11Var67, k11Var68, k11Var69, k11Var70, k11Var71, k11Var72, k11Var73, k11Var74, k11Var75, k11Var76, k11Var77, k11Var78, k11Var79, k11Var80, k11Var81, k11Var82, k11Var83, k11Var84, k11Var85, k11Var86, k11Var87, k11Var88, k11Var89, k11Var90, k11Var91, k11Var92, k11Var93, k11Var94, k11Var95, k11Var96, k11Var97, k11Var98, k11Var99, k11Var100, k11Var101, k11Var102, k11Var103, k11Var104, k11Var105, k11Var106, k11Var107, k11Var108, k11Var109, k11Var110, k11Var111, k11Var112, k11Var5, k11Var114, k11Var6, k11Var116, k11Var7, k11Var118, k11Var119, k11Var120, k11Var121, k11Var4, k11Var8, k11Var9, k11Var10, k11Var11, k11Var12, k11Var13, k11Var14, k11Var123, k11Var15, k11Var16, k11Var17, k11Var18, k11Var19, k11Var20, k11Var124, k11Var125, k11Var126, k11Var127, k11Var128, k11Var129, k11Var130, k11Var131, k11Var132, k11Var133, k11Var134, k11Var135, k11Var21, k11Var136, k11Var137, k11Var138, k11Var139, k11Var140, k11Var141, k11Var142, k11Var42, k11Var144, k11Var145, k11Var146};
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.v;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.w) {
            l();
        }
        if (arrayList.size() > 20) {
            a4.a.x(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof k11) {
                ((k11) obj2).g = i10;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f;
        TLRPC.WebPage webPage = MessagesController.getInstance(i10).faqWebPage;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i10).faqSearchArray);
        }
        if (this.E != null || this.F) {
            return;
        }
        this.F = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new m(this, 20));
    }

    public final void I(String str) {
        this.y = str;
        if (this.x != null) {
            Utilities.searchQueue.cancelRunnable(this.x);
            this.x = null;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            rx0 rx0Var = new rx0(17, this, str);
            this.x = rx0Var;
            dispatchQueue.postRunnable(rx0Var, 300L);
            return;
        }
        this.w = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.n2 n2Var = this.e;
        if (n2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) n2Var).P.b.getImageReceiver().startAnimation();
                ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        k11 k11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            k11[] k11VarArr = this.c;
            if (i10 >= k11VarArr.length) {
                break;
            }
            k11 k11Var2 = k11VarArr[i10];
            if (k11Var2 != null) {
                hashMap.put(Integer.valueOf(k11Var2.f), this.c[i10]);
            }
            i10++;
        }
        Set<String> stringSet = MessagesController.getGlobalMainSettings().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.v;
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.hexToBytes(it.next()));
                    int readInt32 = serializedData.readInt32(false);
                    int readInt322 = serializedData.readInt32(false);
                    if (readInt322 == 0) {
                        String readString = serializedData.readString(false);
                        int readInt323 = serializedData.readInt32(false);
                        if (readInt323 > 0) {
                            strArr = new String[readInt323];
                            for (int i11 = 0; i11 < readInt323; i11++) {
                                strArr[i11] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        MessagesController.FaqSearchResult faqSearchResult = new MessagesController.FaqSearchResult(readString, strArr, serializedData.readString(false));
                        faqSearchResult.num = readInt32;
                        arrayList.add(faqSearchResult);
                    } else if (readInt322 == 1 && (k11Var = (k11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        k11Var.g = readInt32;
                        arrayList.add(k11Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new f11(this));
    }

    @Override // s4.h0
    public final int h() {
        if (this.w) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.v;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // s4.h0
    public final int j(int i10) {
        if (!this.w) {
            ArrayList arrayList = this.v;
            if (i10 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i10 != arrayList.size() + 1) {
                return 0;
            }
        } else if (i10 < this.r.size() || i10 != this.r.size()) {
            return 0;
        }
        return 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.u3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.l4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                return;
            }
        }
        org.telegram.ui.Cells.x6 x6Var = (org.telegram.ui.Cells.x6) view;
        if (this.w) {
            if (i10 >= this.r.size()) {
                int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.r);
                x6Var.a((CharSequence) this.n.get(this.r.size() + f7), ((MessagesController.FaqSearchResult) this.s.get(f7)).path, true, f7 < this.r.size() - 1);
                return;
            } else {
                k11 k11Var = (k11) this.r.get(i10);
                k11 k11Var2 = i10 > 0 ? (k11) this.r.get(i10 - 1) : null;
                x6Var.b((CharSequence) this.n.get(i10), k11Var.d, (k11Var2 == null || k11Var2.e != k11Var.e) ? k11Var.e : 0, i10 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= arrayList.size()) {
            int f10 = com.google.android.gms.internal.vision.e2.f(1, i10, arrayList);
            MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) this.d.get(f10);
            x6Var.a(faqSearchResult.title, faqSearchResult.path, true, f10 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof k11) {
            k11 k11Var3 = (k11) obj;
            x6Var.a(k11Var3.a, k11Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            x6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View l4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.l4(context, 16) : new org.telegram.ui.Cells.u3(context, null) : new org.telegram.ui.Cells.x6(context);
        l4Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.vk0(l4Var);
    }
}
