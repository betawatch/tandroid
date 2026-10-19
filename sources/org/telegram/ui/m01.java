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

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public class m01 extends org.telegram.ui.Components.hm0 {
    public TLRPC.WebPage E;
    public boolean F;
    public l01[] c;
    public final org.telegram.ui.ActionBar.n2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public jv0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public m01(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
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

    public static l01[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        l01 l01Var;
        l01 l01Var2;
        l01 l01Var3;
        l01 l01Var4;
        l01 l01Var5;
        l01 l01Var6;
        l01 l01Var7;
        l01 l01Var8;
        l01 l01Var9;
        l01 l01Var10;
        l01 l01Var11;
        l01 l01Var12;
        l01 l01Var13;
        l01 l01Var14;
        l01 l01Var15;
        l01 l01Var16;
        l01 l01Var17;
        l01 l01Var18;
        l01 l01Var19;
        l01 l01Var20;
        l01 l01Var21;
        l01 l01Var22;
        final int currentAccount = n2Var.getCurrentAccount();
        final int i10 = 18;
        l01 l01Var23 = new l01(LocaleController.getString(R.string.EditName), 500, 0, new jv0(18, n2Var, n2Var.getResourceProvider()));
        final int i11 = 24;
        l01 l01Var24 = new l01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i12 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i12 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i12)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i12, 13), 700, true);
                                break;
                            } else {
                                i12++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var24.a("tg://settings/edit/change-number");
        final int i12 = 6;
        l01 l01Var25 = new l01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i13));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var25.a("tg://settings/edit/add-account");
        final int i13 = 17;
        final int i14 = 1;
        l01 l01Var26 = new l01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var26.a("tg://settings/notifications");
        final int i15 = 29;
        l01 l01Var27 = new l01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.j01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var27.a("tg://settings/notifications/private-chats");
        final int i16 = 11;
        l01 l01Var28 = new l01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.k01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        l01Var28.a("tg://settings/notifications/groups");
        l01 l01Var29 = new l01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new bi0(7, n2Var));
        l01Var29.a("tg://settings/notifications/channels");
        final int i17 = 19;
        l01 l01Var30 = new l01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new bi0(i17, n2Var));
        l01 l01Var31 = new l01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.f01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i18 = 13;
        l01 l01Var32 = new l01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.f01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01 l01Var33 = new l01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new bi0(23, n2Var));
        l01Var33.a("tg://settings/notifications/new-contacts");
        l01 l01Var34 = new l01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.f01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var34.a("tg://settings/notifications/pinned-messages");
        l01 l01Var35 = new l01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var35.a("tg://settings/notifications/reset");
        l01 l01Var36 = new l01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01 l01Var37 = new l01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01 l01Var38 = new l01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01 l01Var39 = new l01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var39.a("tg://settings/privacy");
        final int i20 = 21;
        l01 l01Var40 = new l01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        l01 l01Var41 = new l01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.i01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new v4());
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
                                spannableStringBuilder.setSpan(new ei.kb(a02, 5), indexOf, lastIndexOf - 1, 33);
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
        l01Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        l01 l01Var42 = new l01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var42.a("tg://settings/privacy/passcode");
        l01 l01Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            l01Var = l01Var40;
            final int i23 = 25;
            l01Var2 = new l01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(LiteMode.FLAGS_CHAT);
                            qb0Var.V(64);
                            break;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(LiteMode.FLAGS_CHAT);
                            qb0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(LiteMode.FLAGS_CHAT);
                            qb0Var3.V(256);
                            break;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(LiteMode.FLAGS_CHAT);
                            qb0Var4.V(32768);
                            break;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            break;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            break;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((kb0) arrayList.get(i122)).f == 1) {
                                    qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            break;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
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
            l01Var2.a("tg://settings/privacy/login-email");
        } else {
            l01Var = l01Var40;
            l01Var2 = null;
        }
        final int i24 = 26;
        l01 l01Var44 = new l01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        l01 l01Var45 = new l01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i25) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var45.a("tg://settings/devices");
        final int i26 = 28;
        l01 l01Var46 = new l01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        l01 l01Var47 = new l01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        l01 l01Var48 = new l01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        l01 l01Var49 = new l01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        l01 l01Var50 = new l01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        l01 l01Var51 = new l01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        l01 l01Var52 = new l01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        l01 l01Var53 = new l01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.i01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            n2Var.presentFragment(new v4());
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
                                spannableStringBuilder.setSpan(new ei.kb(a02, 5), indexOf, lastIndexOf - 1, 33);
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
        l01Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            l01Var3 = l01Var53;
            final int i34 = 7;
            l01Var4 = new l01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                n2Var.presentFragment(new dg0(i132));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
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
                            n2Var.presentFragment(new c7());
                            break;
                        case 24:
                            n2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new c7());
                            break;
                        case 27:
                            n2Var.presentFragment(new c7());
                            break;
                        case 28:
                            n2Var.presentFragment(new lu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            l01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            l01Var3 = l01Var53;
            l01Var4 = null;
        }
        final int i35 = 8;
        l01 l01Var54 = new l01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        l01 l01Var55 = new l01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        l01 l01Var56 = new l01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        l01 l01Var57 = new l01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        l01 l01Var58 = new l01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        l01 l01Var59 = new l01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        l01 l01Var60 = new l01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        l01 l01Var61 = new l01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        l01 l01Var62 = new l01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var62.a("tg://settings/devices");
        final int i44 = 19;
        l01 l01Var63 = new l01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        l01 l01Var64 = new l01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        l01 l01Var65 = new l01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        l01 l01Var66 = new l01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        l01 l01Var67 = new l01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        l01 l01Var68 = new l01(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        l01 l01Var69 = new l01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        l01 l01Var70 = new l01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        l01 l01Var71 = new l01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.j01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 5:
                        n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            n2Var.presentFragment(new dg0(i132));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                        y0Var2.D();
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
                        n2Var.presentFragment(new c7());
                        break;
                    case 24:
                        n2Var.presentFragment(new c7());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 26:
                        n2Var.presentFragment(new c7());
                        break;
                    case 27:
                        n2Var.presentFragment(new c7());
                        break;
                    case 28:
                        n2Var.presentFragment(new lu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        l01Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        l01 l01Var72 = new l01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i54 = 1;
        l01 l01Var73 = new l01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i55 = 2;
        l01 l01Var74 = new l01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        l01 l01Var75 = new l01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        l01 l01Var76 = new l01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        l01Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        l01 l01Var77 = new l01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i59 = 7;
        l01 l01Var78 = new l01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i60 = 8;
        l01 l01Var79 = new l01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        l01 l01Var80 = new l01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        l01Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        l01 l01Var81 = new l01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i63 = 12;
        l01 l01Var82 = new l01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        l01Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        l01 l01Var83 = new l01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        l01Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        l01 l01Var84 = new l01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        final int i66 = 15;
        l01 l01Var85 = new l01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        l01Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        l01 l01Var86 = new l01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.k01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                        y0Var.D();
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
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                }
            }
        });
        l01Var86.a("tg://settings/data/save-to-photos/groups");
        l01 l01Var87 = new l01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new bi0(2, n2Var));
        l01Var87.a("tg://settings/data/save-to-photos/channels");
        l01 l01Var88 = new l01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new bi0(3, n2Var));
        l01Var88.a("tg://settings/appearance/themes");
        l01 l01Var89 = new l01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(4, n2Var));
        l01Var89.a("tg://settings/appearance/text-size");
        l01 l01Var90 = new l01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(5, n2Var));
        l01Var90.a("tg://settings/appearance/wallpapers");
        l01 l01Var91 = new l01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new bi0(6, n2Var));
        l01 l01Var92 = new l01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new bi0(8, n2Var));
        l01 l01Var93 = new l01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(9, n2Var));
        l01 l01Var94 = new l01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(10, n2Var));
        l01 l01Var95 = new l01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new bi0(11, n2Var));
        l01Var95.a("tg://settings/appearance/themes/create");
        l01 l01Var96 = new l01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(13, n2Var));
        l01Var96.a("tg://settings/appearance/message-corners");
        l01 l01Var97 = new l01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(14, n2Var));
        l01 l01Var98 = new l01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(15, n2Var));
        l01 l01Var99 = new l01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(16, n2Var));
        l01Var99.a("tg://settings/appearance/app-icon");
        l01 l01Var100 = new l01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(17, n2Var));
        l01 l01Var101 = new l01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(18, n2Var));
        l01Var101.a("tg://settings/appearance/tap-for-next-media");
        l01 l01Var102 = new l01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(20, n2Var));
        l01Var102.a("tg://settings/data/raise-to-listen");
        l01 l01Var103 = new l01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(21, n2Var));
        l01Var103.a("tg://settings/data/raise-to-speak");
        l01 l01Var104 = new l01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(22, n2Var));
        l01Var104.a("tg://settings/data/pause-music");
        l01 l01Var105 = new l01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(24, n2Var));
        l01 l01Var106 = new l01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(25, n2Var));
        l01 l01Var107 = new l01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(26, n2Var));
        l01 l01Var108 = new l01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new bi0(27, n2Var));
        l01 l01Var109 = new l01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new bi0(28, n2Var));
        l01Var109.a("tg://settings/appearance/stickers-and-emoji");
        l01 l01Var110 = new l01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new bi0(29, n2Var));
        final int i68 = 0;
        l01 l01Var111 = new l01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        l01 l01Var112 = new l01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        l01 l01Var113 = new l01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        l01 l01Var114 = new l01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        l01 l01Var115 = new l01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        l01 l01Var116 = new l01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        l01 l01Var117 = new l01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        l01 l01Var118 = new l01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        l01 l01Var119 = new l01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        l01 l01Var120 = new l01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        l01 l01Var121 = new l01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var121.a("tg://settings/folders");
        final int i79 = 21;
        l01 l01Var122 = new l01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            l01Var5 = l01Var122;
            l01Var6 = l01Var113;
            l01Var7 = l01Var115;
            l01Var8 = l01Var117;
            final int i80 = 2;
            l01Var9 = new l01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.h01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i80) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(LiteMode.FLAGS_CHAT);
                            qb0Var.V(64);
                            break;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(LiteMode.FLAGS_CHAT);
                            qb0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(LiteMode.FLAGS_CHAT);
                            qb0Var3.V(256);
                            break;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(LiteMode.FLAGS_CHAT);
                            qb0Var4.V(32768);
                            break;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            break;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            break;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((kb0) arrayList.get(i122)).f == 1) {
                                    qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            break;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
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
            l01Var5 = l01Var122;
            l01Var6 = l01Var113;
            l01Var7 = l01Var115;
            l01Var8 = l01Var117;
            l01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            l01Var10 = new l01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.h01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i81) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(LiteMode.FLAGS_CHAT);
                            qb0Var.V(64);
                            break;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(LiteMode.FLAGS_CHAT);
                            qb0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(LiteMode.FLAGS_CHAT);
                            qb0Var3.V(256);
                            break;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(LiteMode.FLAGS_CHAT);
                            qb0Var4.V(32768);
                            break;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            break;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            break;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((kb0) arrayList.get(i122)).f == 1) {
                                    qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            break;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
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
            l01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            l01Var11 = new l01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.h01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(LiteMode.FLAGS_CHAT);
                            qb0Var.V(64);
                            break;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(LiteMode.FLAGS_CHAT);
                            qb0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(LiteMode.FLAGS_CHAT);
                            qb0Var3.V(256);
                            break;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(LiteMode.FLAGS_CHAT);
                            qb0Var4.V(32768);
                            break;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            break;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            break;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((kb0) arrayList.get(i122)).f == 1) {
                                    qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            break;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
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
            l01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            l01Var12 = new l01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                n2Var.presentFragment(new dg0(i132));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
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
                            n2Var.presentFragment(new c7());
                            break;
                        case 24:
                            n2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new c7());
                            break;
                        case 27:
                            n2Var.presentFragment(new c7());
                            break;
                        case 28:
                            n2Var.presentFragment(new lu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            l01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            l01Var13 = new l01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                n2Var.presentFragment(new dg0(i132));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
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
                            n2Var.presentFragment(new c7());
                            break;
                        case 24:
                            n2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new c7());
                            break;
                        case 27:
                            n2Var.presentFragment(new c7());
                            break;
                        case 28:
                            n2Var.presentFragment(new lu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            l01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            l01Var14 = new l01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.j01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 1, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 5:
                            n2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                n2Var.presentFragment(new dg0(i132));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 2, false);
                            y0Var2.D();
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
                            n2Var.presentFragment(new c7());
                            break;
                        case 24:
                            n2Var.presentFragment(new c7());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 8, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 26:
                            n2Var.presentFragment(new c7());
                            break;
                        case 27:
                            n2Var.presentFragment(new c7());
                            break;
                        case 28:
                            n2Var.presentFragment(new lu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            l01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            l01Var15 = new l01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                            y0Var.D();
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            l01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            l01Var16 = new l01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.k01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 3, false);
                            y0Var.D();
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
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 4, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            break;
                    }
                }
            });
        } else {
            l01Var16 = null;
        }
        l01 l01Var123 = F(currentAccount, 5) ? new l01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new bi0(12, n2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            l01Var17 = new l01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new z11());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            break;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            break;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            break;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(LiteMode.FLAGS_CHAT);
                            qb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            l01Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            l01Var18 = new l01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new z11());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            break;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            break;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            break;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(LiteMode.FLAGS_CHAT);
                            qb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            l01Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            l01Var19 = new l01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new z11());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            break;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            break;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            break;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(LiteMode.FLAGS_CHAT);
                            qb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            l01Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            l01Var20 = new l01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new z11());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            break;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            break;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            break;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(LiteMode.FLAGS_CHAT);
                            qb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            l01Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            l01Var21 = new l01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f01
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
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
                            n2Var.presentFragment(new z11());
                            break;
                        case 12:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                            y0Var2.D();
                            n2Var3.showDialog(y0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                            sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                            y0Var3.D();
                            n2Var4.showDialog(y0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                            sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                            y0Var4.D();
                            n2Var5.showDialog(y0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                            sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                            y0Var5.D();
                            n2Var6.showDialog(y0Var5);
                            break;
                        case 18:
                            n2Var.presentFragment(new qb0());
                            break;
                        case 19:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.V(3);
                            break;
                        case 20:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(3);
                            qb0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(3);
                            qb0Var3.V(2);
                            break;
                        case 23:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            qb0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            qb0 qb0Var9 = new qb0();
                            n2Var.presentFragment(qb0Var9);
                            qb0Var9.W(LiteMode.FLAGS_CHAT);
                            qb0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            l01Var21 = null;
        }
        final int i93 = 18;
        l01 l01Var124 = new l01(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        l01 l01Var125 = new l01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        l01 l01Var126 = new l01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        l01 l01Var127 = new l01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        l01 l01Var128 = new l01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        l01 l01Var129 = new l01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        l01 l01Var130 = new l01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        l01 l01Var131 = new l01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        l01 l01Var132 = new l01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        l01 l01Var133 = new l01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f01
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 9, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
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
                        n2Var.presentFragment(new z11());
                        break;
                    case 12:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        sg.y0 y0Var2 = new sg.y0(n2Var3, 6, false);
                        y0Var2.D();
                        n2Var3.showDialog(y0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.n2 n2Var4 = n2Var;
                        sg.y0 y0Var3 = new sg.y0(n2Var4, 7, false);
                        y0Var3.D();
                        n2Var4.showDialog(y0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.n2 n2Var5 = n2Var;
                        sg.y0 y0Var4 = new sg.y0(n2Var5, 10, false);
                        y0Var4.D();
                        n2Var5.showDialog(y0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.n2 n2Var6 = n2Var;
                        sg.y0 y0Var5 = new sg.y0(n2Var6, 12, false);
                        y0Var5.D();
                        n2Var6.showDialog(y0Var5);
                        break;
                    case 18:
                        n2Var.presentFragment(new qb0());
                        break;
                    case 19:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.V(3);
                        break;
                    case 20:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(3);
                        qb0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(3);
                        qb0Var3.V(2);
                        break;
                    case 23:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        qb0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        qb0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        qb0 qb0Var9 = new qb0();
                        n2Var.presentFragment(qb0Var9);
                        qb0Var9.W(LiteMode.FLAGS_CHAT);
                        qb0Var9.V(32);
                        break;
                }
            }
        });
        l01Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        l01 l01Var134 = new l01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01 l01Var135 = new l01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
            l01Var22 = new l01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.h01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i105) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(LiteMode.FLAGS_CHAT);
                            qb0Var.V(64);
                            break;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(LiteMode.FLAGS_CHAT);
                            qb0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(LiteMode.FLAGS_CHAT);
                            qb0Var3.V(256);
                            break;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(LiteMode.FLAGS_CHAT);
                            qb0Var4.V(32768);
                            break;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            break;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            break;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((kb0) arrayList.get(i122)).f == 1) {
                                    qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            break;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
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
            l01Var22 = null;
        }
        final int i106 = 4;
        l01 l01Var136 = new l01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01 l01Var137 = new l01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        l01 l01Var138 = new l01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i108) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        l01 l01Var139 = new l01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        l01 l01Var140 = new l01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        l01 l01Var141 = new l01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var141.a("tg://settings/language");
        final int i112 = 11;
        l01 l01Var142 = new l01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i113 = 12;
            l01 l01Var143 = new l01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.h01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i113) {
                        case 0:
                            qb0 qb0Var = new qb0();
                            n2Var.presentFragment(qb0Var);
                            qb0Var.W(LiteMode.FLAGS_CHAT);
                            qb0Var.V(64);
                            break;
                        case 1:
                            qb0 qb0Var2 = new qb0();
                            n2Var.presentFragment(qb0Var2);
                            qb0Var2.W(LiteMode.FLAGS_CHAT);
                            qb0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            qb0 qb0Var3 = new qb0();
                            n2Var.presentFragment(qb0Var3);
                            qb0Var3.W(LiteMode.FLAGS_CHAT);
                            qb0Var3.V(256);
                            break;
                        case 4:
                            qb0 qb0Var4 = new qb0();
                            n2Var.presentFragment(qb0Var4);
                            qb0Var4.W(LiteMode.FLAGS_CHAT);
                            qb0Var4.V(32768);
                            break;
                        case 5:
                            qb0 qb0Var5 = new qb0();
                            n2Var.presentFragment(qb0Var5);
                            qb0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            qb0 qb0Var6 = new qb0();
                            n2Var.presentFragment(qb0Var6);
                            qb0Var6.V(1024);
                            break;
                        case 8:
                            qb0 qb0Var7 = new qb0();
                            n2Var.presentFragment(qb0Var7);
                            qb0Var7.V(2048);
                            break;
                        case 9:
                            qb0 qb0Var8 = new qb0();
                            n2Var.presentFragment(qb0Var8);
                            int i122 = 0;
                            while (true) {
                                ArrayList arrayList = qb0Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((kb0) arrayList.get(i122)).f == 1) {
                                    qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
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
                            sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                            y0Var.D();
                            n2Var2.showDialog(y0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                            n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                            break;
                        case 15:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                            sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                            y0Var2.D();
                            n2Var4.showDialog(y0Var2);
                            break;
                        case 24:
                            n2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            n2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            kx0 kx0Var = new kx0();
                            kx0Var.getMessagesController().getBlockedPeers(true);
                            n2Var.presentFragment(kx0Var);
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
            l01Var143.a("tg://settings/language/do-not-translate");
            l01Var43 = l01Var143;
        }
        final int i114 = 14;
        l01 l01Var144 = new l01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        l01 l01Var145 = new l01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var145.a("tg://settings/faq");
        final int i116 = 16;
        l01 l01Var146 = new l01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.h01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i116) {
                    case 0:
                        qb0 qb0Var = new qb0();
                        n2Var.presentFragment(qb0Var);
                        qb0Var.W(LiteMode.FLAGS_CHAT);
                        qb0Var.V(64);
                        break;
                    case 1:
                        qb0 qb0Var2 = new qb0();
                        n2Var.presentFragment(qb0Var2);
                        qb0Var2.W(LiteMode.FLAGS_CHAT);
                        qb0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        qb0 qb0Var3 = new qb0();
                        n2Var.presentFragment(qb0Var3);
                        qb0Var3.W(LiteMode.FLAGS_CHAT);
                        qb0Var3.V(256);
                        break;
                    case 4:
                        qb0 qb0Var4 = new qb0();
                        n2Var.presentFragment(qb0Var4);
                        qb0Var4.W(LiteMode.FLAGS_CHAT);
                        qb0Var4.V(32768);
                        break;
                    case 5:
                        qb0 qb0Var5 = new qb0();
                        n2Var.presentFragment(qb0Var5);
                        qb0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        qb0 qb0Var6 = new qb0();
                        n2Var.presentFragment(qb0Var6);
                        qb0Var6.V(1024);
                        break;
                    case 8:
                        qb0 qb0Var7 = new qb0();
                        n2Var.presentFragment(qb0Var7);
                        qb0Var7.V(2048);
                        break;
                    case 9:
                        qb0 qb0Var8 = new qb0();
                        n2Var.presentFragment(qb0Var8);
                        int i122 = 0;
                        while (true) {
                            ArrayList arrayList = qb0Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((kb0) arrayList.get(i122)).f == 1) {
                                qb0Var8.b.e1(new i2.s(qb0Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
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
                        sg.y0 y0Var = new sg.y0(n2Var2, 0, false);
                        y0Var.D();
                        n2Var2.showDialog(y0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.n2 n2Var3 = n2Var;
                        n2Var3.showDialog(org.telegram.ui.Components.f5.T(n2Var3, null));
                        break;
                    case 15:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        pf.d.r(n2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
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
                        sg.y0 y0Var2 = new sg.y0(n2Var4, 11, false);
                        y0Var2.D();
                        n2Var4.showDialog(y0Var2);
                        break;
                    case 24:
                        n2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        n2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        kx0 kx0Var = new kx0();
                        kx0Var.getMessagesController().getBlockedPeers(true);
                        n2Var.presentFragment(kx0Var);
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
        l01Var146.a("tg://settings/privacy-policy");
        return new l01[]{l01Var23, l01Var24, l01Var25, l01Var26, l01Var27, l01Var28, l01Var29, l01Var30, l01Var31, l01Var32, l01Var33, l01Var34, l01Var35, l01Var36, l01Var37, l01Var38, l01Var39, l01Var, l01Var41, l01Var42, l01Var2, l01Var44, l01Var45, l01Var46, l01Var47, l01Var48, l01Var49, l01Var50, l01Var51, l01Var52, l01Var3, l01Var4, l01Var54, l01Var55, l01Var56, l01Var57, l01Var58, l01Var59, l01Var60, l01Var61, l01Var62, l01Var63, l01Var64, l01Var65, l01Var66, l01Var67, l01Var68, l01Var69, l01Var70, l01Var71, l01Var72, l01Var73, l01Var74, l01Var75, l01Var76, l01Var77, l01Var78, l01Var79, l01Var80, l01Var81, l01Var82, l01Var83, l01Var84, l01Var85, l01Var86, l01Var87, l01Var88, l01Var89, l01Var90, l01Var91, l01Var92, l01Var93, l01Var94, l01Var95, l01Var96, l01Var97, l01Var98, l01Var99, l01Var100, l01Var101, l01Var102, l01Var103, l01Var104, l01Var105, l01Var106, l01Var107, l01Var108, l01Var109, l01Var110, l01Var111, l01Var112, l01Var6, l01Var114, l01Var7, l01Var116, l01Var8, l01Var118, l01Var119, l01Var120, l01Var121, l01Var5, l01Var9, l01Var10, l01Var11, l01Var12, l01Var13, l01Var14, l01Var15, l01Var16, l01Var123, l01Var17, l01Var18, l01Var19, l01Var20, l01Var21, l01Var124, l01Var125, l01Var126, l01Var127, l01Var128, l01Var129, l01Var130, l01Var131, l01Var132, l01Var133, l01Var134, l01Var135, l01Var22, l01Var136, l01Var137, l01Var138, l01Var139, l01Var140, l01Var141, l01Var142, l01Var43, l01Var144, l01Var145, l01Var146};
    }

    @Override // org.telegram.ui.Components.hm0
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
            if (obj2 instanceof l01) {
                ((l01) obj2).g = i10;
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
            jv0 jv0Var = new jv0(19, this, str);
            this.x = jv0Var;
            dispatchQueue.postRunnable(jv0Var, 300L);
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
        l01 l01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            l01[] l01VarArr = this.c;
            if (i10 >= l01VarArr.length) {
                break;
            }
            l01 l01Var2 = l01VarArr[i10];
            if (l01Var2 != null) {
                hashMap.put(Integer.valueOf(l01Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (l01Var = (l01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        l01Var.g = readInt32;
                        arrayList.add(l01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new jg0(this));
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
        org.telegram.ui.Cells.w6 w6Var = (org.telegram.ui.Cells.w6) view;
        if (this.w) {
            if (i10 >= this.r.size()) {
                int g10 = com.google.android.gms.internal.play_billing.k3.g(1, i10, this.r);
                w6Var.a((CharSequence) this.n.get(this.r.size() + g10), ((MessagesController.FaqSearchResult) this.s.get(g10)).path, true, g10 < this.r.size() - 1);
                return;
            } else {
                l01 l01Var = (l01) this.r.get(i10);
                l01 l01Var2 = i10 > 0 ? (l01) this.r.get(i10 - 1) : null;
                w6Var.b((CharSequence) this.n.get(i10), l01Var.d, (l01Var2 == null || l01Var2.e != l01Var.e) ? l01Var.e : 0, i10 < this.r.size() - 1);
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
            w6Var.a(faqSearchResult.title, faqSearchResult.path, true, g11 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof l01) {
            l01 l01Var3 = (l01) obj;
            w6Var.a(l01Var3.a, l01Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            w6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View l4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.l4(context, 16) : new org.telegram.ui.Cells.u3(context, null) : new org.telegram.ui.Cells.w6(context);
        l4Var.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.sl0(l4Var);
    }
}
