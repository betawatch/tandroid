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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public class c11 extends org.telegram.ui.Components.ll0 {
    public TLRPC.WebPage E;
    public boolean F;
    public b11[] c;
    public final org.telegram.ui.ActionBar.n2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public by0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public c11(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
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

    public static b11[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        b11 b11Var;
        b11 b11Var2;
        b11 b11Var3;
        b11 b11Var4;
        b11 b11Var5;
        b11 b11Var6;
        b11 b11Var7;
        b11 b11Var8;
        b11 b11Var9;
        b11 b11Var10;
        b11 b11Var11;
        b11 b11Var12;
        b11 b11Var13;
        b11 b11Var14;
        b11 b11Var15;
        b11 b11Var16;
        b11 b11Var17;
        b11 b11Var18;
        b11 b11Var19;
        b11 b11Var20;
        b11 b11Var21;
        b11 b11Var22;
        final int currentAccount = n2Var.getCurrentAccount();
        b11 b11Var23 = new b11(LocaleController.getString(R.string.EditName), 500, 0, new by0(10, n2Var, n2Var.getResourceProvider()));
        final int i10 = 24;
        b11 b11Var24 = new b11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i11)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i11, 13), 700, true);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var24.a("tg://settings/edit/change-number");
        final int i11 = 6;
        b11 b11Var25 = new b11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                i12 = -1;
                            } else if (UserConfig.getInstance(i12).isClientActivated()) {
                                i12++;
                            }
                        }
                        if (i12 >= 0) {
                            n2Var.presentFragment(new rg0(i12));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var25.a("tg://settings/edit/add-account");
        final int i12 = 17;
        final int i13 = 1;
        b11 b11Var26 = new b11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var26.a("tg://settings/notifications");
        final int i14 = 29;
        b11 b11Var27 = new b11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var27.a("tg://settings/notifications/private-chats");
        final int i15 = 11;
        b11 b11Var28 = new b11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        b11Var28.a("tg://settings/notifications/groups");
        b11 b11Var29 = new b11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new li0(7, n2Var));
        b11Var29.a("tg://settings/notifications/channels");
        final int i16 = 19;
        b11 b11Var30 = new b11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new li0(i16, n2Var));
        b11 b11Var31 = new b11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i17 = 13;
        b11 b11Var32 = new b11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11 b11Var33 = new b11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new li0(23, n2Var));
        b11Var33.a("tg://settings/notifications/new-contacts");
        b11 b11Var34 = new b11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var34.a("tg://settings/notifications/pinned-messages");
        b11 b11Var35 = new b11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var35.a("tg://settings/notifications/reset");
        b11 b11Var36 = new b11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i18 = 18;
        b11 b11Var37 = new b11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11 b11Var38 = new b11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i19 = 20;
        b11 b11Var39 = new b11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var39.a("tg://settings/privacy");
        final int i20 = 21;
        b11 b11Var40 = new b11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        b11 b11Var41 = new b11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
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
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
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
        b11Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        b11 b11Var42 = new b11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var42.a("tg://settings/privacy/passcode");
        b11 b11Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            b11Var = b11Var40;
            final int i23 = 25;
            b11Var2 = new b11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.W(LiteMode.FLAGS_CHAT);
                            ic0Var.V(64);
                            break;
                        case 1:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(LiteMode.FLAGS_CHAT);
                            ic0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(LiteMode.FLAGS_CHAT);
                            ic0Var3.V(256);
                            break;
                        case 4:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.W(LiteMode.FLAGS_CHAT);
                            ic0Var4.V(32768);
                            break;
                        case 5:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.V(1024);
                            break;
                        case 8:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.V(2048);
                            break;
                        case 9:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = ic0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((cc0) arrayList.get(i112)).f == 1) {
                                    ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                            break;
                        case 15:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                            x0Var2.B();
                            n2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zx0 zx0Var = new zx0();
                            zx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(zx0Var);
                            break;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            b11Var2.a("tg://settings/privacy/login-email");
        } else {
            b11Var = b11Var40;
            b11Var2 = null;
        }
        final int i24 = 26;
        b11 b11Var44 = new b11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        b11 b11Var45 = new b11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i25) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var45.a("tg://settings/devices");
        final int i26 = 28;
        b11 b11Var46 = new b11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        b11 b11Var47 = new b11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        b11 b11Var48 = new b11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        b11 b11Var49 = new b11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        b11 b11Var50 = new b11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        b11 b11Var51 = new b11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        b11 b11Var52 = new b11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        b11 b11Var53 = new b11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
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
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
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
        b11Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            b11Var3 = b11Var53;
            final int i34 = 7;
            b11Var4 = new b11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.z01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i34) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                n2Var.presentFragment(new rg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new z6());
                            break;
                        case 24:
                            n2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                            x0Var3.B();
                            n2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new z6());
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new wu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            b11Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            b11Var3 = b11Var53;
            b11Var4 = null;
        }
        final int i35 = 8;
        b11 b11Var54 = new b11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        b11 b11Var55 = new b11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        b11 b11Var56 = new b11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        b11 b11Var57 = new b11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        b11 b11Var58 = new b11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        b11 b11Var59 = new b11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        b11 b11Var60 = new b11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        b11 b11Var61 = new b11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        b11 b11Var62 = new b11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var62.a("tg://settings/devices");
        final int i44 = 19;
        b11 b11Var63 = new b11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        b11 b11Var64 = new b11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        b11 b11Var65 = new b11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        b11 b11Var66 = new b11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        b11 b11Var67 = new b11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        b11 b11Var68 = new b11(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        b11 b11Var69 = new b11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        b11 b11Var70 = new b11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        b11 b11Var71 = new b11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.z01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        n2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        n2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        n2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        n2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            n2Var.presentFragment(new rg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        n2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        n2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        n2Var.presentFragment(new z6());
                        break;
                    case 24:
                        n2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new z6());
                        break;
                    case 27:
                        n2Var.presentFragment(new z6());
                        break;
                    case 28:
                        n2Var.presentFragment(new wu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        b11Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        b11 b11Var72 = new b11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i54 = 1;
        b11 b11Var73 = new b11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i55 = 2;
        b11 b11Var74 = new b11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        b11 b11Var75 = new b11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        b11 b11Var76 = new b11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        b11Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        b11 b11Var77 = new b11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i59 = 7;
        b11 b11Var78 = new b11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i60 = 8;
        b11 b11Var79 = new b11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        b11 b11Var80 = new b11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        b11Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        b11 b11Var81 = new b11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i63 = 12;
        b11 b11Var82 = new b11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        b11Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        b11 b11Var83 = new b11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        b11Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        b11 b11Var84 = new b11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i66 = 15;
        b11 b11Var85 = new b11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        b11Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        b11 b11Var86 = new b11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.a11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        n2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        n2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        n2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        n2Var.presentFragment(new DataSettingsActivity());
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
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        n2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        n2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        b11Var86.a("tg://settings/data/save-to-photos/groups");
        b11 b11Var87 = new b11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new li0(2, n2Var));
        b11Var87.a("tg://settings/data/save-to-photos/channels");
        b11 b11Var88 = new b11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new li0(3, n2Var));
        b11Var88.a("tg://settings/appearance/themes");
        b11 b11Var89 = new b11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(4, n2Var));
        b11Var89.a("tg://settings/appearance/text-size");
        b11 b11Var90 = new b11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(5, n2Var));
        b11Var90.a("tg://settings/appearance/wallpapers");
        b11 b11Var91 = new b11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new li0(6, n2Var));
        b11 b11Var92 = new b11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new li0(8, n2Var));
        b11 b11Var93 = new b11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(9, n2Var));
        b11 b11Var94 = new b11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(10, n2Var));
        b11 b11Var95 = new b11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new li0(11, n2Var));
        b11Var95.a("tg://settings/appearance/themes/create");
        b11 b11Var96 = new b11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(13, n2Var));
        b11Var96.a("tg://settings/appearance/message-corners");
        b11 b11Var97 = new b11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(14, n2Var));
        b11 b11Var98 = new b11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(15, n2Var));
        b11 b11Var99 = new b11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(16, n2Var));
        b11Var99.a("tg://settings/appearance/app-icon");
        b11 b11Var100 = new b11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(17, n2Var));
        b11 b11Var101 = new b11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(18, n2Var));
        b11Var101.a("tg://settings/appearance/tap-for-next-media");
        b11 b11Var102 = new b11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(20, n2Var));
        b11Var102.a("tg://settings/data/raise-to-listen");
        b11 b11Var103 = new b11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(21, n2Var));
        b11Var103.a("tg://settings/data/raise-to-speak");
        b11 b11Var104 = new b11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(22, n2Var));
        b11Var104.a("tg://settings/data/pause-music");
        b11 b11Var105 = new b11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(24, n2Var));
        b11 b11Var106 = new b11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(25, n2Var));
        b11 b11Var107 = new b11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(26, n2Var));
        b11 b11Var108 = new b11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new li0(27, n2Var));
        b11 b11Var109 = new b11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new li0(28, n2Var));
        b11Var109.a("tg://settings/appearance/stickers-and-emoji");
        b11 b11Var110 = new b11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new li0(29, n2Var));
        final int i68 = 0;
        b11 b11Var111 = new b11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        b11 b11Var112 = new b11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        b11 b11Var113 = new b11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        b11 b11Var114 = new b11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        b11 b11Var115 = new b11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        b11 b11Var116 = new b11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        b11 b11Var117 = new b11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        b11 b11Var118 = new b11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        b11 b11Var119 = new b11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        b11 b11Var120 = new b11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        b11 b11Var121 = new b11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var121.a("tg://settings/folders");
        final int i79 = 21;
        b11 b11Var122 = new b11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            b11Var5 = b11Var122;
            b11Var6 = b11Var113;
            b11Var7 = b11Var115;
            b11Var8 = b11Var117;
            final int i80 = 2;
            b11Var9 = new b11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i80) {
                        case 0:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.W(LiteMode.FLAGS_CHAT);
                            ic0Var.V(64);
                            break;
                        case 1:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(LiteMode.FLAGS_CHAT);
                            ic0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(LiteMode.FLAGS_CHAT);
                            ic0Var3.V(256);
                            break;
                        case 4:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.W(LiteMode.FLAGS_CHAT);
                            ic0Var4.V(32768);
                            break;
                        case 5:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.V(1024);
                            break;
                        case 8:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.V(2048);
                            break;
                        case 9:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = ic0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((cc0) arrayList.get(i112)).f == 1) {
                                    ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                            break;
                        case 15:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                            x0Var2.B();
                            n2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zx0 zx0Var = new zx0();
                            zx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(zx0Var);
                            break;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            b11Var5 = b11Var122;
            b11Var6 = b11Var113;
            b11Var7 = b11Var115;
            b11Var8 = b11Var117;
            b11Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            b11Var10 = new b11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i81) {
                        case 0:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.W(LiteMode.FLAGS_CHAT);
                            ic0Var.V(64);
                            break;
                        case 1:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(LiteMode.FLAGS_CHAT);
                            ic0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(LiteMode.FLAGS_CHAT);
                            ic0Var3.V(256);
                            break;
                        case 4:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.W(LiteMode.FLAGS_CHAT);
                            ic0Var4.V(32768);
                            break;
                        case 5:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.V(1024);
                            break;
                        case 8:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.V(2048);
                            break;
                        case 9:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = ic0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((cc0) arrayList.get(i112)).f == 1) {
                                    ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                            break;
                        case 15:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                            x0Var2.B();
                            n2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zx0 zx0Var = new zx0();
                            zx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(zx0Var);
                            break;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            b11Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            b11Var11 = new b11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.W(LiteMode.FLAGS_CHAT);
                            ic0Var.V(64);
                            break;
                        case 1:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(LiteMode.FLAGS_CHAT);
                            ic0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(LiteMode.FLAGS_CHAT);
                            ic0Var3.V(256);
                            break;
                        case 4:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.W(LiteMode.FLAGS_CHAT);
                            ic0Var4.V(32768);
                            break;
                        case 5:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.V(1024);
                            break;
                        case 8:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.V(2048);
                            break;
                        case 9:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = ic0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((cc0) arrayList.get(i112)).f == 1) {
                                    ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                            break;
                        case 15:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                            x0Var2.B();
                            n2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zx0 zx0Var = new zx0();
                            zx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(zx0Var);
                            break;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            b11Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            b11Var12 = new b11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.z01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                n2Var.presentFragment(new rg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new z6());
                            break;
                        case 24:
                            n2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                            x0Var3.B();
                            n2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new z6());
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new wu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            b11Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            b11Var13 = new b11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.z01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                n2Var.presentFragment(new rg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new z6());
                            break;
                        case 24:
                            n2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                            x0Var3.B();
                            n2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new z6());
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new wu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            b11Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            b11Var14 = new b11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.z01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            n2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            n2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            n2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            n2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 1, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (UserConfig.getInstance(i122).isClientActivated()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                n2Var.presentFragment(new rg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            n2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 2, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            n2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            n2Var.presentFragment(new z6());
                            break;
                        case 24:
                            n2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var3 = new rg.x0(n2Var4, 8, false);
                            x0Var3.B();
                            n2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new z6());
                            break;
                        case 27:
                            n2Var.presentFragment(new z6());
                            break;
                        case 28:
                            n2Var.presentFragment(new wu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            b11Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            b11Var15 = new b11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.a11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 7:
                            n2Var.presentFragment(new DataSettingsActivity());
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
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                    }
                }
            });
        } else {
            b11Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            b11Var16 = new b11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.a11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            n2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            n2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            n2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 3, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 7:
                            n2Var.presentFragment(new DataSettingsActivity());
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
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            n2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            n2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 4, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                    }
                }
            });
        } else {
            b11Var16 = null;
        }
        b11 b11Var123 = F(currentAccount, 5) ? new b11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new li0(12, n2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            b11Var17 = new b11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.w01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new e31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                            x0Var3.B();
                            n2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                            x0Var4.B();
                            n2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                            x0Var5.B();
                            n2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new ic0());
                            break;
                        case 19:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.V(3);
                            break;
                        case 20:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(3);
                            ic0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(3);
                            ic0Var3.V(2);
                            break;
                        case 23:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            ic0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            ic0 ic0Var9 = new ic0();
                            n2Var.presentFragment(ic0Var9);
                            ic0Var9.W(LiteMode.FLAGS_CHAT);
                            ic0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            b11Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            b11Var18 = new b11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.w01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new e31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                            x0Var3.B();
                            n2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                            x0Var4.B();
                            n2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                            x0Var5.B();
                            n2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new ic0());
                            break;
                        case 19:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.V(3);
                            break;
                        case 20:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(3);
                            ic0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(3);
                            ic0Var3.V(2);
                            break;
                        case 23:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            ic0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            ic0 ic0Var9 = new ic0();
                            n2Var.presentFragment(ic0Var9);
                            ic0Var9.W(LiteMode.FLAGS_CHAT);
                            ic0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            b11Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            b11Var19 = new b11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.w01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new e31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                            x0Var3.B();
                            n2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                            x0Var4.B();
                            n2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                            x0Var5.B();
                            n2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new ic0());
                            break;
                        case 19:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.V(3);
                            break;
                        case 20:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(3);
                            ic0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(3);
                            ic0Var3.V(2);
                            break;
                        case 23:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            ic0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            ic0 ic0Var9 = new ic0();
                            n2Var.presentFragment(ic0Var9);
                            ic0Var9.W(LiteMode.FLAGS_CHAT);
                            ic0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            b11Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            b11Var20 = new b11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.w01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new e31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                            x0Var3.B();
                            n2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                            x0Var4.B();
                            n2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                            x0Var5.B();
                            n2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new ic0());
                            break;
                        case 19:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.V(3);
                            break;
                        case 20:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(3);
                            ic0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(3);
                            ic0Var3.V(2);
                            break;
                        case 23:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            ic0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            ic0 ic0Var9 = new ic0();
                            n2Var.presentFragment(ic0Var9);
                            ic0Var9.W(LiteMode.FLAGS_CHAT);
                            ic0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            b11Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            b11Var21 = new b11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.w01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            n2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            n2Var.presentFragment(new p(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new p(1));
                            break;
                        case 6:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            n2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            n2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            n2Var.presentFragment(new e31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                            x0Var2.B();
                            n2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                            x0Var3.B();
                            n2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                            x0Var4.B();
                            n2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                            x0Var5.B();
                            n2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new ic0());
                            break;
                        case 19:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.V(3);
                            break;
                        case 20:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(3);
                            ic0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(3);
                            ic0Var3.V(2);
                            break;
                        case 23:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            ic0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            ic0 ic0Var9 = new ic0();
                            n2Var.presentFragment(ic0Var9);
                            ic0Var9.W(LiteMode.FLAGS_CHAT);
                            ic0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            b11Var21 = null;
        }
        final int i93 = 18;
        b11 b11Var124 = new b11(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i93) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        b11 b11Var125 = new b11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i94) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        b11 b11Var126 = new b11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        b11 b11Var127 = new b11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        b11 b11Var128 = new b11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        b11 b11Var129 = new b11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        b11 b11Var130 = new b11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        b11 b11Var131 = new b11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        b11 b11Var132 = new b11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        b11 b11Var133 = new b11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        n2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        n2Var.presentFragment(new p(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 9, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new p(1));
                        break;
                    case 6:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        n2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        n2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        n2Var.presentFragment(new e31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var3, 6, false);
                        x0Var2.B();
                        n2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var3 = new rg.x0(n2Var4, 7, false);
                        x0Var3.B();
                        n2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.x0 x0Var4 = new rg.x0(n2Var5, 10, false);
                        x0Var4.B();
                        n2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.x0 x0Var5 = new rg.x0(n2Var6, 12, false);
                        x0Var5.B();
                        n2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new ic0());
                        break;
                    case 19:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.V(3);
                        break;
                    case 20:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(3);
                        ic0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(3);
                        ic0Var3.V(2);
                        break;
                    case 23:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        ic0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        ic0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        ic0 ic0Var9 = new ic0();
                        n2Var.presentFragment(ic0Var9);
                        ic0Var9.W(LiteMode.FLAGS_CHAT);
                        ic0Var9.V(32);
                        break;
                }
            }
        });
        b11Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        b11 b11Var134 = new b11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i104 = 1;
        b11 b11Var135 = new b11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i105 = 3;
            b11Var22 = new b11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i105) {
                        case 0:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.W(LiteMode.FLAGS_CHAT);
                            ic0Var.V(64);
                            break;
                        case 1:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(LiteMode.FLAGS_CHAT);
                            ic0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(LiteMode.FLAGS_CHAT);
                            ic0Var3.V(256);
                            break;
                        case 4:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.W(LiteMode.FLAGS_CHAT);
                            ic0Var4.V(32768);
                            break;
                        case 5:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.V(1024);
                            break;
                        case 8:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.V(2048);
                            break;
                        case 9:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = ic0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((cc0) arrayList.get(i112)).f == 1) {
                                    ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                            break;
                        case 15:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                            x0Var2.B();
                            n2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zx0 zx0Var = new zx0();
                            zx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(zx0Var);
                            break;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            b11Var22 = null;
        }
        final int i106 = 4;
        b11 b11Var136 = new b11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i107 = 5;
        b11 b11Var137 = new b11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        b11 b11Var138 = new b11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i108) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        b11 b11Var139 = new b11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        b11 b11Var140 = new b11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        b11 b11Var141 = new b11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i112)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var141.a("tg://settings/language");
        final int i112 = 11;
        b11 b11Var142 = new b11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i1122)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i113 = 12;
            b11 b11Var143 = new b11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i113) {
                        case 0:
                            ic0 ic0Var = new ic0();
                            n2Var.presentFragment(ic0Var);
                            ic0Var.W(LiteMode.FLAGS_CHAT);
                            ic0Var.V(64);
                            break;
                        case 1:
                            ic0 ic0Var2 = new ic0();
                            n2Var.presentFragment(ic0Var2);
                            ic0Var2.W(LiteMode.FLAGS_CHAT);
                            ic0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ic0 ic0Var3 = new ic0();
                            n2Var.presentFragment(ic0Var3);
                            ic0Var3.W(LiteMode.FLAGS_CHAT);
                            ic0Var3.V(256);
                            break;
                        case 4:
                            ic0 ic0Var4 = new ic0();
                            n2Var.presentFragment(ic0Var4);
                            ic0Var4.W(LiteMode.FLAGS_CHAT);
                            ic0Var4.V(32768);
                            break;
                        case 5:
                            ic0 ic0Var5 = new ic0();
                            n2Var.presentFragment(ic0Var5);
                            ic0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ic0 ic0Var6 = new ic0();
                            n2Var.presentFragment(ic0Var6);
                            ic0Var6.V(1024);
                            break;
                        case 8:
                            ic0 ic0Var7 = new ic0();
                            n2Var.presentFragment(ic0Var7);
                            ic0Var7.V(2048);
                            break;
                        case 9:
                            ic0 ic0Var8 = new ic0();
                            n2Var.presentFragment(ic0Var8);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = ic0Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((cc0) arrayList.get(i1122)).f == 1) {
                                    ic0Var8.b.e1(new i2.s(ic0Var8, i1122, 13), 700, true);
                                    break;
                                } else {
                                    i1122++;
                                }
                            }
                        case 10:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            n2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                            x0Var.B();
                            n2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                            break;
                        case 15:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            n2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            n2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                            x0Var2.B();
                            n2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zx0 zx0Var = new zx0();
                            zx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(zx0Var);
                            break;
                        case 27:
                            n2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            n2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            n2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            b11Var143.a("tg://settings/language/do-not-translate");
            b11Var43 = b11Var143;
        }
        final int i114 = 14;
        b11 b11Var144 = new b11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i1122)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        b11 b11Var145 = new b11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i1122)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var145.a("tg://settings/faq");
        final int i116 = 16;
        b11 b11Var146 = new b11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i116) {
                    case 0:
                        ic0 ic0Var = new ic0();
                        n2Var.presentFragment(ic0Var);
                        ic0Var.W(LiteMode.FLAGS_CHAT);
                        ic0Var.V(64);
                        break;
                    case 1:
                        ic0 ic0Var2 = new ic0();
                        n2Var.presentFragment(ic0Var2);
                        ic0Var2.W(LiteMode.FLAGS_CHAT);
                        ic0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ic0 ic0Var3 = new ic0();
                        n2Var.presentFragment(ic0Var3);
                        ic0Var3.W(LiteMode.FLAGS_CHAT);
                        ic0Var3.V(256);
                        break;
                    case 4:
                        ic0 ic0Var4 = new ic0();
                        n2Var.presentFragment(ic0Var4);
                        ic0Var4.W(LiteMode.FLAGS_CHAT);
                        ic0Var4.V(32768);
                        break;
                    case 5:
                        ic0 ic0Var5 = new ic0();
                        n2Var.presentFragment(ic0Var5);
                        ic0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ic0 ic0Var6 = new ic0();
                        n2Var.presentFragment(ic0Var6);
                        ic0Var6.V(1024);
                        break;
                    case 8:
                        ic0 ic0Var7 = new ic0();
                        n2Var.presentFragment(ic0Var7);
                        ic0Var7.V(2048);
                        break;
                    case 9:
                        ic0 ic0Var8 = new ic0();
                        n2Var.presentFragment(ic0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = ic0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((cc0) arrayList.get(i1122)).f == 1) {
                                ic0Var8.b.e1(new i2.s(ic0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        n2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.x0 x0Var = new rg.x0(n2Var2, 0, false);
                        x0Var.B();
                        n2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.e5.U(n2Var3, null));
                        break;
                    case 15:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        n2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        n2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.x0 x0Var2 = new rg.x0(n2Var4, 11, false);
                        x0Var2.B();
                        n2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zx0 zx0Var = new zx0();
                        zx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(zx0Var);
                        break;
                    case 27:
                        n2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        n2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        n2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        b11Var146.a("tg://settings/privacy-policy");
        return new b11[]{b11Var23, b11Var24, b11Var25, b11Var26, b11Var27, b11Var28, b11Var29, b11Var30, b11Var31, b11Var32, b11Var33, b11Var34, b11Var35, b11Var36, b11Var37, b11Var38, b11Var39, b11Var, b11Var41, b11Var42, b11Var2, b11Var44, b11Var45, b11Var46, b11Var47, b11Var48, b11Var49, b11Var50, b11Var51, b11Var52, b11Var3, b11Var4, b11Var54, b11Var55, b11Var56, b11Var57, b11Var58, b11Var59, b11Var60, b11Var61, b11Var62, b11Var63, b11Var64, b11Var65, b11Var66, b11Var67, b11Var68, b11Var69, b11Var70, b11Var71, b11Var72, b11Var73, b11Var74, b11Var75, b11Var76, b11Var77, b11Var78, b11Var79, b11Var80, b11Var81, b11Var82, b11Var83, b11Var84, b11Var85, b11Var86, b11Var87, b11Var88, b11Var89, b11Var90, b11Var91, b11Var92, b11Var93, b11Var94, b11Var95, b11Var96, b11Var97, b11Var98, b11Var99, b11Var100, b11Var101, b11Var102, b11Var103, b11Var104, b11Var105, b11Var106, b11Var107, b11Var108, b11Var109, b11Var110, b11Var111, b11Var112, b11Var6, b11Var114, b11Var7, b11Var116, b11Var8, b11Var118, b11Var119, b11Var120, b11Var121, b11Var5, b11Var9, b11Var10, b11Var11, b11Var12, b11Var13, b11Var14, b11Var15, b11Var16, b11Var123, b11Var17, b11Var18, b11Var19, b11Var20, b11Var21, b11Var124, b11Var125, b11Var126, b11Var127, b11Var128, b11Var129, b11Var130, b11Var131, b11Var132, b11Var133, b11Var134, b11Var135, b11Var22, b11Var136, b11Var137, b11Var138, b11Var139, b11Var140, b11Var141, b11Var142, b11Var43, b11Var144, b11Var145, b11Var146};
    }

    @Override // org.telegram.ui.Components.ll0
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
            a4.a.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof b11) {
                ((b11) obj2).g = i10;
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
            by0 by0Var = new by0(11, this, str);
            this.x = by0Var;
            dispatchQueue.postRunnable(by0Var, 300L);
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        b11 b11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            b11[] b11VarArr = this.c;
            if (i10 >= b11VarArr.length) {
                break;
            }
            b11 b11Var2 = b11VarArr[i10];
            if (b11Var2 != null) {
                hashMap.put(Integer.valueOf(b11Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (b11Var = (b11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        b11Var.g = readInt32;
                        arrayList.add(b11Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new df(this));
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
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.SettingsRecent));
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
                b11 b11Var = (b11) this.r.get(i10);
                b11 b11Var2 = i10 > 0 ? (b11) this.r.get(i10 - 1) : null;
                x6Var.b((CharSequence) this.n.get(i10), b11Var.d, (b11Var2 == null || b11Var2.e != b11Var.e) ? b11Var.e : 0, i10 < this.r.size() - 1);
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
        if (obj instanceof b11) {
            b11 b11Var3 = (b11) obj;
            x6Var.a(b11Var3.a, b11Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            x6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View m4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.m4(context, 16) : new org.telegram.ui.Cells.v3(context, null) : new org.telegram.ui.Cells.x6(context);
        m4Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.wk0(m4Var);
    }
}
