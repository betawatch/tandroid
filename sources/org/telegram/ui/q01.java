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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public class q01 extends org.telegram.ui.Components.lm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public p01[] c;
    public final org.telegram.ui.ActionBar.o2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public mv0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public q01(Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        this.e = o2Var;
        this.f = o2Var.getCurrentAccount();
        this.h = context;
        this.c = H(o2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() || UserConfig.getInstance(i10).isPremium()) {
            return i11 == -1 || MessagesController.getInstance(i10).premiumFeaturesTypesToPosition.get(i11, -1) != -1;
        }
        return false;
    }

    public static p01[] H(final org.telegram.ui.ActionBar.o2 o2Var) {
        p01 p01Var;
        p01 p01Var2;
        p01 p01Var3;
        p01 p01Var4;
        p01 p01Var5;
        p01 p01Var6;
        p01 p01Var7;
        p01 p01Var8;
        p01 p01Var9;
        p01 p01Var10;
        p01 p01Var11;
        p01 p01Var12;
        p01 p01Var13;
        p01 p01Var14;
        p01 p01Var15;
        p01 p01Var16;
        p01 p01Var17;
        p01 p01Var18;
        p01 p01Var19;
        p01 p01Var20;
        p01 p01Var21;
        p01 p01Var22;
        final int currentAccount = o2Var.getCurrentAccount();
        final int i10 = 18;
        p01 p01Var23 = new p01(LocaleController.getString(R.string.EditName), 500, 0, new mv0(18, o2Var, o2Var.getResourceProvider()));
        final int i11 = 24;
        p01 p01Var24 = new p01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i12 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i12)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i12, 13), 700, true);
                                break;
                            } else {
                                i12++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var24.a("tg://settings/edit/change-number");
        final int i12 = 6;
        p01 p01Var25 = new p01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i13 = 0;
                        while (true) {
                            if (i13 >= 4) {
                                i13 = -1;
                            } else if (UserConfig.getInstance(i13).isClientActivated()) {
                                i13++;
                            }
                        }
                        if (i13 >= 0) {
                            o2Var.presentFragment(new ig0(i13));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var25.a("tg://settings/edit/add-account");
        final int i13 = 17;
        final int i14 = 1;
        p01 p01Var26 = new p01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var26.a("tg://settings/notifications");
        final int i15 = 29;
        p01 p01Var27 = new p01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var27.a("tg://settings/notifications/private-chats");
        final int i16 = 11;
        p01 p01Var28 = new p01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        p01Var28.a("tg://settings/notifications/groups");
        p01 p01Var29 = new p01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new fi0(7, o2Var));
        p01Var29.a("tg://settings/notifications/channels");
        final int i17 = 19;
        p01 p01Var30 = new p01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new fi0(i17, o2Var));
        p01 p01Var31 = new p01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i18 = 13;
        p01 p01Var32 = new p01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01 p01Var33 = new p01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new fi0(23, o2Var));
        p01Var33.a("tg://settings/notifications/new-contacts");
        p01 p01Var34 = new p01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var34.a("tg://settings/notifications/pinned-messages");
        p01 p01Var35 = new p01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var35.a("tg://settings/notifications/reset");
        p01 p01Var36 = new p01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01 p01Var37 = new p01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01 p01Var38 = new p01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i19 = 20;
        p01 p01Var39 = new p01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var39.a("tg://settings/privacy");
        final int i20 = 21;
        p01 p01Var40 = new p01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        p01 p01Var41 = new p01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new u4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ei.kb(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.b.setText(spannableStringBuilder);
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            break;
                        } else {
                            o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        p01Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        p01 p01Var42 = new p01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var42.a("tg://settings/privacy/passcode");
        p01 p01Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            p01Var = p01Var40;
            final int i23 = 25;
            p01Var2 = new p01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.l01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(LiteMode.FLAGS_CHAT);
                            wb0Var.V(64);
                            break;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(LiteMode.FLAGS_CHAT);
                            wb0Var2.V(128);
                            break;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(LiteMode.FLAGS_CHAT);
                            wb0Var3.V(256);
                            break;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(LiteMode.FLAGS_CHAT);
                            wb0Var4.V(32768);
                            break;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            break;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            break;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            break;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((qb0) arrayList.get(i122)).f == 1) {
                                    wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                            break;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
                            break;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            p01Var2.a("tg://settings/privacy/login-email");
        } else {
            p01Var = p01Var40;
            p01Var2 = null;
        }
        final int i24 = 26;
        p01 p01Var44 = new p01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        p01 p01Var45 = new p01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i25) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var45.a("tg://settings/devices");
        final int i26 = 28;
        p01 p01Var46 = new p01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        p01 p01Var47 = new p01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        p01 p01Var48 = new p01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        p01 p01Var49 = new p01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        p01 p01Var50 = new p01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        p01 p01Var51 = new p01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        p01 p01Var52 = new p01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        p01 p01Var53 = new p01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.m01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            o2Var.presentFragment(new u4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(o2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.yb ybVar = new org.telegram.ui.Components.yb(a02.W(), null);
                            ybVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ei.kb(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ybVar.b.setText(spannableStringBuilder);
                            ybVar.b.setSingleLine(false);
                            ybVar.b.setMaxLines(2);
                            a02.b(ybVar, 2750).j();
                            break;
                        } else {
                            o2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        p01Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            p01Var3 = p01Var53;
            final int i34 = 7;
            p01Var4 = new p01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i34) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                o2Var.presentFragment(new ig0(i132));
                                break;
                            }
                            break;
                        case 7:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            o2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            o2Var.presentFragment(new c7());
                            break;
                        case 24:
                            o2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            o2Var.presentFragment(new c7());
                            break;
                        case 27:
                            o2Var.presentFragment(new c7());
                            break;
                        case 28:
                            o2Var.presentFragment(new ou(null));
                            break;
                        default:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            p01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            p01Var3 = p01Var53;
            p01Var4 = null;
        }
        final int i35 = 8;
        p01 p01Var54 = new p01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        p01 p01Var55 = new p01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        p01 p01Var56 = new p01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        p01 p01Var57 = new p01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        p01 p01Var58 = new p01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        p01 p01Var59 = new p01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        p01 p01Var60 = new p01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        p01 p01Var61 = new p01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        p01 p01Var62 = new p01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var62.a("tg://settings/devices");
        final int i44 = 19;
        p01 p01Var63 = new p01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        p01 p01Var64 = new p01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        p01 p01Var65 = new p01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        p01 p01Var66 = new p01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        p01 p01Var67 = new p01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        p01 p01Var68 = new p01(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        p01 p01Var69 = new p01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        p01 p01Var70 = new p01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        p01 p01Var71 = new p01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.n01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        o2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        o2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        o2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        o2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            o2Var.presentFragment(new ig0(i132));
                            break;
                        }
                        break;
                    case 7:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        o2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        o2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        o2Var.presentFragment(new c7());
                        break;
                    case 24:
                        o2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        o2Var.presentFragment(new c7());
                        break;
                    case 27:
                        o2Var.presentFragment(new c7());
                        break;
                    case 28:
                        o2Var.presentFragment(new ou(null));
                        break;
                    default:
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        p01Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        p01 p01Var72 = new p01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i54 = 1;
        p01 p01Var73 = new p01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i55 = 2;
        p01 p01Var74 = new p01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        p01 p01Var75 = new p01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        p01 p01Var76 = new p01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        p01Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        p01 p01Var77 = new p01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i59 = 7;
        p01 p01Var78 = new p01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i60 = 8;
        p01 p01Var79 = new p01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        p01 p01Var80 = new p01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        p01Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        p01 p01Var81 = new p01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i63 = 12;
        p01 p01Var82 = new p01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        p01Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        p01 p01Var83 = new p01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        p01Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        p01 p01Var84 = new p01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i66 = 15;
        p01 p01Var85 = new p01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        p01Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        p01 p01Var86 = new p01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.o01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        o2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        o2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        o2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 7:
                        o2Var.presentFragment(new DataSettingsActivity());
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
                        o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        o2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        o2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        p01Var86.a("tg://settings/data/save-to-photos/groups");
        p01 p01Var87 = new p01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new fi0(2, o2Var));
        p01Var87.a("tg://settings/data/save-to-photos/channels");
        p01 p01Var88 = new p01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new fi0(3, o2Var));
        p01Var88.a("tg://settings/appearance/themes");
        p01 p01Var89 = new p01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(4, o2Var));
        p01Var89.a("tg://settings/appearance/text-size");
        p01 p01Var90 = new p01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(5, o2Var));
        p01Var90.a("tg://settings/appearance/wallpapers");
        p01 p01Var91 = new p01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new fi0(6, o2Var));
        p01 p01Var92 = new p01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new fi0(8, o2Var));
        p01 p01Var93 = new p01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(9, o2Var));
        p01 p01Var94 = new p01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(10, o2Var));
        p01 p01Var95 = new p01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new fi0(11, o2Var));
        p01Var95.a("tg://settings/appearance/themes/create");
        p01 p01Var96 = new p01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(13, o2Var));
        p01Var96.a("tg://settings/appearance/message-corners");
        p01 p01Var97 = new p01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(14, o2Var));
        p01 p01Var98 = new p01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(15, o2Var));
        p01 p01Var99 = new p01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(16, o2Var));
        p01Var99.a("tg://settings/appearance/app-icon");
        p01 p01Var100 = new p01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(17, o2Var));
        p01 p01Var101 = new p01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(18, o2Var));
        p01Var101.a("tg://settings/appearance/tap-for-next-media");
        p01 p01Var102 = new p01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(20, o2Var));
        p01Var102.a("tg://settings/data/raise-to-listen");
        p01 p01Var103 = new p01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(21, o2Var));
        p01Var103.a("tg://settings/data/raise-to-speak");
        p01 p01Var104 = new p01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(22, o2Var));
        p01Var104.a("tg://settings/data/pause-music");
        p01 p01Var105 = new p01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(24, o2Var));
        p01 p01Var106 = new p01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(25, o2Var));
        p01 p01Var107 = new p01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(26, o2Var));
        p01 p01Var108 = new p01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new fi0(27, o2Var));
        p01 p01Var109 = new p01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new fi0(28, o2Var));
        p01Var109.a("tg://settings/appearance/stickers-and-emoji");
        p01 p01Var110 = new p01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new fi0(29, o2Var));
        final int i68 = 0;
        p01 p01Var111 = new p01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        p01 p01Var112 = new p01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        p01 p01Var113 = new p01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        p01 p01Var114 = new p01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        p01 p01Var115 = new p01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        p01 p01Var116 = new p01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        p01 p01Var117 = new p01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        p01 p01Var118 = new p01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        p01 p01Var119 = new p01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        p01 p01Var120 = new p01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        p01 p01Var121 = new p01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var121.a("tg://settings/folders");
        final int i79 = 21;
        p01 p01Var122 = new p01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            p01Var5 = p01Var122;
            p01Var6 = p01Var113;
            p01Var7 = p01Var115;
            p01Var8 = p01Var117;
            final int i80 = 2;
            p01Var9 = new p01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.l01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i80) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(LiteMode.FLAGS_CHAT);
                            wb0Var.V(64);
                            break;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(LiteMode.FLAGS_CHAT);
                            wb0Var2.V(128);
                            break;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(LiteMode.FLAGS_CHAT);
                            wb0Var3.V(256);
                            break;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(LiteMode.FLAGS_CHAT);
                            wb0Var4.V(32768);
                            break;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            break;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            break;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            break;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((qb0) arrayList.get(i122)).f == 1) {
                                    wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                            break;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
                            break;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            p01Var5 = p01Var122;
            p01Var6 = p01Var113;
            p01Var7 = p01Var115;
            p01Var8 = p01Var117;
            p01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            p01Var10 = new p01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.l01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i81) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(LiteMode.FLAGS_CHAT);
                            wb0Var.V(64);
                            break;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(LiteMode.FLAGS_CHAT);
                            wb0Var2.V(128);
                            break;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(LiteMode.FLAGS_CHAT);
                            wb0Var3.V(256);
                            break;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(LiteMode.FLAGS_CHAT);
                            wb0Var4.V(32768);
                            break;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            break;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            break;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            break;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((qb0) arrayList.get(i122)).f == 1) {
                                    wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                            break;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
                            break;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            p01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            p01Var11 = new p01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.l01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(LiteMode.FLAGS_CHAT);
                            wb0Var.V(64);
                            break;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(LiteMode.FLAGS_CHAT);
                            wb0Var2.V(128);
                            break;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(LiteMode.FLAGS_CHAT);
                            wb0Var3.V(256);
                            break;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(LiteMode.FLAGS_CHAT);
                            wb0Var4.V(32768);
                            break;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            break;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            break;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            break;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((qb0) arrayList.get(i122)).f == 1) {
                                    wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                            break;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
                            break;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            p01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            p01Var12 = new p01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                o2Var.presentFragment(new ig0(i132));
                                break;
                            }
                            break;
                        case 7:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            o2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            o2Var.presentFragment(new c7());
                            break;
                        case 24:
                            o2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            o2Var.presentFragment(new c7());
                            break;
                        case 27:
                            o2Var.presentFragment(new c7());
                            break;
                        case 28:
                            o2Var.presentFragment(new ou(null));
                            break;
                        default:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            p01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            p01Var13 = new p01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                o2Var.presentFragment(new ig0(i132));
                                break;
                            }
                            break;
                        case 7:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            o2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            o2Var.presentFragment(new c7());
                            break;
                        case 24:
                            o2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            o2Var.presentFragment(new c7());
                            break;
                        case 27:
                            o2Var.presentFragment(new c7());
                            break;
                        case 28:
                            o2Var.presentFragment(new ou(null));
                            break;
                        default:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            p01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            p01Var14 = new p01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.n01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            o2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            o2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            o2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            o2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 1, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (UserConfig.getInstance(i132).isClientActivated()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                o2Var.presentFragment(new ig0(i132));
                                break;
                            }
                            break;
                        case 7:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            o2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 2, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            o2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            o2Var.presentFragment(new c7());
                            break;
                        case 24:
                            o2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 8, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            o2Var.presentFragment(new c7());
                            break;
                        case 27:
                            o2Var.presentFragment(new c7());
                            break;
                        case 28:
                            o2Var.presentFragment(new ou(null));
                            break;
                        default:
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            p01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            p01Var15 = new p01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.o01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            o2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            o2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            o2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 7:
                            o2Var.presentFragment(new DataSettingsActivity());
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
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            o2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            p01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            p01Var16 = new p01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.o01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            o2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            o2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            o2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 3, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 7:
                            o2Var.presentFragment(new DataSettingsActivity());
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
                            o2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            o2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            o2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 4, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            p01Var16 = null;
        }
        p01 p01Var123 = F(currentAccount, 5) ? new p01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new fi0(12, o2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            p01Var17 = new p01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new d21());
                            break;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            break;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            break;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            break;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            break;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(LiteMode.FLAGS_CHAT);
                            wb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            p01Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            p01Var18 = new p01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new d21());
                            break;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            break;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            break;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            break;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            break;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(LiteMode.FLAGS_CHAT);
                            wb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            p01Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            p01Var19 = new p01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new d21());
                            break;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            break;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            break;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            break;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            break;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(LiteMode.FLAGS_CHAT);
                            wb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            p01Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            p01Var20 = new p01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new d21());
                            break;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            break;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            break;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            break;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            break;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(LiteMode.FLAGS_CHAT);
                            wb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            p01Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            p01Var21 = new p01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            o2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            o2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            o2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            o2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            o2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            o2Var.presentFragment(new d21());
                            break;
                        case 12:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                            y0Var2.E();
                            o2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                            y0Var3.E();
                            o2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                            sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                            y0Var4.E();
                            o2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                            sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                            y0Var5.E();
                            o2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            o2Var.presentFragment(new wb0());
                            break;
                        case 19:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.V(3);
                            break;
                        case 20:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(3);
                            wb0Var2.V(1);
                            break;
                        case 21:
                            o2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(3);
                            wb0Var3.V(2);
                            break;
                        case 23:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            wb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            wb0 wb0Var9 = new wb0();
                            o2Var.presentFragment(wb0Var9);
                            wb0Var9.W(LiteMode.FLAGS_CHAT);
                            wb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            p01Var21 = null;
        }
        final int i93 = 18;
        p01 p01Var124 = new p01(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i93) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        p01 p01Var125 = new p01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i94) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        p01 p01Var126 = new p01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        p01 p01Var127 = new p01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        p01 p01Var128 = new p01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        p01 p01Var129 = new p01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        p01 p01Var130 = new p01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        p01 p01Var131 = new p01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        p01 p01Var132 = new p01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        p01 p01Var133 = new p01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        o2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        o2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 9, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        o2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        o2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        o2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        o2Var.presentFragment(new d21());
                        break;
                    case 12:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var3, 6, false);
                        y0Var2.E();
                        o2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var3 = new sg.y0(o2Var4, 7, false);
                        y0Var3.E();
                        o2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.o2 o2Var5 = o2Var;
                        sg.y0 y0Var4 = new sg.y0(o2Var5, 10, false);
                        y0Var4.E();
                        o2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.o2 o2Var6 = o2Var;
                        sg.y0 y0Var5 = new sg.y0(o2Var6, 12, false);
                        y0Var5.E();
                        o2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        o2Var.presentFragment(new wb0());
                        break;
                    case 19:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.V(3);
                        break;
                    case 20:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(3);
                        wb0Var2.V(1);
                        break;
                    case 21:
                        o2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(3);
                        wb0Var3.V(2);
                        break;
                    case 23:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        wb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        wb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        wb0 wb0Var9 = new wb0();
                        o2Var.presentFragment(wb0Var9);
                        wb0Var9.W(LiteMode.FLAGS_CHAT);
                        wb0Var9.V(32);
                        break;
                }
            }
        });
        p01Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        p01 p01Var134 = new p01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i104 = 1;
        p01 p01Var135 = new p01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i105 = 3;
            p01Var22 = new p01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.l01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i105) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(LiteMode.FLAGS_CHAT);
                            wb0Var.V(64);
                            break;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(LiteMode.FLAGS_CHAT);
                            wb0Var2.V(128);
                            break;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(LiteMode.FLAGS_CHAT);
                            wb0Var3.V(256);
                            break;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(LiteMode.FLAGS_CHAT);
                            wb0Var4.V(32768);
                            break;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            break;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            break;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            break;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((qb0) arrayList.get(i122)).f == 1) {
                                    wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                            break;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
                            break;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            p01Var22 = null;
        }
        final int i106 = 4;
        p01 p01Var136 = new p01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i107 = 5;
        p01 p01Var137 = new p01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        p01 p01Var138 = new p01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i108) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        p01 p01Var139 = new p01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        p01 p01Var140 = new p01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        p01 p01Var141 = new p01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var141.a("tg://settings/language");
        final int i112 = 11;
        p01 p01Var142 = new p01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i113 = 12;
            p01 p01Var143 = new p01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.l01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i113) {
                        case 0:
                            wb0 wb0Var = new wb0();
                            o2Var.presentFragment(wb0Var);
                            wb0Var.W(LiteMode.FLAGS_CHAT);
                            wb0Var.V(64);
                            break;
                        case 1:
                            wb0 wb0Var2 = new wb0();
                            o2Var.presentFragment(wb0Var2);
                            wb0Var2.W(LiteMode.FLAGS_CHAT);
                            wb0Var2.V(128);
                            break;
                        case 2:
                            o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            wb0 wb0Var3 = new wb0();
                            o2Var.presentFragment(wb0Var3);
                            wb0Var3.W(LiteMode.FLAGS_CHAT);
                            wb0Var3.V(256);
                            break;
                        case 4:
                            wb0 wb0Var4 = new wb0();
                            o2Var.presentFragment(wb0Var4);
                            wb0Var4.W(LiteMode.FLAGS_CHAT);
                            wb0Var4.V(32768);
                            break;
                        case 5:
                            wb0 wb0Var5 = new wb0();
                            o2Var.presentFragment(wb0Var5);
                            wb0Var5.V(512);
                            break;
                        case 6:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            wb0 wb0Var6 = new wb0();
                            o2Var.presentFragment(wb0Var6);
                            wb0Var6.V(1024);
                            break;
                        case 8:
                            wb0 wb0Var7 = new wb0();
                            o2Var.presentFragment(wb0Var7);
                            wb0Var7.V(2048);
                            break;
                        case 9:
                            wb0 wb0Var8 = new wb0();
                            o2Var.presentFragment(wb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = wb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((qb0) arrayList.get(i122)).f == 1) {
                                    wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            o2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                            sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                            y0Var.E();
                            o2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                            o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                            break;
                        case 15:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            o2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            o2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            o2Var.presentFragment(PasscodeActivity.e0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                            sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                            y0Var2.E();
                            o2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            o2Var.presentFragment(new g(3));
                            break;
                        case 25:
                            o2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            ox0 ox0Var = new ox0();
                            ox0Var.getMessagesController().getBlockedPeers(true);
                            o2Var.presentFragment(ox0Var);
                            break;
                        case 27:
                            o2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            o2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            o2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            p01Var143.a("tg://settings/language/do-not-translate");
            p01Var43 = p01Var143;
        }
        final int i114 = 14;
        p01 p01Var144 = new p01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        p01 p01Var145 = new p01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var145.a("tg://settings/faq");
        final int i116 = 16;
        p01 p01Var146 = new p01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.l01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i116) {
                    case 0:
                        wb0 wb0Var = new wb0();
                        o2Var.presentFragment(wb0Var);
                        wb0Var.W(LiteMode.FLAGS_CHAT);
                        wb0Var.V(64);
                        break;
                    case 1:
                        wb0 wb0Var2 = new wb0();
                        o2Var.presentFragment(wb0Var2);
                        wb0Var2.W(LiteMode.FLAGS_CHAT);
                        wb0Var2.V(128);
                        break;
                    case 2:
                        o2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        wb0 wb0Var3 = new wb0();
                        o2Var.presentFragment(wb0Var3);
                        wb0Var3.W(LiteMode.FLAGS_CHAT);
                        wb0Var3.V(256);
                        break;
                    case 4:
                        wb0 wb0Var4 = new wb0();
                        o2Var.presentFragment(wb0Var4);
                        wb0Var4.W(LiteMode.FLAGS_CHAT);
                        wb0Var4.V(32768);
                        break;
                    case 5:
                        wb0 wb0Var5 = new wb0();
                        o2Var.presentFragment(wb0Var5);
                        wb0Var5.V(512);
                        break;
                    case 6:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        wb0 wb0Var6 = new wb0();
                        o2Var.presentFragment(wb0Var6);
                        wb0Var6.V(1024);
                        break;
                    case 8:
                        wb0 wb0Var7 = new wb0();
                        o2Var.presentFragment(wb0Var7);
                        wb0Var7.V(2048);
                        break;
                    case 9:
                        wb0 wb0Var8 = new wb0();
                        o2Var.presentFragment(wb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = wb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((qb0) arrayList.get(i122)).f == 1) {
                                wb0Var8.b.f1(new i2.r(wb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        o2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.o2 o2Var2 = o2Var;
                        sg.y0 y0Var = new sg.y0(o2Var2, 0, false);
                        y0Var.E();
                        o2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.o2 o2Var3 = o2Var;
                        o2Var3.showDialog(org.telegram.ui.Components.f5.U(o2Var3, null));
                        break;
                    case 15:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(o2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        o2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        o2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        o2Var.presentFragment(PasscodeActivity.e0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.o2 o2Var4 = o2Var;
                        sg.y0 y0Var2 = new sg.y0(o2Var4, 11, false);
                        y0Var2.E();
                        o2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        o2Var.presentFragment(new g(3));
                        break;
                    case 25:
                        o2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        ox0 ox0Var = new ox0();
                        ox0Var.getMessagesController().getBlockedPeers(true);
                        o2Var.presentFragment(ox0Var);
                        break;
                    case 27:
                        o2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        o2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        o2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        p01Var146.a("tg://settings/privacy-policy");
        return new p01[]{p01Var23, p01Var24, p01Var25, p01Var26, p01Var27, p01Var28, p01Var29, p01Var30, p01Var31, p01Var32, p01Var33, p01Var34, p01Var35, p01Var36, p01Var37, p01Var38, p01Var39, p01Var, p01Var41, p01Var42, p01Var2, p01Var44, p01Var45, p01Var46, p01Var47, p01Var48, p01Var49, p01Var50, p01Var51, p01Var52, p01Var3, p01Var4, p01Var54, p01Var55, p01Var56, p01Var57, p01Var58, p01Var59, p01Var60, p01Var61, p01Var62, p01Var63, p01Var64, p01Var65, p01Var66, p01Var67, p01Var68, p01Var69, p01Var70, p01Var71, p01Var72, p01Var73, p01Var74, p01Var75, p01Var76, p01Var77, p01Var78, p01Var79, p01Var80, p01Var81, p01Var82, p01Var83, p01Var84, p01Var85, p01Var86, p01Var87, p01Var88, p01Var89, p01Var90, p01Var91, p01Var92, p01Var93, p01Var94, p01Var95, p01Var96, p01Var97, p01Var98, p01Var99, p01Var100, p01Var101, p01Var102, p01Var103, p01Var104, p01Var105, p01Var106, p01Var107, p01Var108, p01Var109, p01Var110, p01Var111, p01Var112, p01Var6, p01Var114, p01Var7, p01Var116, p01Var8, p01Var118, p01Var119, p01Var120, p01Var121, p01Var5, p01Var9, p01Var10, p01Var11, p01Var12, p01Var13, p01Var14, p01Var15, p01Var16, p01Var123, p01Var17, p01Var18, p01Var19, p01Var20, p01Var21, p01Var124, p01Var125, p01Var126, p01Var127, p01Var128, p01Var129, p01Var130, p01Var131, p01Var132, p01Var133, p01Var134, p01Var135, p01Var22, p01Var136, p01Var137, p01Var138, p01Var139, p01Var140, p01Var141, p01Var142, p01Var43, p01Var144, p01Var145, p01Var146};
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 0;
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
            if (obj2 instanceof p01) {
                ((p01) obj2).g = i10;
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
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new l(this, 21));
    }

    public final void I(String str) {
        this.y = str;
        if (this.x != null) {
            Utilities.searchQueue.cancelRunnable(this.x);
            this.x = null;
        }
        if (!TextUtils.isEmpty(str)) {
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            mv0 mv0Var = new mv0(19, this, str);
            this.x = mv0Var;
            dispatchQueue.postRunnable(mv0Var, 300L);
            return;
        }
        this.w = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.o2 o2Var = this.e;
        if (o2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) o2Var).P.b.getImageReceiver().startAnimation();
                ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        p01 p01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            p01[] p01VarArr = this.c;
            if (i10 >= p01VarArr.length) {
                break;
            }
            p01 p01Var2 = p01VarArr[i10];
            if (p01Var2 != null) {
                hashMap.put(Integer.valueOf(p01Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (p01Var = (p01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        p01Var.g = readInt32;
                        arrayList.add(p01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new o70(this));
    }

    @Override // s4.g0
    public final int h() {
        if (this.w) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.v;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
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
        org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
        if (this.w) {
            if (i10 >= this.r.size()) {
                int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.r);
                y6Var.a((CharSequence) this.n.get(this.r.size() + g10), ((MessagesController.FaqSearchResult) this.s.get(g10)).path, true, g10 < this.r.size() - 1);
                return;
            } else {
                p01 p01Var = (p01) this.r.get(i10);
                p01 p01Var2 = i10 > 0 ? (p01) this.r.get(i10 - 1) : null;
                y6Var.b((CharSequence) this.n.get(i10), p01Var.d, (p01Var2 == null || p01Var2.e != p01Var.e) ? p01Var.e : 0, i10 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.v;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= arrayList.size()) {
            int g11 = com.google.android.gms.internal.play_billing.k3.g(1, i10, arrayList);
            MessagesController.FaqSearchResult faqSearchResult = (MessagesController.FaqSearchResult) this.d.get(g11);
            y6Var.a(faqSearchResult.title, faqSearchResult.path, true, g11 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof p01) {
            p01 p01Var3 = (p01) obj;
            y6Var.a(p01Var3.a, p01Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            y6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View l4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.l4(context, 16) : new org.telegram.ui.Cells.u3(context, null) : new org.telegram.ui.Cells.y6(context);
        l4Var.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(l4Var);
    }
}
