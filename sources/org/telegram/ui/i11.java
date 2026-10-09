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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public class i11 extends org.telegram.ui.Components.pm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public h11[] c;
    public final org.telegram.ui.ActionBar.n2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public rt0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public i11(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
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

    public static h11[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        h11 h11Var;
        h11 h11Var2;
        h11 h11Var3;
        h11 h11Var4;
        h11 h11Var5;
        h11 h11Var6;
        h11 h11Var7;
        h11 h11Var8;
        h11 h11Var9;
        h11 h11Var10;
        h11 h11Var11;
        h11 h11Var12;
        h11 h11Var13;
        h11 h11Var14;
        h11 h11Var15;
        h11 h11Var16;
        h11 h11Var17;
        h11 h11Var18;
        h11 h11Var19;
        h11 h11Var20;
        h11 h11Var21;
        h11 h11Var22;
        final int currentAccount = n2Var.getCurrentAccount();
        final int i10 = 24;
        h11 h11Var23 = new h11(LocaleController.getString(R.string.EditName), 500, 0, new rt0(24, n2Var, n2Var.getResourceProvider()));
        h11 h11Var24 = new h11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i11)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i11, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var24.a("tg://settings/edit/change-number");
        final int i11 = 6;
        h11 h11Var25 = new h11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i12));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var25.a("tg://settings/edit/add-account");
        final int i12 = 17;
        final int i13 = 1;
        h11 h11Var26 = new h11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var26.a("tg://settings/notifications");
        final int i14 = 29;
        h11 h11Var27 = new h11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var27.a("tg://settings/notifications/private-chats");
        final int i15 = 11;
        h11 h11Var28 = new h11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        h11Var28.a("tg://settings/notifications/groups");
        h11 h11Var29 = new h11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new si0(7, n2Var));
        h11Var29.a("tg://settings/notifications/channels");
        final int i16 = 19;
        h11 h11Var30 = new h11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new si0(i16, n2Var));
        h11 h11Var31 = new h11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i17 = 13;
        h11 h11Var32 = new h11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11 h11Var33 = new h11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new si0(23, n2Var));
        h11Var33.a("tg://settings/notifications/new-contacts");
        h11 h11Var34 = new h11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var34.a("tg://settings/notifications/pinned-messages");
        h11 h11Var35 = new h11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var35.a("tg://settings/notifications/reset");
        h11 h11Var36 = new h11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var37 = new h11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var38 = new h11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var39 = new h11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var39.a("tg://settings/privacy");
        final int i20 = 21;
        h11 h11Var40 = new h11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        h11 h11Var41 = new h11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(a02.W(), null);
                            bcVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            bcVar.b.setText(spannableStringBuilder);
                            bcVar.b.setSingleLine(false);
                            bcVar.b.setMaxLines(2);
                            a02.b(bcVar, 2750).j();
                            break;
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        h11Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        h11 h11Var42 = new h11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var42.a("tg://settings/privacy/passcode");
        h11 h11Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            h11Var = h11Var40;
            final int i23 = 25;
            h11Var2 = new h11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.d11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(LiteMode.FLAGS_CHAT);
                            mc0Var.V(64);
                            break;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(LiteMode.FLAGS_CHAT);
                            mc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(LiteMode.FLAGS_CHAT);
                            mc0Var3.V(256);
                            break;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(LiteMode.FLAGS_CHAT);
                            mc0Var4.V(32768);
                            break;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            break;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            break;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((gc0) arrayList.get(i112)).f == 1) {
                                    mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            break;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            n2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var2.a("tg://settings/privacy/login-email");
        } else {
            h11Var = h11Var40;
            h11Var2 = null;
        }
        final int i24 = 26;
        h11 h11Var44 = new h11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        h11 h11Var45 = new h11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i25) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var45.a("tg://settings/devices");
        final int i26 = 28;
        h11 h11Var46 = new h11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        h11 h11Var47 = new h11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        h11 h11Var48 = new h11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        h11 h11Var49 = new h11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        h11 h11Var50 = new h11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        h11 h11Var51 = new h11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        h11 h11Var52 = new h11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        h11 h11Var53 = new h11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.bc bcVar = new org.telegram.ui.Components.bc(a02.W(), null);
                            bcVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.ac(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            bcVar.b.setText(spannableStringBuilder);
                            bcVar.b.setSingleLine(false);
                            bcVar.b.setMaxLines(2);
                            a02.b(bcVar, 2750).j();
                            break;
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        h11Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            h11Var3 = h11Var53;
            final int i34 = 7;
            h11Var4 = new h11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
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
                                n2Var.presentFragment(new wg0(i122));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
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
                            n2Var.presentFragment(new y6());
                            break;
                        case 24:
                            n2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new y6());
                            break;
                        case 27:
                            n2Var.presentFragment(new y6());
                            break;
                        case 28:
                            n2Var.presentFragment(new yu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            h11Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            h11Var3 = h11Var53;
            h11Var4 = null;
        }
        final int i35 = 8;
        h11 h11Var54 = new h11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        h11 h11Var55 = new h11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        h11 h11Var56 = new h11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        h11 h11Var57 = new h11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        h11 h11Var58 = new h11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        h11 h11Var59 = new h11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        h11 h11Var60 = new h11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        h11 h11Var61 = new h11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        h11 h11Var62 = new h11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var62.a("tg://settings/devices");
        final int i44 = 19;
        h11 h11Var63 = new h11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        h11 h11Var64 = new h11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        h11 h11Var65 = new h11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        h11 h11Var66 = new h11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        h11 h11Var67 = new h11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        h11 h11Var68 = new h11(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        h11 h11Var69 = new h11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        h11 h11Var70 = new h11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        h11 h11Var71 = new h11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.f11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new wg0(i122));
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
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
                        n2Var.presentFragment(new y6());
                        break;
                    case 24:
                        n2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new y6());
                        break;
                    case 27:
                        n2Var.presentFragment(new y6());
                        break;
                    case 28:
                        n2Var.presentFragment(new yu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        h11Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        h11 h11Var72 = new h11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i54 = 1;
        h11 h11Var73 = new h11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i55 = 2;
        h11 h11Var74 = new h11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        h11 h11Var75 = new h11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        h11 h11Var76 = new h11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        h11Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        h11 h11Var77 = new h11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i59 = 7;
        h11 h11Var78 = new h11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i60 = 8;
        h11 h11Var79 = new h11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        h11 h11Var80 = new h11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        h11Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        h11 h11Var81 = new h11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i63 = 12;
        h11 h11Var82 = new h11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        h11Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        h11 h11Var83 = new h11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        h11Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        h11 h11Var84 = new h11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i66 = 15;
        h11 h11Var85 = new h11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        h11Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        h11 h11Var86 = new h11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
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
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        h11Var86.a("tg://settings/data/save-to-photos/groups");
        h11 h11Var87 = new h11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new si0(2, n2Var));
        h11Var87.a("tg://settings/data/save-to-photos/channels");
        h11 h11Var88 = new h11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new si0(3, n2Var));
        h11Var88.a("tg://settings/appearance/themes");
        h11 h11Var89 = new h11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(4, n2Var));
        h11Var89.a("tg://settings/appearance/text-size");
        h11 h11Var90 = new h11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(5, n2Var));
        h11Var90.a("tg://settings/appearance/wallpapers");
        h11 h11Var91 = new h11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new si0(6, n2Var));
        h11 h11Var92 = new h11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new si0(8, n2Var));
        h11 h11Var93 = new h11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(9, n2Var));
        h11 h11Var94 = new h11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(10, n2Var));
        h11 h11Var95 = new h11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new si0(11, n2Var));
        h11Var95.a("tg://settings/appearance/themes/create");
        h11 h11Var96 = new h11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(13, n2Var));
        h11Var96.a("tg://settings/appearance/message-corners");
        h11 h11Var97 = new h11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(14, n2Var));
        h11 h11Var98 = new h11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(15, n2Var));
        h11 h11Var99 = new h11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(16, n2Var));
        h11Var99.a("tg://settings/appearance/app-icon");
        h11 h11Var100 = new h11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(17, n2Var));
        h11 h11Var101 = new h11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(18, n2Var));
        h11Var101.a("tg://settings/appearance/tap-for-next-media");
        h11 h11Var102 = new h11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(20, n2Var));
        h11Var102.a("tg://settings/data/raise-to-listen");
        h11 h11Var103 = new h11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(21, n2Var));
        h11Var103.a("tg://settings/data/raise-to-speak");
        h11 h11Var104 = new h11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(22, n2Var));
        h11Var104.a("tg://settings/data/pause-music");
        h11 h11Var105 = new h11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(24, n2Var));
        h11 h11Var106 = new h11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(25, n2Var));
        h11 h11Var107 = new h11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(26, n2Var));
        h11 h11Var108 = new h11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(27, n2Var));
        h11 h11Var109 = new h11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new si0(28, n2Var));
        h11Var109.a("tg://settings/appearance/stickers-and-emoji");
        h11 h11Var110 = new h11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new si0(29, n2Var));
        final int i68 = 0;
        h11 h11Var111 = new h11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        h11 h11Var112 = new h11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        h11 h11Var113 = new h11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        h11 h11Var114 = new h11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        h11 h11Var115 = new h11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        h11 h11Var116 = new h11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        h11 h11Var117 = new h11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        h11 h11Var118 = new h11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        h11 h11Var119 = new h11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        h11 h11Var120 = new h11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        h11 h11Var121 = new h11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var121.a("tg://settings/folders");
        final int i79 = 21;
        h11 h11Var122 = new h11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            h11Var5 = h11Var122;
            h11Var6 = h11Var113;
            h11Var7 = h11Var115;
            h11Var8 = h11Var117;
            final int i80 = 2;
            h11Var9 = new h11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i80) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(LiteMode.FLAGS_CHAT);
                            mc0Var.V(64);
                            break;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(LiteMode.FLAGS_CHAT);
                            mc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(LiteMode.FLAGS_CHAT);
                            mc0Var3.V(256);
                            break;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(LiteMode.FLAGS_CHAT);
                            mc0Var4.V(32768);
                            break;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            break;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            break;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((gc0) arrayList.get(i112)).f == 1) {
                                    mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            break;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            n2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var5 = h11Var122;
            h11Var6 = h11Var113;
            h11Var7 = h11Var115;
            h11Var8 = h11Var117;
            h11Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            h11Var10 = new h11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i81) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(LiteMode.FLAGS_CHAT);
                            mc0Var.V(64);
                            break;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(LiteMode.FLAGS_CHAT);
                            mc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(LiteMode.FLAGS_CHAT);
                            mc0Var3.V(256);
                            break;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(LiteMode.FLAGS_CHAT);
                            mc0Var4.V(32768);
                            break;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            break;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            break;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((gc0) arrayList.get(i112)).f == 1) {
                                    mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            break;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            n2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            h11Var11 = new h11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(LiteMode.FLAGS_CHAT);
                            mc0Var.V(64);
                            break;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(LiteMode.FLAGS_CHAT);
                            mc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(LiteMode.FLAGS_CHAT);
                            mc0Var3.V(256);
                            break;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(LiteMode.FLAGS_CHAT);
                            mc0Var4.V(32768);
                            break;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            break;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            break;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((gc0) arrayList.get(i112)).f == 1) {
                                    mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            break;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            n2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            h11Var12 = new h11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f11
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
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
                                n2Var.presentFragment(new wg0(i122));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
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
                            n2Var.presentFragment(new y6());
                            break;
                        case 24:
                            n2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new y6());
                            break;
                        case 27:
                            n2Var.presentFragment(new y6());
                            break;
                        case 28:
                            n2Var.presentFragment(new yu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            h11Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            h11Var13 = new h11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f11
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
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
                                n2Var.presentFragment(new wg0(i122));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
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
                            n2Var.presentFragment(new y6());
                            break;
                        case 24:
                            n2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new y6());
                            break;
                        case 27:
                            n2Var.presentFragment(new y6());
                            break;
                        case 28:
                            n2Var.presentFragment(new yu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            h11Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            h11Var14 = new h11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f11
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 1, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
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
                                n2Var.presentFragment(new wg0(i122));
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 2, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
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
                            n2Var.presentFragment(new y6());
                            break;
                        case 24:
                            n2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 8, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new y6());
                            break;
                        case 27:
                            n2Var.presentFragment(new y6());
                            break;
                        case 28:
                            n2Var.presentFragment(new yu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            h11Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            h11Var15 = new h11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.g11
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            h11Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            h11Var16 = new h11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.g11
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 3, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
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
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 4, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            h11Var16 = null;
        }
        h11 h11Var123 = F(currentAccount, 5) ? new h11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new si0(12, n2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            h11Var17 = new h11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.c11
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
                            n2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            break;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            break;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            break;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(LiteMode.FLAGS_CHAT);
                            mc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            h11Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            h11Var18 = new h11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.c11
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
                            n2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            break;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            break;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            break;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(LiteMode.FLAGS_CHAT);
                            mc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            h11Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            h11Var19 = new h11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.c11
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
                            n2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            break;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            break;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            break;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(LiteMode.FLAGS_CHAT);
                            mc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            h11Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            h11Var20 = new h11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.c11
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
                            n2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            break;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            break;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            break;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(LiteMode.FLAGS_CHAT);
                            mc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            h11Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            h11Var21 = new h11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.c11
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
                            n2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                            rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new q(1));
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
                            n2Var.presentFragment(new l31());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                            y0Var2.E();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                            y0Var3.E();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                            y0Var4.E();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                            y0Var5.E();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new mc0());
                            break;
                        case 19:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.V(3);
                            break;
                        case 20:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(3);
                            mc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(3);
                            mc0Var3.V(2);
                            break;
                        case 23:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            mc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            mc0 mc0Var9 = new mc0();
                            n2Var.presentFragment(mc0Var9);
                            mc0Var9.W(LiteMode.FLAGS_CHAT);
                            mc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            h11Var21 = null;
        }
        final int i93 = 18;
        h11 h11Var124 = new h11(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        h11 h11Var125 = new h11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        h11 h11Var126 = new h11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        h11 h11Var127 = new h11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        h11 h11Var128 = new h11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        h11 h11Var129 = new h11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        h11 h11Var130 = new h11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        h11 h11Var131 = new h11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        h11 h11Var132 = new h11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        h11 h11Var133 = new h11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.c11
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
                        n2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                        rg.y0 y0Var = new rg.y0(n2Var2, 9, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new q(1));
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
                        n2Var.presentFragment(new l31());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var3, 6, false);
                        y0Var2.E();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var3 = new rg.y0(n2Var4, 7, false);
                        y0Var3.E();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        rg.y0 y0Var4 = new rg.y0(n2Var5, 10, false);
                        y0Var4.E();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        rg.y0 y0Var5 = new rg.y0(n2Var6, 12, false);
                        y0Var5.E();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new mc0());
                        break;
                    case 19:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.V(3);
                        break;
                    case 20:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(3);
                        mc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(3);
                        mc0Var3.V(2);
                        break;
                    case 23:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        mc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        mc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        mc0 mc0Var9 = new mc0();
                        n2Var.presentFragment(mc0Var9);
                        mc0Var9.W(LiteMode.FLAGS_CHAT);
                        mc0Var9.V(32);
                        break;
                }
            }
        });
        h11Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        h11 h11Var134 = new h11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var135 = new h11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
            h11Var22 = new h11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i105) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(LiteMode.FLAGS_CHAT);
                            mc0Var.V(64);
                            break;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(LiteMode.FLAGS_CHAT);
                            mc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(LiteMode.FLAGS_CHAT);
                            mc0Var3.V(256);
                            break;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(LiteMode.FLAGS_CHAT);
                            mc0Var4.V(32768);
                            break;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            break;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            break;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((gc0) arrayList.get(i112)).f == 1) {
                                    mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            break;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            n2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var22 = null;
        }
        final int i106 = 4;
        h11 h11Var136 = new h11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11 h11Var137 = new h11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        h11 h11Var138 = new h11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i108) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        h11 h11Var139 = new h11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        h11 h11Var140 = new h11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        h11 h11Var141 = new h11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i112)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i112, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var141.a("tg://settings/language");
        final int i112 = 11;
        h11 h11Var142 = new h11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i1122)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i1122, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i113 = 12;
            h11 h11Var143 = new h11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.d11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i113) {
                        case 0:
                            mc0 mc0Var = new mc0();
                            n2Var.presentFragment(mc0Var);
                            mc0Var.W(LiteMode.FLAGS_CHAT);
                            mc0Var.V(64);
                            break;
                        case 1:
                            mc0 mc0Var2 = new mc0();
                            n2Var.presentFragment(mc0Var2);
                            mc0Var2.W(LiteMode.FLAGS_CHAT);
                            mc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            mc0 mc0Var3 = new mc0();
                            n2Var.presentFragment(mc0Var3);
                            mc0Var3.W(LiteMode.FLAGS_CHAT);
                            mc0Var3.V(256);
                            break;
                        case 4:
                            mc0 mc0Var4 = new mc0();
                            n2Var.presentFragment(mc0Var4);
                            mc0Var4.W(LiteMode.FLAGS_CHAT);
                            mc0Var4.V(32768);
                            break;
                        case 5:
                            mc0 mc0Var5 = new mc0();
                            n2Var.presentFragment(mc0Var5);
                            mc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            mc0 mc0Var6 = new mc0();
                            n2Var.presentFragment(mc0Var6);
                            mc0Var6.V(1024);
                            break;
                        case 8:
                            mc0 mc0Var7 = new mc0();
                            n2Var.presentFragment(mc0Var7);
                            mc0Var7.V(2048);
                            break;
                        case 9:
                            mc0 mc0Var8 = new mc0();
                            n2Var.presentFragment(mc0Var8);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = mc0Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((gc0) arrayList.get(i1122)).f == 1) {
                                    mc0Var8.b.e1(new i2.s(mc0Var8, i1122, 13), 700, true);
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
                            rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                            y0Var.E();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                            break;
                        case 15:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            n2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                            y0Var2.E();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            gy0 gy0Var = new gy0();
                            gy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(gy0Var);
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
            h11Var143.a("tg://settings/language/do-not-translate");
            h11Var43 = h11Var143;
        }
        final int i114 = 14;
        h11 h11Var144 = new h11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i1122)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i1122, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        h11 h11Var145 = new h11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i1122)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i1122, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var145.a("tg://settings/faq");
        final int i116 = 16;
        h11 h11Var146 = new h11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.d11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i116) {
                    case 0:
                        mc0 mc0Var = new mc0();
                        n2Var.presentFragment(mc0Var);
                        mc0Var.W(LiteMode.FLAGS_CHAT);
                        mc0Var.V(64);
                        break;
                    case 1:
                        mc0 mc0Var2 = new mc0();
                        n2Var.presentFragment(mc0Var2);
                        mc0Var2.W(LiteMode.FLAGS_CHAT);
                        mc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        mc0 mc0Var3 = new mc0();
                        n2Var.presentFragment(mc0Var3);
                        mc0Var3.W(LiteMode.FLAGS_CHAT);
                        mc0Var3.V(256);
                        break;
                    case 4:
                        mc0 mc0Var4 = new mc0();
                        n2Var.presentFragment(mc0Var4);
                        mc0Var4.W(LiteMode.FLAGS_CHAT);
                        mc0Var4.V(32768);
                        break;
                    case 5:
                        mc0 mc0Var5 = new mc0();
                        n2Var.presentFragment(mc0Var5);
                        mc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        mc0 mc0Var6 = new mc0();
                        n2Var.presentFragment(mc0Var6);
                        mc0Var6.V(1024);
                        break;
                    case 8:
                        mc0 mc0Var7 = new mc0();
                        n2Var.presentFragment(mc0Var7);
                        mc0Var7.V(2048);
                        break;
                    case 9:
                        mc0 mc0Var8 = new mc0();
                        n2Var.presentFragment(mc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = mc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((gc0) arrayList.get(i1122)).f == 1) {
                                mc0Var8.b.e1(new i2.s(mc0Var8, i1122, 13), 700, true);
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
                        rg.y0 y0Var = new rg.y0(n2Var2, 0, false);
                        y0Var.E();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.g5.T(n2Var3, null));
                        break;
                    case 15:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        of.f.s(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        n2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        rg.y0 y0Var2 = new rg.y0(n2Var4, 11, false);
                        y0Var2.E();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        gy0 gy0Var = new gy0();
                        gy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(gy0Var);
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
        h11Var146.a("tg://settings/privacy-policy");
        return new h11[]{h11Var23, h11Var24, h11Var25, h11Var26, h11Var27, h11Var28, h11Var29, h11Var30, h11Var31, h11Var32, h11Var33, h11Var34, h11Var35, h11Var36, h11Var37, h11Var38, h11Var39, h11Var, h11Var41, h11Var42, h11Var2, h11Var44, h11Var45, h11Var46, h11Var47, h11Var48, h11Var49, h11Var50, h11Var51, h11Var52, h11Var3, h11Var4, h11Var54, h11Var55, h11Var56, h11Var57, h11Var58, h11Var59, h11Var60, h11Var61, h11Var62, h11Var63, h11Var64, h11Var65, h11Var66, h11Var67, h11Var68, h11Var69, h11Var70, h11Var71, h11Var72, h11Var73, h11Var74, h11Var75, h11Var76, h11Var77, h11Var78, h11Var79, h11Var80, h11Var81, h11Var82, h11Var83, h11Var84, h11Var85, h11Var86, h11Var87, h11Var88, h11Var89, h11Var90, h11Var91, h11Var92, h11Var93, h11Var94, h11Var95, h11Var96, h11Var97, h11Var98, h11Var99, h11Var100, h11Var101, h11Var102, h11Var103, h11Var104, h11Var105, h11Var106, h11Var107, h11Var108, h11Var109, h11Var110, h11Var111, h11Var112, h11Var6, h11Var114, h11Var7, h11Var116, h11Var8, h11Var118, h11Var119, h11Var120, h11Var121, h11Var5, h11Var9, h11Var10, h11Var11, h11Var12, h11Var13, h11Var14, h11Var15, h11Var16, h11Var123, h11Var17, h11Var18, h11Var19, h11Var20, h11Var21, h11Var124, h11Var125, h11Var126, h11Var127, h11Var128, h11Var129, h11Var130, h11Var131, h11Var132, h11Var133, h11Var134, h11Var135, h11Var22, h11Var136, h11Var137, h11Var138, h11Var139, h11Var140, h11Var141, h11Var142, h11Var43, h11Var144, h11Var145, h11Var146};
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        return d1Var.f == 0;
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
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof h11) {
                ((h11) obj2).g = i10;
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
            rt0 rt0Var = new rt0(25, this, str);
            this.x = rt0Var;
            dispatchQueue.postRunnable(rt0Var, 300L);
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
        h11 h11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            h11[] h11VarArr = this.c;
            if (i10 >= h11VarArr.length) {
                break;
            }
            h11 h11Var2 = h11VarArr[i10];
            if (h11Var2 != null) {
                hashMap.put(Integer.valueOf(h11Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (h11Var = (h11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        h11Var.g = readInt32;
                        arrayList.add(h11Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new gf(this));
    }

    @Override // s4.i0
    public final int h() {
        if (this.w) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.v;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // s4.i0
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

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11 = d1Var.f;
        View view = d1Var.a;
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
        org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
        if (this.w) {
            if (i10 >= this.r.size()) {
                int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.r);
                y6Var.a((CharSequence) this.n.get(this.r.size() + f7), ((MessagesController.FaqSearchResult) this.s.get(f7)).path, true, f7 < this.r.size() - 1);
                return;
            } else {
                h11 h11Var = (h11) this.r.get(i10);
                h11 h11Var2 = i10 > 0 ? (h11) this.r.get(i10 - 1) : null;
                y6Var.b((CharSequence) this.n.get(i10), h11Var.d, (h11Var2 == null || h11Var2.e != h11Var.e) ? h11Var.e : 0, i10 < this.r.size() - 1);
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
            y6Var.a(faqSearchResult.title, faqSearchResult.path, true, f10 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof h11) {
            h11 h11Var3 = (h11) obj;
            y6Var.a(h11Var3.a, h11Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            y6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View m4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.m4(context, 16) : new org.telegram.ui.Cells.v3(context, null) : new org.telegram.ui.Cells.y6(context);
        m4Var.setLayoutParams(new s4.q0(-1, -2));
        return new org.telegram.ui.Components.am0(m4Var);
    }
}
