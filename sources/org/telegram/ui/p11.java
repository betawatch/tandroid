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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class p11 extends org.telegram.ui.Components.ul0 {
    public TLRPC.WebPage E;
    public boolean F;
    public o11[] c;
    public final org.telegram.ui.ActionBar.p2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public ey0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public p11(Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        this.e = p2Var;
        this.f = p2Var.getCurrentAccount();
        this.h = context;
        this.c = H(p2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() || UserConfig.getInstance(i10).isPremium()) {
            return i11 == -1 || MessagesController.getInstance(i10).premiumFeaturesTypesToPosition.get(i11, -1) != -1;
        }
        return false;
    }

    public static o11[] H(final org.telegram.ui.ActionBar.p2 p2Var) {
        o11 o11Var;
        o11 o11Var2;
        o11 o11Var3;
        o11 o11Var4;
        o11 o11Var5;
        o11 o11Var6;
        o11 o11Var7;
        o11 o11Var8;
        o11 o11Var9;
        o11 o11Var10;
        o11 o11Var11;
        o11 o11Var12;
        o11 o11Var13;
        o11 o11Var14;
        o11 o11Var15;
        o11 o11Var16;
        o11 o11Var17;
        o11 o11Var18;
        o11 o11Var19;
        o11 o11Var20;
        o11 o11Var21;
        final int currentAccount = p2Var.getCurrentAccount();
        final int i10 = 13;
        o11 o11Var22 = new o11(LocaleController.getString(R.string.EditName), 500, 0, new ey0(13, p2Var, p2Var.getResourceProvider()));
        final int i11 = 26;
        o11 o11Var23 = new o11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i12 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i12)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i12, 12), 700, true);
                                break;
                            } else {
                                i12++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var23.a("tg://settings/edit/change-number");
        final int i12 = 8;
        o11 o11Var24 = new o11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i13 = 0;
                        while (true) {
                            if (i13 >= 4) {
                                i13 = -1;
                            } else if (UserConfig.getInstance(i13).isClientActivated()) {
                                i13++;
                            }
                        }
                        if (i13 >= 0) {
                            p2Var.presentFragment(new xg0(i13));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var24.a("tg://settings/edit/add-account");
        final int i13 = 19;
        final int i14 = 1;
        o11 o11Var25 = new o11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var25.a("tg://settings/notifications");
        o11 o11Var26 = new o11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        o11Var26.a("tg://settings/notifications/private-chats");
        o11 o11Var27 = new o11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        o11Var27.a("tg://settings/notifications/groups");
        o11 o11Var28 = new o11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(i12, p2Var));
        o11Var28.a("tg://settings/notifications/channels");
        final int i15 = 20;
        o11 o11Var29 = new o11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(i15, p2Var));
        final int i16 = 2;
        o11 o11Var30 = new o11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i17 = 14;
        o11 o11Var31 = new o11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11 o11Var32 = new o11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ri0(23, p2Var));
        o11Var32.a("tg://settings/notifications/new-contacts");
        final int i18 = 25;
        o11 o11Var33 = new o11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var33.a("tg://settings/notifications/pinned-messages");
        final int i19 = 7;
        o11 o11Var34 = new o11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var34.a("tg://settings/notifications/reset");
        o11 o11Var35 = new o11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11 o11Var36 = new o11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i20 = 21;
        o11 o11Var37 = new o11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i21 = 22;
        o11 o11Var38 = new o11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var38.a("tg://settings/privacy");
        final int i22 = 23;
        o11 o11Var39 = new o11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var39.a("tg://settings/privacy/2sv");
        final int i23 = 0;
        o11 o11Var40 = new o11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.l11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i23) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            p2Var.presentFragment(new q4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(p2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), null);
                            xbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new bi.pd(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            xbVar.b.setText(spannableStringBuilder);
                            xbVar.b.setSingleLine(false);
                            xbVar.b.setMaxLines(2);
                            a02.b(xbVar, 2750).j();
                            break;
                        } else {
                            p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        o11Var40.a("tg://settings/privacy/auto-delete");
        final int i24 = 25;
        o11 o11Var41 = new o11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var41.a("tg://settings/privacy/passcode");
        o11 o11Var42 = null;
        if (SharedConfig.hasEmailLogin) {
            o11Var = o11Var39;
            final int i25 = 27;
            o11Var2 = new o11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.k11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i25) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i122)).f == 1) {
                                    nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            break;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            o11Var2.a("tg://settings/privacy/login-email");
        } else {
            o11Var = o11Var39;
            o11Var2 = null;
        }
        final int i26 = 28;
        o11 o11Var43 = new o11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var43.a("tg://settings/privacy/blocked");
        final int i27 = 29;
        o11 o11Var44 = new o11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var44.a("tg://settings/devices");
        final int i28 = 0;
        o11 o11Var45 = new o11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var45.a("tg://settings/privacy/phone-number/");
        final int i29 = 1;
        o11 o11Var46 = new o11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var46.a("tg://settings/privacy/last-seen");
        final int i30 = 2;
        o11 o11Var47 = new o11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var47.a("tg://settings/privacy/profile-photos");
        final int i31 = 3;
        o11 o11Var48 = new o11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var48.a("tg://settings/privacy/forwards");
        final int i32 = 4;
        o11 o11Var49 = new o11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var49.a("tg://settings/privacy/calls/p2p");
        final int i33 = 6;
        o11 o11Var50 = new o11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var50.a("tg://settings/privacy/calls");
        final int i34 = 7;
        o11 o11Var51 = new o11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i34) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var51.a("tg://settings/privacy/invites");
        final int i35 = 1;
        o11 o11Var52 = new o11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.l11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            p2Var.presentFragment(new q4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.wc a02 = org.telegram.ui.Components.wc.a0(p2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), null);
                            xbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new bi.pd(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            xbVar.b.setText(spannableStringBuilder);
                            xbVar.b.setSingleLine(false);
                            xbVar.b.setMaxLines(2);
                            a02.b(xbVar, 2750).j();
                            break;
                        } else {
                            p2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        o11Var52.a("tg://settings/privacy/voice");
        final int i36 = 9;
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            o11Var3 = new o11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i36) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                p2Var.presentFragment(new xg0(i132));
                                break;
                            }
                            break;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            p2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            p2Var.presentFragment(new y6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 27:
                            p2Var.presentFragment(new y6());
                            break;
                        case 28:
                            p2Var.presentFragment(new y6());
                            break;
                        default:
                            p2Var.presentFragment(new y6());
                            break;
                    }
                }
            });
            o11Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            o11Var3 = null;
        }
        final int i37 = 10;
        o11 o11Var53 = new o11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var53.a("tg://settings/privacy/self-destruct");
        final int i38 = 11;
        o11 o11Var54 = new o11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var54.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i39 = 12;
        o11 o11Var55 = new o11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var55.a("tg://settings/privacy/active-websites");
        final int i40 = 13;
        o11 o11Var56 = new o11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var56.a("tg://settings/privacy/data-settings/delete-synced");
        final int i41 = 14;
        o11 o11Var57 = new o11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var57.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i42 = 16;
        o11 o11Var58 = new o11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var58.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i43 = 17;
        o11 o11Var59 = new o11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var59.a("tg://settings/privacy/data-settings/map-provider");
        final int i44 = 18;
        o11 o11Var60 = new o11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var60.a("tg://settings/privacy/data-settings/link-previews");
        final int i45 = 20;
        o11 o11Var61 = new o11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var61.a("tg://settings/devices");
        final int i46 = 21;
        o11 o11Var62 = new o11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var62.a("tg://settings/devices/terminate-sessions");
        final int i47 = 22;
        o11 o11Var63 = new o11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var63.a("tg://settings/devices/link-desktop");
        final int i48 = 23;
        o11 o11Var64 = new o11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var64.a("tg://settings/privacy/data-settings");
        final int i49 = 24;
        o11 o11Var65 = new o11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        final int i50 = 25;
        o11 o11Var66 = new o11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        o11Var66.a("tg://settings/data/storage");
        final int i51 = 27;
        o11 o11Var67 = new o11(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        final int i52 = 28;
        o11 o11Var68 = new o11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        final int i53 = 29;
        o11 o11Var69 = new o11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.m11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        p2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        p2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        p2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        p2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 6:
                        p2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        p2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 8:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            p2Var.presentFragment(new xg0(i132));
                            break;
                        }
                        break;
                    case 9:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        p2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        p2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 27:
                        p2Var.presentFragment(new y6());
                        break;
                    case 28:
                        p2Var.presentFragment(new y6());
                        break;
                    default:
                        p2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        final int i54 = 0;
        o11 o11Var70 = new o11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        o11Var70.a("tg://settings/data/usage");
        final int i55 = 2;
        o11 o11Var71 = new o11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        o11 o11Var72 = new o11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        o11 o11Var73 = new o11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i58 = 5;
        o11 o11Var74 = new o11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i59 = 6;
        o11 o11Var75 = new o11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        o11Var75.a("tg://settings/data/auto-download/reset");
        final int i60 = 8;
        o11 o11Var76 = new o11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        o11 o11Var77 = new o11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i62 = 10;
        o11 o11Var78 = new o11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i63 = 11;
        o11 o11Var79 = new o11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        o11Var79.a("tg://settings/data/use-less-data");
        final int i64 = 12;
        o11 o11Var80 = new o11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        final int i65 = 14;
        o11 o11Var81 = new o11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        o11Var81.a("tg://settings/data/proxy");
        final int i66 = 15;
        o11 o11Var82 = new o11(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        o11Var82.a("tg://settings/data/proxy/use-for-calls");
        final int i67 = 16;
        o11 o11Var83 = new o11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        o11Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i68 = 17;
        o11 o11Var84 = new o11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        p2Var.presentFragment(new bv(null));
                        break;
                    case 1:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        p2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        p2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 8:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        p2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        p2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                }
            }
        });
        o11 o11Var85 = new o11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(2, p2Var));
        o11Var85.a("tg://settings/data/save-to-photos/chats");
        o11 o11Var86 = new o11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(3, p2Var));
        o11Var86.a("tg://settings/data/save-to-photos/groups");
        o11 o11Var87 = new o11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ri0(4, p2Var));
        o11Var87.a("tg://settings/data/save-to-photos/channels");
        o11 o11Var88 = new o11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ri0(5, p2Var));
        o11Var88.a("tg://settings/appearance/themes");
        o11 o11Var89 = new o11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(6, p2Var));
        o11Var89.a("tg://settings/appearance/text-size");
        o11 o11Var90 = new o11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(7, p2Var));
        o11Var90.a("tg://settings/appearance/wallpapers");
        o11 o11Var91 = new o11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(9, p2Var));
        o11 o11Var92 = new o11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ri0(10, p2Var));
        o11 o11Var93 = new o11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(11, p2Var));
        o11 o11Var94 = new o11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(13, p2Var));
        o11 o11Var95 = new o11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ri0(14, p2Var));
        o11Var95.a("tg://settings/appearance/themes/create");
        o11 o11Var96 = new o11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(15, p2Var));
        o11Var96.a("tg://settings/appearance/message-corners");
        o11 o11Var97 = new o11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(16, p2Var));
        o11 o11Var98 = new o11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(17, p2Var));
        o11 o11Var99 = new o11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(18, p2Var));
        o11Var99.a("tg://settings/appearance/app-icon");
        o11 o11Var100 = new o11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(19, p2Var));
        o11 o11Var101 = new o11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(21, p2Var));
        o11Var101.a("tg://settings/appearance/tap-for-next-media");
        o11 o11Var102 = new o11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(22, p2Var));
        o11Var102.a("tg://settings/data/raise-to-listen");
        o11 o11Var103 = new o11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(24, p2Var));
        o11Var103.a("tg://settings/data/raise-to-speak");
        o11 o11Var104 = new o11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(25, p2Var));
        o11Var104.a("tg://settings/data/pause-music");
        o11 o11Var105 = new o11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(26, p2Var));
        o11 o11Var106 = new o11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(27, p2Var));
        o11 o11Var107 = new o11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(28, p2Var));
        o11 o11Var108 = new o11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ri0(29, p2Var));
        final int i69 = 0;
        o11 o11Var109 = new o11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var109.a("tg://settings/appearance/stickers-and-emoji");
        final int i70 = 1;
        o11 o11Var110 = new o11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i71 = 3;
        o11 o11Var111 = new o11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i72 = 5;
        o11 o11Var112 = new o11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i73 = 6;
        o11 o11Var113 = new o11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i74 = 7;
        o11 o11Var114 = new o11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i75 = 8;
        o11 o11Var115 = new o11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i76 = 9;
        o11 o11Var116 = new o11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i77 = 10;
        o11 o11Var117 = new o11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i78 = 11;
        o11 o11Var118 = new o11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i79 = 12;
        o11 o11Var119 = new o11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i80 = 13;
        o11 o11Var120 = new o11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i80) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i81 = 22;
        o11 o11Var121 = new o11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i81) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var121.a("tg://settings/folders");
        final int i82 = 3;
        o11 o11Var122 = new o11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i82) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            o11Var4 = o11Var122;
            o11Var5 = o11Var113;
            o11Var6 = o11Var115;
            o11Var7 = o11Var117;
            final int i83 = 14;
            o11Var8 = new o11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i122)).f == 1) {
                                    nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            break;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            o11Var4 = o11Var122;
            o11Var5 = o11Var113;
            o11Var6 = o11Var115;
            o11Var7 = o11Var117;
            o11Var8 = null;
        }
        if (F(currentAccount, 0)) {
            final int i84 = 24;
            o11Var9 = new o11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i122)).f == 1) {
                                    nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            break;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            o11Var9 = null;
        }
        if (F(currentAccount, 11)) {
            final int i85 = 5;
            o11Var10 = new o11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.m11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                p2Var.presentFragment(new xg0(i132));
                                break;
                            }
                            break;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            p2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            p2Var.presentFragment(new y6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 27:
                            p2Var.presentFragment(new y6());
                            break;
                        case 28:
                            p2Var.presentFragment(new y6());
                            break;
                        default:
                            p2Var.presentFragment(new y6());
                            break;
                    }
                }
            });
        } else {
            o11Var10 = null;
        }
        if (F(currentAccount, 1)) {
            final int i86 = 15;
            o11Var11 = new o11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.m11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                p2Var.presentFragment(new xg0(i132));
                                break;
                            }
                            break;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            p2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            p2Var.presentFragment(new y6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 27:
                            p2Var.presentFragment(new y6());
                            break;
                        case 28:
                            p2Var.presentFragment(new y6());
                            break;
                        default:
                            p2Var.presentFragment(new y6());
                            break;
                    }
                }
            });
        } else {
            o11Var11 = null;
        }
        if (F(currentAccount, 2)) {
            final int i87 = 26;
            o11Var12 = new o11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.m11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            p2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            p2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            p2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            p2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 11, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 6:
                            p2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            p2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 8:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                p2Var.presentFragment(new xg0(i132));
                                break;
                            }
                            break;
                        case 9:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 1, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            p2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            p2Var.presentFragment(new y6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 2, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 27:
                            p2Var.presentFragment(new y6());
                            break;
                        case 28:
                            p2Var.presentFragment(new y6());
                            break;
                        default:
                            p2Var.presentFragment(new y6());
                            break;
                    }
                }
            });
        } else {
            o11Var12 = null;
        }
        if (F(currentAccount, 8)) {
            final int i88 = 7;
            o11Var13 = new o11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            p2Var.presentFragment(new bv(null));
                            break;
                        case 1:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            p2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            p2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 8:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            p2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            p2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                    }
                }
            });
        } else {
            o11Var13 = null;
        }
        if (F(currentAccount, 3)) {
            final int i89 = 18;
            o11Var14 = new o11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            p2Var.presentFragment(new bv(null));
                            break;
                        case 1:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            p2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            p2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 8, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 8:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            p2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            p2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            p2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 3, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                    }
                }
            });
        } else {
            o11Var14 = null;
        }
        o11 o11Var123 = F(currentAccount, 4) ? new o11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ri0(12, p2Var)) : null;
        if (F(currentAccount, 5)) {
            final int i90 = 4;
            o11Var15 = new o11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new r31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            o11Var15 = null;
        }
        if (F(currentAccount, 9)) {
            final int i91 = 15;
            o11Var16 = new o11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new r31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            o11Var16 = null;
        }
        if (F(currentAccount, 6)) {
            final int i92 = 16;
            o11Var17 = new o11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new r31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            o11Var17 = null;
        }
        if (F(currentAccount, 7)) {
            final int i93 = 17;
            o11Var18 = new o11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i93) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new r31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            o11Var18 = null;
        }
        if (F(currentAccount, 10)) {
            final int i94 = 18;
            o11Var19 = new o11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i94) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new r31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            o11Var19 = null;
        }
        if (F(currentAccount, 12)) {
            final int i95 = 19;
            o11Var20 = new o11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i95) {
                        case 0:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                            a1Var.C();
                            p2Var2.showDialog(a1Var);
                            break;
                        case 5:
                            p2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            p2Var.presentFragment(new q(0));
                            break;
                        case 7:
                            p2Var.presentFragment(new q(1));
                            break;
                        case 8:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            p2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            p2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            p2Var.presentFragment(new r31());
                            break;
                        case 14:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                            a1Var2.C();
                            p2Var3.showDialog(a1Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                            qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                            a1Var3.C();
                            p2Var4.showDialog(a1Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                            qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                            a1Var4.C();
                            p2Var5.showDialog(a1Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                            qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                            a1Var5.C();
                            p2Var6.showDialog(a1Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                            qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                            a1Var6.C();
                            p2Var7.showDialog(a1Var6);
                            break;
                        case 20:
                            p2Var.presentFragment(new nc0());
                            break;
                        case 21:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 22:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 24:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 25:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            o11Var20 = null;
        }
        final int i96 = 20;
        o11 o11Var124 = new o11(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var124.a("tg://settings/power-saving");
        final int i97 = 21;
        o11 o11Var125 = new o11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var125.a("tg://settings/power-saving/stickers");
        final int i98 = 23;
        o11 o11Var126 = new o11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i99 = 24;
        o11 o11Var127 = new o11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i100 = 26;
        o11 o11Var128 = new o11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        o11Var128.a("tg://settings/power-saving/emoji");
        final int i101 = 27;
        o11 o11Var129 = new o11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i102 = 28;
        o11 o11Var130 = new o11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i103 = 29;
        o11 o11Var131 = new o11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var2, 5, false);
                        a1Var.C();
                        p2Var2.showDialog(a1Var);
                        break;
                    case 5:
                        p2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        p2Var.presentFragment(new q(0));
                        break;
                    case 7:
                        p2Var.presentFragment(new q(1));
                        break;
                    case 8:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        p2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        p2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        p2Var.presentFragment(new r31());
                        break;
                    case 14:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var2 = new qg.a1(p2Var3, 9, false);
                        a1Var2.C();
                        p2Var3.showDialog(a1Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var4 = p2Var;
                        qg.a1 a1Var3 = new qg.a1(p2Var4, 6, false);
                        a1Var3.C();
                        p2Var4.showDialog(a1Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.p2 p2Var5 = p2Var;
                        qg.a1 a1Var4 = new qg.a1(p2Var5, 7, false);
                        a1Var4.C();
                        p2Var5.showDialog(a1Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.p2 p2Var6 = p2Var;
                        qg.a1 a1Var5 = new qg.a1(p2Var6, 10, false);
                        a1Var5.C();
                        p2Var6.showDialog(a1Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.p2 p2Var7 = p2Var;
                        qg.a1 a1Var6 = new qg.a1(p2Var7, 12, false);
                        a1Var6.C();
                        p2Var7.showDialog(a1Var6);
                        break;
                    case 20:
                        p2Var.presentFragment(new nc0());
                        break;
                    case 21:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 22:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 24:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 25:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i104 = 0;
        o11 o11Var132 = new o11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var132.a("tg://settings/power-saving/effects");
        final int i105 = 1;
        o11 o11Var133 = new o11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i105) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var133.a("tg://settings/power-saving/background");
        final int i106 = 2;
        o11 o11Var134 = new o11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i107 = 4;
        o11 o11Var135 = new o11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i108 = 5;
            o11Var21 = new o11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i108) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i122)).f == 1) {
                                    nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            break;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            o11Var21 = null;
        }
        final int i109 = 6;
        o11 o11Var136 = new o11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i110 = 8;
        o11 o11Var137 = new o11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var137.a("tg://settings/power-saving/call-animations");
        final int i111 = 9;
        o11 o11Var138 = new o11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var138.a("tg://settings/power-saving/videos");
        final int i112 = 10;
        o11 o11Var139 = new o11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var139.a("tg://settings/power-saving/gifs");
        final int i113 = 11;
        o11 o11Var140 = new o11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i113) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var140.a("tg://settings/power-saving/transitions");
        final int i114 = 12;
        o11 o11Var141 = new o11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var141.a("tg://settings/language");
        final int i115 = 13;
        o11 o11Var142 = new o11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i116 = 15;
            o11 o11Var143 = new o11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.k11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i116) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            p2Var.presentFragment(nc0Var);
                            nc0Var.V(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            p2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(32);
                            break;
                        case 2:
                            nc0 nc0Var3 = new nc0();
                            p2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(64);
                            break;
                        case 3:
                            p2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            p2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(128);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            p2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_CHAT);
                            nc0Var5.V(256);
                            break;
                        case 6:
                            nc0 nc0Var6 = new nc0();
                            p2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_CHAT);
                            nc0Var6.V(32768);
                            break;
                        case 7:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            p2Var.presentFragment(nc0Var7);
                            nc0Var7.V(512);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            p2Var.presentFragment(nc0Var8);
                            nc0Var8.V(1024);
                            break;
                        case 10:
                            nc0 nc0Var9 = new nc0();
                            p2Var.presentFragment(nc0Var9);
                            nc0Var9.V(2048);
                            break;
                        case 11:
                            nc0 nc0Var10 = new nc0();
                            p2Var.presentFragment(nc0Var10);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var10.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i122)).f == 1) {
                                    nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 12:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            p2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                            p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                            break;
                        case 17:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            p2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            p2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                            qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                            a1Var.C();
                            p2Var3.showDialog(a1Var);
                            break;
                        case 25:
                            p2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 26:
                            p2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            p2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            ky0 ky0Var = new ky0();
                            ky0Var.getMessagesController().getBlockedPeers(true);
                            p2Var.presentFragment(ky0Var);
                            break;
                        default:
                            p2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            o11Var143.a("tg://settings/language/do-not-translate");
            o11Var42 = o11Var143;
        }
        final int i117 = 16;
        o11 o11Var144 = new o11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i117) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var144.a("tg://settings/ask-question");
        final int i118 = 17;
        o11 o11Var145 = new o11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i118) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var145.a("tg://settings/faq");
        final int i119 = 18;
        o11 o11Var146 = new o11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.k11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i119) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        p2Var.presentFragment(nc0Var);
                        nc0Var.V(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        p2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(32);
                        break;
                    case 2:
                        nc0 nc0Var3 = new nc0();
                        p2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(64);
                        break;
                    case 3:
                        p2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        p2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(128);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        p2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_CHAT);
                        nc0Var5.V(256);
                        break;
                    case 6:
                        nc0 nc0Var6 = new nc0();
                        p2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_CHAT);
                        nc0Var6.V(32768);
                        break;
                    case 7:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        p2Var.presentFragment(nc0Var7);
                        nc0Var7.V(512);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        p2Var.presentFragment(nc0Var8);
                        nc0Var8.V(1024);
                        break;
                    case 10:
                        nc0 nc0Var9 = new nc0();
                        p2Var.presentFragment(nc0Var9);
                        nc0Var9.V(2048);
                        break;
                    case 11:
                        nc0 nc0Var10 = new nc0();
                        p2Var.presentFragment(nc0Var10);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var10.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i122)).f == 1) {
                                nc0Var10.b.d1(new i2.s(nc0Var10, i122, 12), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 12:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        p2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        p2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.p2 p2Var2 = p2Var;
                        p2Var2.showDialog(org.telegram.ui.Components.d5.U(p2Var2, null));
                        break;
                    case 17:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        nf.f.s(p2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        p2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        p2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.p2 p2Var3 = p2Var;
                        qg.a1 a1Var = new qg.a1(p2Var3, 0, false);
                        a1Var.C();
                        p2Var3.showDialog(a1Var);
                        break;
                    case 25:
                        p2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 26:
                        p2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        p2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        ky0 ky0Var = new ky0();
                        ky0Var.getMessagesController().getBlockedPeers(true);
                        p2Var.presentFragment(ky0Var);
                        break;
                    default:
                        p2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        o11Var146.a("tg://settings/privacy-policy");
        return new o11[]{o11Var22, o11Var23, o11Var24, o11Var25, o11Var26, o11Var27, o11Var28, o11Var29, o11Var30, o11Var31, o11Var32, o11Var33, o11Var34, o11Var35, o11Var36, o11Var37, o11Var38, o11Var, o11Var40, o11Var41, o11Var2, o11Var43, o11Var44, o11Var45, o11Var46, o11Var47, o11Var48, o11Var49, o11Var50, o11Var51, o11Var52, o11Var3, o11Var53, o11Var54, o11Var55, o11Var56, o11Var57, o11Var58, o11Var59, o11Var60, o11Var61, o11Var62, o11Var63, o11Var64, o11Var65, o11Var66, o11Var67, o11Var68, o11Var69, o11Var70, o11Var71, o11Var72, o11Var73, o11Var74, o11Var75, o11Var76, o11Var77, o11Var78, o11Var79, o11Var80, o11Var81, o11Var82, o11Var83, o11Var84, o11Var85, o11Var86, o11Var87, o11Var88, o11Var89, o11Var90, o11Var91, o11Var92, o11Var93, o11Var94, o11Var95, o11Var96, o11Var97, o11Var98, o11Var99, o11Var100, o11Var101, o11Var102, o11Var103, o11Var104, o11Var105, o11Var106, o11Var107, o11Var108, o11Var109, o11Var110, o11Var111, o11Var112, o11Var5, o11Var114, o11Var6, o11Var116, o11Var7, o11Var118, o11Var119, o11Var120, o11Var121, o11Var4, o11Var8, o11Var9, o11Var10, o11Var11, o11Var12, o11Var13, o11Var14, o11Var123, o11Var15, o11Var16, o11Var17, o11Var18, o11Var19, o11Var20, o11Var124, o11Var125, o11Var126, o11Var127, o11Var128, o11Var129, o11Var130, o11Var131, o11Var132, o11Var133, o11Var134, o11Var135, o11Var21, o11Var136, o11Var137, o11Var138, o11Var139, o11Var140, o11Var141, o11Var142, o11Var42, o11Var144, o11Var145, o11Var146};
    }

    @Override // org.telegram.ui.Components.ul0
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
            if (obj2 instanceof o11) {
                ((o11) obj2).g = i10;
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
            ey0 ey0Var = new ey0(14, this, str);
            this.x = ey0Var;
            dispatchQueue.postRunnable(ey0Var, 300L);
            return;
        }
        this.w = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.p2 p2Var = this.e;
        if (p2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) p2Var).P.b.getImageReceiver().startAnimation();
                ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        o11 o11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            o11[] o11VarArr = this.c;
            if (i10 >= o11VarArr.length) {
                break;
            }
            o11 o11Var2 = o11VarArr[i10];
            if (o11Var2 != null) {
                hashMap.put(Integer.valueOf(o11Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (o11Var = (o11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        o11Var.g = readInt32;
                        arrayList.add(o11Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.m9(this));
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
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                return;
            }
        }
        org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
        if (this.w) {
            if (i10 >= this.r.size()) {
                int e = com.google.android.gms.internal.vision.e2.e(1, i10, this.r);
                z6Var.a((CharSequence) this.n.get(this.r.size() + e), ((MessagesController.FaqSearchResult) this.s.get(e)).path, true, e < this.r.size() - 1);
                return;
            } else {
                o11 o11Var = (o11) this.r.get(i10);
                o11 o11Var2 = i10 > 0 ? (o11) this.r.get(i10 - 1) : null;
                z6Var.b((CharSequence) this.n.get(i10), o11Var.d, (o11Var2 == null || o11Var2.e != o11Var.e) ? o11Var.e : 0, i10 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= arrayList.size()) {
            int e7 = com.google.android.gms.internal.vision.e2.e(1, i10, arrayList);
            MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) this.d.get(e7);
            z6Var.a(faqSearchResult.title, faqSearchResult.path, true, e7 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof o11) {
            o11 o11Var3 = (o11) obj;
            z6Var.a(o11Var3.a, o11Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            z6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View m4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.m4(context, 16) : new org.telegram.ui.Cells.u3(context, null) : new org.telegram.ui.Cells.z6(context);
        m4Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.fl0(m4Var);
    }
}
