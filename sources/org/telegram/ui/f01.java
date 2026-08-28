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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class f01 extends org.telegram.ui.Components.vk0 {
    public TLRPC.WebPage A;
    public boolean B;
    public e01[] c;
    public final org.telegram.ui.ActionBar.o2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public ys0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public f01(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.e = o2Var;
        this.f = o2Var.getCurrentAccount();
        this.h = context;
        this.c = H(o2Var);
        J();
    }

    public static boolean F(int i9, int i10) {
        if (!MessagesController.getInstance(i9).premiumFeaturesBlocked() || UserConfig.getInstance(i9).isPremium()) {
            return i10 == -1 || MessagesController.getInstance(i9).premiumFeaturesTypesToPosition.get(i10, -1) != -1;
        }
        return false;
    }

    public static e01[] H(final org.telegram.ui.ActionBar.o2 o2Var) {
        e01 e01Var;
        e01 e01Var2;
        e01 e01Var3;
        e01 e01Var4;
        e01 e01Var5;
        e01 e01Var6;
        e01 e01Var7;
        e01 e01Var8;
        e01 e01Var9;
        e01 e01Var10;
        e01 e01Var11;
        e01 e01Var12;
        e01 e01Var13;
        e01 e01Var14;
        e01 e01Var15;
        e01 e01Var16;
        e01 e01Var17;
        e01 e01Var18;
        e01 e01Var19;
        e01 e01Var20;
        e01 e01Var21;
        final int currentAccount = o2Var.getCurrentAccount();
        final int i9 = 22;
        e01 e01Var22 = new e01(LocaleController.getString(R.string.EditName), 500, 0, new ys0(22, o2Var, o2Var.getResourceProvider()));
        final int i10 = 26;
        e01 e01Var23 = new e01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i11)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i11, 11), 700, true);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var23.a("tg://settings/edit/change-number");
        final int i11 = 8;
        e01 e01Var24 = new e01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i12));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var24.a("tg://settings/edit/add-account");
        final int i12 = 19;
        final int i13 = 1;
        e01 e01Var25 = new e01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var25.a("tg://settings/notifications");
        e01 e01Var26 = new e01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        e01Var26.a("tg://settings/notifications/private-chats");
        final int i14 = 13;
        e01 e01Var27 = new e01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        e01Var27.a("tg://settings/notifications/groups");
        e01 e01Var28 = new e01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ai0(i11, o2Var));
        e01Var28.a("tg://settings/notifications/channels");
        e01 e01Var29 = new e01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ai0(20, o2Var));
        final int i15 = 2;
        e01 e01Var30 = new e01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i16 = 14;
        e01 e01Var31 = new e01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01 e01Var32 = new e01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ai0(23, o2Var));
        e01Var32.a("tg://settings/notifications/new-contacts");
        final int i17 = 25;
        e01 e01Var33 = new e01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var33.a("tg://settings/notifications/pinned-messages");
        final int i18 = 7;
        e01 e01Var34 = new e01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var34.a("tg://settings/notifications/reset");
        e01 e01Var35 = new e01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i19 = 20;
        e01 e01Var36 = new e01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i20 = 21;
        e01 e01Var37 = new e01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01 e01Var38 = new e01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var38.a("tg://settings/privacy");
        final int i21 = 23;
        e01 e01Var39 = new e01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var39.a("tg://settings/privacy/2sv");
        final int i22 = 0;
        e01 e01Var40 = new e01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.b01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(a02.W(), null);
                            obVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new kh.lb(a02, 4), indexOf, lastIndexOf - 1, 33);
                            }
                            obVar.b.setText(spannableStringBuilder);
                            obVar.b.setSingleLine(false);
                            obVar.b.setMaxLines(2);
                            a02.b(obVar, 2750).j();
                            break;
                        } else {
                            o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        e01Var40.a("tg://settings/privacy/auto-delete");
        final int i23 = 25;
        e01 e01Var41 = new e01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i23) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var41.a("tg://settings/privacy/passcode");
        e01 e01Var42 = null;
        if (SharedConfig.hasEmailLogin) {
            e01Var = e01Var39;
            final int i24 = 27;
            e01Var2 = new e01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.a01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i24) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(LiteMode.FLAGS_CHAT);
                            sb0Var2.U(32);
                            break;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(LiteMode.FLAGS_CHAT);
                            sb0Var3.U(64);
                            break;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(LiteMode.FLAGS_CHAT);
                            sb0Var4.U(128);
                            break;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_CHAT);
                            sb0Var5.U(256);
                            break;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_CHAT);
                            sb0Var6.U(32768);
                            break;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            break;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            break;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            break;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((mb0) arrayList.get(i112)).f == 1) {
                                    sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            break;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            break;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            break;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            break;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            e01Var2.a("tg://settings/privacy/login-email");
        } else {
            e01Var = e01Var39;
            e01Var2 = null;
        }
        final int i25 = 28;
        e01 e01Var43 = new e01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i25) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var43.a("tg://settings/privacy/blocked");
        final int i26 = 29;
        e01 e01Var44 = new e01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var44.a("tg://settings/devices");
        final int i27 = 0;
        e01 e01Var45 = new e01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var45.a("tg://settings/privacy/phone-number/");
        final int i28 = 1;
        e01 e01Var46 = new e01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var46.a("tg://settings/privacy/last-seen");
        final int i29 = 2;
        e01 e01Var47 = new e01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var47.a("tg://settings/privacy/profile-photos");
        final int i30 = 3;
        e01 e01Var48 = new e01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var48.a("tg://settings/privacy/forwards");
        final int i31 = 4;
        e01 e01Var49 = new e01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var49.a("tg://settings/privacy/calls/p2p");
        final int i32 = 6;
        e01 e01Var50 = new e01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var50.a("tg://settings/privacy/calls");
        final int i33 = 7;
        e01 e01Var51 = new e01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var51.a("tg://settings/privacy/invites");
        final int i34 = 1;
        e01 e01Var52 = new e01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.b01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i34) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(a02.W(), null);
                            obVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new kh.lb(a02, 4), indexOf, lastIndexOf - 1, 33);
                            }
                            obVar.b.setText(spannableStringBuilder);
                            obVar.b.setSingleLine(false);
                            obVar.b.setMaxLines(2);
                            a02.b(obVar, 2750).j();
                            break;
                        } else {
                            o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        e01Var52.a("tg://settings/privacy/voice");
        final int i35 = 9;
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            e01Var3 = new e01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.c01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i35) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                o2Var.presentFragment(new fg0(i122));
                                break;
                            }
                            break;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            o2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            o2Var.presentFragment(new y6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 27:
                            o2Var.presentFragment(new y6());
                            break;
                        case 28:
                            o2Var.presentFragment(new y6());
                            break;
                        default:
                            o2Var.presentFragment(new y6());
                            break;
                    }
                }
            });
            e01Var3.a("tg://settings/privacy/archive-and-mute");
        } else {
            e01Var3 = null;
        }
        final int i36 = 10;
        e01 e01Var53 = new e01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var53.a("tg://settings/privacy/self-destruct");
        final int i37 = 11;
        e01 e01Var54 = new e01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var54.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i38 = 12;
        e01 e01Var55 = new e01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var55.a("tg://settings/privacy/active-websites");
        final int i39 = 13;
        e01 e01Var56 = new e01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var56.a("tg://settings/privacy/data-settings/delete-synced");
        final int i40 = 14;
        e01 e01Var57 = new e01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var57.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i41 = 16;
        e01 e01Var58 = new e01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var58.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i42 = 17;
        e01 e01Var59 = new e01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var59.a("tg://settings/privacy/data-settings/map-provider");
        final int i43 = 18;
        e01 e01Var60 = new e01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var60.a("tg://settings/privacy/data-settings/link-previews");
        final int i44 = 20;
        e01 e01Var61 = new e01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var61.a("tg://settings/devices");
        final int i45 = 21;
        e01 e01Var62 = new e01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var62.a("tg://settings/devices/terminate-sessions");
        final int i46 = 22;
        e01 e01Var63 = new e01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var63.a("tg://settings/devices/link-desktop");
        final int i47 = 23;
        e01 e01Var64 = new e01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var64.a("tg://settings/privacy/data-settings");
        final int i48 = 24;
        e01 e01Var65 = new e01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        final int i49 = 25;
        e01 e01Var66 = new e01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        e01Var66.a("tg://settings/data/storage");
        final int i50 = 27;
        e01 e01Var67 = new e01(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        final int i51 = 28;
        e01 e01Var68 = new e01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        final int i52 = 29;
        e01 e01Var69 = new e01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.c01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 4:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 5:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 6:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            o2Var.presentFragment(new fg0(i122));
                            break;
                        }
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 21:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 22:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.S = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 23:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 24:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 25:
                        o2Var.presentFragment(new y6());
                        break;
                    case 26:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 27:
                        o2Var.presentFragment(new y6());
                        break;
                    case 28:
                        o2Var.presentFragment(new y6());
                        break;
                    default:
                        o2Var.presentFragment(new y6());
                        break;
                }
            }
        });
        final int i53 = 0;
        e01 e01Var70 = new e01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        e01Var70.a("tg://settings/data/usage");
        final int i54 = 2;
        e01 e01Var71 = new e01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i55 = 3;
        e01 e01Var72 = new e01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i56 = 4;
        e01 e01Var73 = new e01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i57 = 5;
        e01 e01Var74 = new e01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i58 = 6;
        e01 e01Var75 = new e01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        e01Var75.a("tg://settings/data/auto-download/reset");
        final int i59 = 8;
        e01 e01Var76 = new e01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i60 = 9;
        e01 e01Var77 = new e01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i61 = 10;
        e01 e01Var78 = new e01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i62 = 11;
        e01 e01Var79 = new e01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        e01Var79.a("tg://settings/data/use-less-data");
        final int i63 = 12;
        e01 e01Var80 = new e01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i64 = 14;
        e01 e01Var81 = new e01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        e01Var81.a("tg://settings/data/proxy");
        final int i65 = 15;
        e01 e01Var82 = new e01(221, LocaleController.getString(R.string.UseProxyForCalls), "callsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.ProxySettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        e01Var82.a("tg://settings/data/proxy/use-for-calls");
        final int i66 = 16;
        e01 e01Var83 = new e01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        e01Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i67 = 17;
        e01 e01Var84 = new e01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.d01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        o2Var.presentFragment(new ou(null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 5:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 6:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 7:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 8:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 14:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        e01 e01Var85 = new e01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ai0(2, o2Var));
        e01Var85.a("tg://settings/data/save-to-photos/chats");
        e01 e01Var86 = new e01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ai0(3, o2Var));
        e01Var86.a("tg://settings/data/save-to-photos/groups");
        e01 e01Var87 = new e01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ai0(4, o2Var));
        e01Var87.a("tg://settings/data/save-to-photos/channels");
        e01 e01Var88 = new e01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ai0(5, o2Var));
        e01Var88.a("tg://settings/appearance/themes");
        e01 e01Var89 = new e01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(6, o2Var));
        e01Var89.a("tg://settings/appearance/text-size");
        e01 e01Var90 = new e01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(7, o2Var));
        e01Var90.a("tg://settings/appearance/wallpapers");
        e01 e01Var91 = new e01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ai0(9, o2Var));
        e01 e01Var92 = new e01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ai0(10, o2Var));
        e01 e01Var93 = new e01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(11, o2Var));
        e01 e01Var94 = new e01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(13, o2Var));
        e01 e01Var95 = new e01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ai0(14, o2Var));
        e01Var95.a("tg://settings/appearance/themes/create");
        e01 e01Var96 = new e01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(15, o2Var));
        e01Var96.a("tg://settings/appearance/message-corners");
        e01 e01Var97 = new e01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(16, o2Var));
        e01 e01Var98 = new e01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(17, o2Var));
        e01 e01Var99 = new e01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(18, o2Var));
        e01Var99.a("tg://settings/appearance/app-icon");
        e01 e01Var100 = new e01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(19, o2Var));
        e01 e01Var101 = new e01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(21, o2Var));
        e01Var101.a("tg://settings/appearance/tap-for-next-media");
        e01 e01Var102 = new e01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(22, o2Var));
        e01Var102.a("tg://settings/data/raise-to-listen");
        e01 e01Var103 = new e01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(24, o2Var));
        e01Var103.a("tg://settings/data/raise-to-speak");
        e01 e01Var104 = new e01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(25, o2Var));
        e01Var104.a("tg://settings/data/pause-music");
        e01 e01Var105 = new e01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(26, o2Var));
        e01 e01Var106 = new e01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(27, o2Var));
        e01 e01Var107 = new e01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(28, o2Var));
        e01 e01Var108 = new e01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ai0(29, o2Var));
        final int i68 = 0;
        e01 e01Var109 = new e01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var109.a("tg://settings/appearance/stickers-and-emoji");
        final int i69 = 1;
        e01 e01Var110 = new e01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i70 = 3;
        e01 e01Var111 = new e01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i71 = 5;
        e01 e01Var112 = new e01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i72 = 6;
        e01 e01Var113 = new e01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i73 = 7;
        e01 e01Var114 = new e01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i74 = 8;
        e01 e01Var115 = new e01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i75 = 9;
        e01 e01Var116 = new e01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i76 = 10;
        e01 e01Var117 = new e01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i77 = 11;
        e01 e01Var118 = new e01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i78 = 12;
        e01 e01Var119 = new e01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i79 = 13;
        e01 e01Var120 = new e01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i80 = 22;
        e01 e01Var121 = new e01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i80) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var121.a("tg://settings/folders");
        final int i81 = 3;
        e01 e01Var122 = new e01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i81) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            e01Var4 = e01Var122;
            e01Var5 = e01Var113;
            e01Var6 = e01Var115;
            e01Var7 = e01Var117;
            final int i82 = 14;
            e01Var8 = new e01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.a01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(LiteMode.FLAGS_CHAT);
                            sb0Var2.U(32);
                            break;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(LiteMode.FLAGS_CHAT);
                            sb0Var3.U(64);
                            break;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(LiteMode.FLAGS_CHAT);
                            sb0Var4.U(128);
                            break;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_CHAT);
                            sb0Var5.U(256);
                            break;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_CHAT);
                            sb0Var6.U(32768);
                            break;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            break;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            break;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            break;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((mb0) arrayList.get(i112)).f == 1) {
                                    sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            break;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            break;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            break;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            break;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            e01Var4 = e01Var122;
            e01Var5 = e01Var113;
            e01Var6 = e01Var115;
            e01Var7 = e01Var117;
            e01Var8 = null;
        }
        if (F(currentAccount, 0)) {
            final int i83 = 24;
            e01Var9 = new e01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.a01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(LiteMode.FLAGS_CHAT);
                            sb0Var2.U(32);
                            break;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(LiteMode.FLAGS_CHAT);
                            sb0Var3.U(64);
                            break;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(LiteMode.FLAGS_CHAT);
                            sb0Var4.U(128);
                            break;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_CHAT);
                            sb0Var5.U(256);
                            break;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_CHAT);
                            sb0Var6.U(32768);
                            break;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            break;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            break;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            break;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((mb0) arrayList.get(i112)).f == 1) {
                                    sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            break;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            break;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            break;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            break;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            e01Var9 = null;
        }
        if (F(currentAccount, 11)) {
            final int i84 = 5;
            e01Var10 = new e01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.c01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                o2Var.presentFragment(new fg0(i122));
                                break;
                            }
                            break;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            o2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            o2Var.presentFragment(new y6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 27:
                            o2Var.presentFragment(new y6());
                            break;
                        case 28:
                            o2Var.presentFragment(new y6());
                            break;
                        default:
                            o2Var.presentFragment(new y6());
                            break;
                    }
                }
            });
        } else {
            e01Var10 = null;
        }
        if (F(currentAccount, 1)) {
            final int i85 = 15;
            e01Var11 = new e01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.c01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                o2Var.presentFragment(new fg0(i122));
                                break;
                            }
                            break;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            o2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            o2Var.presentFragment(new y6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 27:
                            o2Var.presentFragment(new y6());
                            break;
                        case 28:
                            o2Var.presentFragment(new y6());
                            break;
                        default:
                            o2Var.presentFragment(new y6());
                            break;
                    }
                }
            });
        } else {
            e01Var11 = null;
        }
        if (F(currentAccount, 2)) {
            final int i86 = 26;
            e01Var12 = new e01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.c01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 4:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 5:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 11, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 6:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 7:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                o2Var.presentFragment(new fg0(i122));
                                break;
                            }
                            break;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 1, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 21:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 22:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.S = true;
                            o2Var.presentFragment(sessionsActivity);
                            break;
                        case 23:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 24:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 25:
                            o2Var.presentFragment(new y6());
                            break;
                        case 26:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 2, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 27:
                            o2Var.presentFragment(new y6());
                            break;
                        case 28:
                            o2Var.presentFragment(new y6());
                            break;
                        default:
                            o2Var.presentFragment(new y6());
                            break;
                    }
                }
            });
        } else {
            e01Var12 = null;
        }
        if (F(currentAccount, 8)) {
            final int i87 = 7;
            e01Var13 = new e01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            o2Var.presentFragment(new ou(null));
                            break;
                        case 1:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            o2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            o2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            o2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 8:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            o2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            o2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                    }
                }
            });
        } else {
            e01Var13 = null;
        }
        if (F(currentAccount, 3)) {
            final int i88 = 18;
            e01Var14 = new e01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            o2Var.presentFragment(new ou(null));
                            break;
                        case 1:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 3:
                            o2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 4:
                            o2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 5:
                            o2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 6:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 7:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 8, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 8:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 14:
                            o2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 15:
                            o2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 16:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 3, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                    }
                }
            });
        } else {
            e01Var14 = null;
        }
        e01 e01Var123 = F(currentAccount, 4) ? new e01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ai0(12, o2Var)) : null;
        if (F(currentAccount, 5)) {
            final int i89 = 4;
            e01Var15 = new e01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.zz0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            o2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            o2Var.presentFragment(new h21());
                            break;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            break;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            break;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            break;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            break;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            break;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            e01Var15 = null;
        }
        if (F(currentAccount, 9)) {
            final int i90 = 15;
            e01Var16 = new e01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.zz0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            o2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            o2Var.presentFragment(new h21());
                            break;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            break;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            break;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            break;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            break;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            break;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            e01Var16 = null;
        }
        if (F(currentAccount, 6)) {
            final int i91 = 16;
            e01Var17 = new e01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.zz0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            o2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            o2Var.presentFragment(new h21());
                            break;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            break;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            break;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            break;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            break;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            break;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            e01Var17 = null;
        }
        if (F(currentAccount, 7)) {
            final int i92 = 17;
            e01Var18 = new e01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.zz0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            o2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            o2Var.presentFragment(new h21());
                            break;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            break;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            break;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            break;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            break;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            break;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            e01Var18 = null;
        }
        if (F(currentAccount, 10)) {
            final int i93 = 18;
            e01Var19 = new e01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.zz0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i93) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            o2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            o2Var.presentFragment(new h21());
                            break;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            break;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            break;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            break;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            break;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            break;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            e01Var19 = null;
        }
        if (F(currentAccount, 12)) {
            final int i94 = 19;
            e01Var20 = new e01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.zz0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i94) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 2:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 3:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                            x0Var.C();
                            o2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 6:
                            o2Var.presentFragment(new p(0));
                            break;
                        case 7:
                            o2Var.presentFragment(new p(1));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 12:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 13:
                            o2Var.presentFragment(new h21());
                            break;
                        case 14:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                            x0Var2.C();
                            o2Var3.showDialog(x0Var2);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                            x0Var3.C();
                            o2Var4.showDialog(x0Var3);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                            x0Var4.C();
                            o2Var5.showDialog(x0Var4);
                            break;
                        case 18:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                            x0Var5.C();
                            o2Var6.showDialog(x0Var5);
                            break;
                        case 19:
                            org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                            zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                            x0Var6.C();
                            o2Var7.showDialog(x0Var6);
                            break;
                        case 20:
                            o2Var.presentFragment(new sb0());
                            break;
                        case 21:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(3);
                            break;
                        case 22:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 23:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(3);
                            sb0Var2.U(1);
                            break;
                        case 24:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(3);
                            sb0Var3.U(2);
                            break;
                        case 25:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 26:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 27:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 28:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        default:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                    }
                }
            });
        } else {
            e01Var20 = null;
        }
        final int i95 = 20;
        e01 e01Var124 = new e01(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var124.a("tg://settings/power-saving");
        final int i96 = 21;
        e01 e01Var125 = new e01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var125.a("tg://settings/power-saving/stickers");
        final int i97 = 23;
        e01 e01Var126 = new e01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i98 = 24;
        e01 e01Var127 = new e01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i99 = 26;
        e01 e01Var128 = new e01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        e01Var128.a("tg://settings/power-saving/emoji");
        final int i100 = 27;
        e01 e01Var129 = new e01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i101 = 28;
        e01 e01Var130 = new e01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i102 = 29;
        e01 e01Var131 = new e01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.zz0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 2:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 3:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var2, 5, false);
                        x0Var.C();
                        o2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 6:
                        o2Var.presentFragment(new p(0));
                        break;
                    case 7:
                        o2Var.presentFragment(new p(1));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 12:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 13:
                        o2Var.presentFragment(new h21());
                        break;
                    case 14:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var2 = new zf.x0(o2Var3, 9, false);
                        x0Var2.C();
                        o2Var3.showDialog(x0Var2);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        zf.x0 x0Var3 = new zf.x0(o2Var4, 6, false);
                        x0Var3.C();
                        o2Var4.showDialog(x0Var3);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        zf.x0 x0Var4 = new zf.x0(o2Var5, 7, false);
                        x0Var4.C();
                        o2Var5.showDialog(x0Var4);
                        break;
                    case 18:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        zf.x0 x0Var5 = new zf.x0(o2Var6, 10, false);
                        x0Var5.C();
                        o2Var6.showDialog(x0Var5);
                        break;
                    case 19:
                        org.telegram.ui.ActionBar.o2 o2Var7 = o2Var;
                        zf.x0 x0Var6 = new zf.x0(o2Var7, 12, false);
                        x0Var6.C();
                        o2Var7.showDialog(x0Var6);
                        break;
                    case 20:
                        o2Var.presentFragment(new sb0());
                        break;
                    case 21:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(3);
                        break;
                    case 22:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 23:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(3);
                        sb0Var2.U(1);
                        break;
                    case 24:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(3);
                        sb0Var3.U(2);
                        break;
                    case 25:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 26:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.U(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 27:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var5.U(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 28:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var6.U(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    default:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        sb0Var7.U(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                }
            }
        });
        final int i103 = 0;
        e01 e01Var132 = new e01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var132.a("tg://settings/power-saving/effects");
        final int i104 = 1;
        e01 e01Var133 = new e01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var133.a("tg://settings/power-saving/background");
        final int i105 = 2;
        e01 e01Var134 = new e01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i105) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i106 = 4;
        e01 e01Var135 = new e01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i107 = 5;
            e01Var21 = new e01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i107) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(LiteMode.FLAGS_CHAT);
                            sb0Var2.U(32);
                            break;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(LiteMode.FLAGS_CHAT);
                            sb0Var3.U(64);
                            break;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(LiteMode.FLAGS_CHAT);
                            sb0Var4.U(128);
                            break;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_CHAT);
                            sb0Var5.U(256);
                            break;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_CHAT);
                            sb0Var6.U(32768);
                            break;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            break;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            break;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            break;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((mb0) arrayList.get(i112)).f == 1) {
                                    sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            break;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            break;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            break;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            break;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
        } else {
            e01Var21 = null;
        }
        final int i108 = 6;
        e01 e01Var136 = new e01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i108) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        final int i109 = 8;
        e01 e01Var137 = new e01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var137.a("tg://settings/power-saving/call-animations");
        final int i110 = 9;
        e01 e01Var138 = new e01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var138.a("tg://settings/power-saving/videos");
        final int i111 = 10;
        e01 e01Var139 = new e01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i112)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i112, 11), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var139.a("tg://settings/power-saving/gifs");
        final int i112 = 11;
        e01 e01Var140 = new e01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i1122)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i1122, 11), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var140.a("tg://settings/power-saving/transitions");
        final int i113 = 12;
        e01 e01Var141 = new e01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i113) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i1122)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i1122, 11), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var141.a("tg://settings/language");
        final int i114 = 13;
        e01 e01Var142 = new e01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i1122)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i1122, 11), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i115 = 15;
            e01 e01Var143 = new e01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.a01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i115) {
                        case 0:
                            sb0 sb0Var = new sb0();
                            o2Var.presentFragment(sb0Var);
                            sb0Var.U(LiteMode.FLAGS_CHAT);
                            break;
                        case 1:
                            sb0 sb0Var2 = new sb0();
                            o2Var.presentFragment(sb0Var2);
                            sb0Var2.V(LiteMode.FLAGS_CHAT);
                            sb0Var2.U(32);
                            break;
                        case 2:
                            sb0 sb0Var3 = new sb0();
                            o2Var.presentFragment(sb0Var3);
                            sb0Var3.V(LiteMode.FLAGS_CHAT);
                            sb0Var3.U(64);
                            break;
                        case 3:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 4:
                            sb0 sb0Var4 = new sb0();
                            o2Var.presentFragment(sb0Var4);
                            sb0Var4.V(LiteMode.FLAGS_CHAT);
                            sb0Var4.U(128);
                            break;
                        case 5:
                            sb0 sb0Var5 = new sb0();
                            o2Var.presentFragment(sb0Var5);
                            sb0Var5.V(LiteMode.FLAGS_CHAT);
                            sb0Var5.U(256);
                            break;
                        case 6:
                            sb0 sb0Var6 = new sb0();
                            o2Var.presentFragment(sb0Var6);
                            sb0Var6.V(LiteMode.FLAGS_CHAT);
                            sb0Var6.U(32768);
                            break;
                        case 7:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 8:
                            sb0 sb0Var7 = new sb0();
                            o2Var.presentFragment(sb0Var7);
                            sb0Var7.U(512);
                            break;
                        case 9:
                            sb0 sb0Var8 = new sb0();
                            o2Var.presentFragment(sb0Var8);
                            sb0Var8.U(1024);
                            break;
                        case 10:
                            sb0 sb0Var9 = new sb0();
                            o2Var.presentFragment(sb0Var9);
                            sb0Var9.U(2048);
                            break;
                        case 11:
                            sb0 sb0Var10 = new sb0();
                            o2Var.presentFragment(sb0Var10);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = sb0Var10.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((mb0) arrayList.get(i1122)).f == 1) {
                                    sb0Var10.b.e1(new bg.x2(sb0Var10, i1122, 11), 700, true);
                                    break;
                                } else {
                                    i1122++;
                                }
                            }
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 15:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                            break;
                        case 17:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 18:
                            ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 23:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 24:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                            x0Var.C();
                            o2Var3.showDialog(x0Var);
                            break;
                        case 25:
                            o2Var.presentFragment(PasscodeActivity.a0());
                            break;
                        case 26:
                            o2Var.presentFragment(new h(3));
                            break;
                        case 27:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 28:
                            cx0 cx0Var = new cx0();
                            cx0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(cx0Var);
                            break;
                        default:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                    }
                }
            });
            e01Var143.a("tg://settings/language/do-not-translate");
            e01Var42 = e01Var143;
        }
        final int i116 = 16;
        e01 e01Var144 = new e01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i116) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i1122)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i1122, 11), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var144.a("tg://settings/ask-question");
        final int i117 = 17;
        e01 e01Var145 = new e01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i117) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i1122)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i1122, 11), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var145.a("tg://settings/faq");
        final int i118 = 18;
        e01 e01Var146 = new e01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.a01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i118) {
                    case 0:
                        sb0 sb0Var = new sb0();
                        o2Var.presentFragment(sb0Var);
                        sb0Var.U(LiteMode.FLAGS_CHAT);
                        break;
                    case 1:
                        sb0 sb0Var2 = new sb0();
                        o2Var.presentFragment(sb0Var2);
                        sb0Var2.V(LiteMode.FLAGS_CHAT);
                        sb0Var2.U(32);
                        break;
                    case 2:
                        sb0 sb0Var3 = new sb0();
                        o2Var.presentFragment(sb0Var3);
                        sb0Var3.V(LiteMode.FLAGS_CHAT);
                        sb0Var3.U(64);
                        break;
                    case 3:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 4:
                        sb0 sb0Var4 = new sb0();
                        o2Var.presentFragment(sb0Var4);
                        sb0Var4.V(LiteMode.FLAGS_CHAT);
                        sb0Var4.U(128);
                        break;
                    case 5:
                        sb0 sb0Var5 = new sb0();
                        o2Var.presentFragment(sb0Var5);
                        sb0Var5.V(LiteMode.FLAGS_CHAT);
                        sb0Var5.U(256);
                        break;
                    case 6:
                        sb0 sb0Var6 = new sb0();
                        o2Var.presentFragment(sb0Var6);
                        sb0Var6.V(LiteMode.FLAGS_CHAT);
                        sb0Var6.U(32768);
                        break;
                    case 7:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 8:
                        sb0 sb0Var7 = new sb0();
                        o2Var.presentFragment(sb0Var7);
                        sb0Var7.U(512);
                        break;
                    case 9:
                        sb0 sb0Var8 = new sb0();
                        o2Var.presentFragment(sb0Var8);
                        sb0Var8.U(1024);
                        break;
                    case 10:
                        sb0 sb0Var9 = new sb0();
                        o2Var.presentFragment(sb0Var9);
                        sb0Var9.U(2048);
                        break;
                    case 11:
                        sb0 sb0Var10 = new sb0();
                        o2Var.presentFragment(sb0Var10);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = sb0Var10.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((mb0) arrayList.get(i1122)).f == 1) {
                                sb0Var10.b.e1(new bg.x2(sb0Var10, i1122, 11), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 15:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        o2Var2.showDialog(org.telegram.ui.Components.y4.U(o2Var2, null));
                        break;
                    case 17:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 18:
                        ve.e.s(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 24:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        zf.x0 x0Var = new zf.x0(o2Var3, 0, false);
                        x0Var.C();
                        o2Var3.showDialog(x0Var);
                        break;
                    case 25:
                        o2Var.presentFragment(PasscodeActivity.a0());
                        break;
                    case 26:
                        o2Var.presentFragment(new h(3));
                        break;
                    case 27:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 28:
                        cx0 cx0Var = new cx0();
                        cx0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(cx0Var);
                        break;
                    default:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                }
            }
        });
        e01Var146.a("tg://settings/privacy-policy");
        return new e01[]{e01Var22, e01Var23, e01Var24, e01Var25, e01Var26, e01Var27, e01Var28, e01Var29, e01Var30, e01Var31, e01Var32, e01Var33, e01Var34, e01Var35, e01Var36, e01Var37, e01Var38, e01Var, e01Var40, e01Var41, e01Var2, e01Var43, e01Var44, e01Var45, e01Var46, e01Var47, e01Var48, e01Var49, e01Var50, e01Var51, e01Var52, e01Var3, e01Var53, e01Var54, e01Var55, e01Var56, e01Var57, e01Var58, e01Var59, e01Var60, e01Var61, e01Var62, e01Var63, e01Var64, e01Var65, e01Var66, e01Var67, e01Var68, e01Var69, e01Var70, e01Var71, e01Var72, e01Var73, e01Var74, e01Var75, e01Var76, e01Var77, e01Var78, e01Var79, e01Var80, e01Var81, e01Var82, e01Var83, e01Var84, e01Var85, e01Var86, e01Var87, e01Var88, e01Var89, e01Var90, e01Var91, e01Var92, e01Var93, e01Var94, e01Var95, e01Var96, e01Var97, e01Var98, e01Var99, e01Var100, e01Var101, e01Var102, e01Var103, e01Var104, e01Var105, e01Var106, e01Var107, e01Var108, e01Var109, e01Var110, e01Var111, e01Var112, e01Var5, e01Var114, e01Var6, e01Var116, e01Var7, e01Var118, e01Var119, e01Var120, e01Var121, e01Var4, e01Var8, e01Var9, e01Var10, e01Var11, e01Var12, e01Var13, e01Var14, e01Var123, e01Var15, e01Var16, e01Var17, e01Var18, e01Var19, e01Var20, e01Var124, e01Var125, e01Var126, e01Var127, e01Var128, e01Var129, e01Var130, e01Var131, e01Var132, e01Var133, e01Var134, e01Var135, e01Var21, e01Var136, e01Var137, e01Var138, e01Var139, e01Var140, e01Var141, e01Var142, e01Var42, e01Var144, e01Var145, e01Var146};
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return q1Var.f == 0;
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
            aa.d.u(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            Object obj2 = arrayList.get(i9);
            if (obj2 instanceof e01) {
                ((e01) obj2).g = i9;
            } else if (obj2 instanceof MessagesController.FaqSearchResult) {
                ((MessagesController.FaqSearchResult) obj2).num = i9;
            }
            linkedHashSet.add(obj2.toString());
        }
        MessagesController.getGlobalMainSettings().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i9 = this.f;
        TLRPC.WebPage webPage = MessagesController.getInstance(i9).faqWebPage;
        this.A = webPage;
        if (webPage != null) {
            this.d.addAll(MessagesController.getInstance(i9).faqSearchArray);
        }
        if (this.A != null || this.B) {
            return;
        }
        this.B = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = LocaleController.getString(R.string.TelegramFaqUrl);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i9).sendRequest(tL_messages_getWebPage, new m(this, 20));
    }

    public final void I(String str) {
        this.y = str;
        if (this.x != null) {
            Utilities.searchQueue.cancelRunnable(this.x);
            this.x = null;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            ys0 ys0Var = new ys0(23, this, str);
            this.x = ys0Var;
            dispatchQueue.postRunnable(ys0Var, 300L);
            return;
        }
        this.w = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.o2 o2Var = this.e;
        if (o2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) o2Var).L.b.getImageReceiver().startAnimation();
                ((ProfileActivity) this.e).L.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        e01 e01Var;
        HashMap hashMap = new HashMap();
        int i9 = 0;
        while (true) {
            e01[] e01VarArr = this.c;
            if (i9 >= e01VarArr.length) {
                break;
            }
            e01 e01Var2 = e01VarArr[i9];
            if (e01Var2 != null) {
                hashMap.put(Integer.valueOf(e01Var2.f), this.c[i9]);
            }
            i9++;
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
                            for (int i10 = 0; i10 < readInt323; i10++) {
                                strArr[i10] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        MessagesController.FaqSearchResult faqSearchResult = new MessagesController.FaqSearchResult(readString, strArr, serializedData.readString(false));
                        faqSearchResult.num = readInt32;
                        arrayList.add(faqSearchResult);
                    } else if (readInt322 == 1 && (e01Var = (e01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        e01Var.g = readInt32;
                        arrayList.add(e01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.jn0(this));
    }

    @Override // f2.r0
    public final int h() {
        if (this.w) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.v;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // f2.r0
    public final int j(int i9) {
        if (!this.w) {
            ArrayList arrayList = this.v;
            if (i9 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i9 != arrayList.size() + 1) {
                return 0;
            }
        } else if (i9 < this.r.size() || i9 != this.r.size()) {
            return 0;
        }
        return 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 != 0) {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.v3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
                return;
            } else {
                if (i10 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.m4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                return;
            }
        }
        org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
        if (this.w) {
            if (i9 >= this.r.size()) {
                int g10 = j3.r0.g(1, i9, this.r);
                w6Var.a((CharSequence) this.n.get(this.r.size() + g10), ((MessagesController.FaqSearchResult) this.s.get(g10)).path, true, g10 < this.r.size() - 1);
                return;
            } else {
                e01 e01Var = (e01) this.r.get(i9);
                e01 e01Var2 = i9 > 0 ? (e01) this.r.get(i9 - 1) : null;
                w6Var.b((CharSequence) this.n.get(i9), e01Var.d, (e01Var2 == null || e01Var2.e != e01Var.e) ? e01Var.e : 0, i9 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i9--;
        }
        if (i9 >= arrayList.size()) {
            int g11 = j3.r0.g(1, i9, arrayList);
            MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) this.d.get(g11);
            w6Var.a(faqSearchResult.title, faqSearchResult.path, true, g11 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i9);
        if (obj instanceof e01) {
            e01 e01Var3 = (e01) obj;
            w6Var.a(e01Var3.a, e01Var3.d, false, i9 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            w6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i9 < arrayList.size() - 1);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        Context context = this.h;
        View m4Var = i9 != 0 ? i9 != 1 ? new org.telegram.ui.Cells.m4(context, 16) : new org.telegram.ui.Cells.v3(context, null) : new org.telegram.ui.Cells.w6(context);
        m4Var.setLayoutParams(new f2.a1(-1, -2));
        return new org.telegram.ui.Components.ik0(m4Var);
    }
}
