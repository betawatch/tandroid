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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public class j11 extends org.telegram.ui.Components.xl0 {
    public TLRPC.WebPage E;
    public boolean F;
    public i11[] c;
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

    public j11(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
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

    public static i11[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        i11 i11Var;
        i11 i11Var2;
        i11 i11Var3;
        i11 i11Var4;
        i11 i11Var5;
        i11 i11Var6;
        i11 i11Var7;
        i11 i11Var8;
        i11 i11Var9;
        i11 i11Var10;
        i11 i11Var11;
        i11 i11Var12;
        i11 i11Var13;
        i11 i11Var14;
        i11 i11Var15;
        i11 i11Var16;
        i11 i11Var17;
        i11 i11Var18;
        i11 i11Var19;
        i11 i11Var20;
        i11 i11Var21;
        i11 i11Var22;
        final int currentAccount = n2Var.getCurrentAccount();
        i11 i11Var23 = new i11(LocaleController.getString(R.string.EditName), 500, 0, new rx0(16, n2Var, n2Var.getResourceProvider()));
        final int i10 = 24;
        i11 i11Var24 = new i11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i11)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i11, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var24.a("tg://settings/edit/change-number");
        final int i11 = 6;
        i11 i11Var25 = new i11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i12));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var25.a("tg://settings/edit/add-account");
        final int i12 = 17;
        final int i13 = 1;
        i11 i11Var26 = new i11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var26.a("tg://settings/notifications");
        final int i14 = 29;
        i11 i11Var27 = new i11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var27.a("tg://settings/notifications/private-chats");
        final int i15 = 11;
        i11 i11Var28 = new i11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.h11
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
        i11Var28.a("tg://settings/notifications/groups");
        i11 i11Var29 = new i11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new si0(7, n2Var));
        i11Var29.a("tg://settings/notifications/channels");
        final int i16 = 19;
        i11 i11Var30 = new i11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new si0(i16, n2Var));
        i11 i11Var31 = new i11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i17 = 13;
        i11 i11Var32 = new i11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11 i11Var33 = new i11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new si0(23, n2Var));
        i11Var33.a("tg://settings/notifications/new-contacts");
        i11 i11Var34 = new i11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var34.a("tg://settings/notifications/pinned-messages");
        i11 i11Var35 = new i11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var35.a("tg://settings/notifications/reset");
        i11 i11Var36 = new i11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11 i11Var37 = new i11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11 i11Var38 = new i11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11 i11Var39 = new i11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var39.a("tg://settings/privacy");
        final int i20 = 21;
        i11 i11Var40 = new i11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        i11 i11Var41 = new i11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), null);
                            xbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.dc(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            xbVar.b.setText(spannableStringBuilder);
                            xbVar.b.setSingleLine(false);
                            xbVar.b.setMaxLines(2);
                            a02.b(xbVar, 2750).j();
                            break;
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        i11Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        i11 i11Var42 = new i11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var42.a("tg://settings/privacy/passcode");
        i11 i11Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            i11Var = i11Var40;
            final int i23 = 25;
            i11Var2 = new i11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.W(LiteMode.FLAGS_CHAT);
                            pc0Var.V(64);
                            break;
                        case 1:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(LiteMode.FLAGS_CHAT);
                            pc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(LiteMode.FLAGS_CHAT);
                            pc0Var3.V(256);
                            break;
                        case 4:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.W(LiteMode.FLAGS_CHAT);
                            pc0Var4.V(32768);
                            break;
                        case 5:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.V(1024);
                            break;
                        case 8:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.V(2048);
                            break;
                        case 9:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = pc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((jc0) arrayList.get(i112)).f == 1) {
                                    pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
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
            i11Var2.a("tg://settings/privacy/login-email");
        } else {
            i11Var = i11Var40;
            i11Var2 = null;
        }
        final int i24 = 26;
        i11 i11Var44 = new i11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        i11 i11Var45 = new i11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i25) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var45.a("tg://settings/devices");
        final int i26 = 28;
        i11 i11Var46 = new i11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        i11 i11Var47 = new i11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        i11 i11Var48 = new i11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        i11 i11Var49 = new i11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        i11 i11Var50 = new i11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        i11 i11Var51 = new i11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        i11 i11Var52 = new i11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        i11 i11Var53 = new i11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
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
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.xb xbVar = new org.telegram.ui.Components.xb(a02.W(), null);
                            xbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.dc(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            xbVar.b.setText(spannableStringBuilder);
                            xbVar.b.setSingleLine(false);
                            xbVar.b.setMaxLines(2);
                            a02.b(xbVar, 2750).j();
                            break;
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        i11Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            i11Var3 = i11Var53;
            final int i34 = 7;
            i11Var4 = new i11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                                n2Var.presentFragment(new yg0(i122));
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
                            n2Var.presentFragment(new av());
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            i11Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            i11Var3 = i11Var53;
            i11Var4 = null;
        }
        final int i35 = 8;
        i11 i11Var54 = new i11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        i11 i11Var55 = new i11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        i11 i11Var56 = new i11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        i11 i11Var57 = new i11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        i11 i11Var58 = new i11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        i11 i11Var59 = new i11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        i11 i11Var60 = new i11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        i11 i11Var61 = new i11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        i11 i11Var62 = new i11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var62.a("tg://settings/devices");
        final int i44 = 19;
        i11 i11Var63 = new i11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        i11 i11Var64 = new i11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        i11 i11Var65 = new i11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        i11 i11Var66 = new i11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        i11 i11Var67 = new i11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        i11 i11Var68 = new i11(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        i11 i11Var69 = new i11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        i11 i11Var70 = new i11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        i11 i11Var71 = new i11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.g11
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
                            n2Var.presentFragment(new yg0(i122));
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
                        n2Var.presentFragment(new av());
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        i11Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        i11 i11Var72 = new i11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11 i11Var73 = new i11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11 i11Var74 = new i11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11 i11Var75 = new i11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11 i11Var76 = new i11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        i11 i11Var77 = new i11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11 i11Var78 = new i11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11 i11Var79 = new i11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11 i11Var80 = new i11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        i11 i11Var81 = new i11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11 i11Var82 = new i11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        i11 i11Var83 = new i11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        i11 i11Var84 = new i11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11 i11Var85 = new i11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        i11 i11Var86 = new i11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
        i11Var86.a("tg://settings/data/save-to-photos/groups");
        i11 i11Var87 = new i11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new si0(2, n2Var));
        i11Var87.a("tg://settings/data/save-to-photos/channels");
        i11 i11Var88 = new i11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new si0(3, n2Var));
        i11Var88.a("tg://settings/appearance/themes");
        i11 i11Var89 = new i11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(4, n2Var));
        i11Var89.a("tg://settings/appearance/text-size");
        i11 i11Var90 = new i11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(5, n2Var));
        i11Var90.a("tg://settings/appearance/wallpapers");
        i11 i11Var91 = new i11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new si0(6, n2Var));
        i11 i11Var92 = new i11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new si0(8, n2Var));
        i11 i11Var93 = new i11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(9, n2Var));
        i11 i11Var94 = new i11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(10, n2Var));
        i11 i11Var95 = new i11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new si0(11, n2Var));
        i11Var95.a("tg://settings/appearance/themes/create");
        i11 i11Var96 = new i11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(13, n2Var));
        i11Var96.a("tg://settings/appearance/message-corners");
        i11 i11Var97 = new i11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(14, n2Var));
        i11 i11Var98 = new i11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(15, n2Var));
        i11 i11Var99 = new i11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(16, n2Var));
        i11Var99.a("tg://settings/appearance/app-icon");
        i11 i11Var100 = new i11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(17, n2Var));
        i11 i11Var101 = new i11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(18, n2Var));
        i11Var101.a("tg://settings/appearance/tap-for-next-media");
        i11 i11Var102 = new i11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(20, n2Var));
        i11Var102.a("tg://settings/data/raise-to-listen");
        i11 i11Var103 = new i11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(21, n2Var));
        i11Var103.a("tg://settings/data/raise-to-speak");
        i11 i11Var104 = new i11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(22, n2Var));
        i11Var104.a("tg://settings/data/pause-music");
        i11 i11Var105 = new i11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(24, n2Var));
        i11 i11Var106 = new i11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(25, n2Var));
        i11 i11Var107 = new i11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(26, n2Var));
        i11 i11Var108 = new i11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new si0(27, n2Var));
        i11 i11Var109 = new i11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new si0(28, n2Var));
        i11Var109.a("tg://settings/appearance/stickers-and-emoji");
        i11 i11Var110 = new i11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new si0(29, n2Var));
        final int i68 = 0;
        i11 i11Var111 = new i11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        i11 i11Var112 = new i11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        i11 i11Var113 = new i11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        i11 i11Var114 = new i11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        i11 i11Var115 = new i11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        i11 i11Var116 = new i11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        i11 i11Var117 = new i11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        i11 i11Var118 = new i11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        i11 i11Var119 = new i11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        i11 i11Var120 = new i11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        i11 i11Var121 = new i11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var121.a("tg://settings/folders");
        final int i79 = 21;
        i11 i11Var122 = new i11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            i11Var5 = i11Var122;
            i11Var6 = i11Var113;
            i11Var7 = i11Var115;
            i11Var8 = i11Var117;
            final int i80 = 2;
            i11Var9 = new i11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i80) {
                        case 0:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.W(LiteMode.FLAGS_CHAT);
                            pc0Var.V(64);
                            break;
                        case 1:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(LiteMode.FLAGS_CHAT);
                            pc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(LiteMode.FLAGS_CHAT);
                            pc0Var3.V(256);
                            break;
                        case 4:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.W(LiteMode.FLAGS_CHAT);
                            pc0Var4.V(32768);
                            break;
                        case 5:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.V(1024);
                            break;
                        case 8:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.V(2048);
                            break;
                        case 9:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = pc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((jc0) arrayList.get(i112)).f == 1) {
                                    pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
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
            i11Var5 = i11Var122;
            i11Var6 = i11Var113;
            i11Var7 = i11Var115;
            i11Var8 = i11Var117;
            i11Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            i11Var10 = new i11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i81) {
                        case 0:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.W(LiteMode.FLAGS_CHAT);
                            pc0Var.V(64);
                            break;
                        case 1:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(LiteMode.FLAGS_CHAT);
                            pc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(LiteMode.FLAGS_CHAT);
                            pc0Var3.V(256);
                            break;
                        case 4:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.W(LiteMode.FLAGS_CHAT);
                            pc0Var4.V(32768);
                            break;
                        case 5:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.V(1024);
                            break;
                        case 8:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.V(2048);
                            break;
                        case 9:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = pc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((jc0) arrayList.get(i112)).f == 1) {
                                    pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
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
            i11Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            i11Var11 = new i11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.W(LiteMode.FLAGS_CHAT);
                            pc0Var.V(64);
                            break;
                        case 1:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(LiteMode.FLAGS_CHAT);
                            pc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(LiteMode.FLAGS_CHAT);
                            pc0Var3.V(256);
                            break;
                        case 4:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.W(LiteMode.FLAGS_CHAT);
                            pc0Var4.V(32768);
                            break;
                        case 5:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.V(1024);
                            break;
                        case 8:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.V(2048);
                            break;
                        case 9:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = pc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((jc0) arrayList.get(i112)).f == 1) {
                                    pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
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
            i11Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            i11Var12 = new i11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.g11
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
                                n2Var.presentFragment(new yg0(i122));
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
                            n2Var.presentFragment(new av());
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            i11Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            i11Var13 = new i11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.g11
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
                                n2Var.presentFragment(new yg0(i122));
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
                            n2Var.presentFragment(new av());
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            i11Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            i11Var14 = new i11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.g11
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
                                n2Var.presentFragment(new yg0(i122));
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
                            n2Var.presentFragment(new av());
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            i11Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            i11Var15 = new i11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.h11
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
            i11Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            i11Var16 = new i11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.h11
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
            i11Var16 = null;
        }
        i11 i11Var123 = F(currentAccount, 5) ? new i11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new si0(12, n2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            i11Var17 = new i11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d11
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
                            n2Var.presentFragment(new m31());
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
                            n2Var.presentFragment(new pc0());
                            break;
                        case 19:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.V(3);
                            break;
                        case 20:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(3);
                            pc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(3);
                            pc0Var3.V(2);
                            break;
                        case 23:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            pc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            pc0 pc0Var9 = new pc0();
                            n2Var.presentFragment(pc0Var9);
                            pc0Var9.W(LiteMode.FLAGS_CHAT);
                            pc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            i11Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            i11Var18 = new i11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d11
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
                            n2Var.presentFragment(new m31());
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
                            n2Var.presentFragment(new pc0());
                            break;
                        case 19:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.V(3);
                            break;
                        case 20:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(3);
                            pc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(3);
                            pc0Var3.V(2);
                            break;
                        case 23:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            pc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            pc0 pc0Var9 = new pc0();
                            n2Var.presentFragment(pc0Var9);
                            pc0Var9.W(LiteMode.FLAGS_CHAT);
                            pc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            i11Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            i11Var19 = new i11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d11
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
                            n2Var.presentFragment(new m31());
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
                            n2Var.presentFragment(new pc0());
                            break;
                        case 19:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.V(3);
                            break;
                        case 20:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(3);
                            pc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(3);
                            pc0Var3.V(2);
                            break;
                        case 23:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            pc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            pc0 pc0Var9 = new pc0();
                            n2Var.presentFragment(pc0Var9);
                            pc0Var9.W(LiteMode.FLAGS_CHAT);
                            pc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            i11Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            i11Var20 = new i11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d11
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
                            n2Var.presentFragment(new m31());
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
                            n2Var.presentFragment(new pc0());
                            break;
                        case 19:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.V(3);
                            break;
                        case 20:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(3);
                            pc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(3);
                            pc0Var3.V(2);
                            break;
                        case 23:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            pc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            pc0 pc0Var9 = new pc0();
                            n2Var.presentFragment(pc0Var9);
                            pc0Var9.W(LiteMode.FLAGS_CHAT);
                            pc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            i11Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            i11Var21 = new i11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.d11
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
                            n2Var.presentFragment(new m31());
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
                            n2Var.presentFragment(new pc0());
                            break;
                        case 19:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.V(3);
                            break;
                        case 20:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(3);
                            pc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(3);
                            pc0Var3.V(2);
                            break;
                        case 23:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            pc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            pc0 pc0Var9 = new pc0();
                            n2Var.presentFragment(pc0Var9);
                            pc0Var9.W(LiteMode.FLAGS_CHAT);
                            pc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            i11Var21 = null;
        }
        final int i93 = 18;
        i11 i11Var124 = new i11(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        i11 i11Var125 = new i11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        i11 i11Var126 = new i11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        i11 i11Var127 = new i11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        i11 i11Var128 = new i11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        i11 i11Var129 = new i11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        i11 i11Var130 = new i11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        i11 i11Var131 = new i11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        i11 i11Var132 = new i11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        i11 i11Var133 = new i11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.d11
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
                        n2Var.presentFragment(new m31());
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
                        n2Var.presentFragment(new pc0());
                        break;
                    case 19:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.V(3);
                        break;
                    case 20:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(3);
                        pc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(3);
                        pc0Var3.V(2);
                        break;
                    case 23:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        pc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        pc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        pc0 pc0Var9 = new pc0();
                        n2Var.presentFragment(pc0Var9);
                        pc0Var9.W(LiteMode.FLAGS_CHAT);
                        pc0Var9.V(32);
                        break;
                }
            }
        });
        i11Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        i11 i11Var134 = new i11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11 i11Var135 = new i11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
            i11Var22 = new i11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i105) {
                        case 0:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.W(LiteMode.FLAGS_CHAT);
                            pc0Var.V(64);
                            break;
                        case 1:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(LiteMode.FLAGS_CHAT);
                            pc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(LiteMode.FLAGS_CHAT);
                            pc0Var3.V(256);
                            break;
                        case 4:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.W(LiteMode.FLAGS_CHAT);
                            pc0Var4.V(32768);
                            break;
                        case 5:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.V(1024);
                            break;
                        case 8:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.V(2048);
                            break;
                        case 9:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = pc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((jc0) arrayList.get(i112)).f == 1) {
                                    pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
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
            i11Var22 = null;
        }
        final int i106 = 4;
        i11 i11Var136 = new i11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11 i11Var137 = new i11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        i11 i11Var138 = new i11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i108) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        i11 i11Var139 = new i11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        i11 i11Var140 = new i11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        i11 i11Var141 = new i11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i112)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var141.a("tg://settings/language");
        final int i112 = 11;
        i11 i11Var142 = new i11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i1122)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i1122, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i113 = 12;
            i11 i11Var143 = new i11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.e11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i113) {
                        case 0:
                            pc0 pc0Var = new pc0();
                            n2Var.presentFragment(pc0Var);
                            pc0Var.W(LiteMode.FLAGS_CHAT);
                            pc0Var.V(64);
                            break;
                        case 1:
                            pc0 pc0Var2 = new pc0();
                            n2Var.presentFragment(pc0Var2);
                            pc0Var2.W(LiteMode.FLAGS_CHAT);
                            pc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            pc0 pc0Var3 = new pc0();
                            n2Var.presentFragment(pc0Var3);
                            pc0Var3.W(LiteMode.FLAGS_CHAT);
                            pc0Var3.V(256);
                            break;
                        case 4:
                            pc0 pc0Var4 = new pc0();
                            n2Var.presentFragment(pc0Var4);
                            pc0Var4.W(LiteMode.FLAGS_CHAT);
                            pc0Var4.V(32768);
                            break;
                        case 5:
                            pc0 pc0Var5 = new pc0();
                            n2Var.presentFragment(pc0Var5);
                            pc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            pc0 pc0Var6 = new pc0();
                            n2Var.presentFragment(pc0Var6);
                            pc0Var6.V(1024);
                            break;
                        case 8:
                            pc0 pc0Var7 = new pc0();
                            n2Var.presentFragment(pc0Var7);
                            pc0Var7.V(2048);
                            break;
                        case 9:
                            pc0 pc0Var8 = new pc0();
                            n2Var.presentFragment(pc0Var8);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = pc0Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((jc0) arrayList.get(i1122)).f == 1) {
                                    pc0Var8.b.f1(new i2.s(pc0Var8, i1122, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                            hy0 hy0Var = new hy0();
                            hy0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(hy0Var);
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
            i11Var143.a("tg://settings/language/do-not-translate");
            i11Var43 = i11Var143;
        }
        final int i114 = 14;
        i11 i11Var144 = new i11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i1122)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i1122, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        i11 i11Var145 = new i11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i1122)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i1122, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var145.a("tg://settings/faq");
        final int i116 = 16;
        i11 i11Var146 = new i11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.e11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i116) {
                    case 0:
                        pc0 pc0Var = new pc0();
                        n2Var.presentFragment(pc0Var);
                        pc0Var.W(LiteMode.FLAGS_CHAT);
                        pc0Var.V(64);
                        break;
                    case 1:
                        pc0 pc0Var2 = new pc0();
                        n2Var.presentFragment(pc0Var2);
                        pc0Var2.W(LiteMode.FLAGS_CHAT);
                        pc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        pc0 pc0Var3 = new pc0();
                        n2Var.presentFragment(pc0Var3);
                        pc0Var3.W(LiteMode.FLAGS_CHAT);
                        pc0Var3.V(256);
                        break;
                    case 4:
                        pc0 pc0Var4 = new pc0();
                        n2Var.presentFragment(pc0Var4);
                        pc0Var4.W(LiteMode.FLAGS_CHAT);
                        pc0Var4.V(32768);
                        break;
                    case 5:
                        pc0 pc0Var5 = new pc0();
                        n2Var.presentFragment(pc0Var5);
                        pc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        pc0 pc0Var6 = new pc0();
                        n2Var.presentFragment(pc0Var6);
                        pc0Var6.V(1024);
                        break;
                    case 8:
                        pc0 pc0Var7 = new pc0();
                        n2Var.presentFragment(pc0Var7);
                        pc0Var7.V(2048);
                        break;
                    case 9:
                        pc0 pc0Var8 = new pc0();
                        n2Var.presentFragment(pc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = pc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((jc0) arrayList.get(i1122)).f == 1) {
                                pc0Var8.b.f1(new i2.s(pc0Var8, i1122, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.d5.U(n2Var3, null));
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
                        hy0 hy0Var = new hy0();
                        hy0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(hy0Var);
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
        i11Var146.a("tg://settings/privacy-policy");
        return new i11[]{i11Var23, i11Var24, i11Var25, i11Var26, i11Var27, i11Var28, i11Var29, i11Var30, i11Var31, i11Var32, i11Var33, i11Var34, i11Var35, i11Var36, i11Var37, i11Var38, i11Var39, i11Var, i11Var41, i11Var42, i11Var2, i11Var44, i11Var45, i11Var46, i11Var47, i11Var48, i11Var49, i11Var50, i11Var51, i11Var52, i11Var3, i11Var4, i11Var54, i11Var55, i11Var56, i11Var57, i11Var58, i11Var59, i11Var60, i11Var61, i11Var62, i11Var63, i11Var64, i11Var65, i11Var66, i11Var67, i11Var68, i11Var69, i11Var70, i11Var71, i11Var72, i11Var73, i11Var74, i11Var75, i11Var76, i11Var77, i11Var78, i11Var79, i11Var80, i11Var81, i11Var82, i11Var83, i11Var84, i11Var85, i11Var86, i11Var87, i11Var88, i11Var89, i11Var90, i11Var91, i11Var92, i11Var93, i11Var94, i11Var95, i11Var96, i11Var97, i11Var98, i11Var99, i11Var100, i11Var101, i11Var102, i11Var103, i11Var104, i11Var105, i11Var106, i11Var107, i11Var108, i11Var109, i11Var110, i11Var111, i11Var112, i11Var6, i11Var114, i11Var7, i11Var116, i11Var8, i11Var118, i11Var119, i11Var120, i11Var121, i11Var5, i11Var9, i11Var10, i11Var11, i11Var12, i11Var13, i11Var14, i11Var15, i11Var16, i11Var123, i11Var17, i11Var18, i11Var19, i11Var20, i11Var21, i11Var124, i11Var125, i11Var126, i11Var127, i11Var128, i11Var129, i11Var130, i11Var131, i11Var132, i11Var133, i11Var134, i11Var135, i11Var22, i11Var136, i11Var137, i11Var138, i11Var139, i11Var140, i11Var141, i11Var142, i11Var43, i11Var144, i11Var145, i11Var146};
    }

    @Override // org.telegram.ui.Components.xl0
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
            if (obj2 instanceof i11) {
                ((i11) obj2).g = i10;
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
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        i11 i11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            i11[] i11VarArr = this.c;
            if (i10 >= i11VarArr.length) {
                break;
            }
            i11 i11Var2 = i11VarArr[i10];
            if (i11Var2 != null) {
                hashMap.put(Integer.valueOf(i11Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (i11Var = (i11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        i11Var.g = readInt32;
                        arrayList.add(i11Var);
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
                ((org.telegram.ui.Cells.w3) view).setText(LocaleController.getString(R.string.SettingsFaqSearchTitle));
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.n4) view).setText(LocaleController.getString(R.string.SettingsRecent));
                return;
            }
        }
        org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
        if (this.w) {
            if (i10 >= this.r.size()) {
                int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.r);
                z6Var.a((CharSequence) this.n.get(this.r.size() + f7), ((MessagesController.FaqSearchResult) this.s.get(f7)).path, true, f7 < this.r.size() - 1);
                return;
            } else {
                i11 i11Var = (i11) this.r.get(i10);
                i11 i11Var2 = i10 > 0 ? (i11) this.r.get(i10 - 1) : null;
                z6Var.b((CharSequence) this.n.get(i10), i11Var.d, (i11Var2 == null || i11Var2.e != i11Var.e) ? i11Var.e : 0, i10 < this.r.size() - 1);
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
            z6Var.a(faqSearchResult.title, faqSearchResult.path, true, f10 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof i11) {
            i11 i11Var3 = (i11) obj;
            z6Var.a(i11Var3.a, i11Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            z6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View n4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.n4(context, 16) : new org.telegram.ui.Cells.w3(context, null) : new org.telegram.ui.Cells.z6(context);
        n4Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.il0(n4Var);
    }
}
