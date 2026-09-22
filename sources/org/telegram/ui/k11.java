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

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public class k11 extends org.telegram.ui.Components.kl0 {
    public TLRPC.WebPage E;
    public boolean F;
    public j11[] c;
    public final org.telegram.ui.ActionBar.n2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public iy0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public k11(Context context, org.telegram.ui.ActionBar.n2 n2Var) {
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

    public static j11[] H(final org.telegram.ui.ActionBar.n2 n2Var) {
        j11 j11Var;
        j11 j11Var2;
        j11 j11Var3;
        j11 j11Var4;
        j11 j11Var5;
        j11 j11Var6;
        j11 j11Var7;
        j11 j11Var8;
        j11 j11Var9;
        j11 j11Var10;
        j11 j11Var11;
        j11 j11Var12;
        j11 j11Var13;
        j11 j11Var14;
        j11 j11Var15;
        j11 j11Var16;
        j11 j11Var17;
        j11 j11Var18;
        j11 j11Var19;
        j11 j11Var20;
        j11 j11Var21;
        j11 j11Var22;
        final int currentAccount = n2Var.getCurrentAccount();
        j11 j11Var23 = new j11(LocaleController.getString(R.string.EditName), 500, 0, new iy0(10, n2Var, n2Var.getResourceProvider()));
        final int i10 = 24;
        j11 j11Var24 = new j11(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i11)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i11, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var24.a("tg://settings/edit/change-number");
        final int i11 = 6;
        j11 j11Var25 = new j11(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var25.a("tg://settings/edit/add-account");
        final int i12 = 17;
        final int i13 = 1;
        j11 j11Var26 = new j11(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var26.a("tg://settings/notifications");
        final int i14 = 29;
        j11 j11Var27 = new j11(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var27.a("tg://settings/notifications/private-chats");
        final int i15 = 11;
        j11 j11Var28 = new j11(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.i11
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
        j11Var28.a("tg://settings/notifications/groups");
        j11 j11Var29 = new j11(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new qi0(7, n2Var));
        j11Var29.a("tg://settings/notifications/channels");
        final int i16 = 19;
        j11 j11Var30 = new j11(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new qi0(i16, n2Var));
        j11 j11Var31 = new j11(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i17 = 13;
        j11 j11Var32 = new j11(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11 j11Var33 = new j11(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new qi0(23, n2Var));
        j11Var33.a("tg://settings/notifications/new-contacts");
        j11 j11Var34 = new j11(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var34.a("tg://settings/notifications/pinned-messages");
        j11 j11Var35 = new j11(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var35.a("tg://settings/notifications/reset");
        j11 j11Var36 = new j11(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11 j11Var37 = new j11(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11 j11Var38 = new j11(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11 j11Var39 = new j11(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var39.a("tg://settings/privacy");
        final int i20 = 21;
        j11 j11Var40 = new j11(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        j11 j11Var41 = new j11(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(a02.W(), null);
                            wbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.dc(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            wbVar.b.setText(spannableStringBuilder);
                            wbVar.b.setSingleLine(false);
                            wbVar.b.setMaxLines(2);
                            a02.b(wbVar, 2750).j();
                            break;
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        j11Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        j11 j11Var42 = new j11(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var42.a("tg://settings/privacy/passcode");
        j11 j11Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            j11Var = j11Var40;
            final int i23 = 25;
            j11Var2 = new j11(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.W(LiteMode.FLAGS_CHAT);
                            nc0Var.V(64);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(256);
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(32768);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.V(1024);
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(2048);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i112)).f == 1) {
                                    nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
            j11Var2.a("tg://settings/privacy/login-email");
        } else {
            j11Var = j11Var40;
            j11Var2 = null;
        }
        final int i24 = 26;
        j11 j11Var44 = new j11(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        j11 j11Var45 = new j11(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i25) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var45.a("tg://settings/devices");
        final int i26 = 28;
        j11 j11Var46 = new j11(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        j11 j11Var47 = new j11(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        j11 j11Var48 = new j11(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        j11 j11Var49 = new j11(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        j11 j11Var50 = new j11(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        j11 j11Var51 = new j11(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        j11 j11Var52 = new j11(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        j11 j11Var53 = new j11(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.g11
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
                            org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(n2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.wb wbVar = new org.telegram.ui.Components.wb(a02.W(), null);
                            wbVar.d(R.raw.voip_muted, new String[0]);
                            String string = LocaleController.getString(R.string.PrivacyVoiceMessagesPremiumOnly);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                            int indexOf = string.indexOf(42);
                            int lastIndexOf = string.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) string.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new ci.dc(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            wbVar.b.setText(spannableStringBuilder);
                            wbVar.b.setSingleLine(false);
                            wbVar.b.setMaxLines(2);
                            a02.b(wbVar, 2750).j();
                            break;
                        } else {
                            n2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        j11Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            j11Var3 = j11Var53;
            final int i34 = 7;
            j11Var4 = new j11(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                            n2Var.presentFragment(new zu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            j11Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            j11Var3 = j11Var53;
            j11Var4 = null;
        }
        final int i35 = 8;
        j11 j11Var54 = new j11(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        j11 j11Var55 = new j11(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        j11 j11Var56 = new j11(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        j11 j11Var57 = new j11(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        j11 j11Var58 = new j11(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        j11 j11Var59 = new j11(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        j11 j11Var60 = new j11(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        j11 j11Var61 = new j11(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        j11 j11Var62 = new j11(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var62.a("tg://settings/devices");
        final int i44 = 19;
        j11 j11Var63 = new j11(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        j11 j11Var64 = new j11(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        j11 j11Var65 = new j11(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        j11 j11Var66 = new j11(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        j11 j11Var67 = new j11(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        j11 j11Var68 = new j11(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        j11 j11Var69 = new j11(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        j11 j11Var70 = new j11(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        j11 j11Var71 = new j11(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.h11
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
                        n2Var.presentFragment(new zu(null));
                        break;
                    default:
                        n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        j11Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        j11 j11Var72 = new j11(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11 j11Var73 = new j11(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11 j11Var74 = new j11(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11 j11Var75 = new j11(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11 j11Var76 = new j11(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        j11 j11Var77 = new j11(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11 j11Var78 = new j11(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11 j11Var79 = new j11(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11 j11Var80 = new j11(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        j11 j11Var81 = new j11(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11 j11Var82 = new j11(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        j11 j11Var83 = new j11(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        j11 j11Var84 = new j11(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11 j11Var85 = new j11(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        j11 j11Var86 = new j11(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.i11
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
        j11Var86.a("tg://settings/data/save-to-photos/groups");
        j11 j11Var87 = new j11(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new qi0(2, n2Var));
        j11Var87.a("tg://settings/data/save-to-photos/channels");
        j11 j11Var88 = new j11(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new qi0(3, n2Var));
        j11Var88.a("tg://settings/appearance/themes");
        j11 j11Var89 = new j11(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(4, n2Var));
        j11Var89.a("tg://settings/appearance/text-size");
        j11 j11Var90 = new j11(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(5, n2Var));
        j11Var90.a("tg://settings/appearance/wallpapers");
        j11 j11Var91 = new j11(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new qi0(6, n2Var));
        j11 j11Var92 = new j11(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new qi0(8, n2Var));
        j11 j11Var93 = new j11(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(9, n2Var));
        j11 j11Var94 = new j11(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(10, n2Var));
        j11 j11Var95 = new j11(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new qi0(11, n2Var));
        j11Var95.a("tg://settings/appearance/themes/create");
        j11 j11Var96 = new j11(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(13, n2Var));
        j11Var96.a("tg://settings/appearance/message-corners");
        j11 j11Var97 = new j11(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(14, n2Var));
        j11 j11Var98 = new j11(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(15, n2Var));
        j11 j11Var99 = new j11(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(16, n2Var));
        j11Var99.a("tg://settings/appearance/app-icon");
        j11 j11Var100 = new j11(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(17, n2Var));
        j11 j11Var101 = new j11(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(18, n2Var));
        j11Var101.a("tg://settings/appearance/tap-for-next-media");
        j11 j11Var102 = new j11(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(20, n2Var));
        j11Var102.a("tg://settings/data/raise-to-listen");
        j11 j11Var103 = new j11(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(21, n2Var));
        j11Var103.a("tg://settings/data/raise-to-speak");
        j11 j11Var104 = new j11(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(22, n2Var));
        j11Var104.a("tg://settings/data/pause-music");
        j11 j11Var105 = new j11(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(24, n2Var));
        j11 j11Var106 = new j11(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(25, n2Var));
        j11 j11Var107 = new j11(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(26, n2Var));
        j11 j11Var108 = new j11(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new qi0(27, n2Var));
        j11 j11Var109 = new j11(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new qi0(28, n2Var));
        j11Var109.a("tg://settings/appearance/stickers-and-emoji");
        j11 j11Var110 = new j11(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new qi0(29, n2Var));
        final int i68 = 0;
        j11 j11Var111 = new j11(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        j11 j11Var112 = new j11(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        j11 j11Var113 = new j11(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        j11 j11Var114 = new j11(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        j11 j11Var115 = new j11(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        j11 j11Var116 = new j11(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        j11 j11Var117 = new j11(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        j11 j11Var118 = new j11(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        j11 j11Var119 = new j11(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        j11 j11Var120 = new j11(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        j11 j11Var121 = new j11(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var121.a("tg://settings/folders");
        final int i79 = 21;
        j11 j11Var122 = new j11(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            j11Var5 = j11Var122;
            j11Var6 = j11Var113;
            j11Var7 = j11Var115;
            j11Var8 = j11Var117;
            final int i80 = 2;
            j11Var9 = new j11(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i80) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.W(LiteMode.FLAGS_CHAT);
                            nc0Var.V(64);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(256);
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(32768);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.V(1024);
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(2048);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i112)).f == 1) {
                                    nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
            j11Var5 = j11Var122;
            j11Var6 = j11Var113;
            j11Var7 = j11Var115;
            j11Var8 = j11Var117;
            j11Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            j11Var10 = new j11(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i81) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.W(LiteMode.FLAGS_CHAT);
                            nc0Var.V(64);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(256);
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(32768);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.V(1024);
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(2048);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i112)).f == 1) {
                                    nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
            j11Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            j11Var11 = new j11(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.f11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.W(LiteMode.FLAGS_CHAT);
                            nc0Var.V(64);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(256);
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(32768);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.V(1024);
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(2048);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i112)).f == 1) {
                                    nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
            j11Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            j11Var12 = new j11(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.h11
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
                            n2Var.presentFragment(new zu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            j11Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            j11Var13 = new j11(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.h11
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
                            n2Var.presentFragment(new zu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            j11Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            j11Var14 = new j11(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.h11
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
                            n2Var.presentFragment(new zu(null));
                            break;
                        default:
                            n2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            j11Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            j11Var15 = new j11(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.i11
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
            j11Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            j11Var16 = new j11(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.i11
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
            j11Var16 = null;
        }
        j11 j11Var123 = F(currentAccount, 5) ? new j11(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new qi0(12, n2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            j11Var17 = new j11(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
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
                            n2Var.presentFragment(new nc0());
                            break;
                        case 19:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 20:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 23:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.W(LiteMode.FLAGS_CHAT);
                            nc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            j11Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            j11Var18 = new j11(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
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
                            n2Var.presentFragment(new nc0());
                            break;
                        case 19:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 20:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 23:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.W(LiteMode.FLAGS_CHAT);
                            nc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            j11Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            j11Var19 = new j11(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
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
                            n2Var.presentFragment(new nc0());
                            break;
                        case 19:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 20:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 23:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.W(LiteMode.FLAGS_CHAT);
                            nc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            j11Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            j11Var20 = new j11(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
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
                            n2Var.presentFragment(new nc0());
                            break;
                        case 19:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 20:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 23:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.W(LiteMode.FLAGS_CHAT);
                            nc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            j11Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            j11Var21 = new j11(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.e11
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
                            n2Var.presentFragment(new nc0());
                            break;
                        case 19:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.V(3);
                            break;
                        case 20:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(3);
                            nc0Var2.V(1);
                            break;
                        case 21:
                            n2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(3);
                            nc0Var3.V(2);
                            break;
                        case 23:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            nc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            nc0 nc0Var9 = new nc0();
                            n2Var.presentFragment(nc0Var9);
                            nc0Var9.W(LiteMode.FLAGS_CHAT);
                            nc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            j11Var21 = null;
        }
        final int i93 = 18;
        j11 j11Var124 = new j11(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        j11 j11Var125 = new j11(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        j11 j11Var126 = new j11(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        j11 j11Var127 = new j11(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        j11 j11Var128 = new j11(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        j11 j11Var129 = new j11(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        j11 j11Var130 = new j11(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        j11 j11Var131 = new j11(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        j11 j11Var132 = new j11(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        j11 j11Var133 = new j11(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.e11
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
                        n2Var.presentFragment(new nc0());
                        break;
                    case 19:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.V(3);
                        break;
                    case 20:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(3);
                        nc0Var2.V(1);
                        break;
                    case 21:
                        n2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(3);
                        nc0Var3.V(2);
                        break;
                    case 23:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        nc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        nc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        nc0 nc0Var9 = new nc0();
                        n2Var.presentFragment(nc0Var9);
                        nc0Var9.W(LiteMode.FLAGS_CHAT);
                        nc0Var9.V(32);
                        break;
                }
            }
        });
        j11Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        j11 j11Var134 = new j11(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11 j11Var135 = new j11(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
            j11Var22 = new j11(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i105) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.W(LiteMode.FLAGS_CHAT);
                            nc0Var.V(64);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(256);
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(32768);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.V(1024);
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(2048);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i112)).f == 1) {
                                    nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
            j11Var22 = null;
        }
        final int i106 = 4;
        j11 j11Var136 = new j11(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11 j11Var137 = new j11(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        j11 j11Var138 = new j11(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i108) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        j11 j11Var139 = new j11(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        j11 j11Var140 = new j11(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        j11 j11Var141 = new j11(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i112)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i112, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var141.a("tg://settings/language");
        final int i112 = 11;
        j11 j11Var142 = new j11(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i1122, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i113 = 12;
            j11 j11Var143 = new j11(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.f11
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i113) {
                        case 0:
                            nc0 nc0Var = new nc0();
                            n2Var.presentFragment(nc0Var);
                            nc0Var.W(LiteMode.FLAGS_CHAT);
                            nc0Var.V(64);
                            break;
                        case 1:
                            nc0 nc0Var2 = new nc0();
                            n2Var.presentFragment(nc0Var2);
                            nc0Var2.W(LiteMode.FLAGS_CHAT);
                            nc0Var2.V(128);
                            break;
                        case 2:
                            n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            nc0 nc0Var3 = new nc0();
                            n2Var.presentFragment(nc0Var3);
                            nc0Var3.W(LiteMode.FLAGS_CHAT);
                            nc0Var3.V(256);
                            break;
                        case 4:
                            nc0 nc0Var4 = new nc0();
                            n2Var.presentFragment(nc0Var4);
                            nc0Var4.W(LiteMode.FLAGS_CHAT);
                            nc0Var4.V(32768);
                            break;
                        case 5:
                            nc0 nc0Var5 = new nc0();
                            n2Var.presentFragment(nc0Var5);
                            nc0Var5.V(512);
                            break;
                        case 6:
                            n2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            nc0 nc0Var6 = new nc0();
                            n2Var.presentFragment(nc0Var6);
                            nc0Var6.V(1024);
                            break;
                        case 8:
                            nc0 nc0Var7 = new nc0();
                            n2Var.presentFragment(nc0Var7);
                            nc0Var7.V(2048);
                            break;
                        case 9:
                            nc0 nc0Var8 = new nc0();
                            n2Var.presentFragment(nc0Var8);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = nc0Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                    nc0Var8.b.e1(new i2.s(nc0Var8, i1122, 12), 700, true);
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
                            n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
            j11Var143.a("tg://settings/language/do-not-translate");
            j11Var43 = j11Var143;
        }
        final int i114 = 14;
        j11 j11Var144 = new j11(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i1122, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        j11 j11Var145 = new j11(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i1122, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var145.a("tg://settings/faq");
        final int i116 = 16;
        j11 j11Var146 = new j11(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.f11
            @Override // java.lang.Runnable
            public final void run() {
                switch (i116) {
                    case 0:
                        nc0 nc0Var = new nc0();
                        n2Var.presentFragment(nc0Var);
                        nc0Var.W(LiteMode.FLAGS_CHAT);
                        nc0Var.V(64);
                        break;
                    case 1:
                        nc0 nc0Var2 = new nc0();
                        n2Var.presentFragment(nc0Var2);
                        nc0Var2.W(LiteMode.FLAGS_CHAT);
                        nc0Var2.V(128);
                        break;
                    case 2:
                        n2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        nc0 nc0Var3 = new nc0();
                        n2Var.presentFragment(nc0Var3);
                        nc0Var3.W(LiteMode.FLAGS_CHAT);
                        nc0Var3.V(256);
                        break;
                    case 4:
                        nc0 nc0Var4 = new nc0();
                        n2Var.presentFragment(nc0Var4);
                        nc0Var4.W(LiteMode.FLAGS_CHAT);
                        nc0Var4.V(32768);
                        break;
                    case 5:
                        nc0 nc0Var5 = new nc0();
                        n2Var.presentFragment(nc0Var5);
                        nc0Var5.V(512);
                        break;
                    case 6:
                        n2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        nc0 nc0Var6 = new nc0();
                        n2Var.presentFragment(nc0Var6);
                        nc0Var6.V(1024);
                        break;
                    case 8:
                        nc0 nc0Var7 = new nc0();
                        n2Var.presentFragment(nc0Var7);
                        nc0Var7.V(2048);
                        break;
                    case 9:
                        nc0 nc0Var8 = new nc0();
                        n2Var.presentFragment(nc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = nc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((hc0) arrayList.get(i1122)).f == 1) {
                                nc0Var8.b.e1(new i2.s(nc0Var8, i1122, 12), 700, true);
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
                        n2Var3.showDialog(org.telegram.ui.Components.c5.U(n2Var3, null));
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
        j11Var146.a("tg://settings/privacy-policy");
        return new j11[]{j11Var23, j11Var24, j11Var25, j11Var26, j11Var27, j11Var28, j11Var29, j11Var30, j11Var31, j11Var32, j11Var33, j11Var34, j11Var35, j11Var36, j11Var37, j11Var38, j11Var39, j11Var, j11Var41, j11Var42, j11Var2, j11Var44, j11Var45, j11Var46, j11Var47, j11Var48, j11Var49, j11Var50, j11Var51, j11Var52, j11Var3, j11Var4, j11Var54, j11Var55, j11Var56, j11Var57, j11Var58, j11Var59, j11Var60, j11Var61, j11Var62, j11Var63, j11Var64, j11Var65, j11Var66, j11Var67, j11Var68, j11Var69, j11Var70, j11Var71, j11Var72, j11Var73, j11Var74, j11Var75, j11Var76, j11Var77, j11Var78, j11Var79, j11Var80, j11Var81, j11Var82, j11Var83, j11Var84, j11Var85, j11Var86, j11Var87, j11Var88, j11Var89, j11Var90, j11Var91, j11Var92, j11Var93, j11Var94, j11Var95, j11Var96, j11Var97, j11Var98, j11Var99, j11Var100, j11Var101, j11Var102, j11Var103, j11Var104, j11Var105, j11Var106, j11Var107, j11Var108, j11Var109, j11Var110, j11Var111, j11Var112, j11Var6, j11Var114, j11Var7, j11Var116, j11Var8, j11Var118, j11Var119, j11Var120, j11Var121, j11Var5, j11Var9, j11Var10, j11Var11, j11Var12, j11Var13, j11Var14, j11Var15, j11Var16, j11Var123, j11Var17, j11Var18, j11Var19, j11Var20, j11Var21, j11Var124, j11Var125, j11Var126, j11Var127, j11Var128, j11Var129, j11Var130, j11Var131, j11Var132, j11Var133, j11Var134, j11Var135, j11Var22, j11Var136, j11Var137, j11Var138, j11Var139, j11Var140, j11Var141, j11Var142, j11Var43, j11Var144, j11Var145, j11Var146};
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
            a4.a.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof j11) {
                ((j11) obj2).g = i10;
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
            iy0 iy0Var = new iy0(11, this, str);
            this.x = iy0Var;
            dispatchQueue.postRunnable(iy0Var, 300L);
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
        j11 j11Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            j11[] j11VarArr = this.c;
            if (i10 >= j11VarArr.length) {
                break;
            }
            j11 j11Var2 = j11VarArr[i10];
            if (j11Var2 != null) {
                hashMap.put(Integer.valueOf(j11Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (j11Var = (j11) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        j11Var.g = readInt32;
                        arrayList.add(j11Var);
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
                j11 j11Var = (j11) this.r.get(i10);
                j11 j11Var2 = i10 > 0 ? (j11) this.r.get(i10 - 1) : null;
                x6Var.b((CharSequence) this.n.get(i10), j11Var.d, (j11Var2 == null || j11Var2.e != j11Var.e) ? j11Var.e : 0, i10 < this.r.size() - 1);
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
        if (obj instanceof j11) {
            j11 j11Var3 = (j11) obj;
            x6Var.a(j11Var3.a, j11Var3.d, false, i10 < arrayList.size() - 1);
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
        return new org.telegram.ui.Components.vk0(m4Var);
    }
}
