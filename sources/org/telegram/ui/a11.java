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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public class a11 extends org.telegram.ui.Components.vl0 {
    public TLRPC.WebPage E;
    public boolean F;
    public z01[] c;
    public final org.telegram.ui.ActionBar.m2 e;
    public final int f;
    public final Context h;
    public boolean w;
    public jx0 x;
    public String y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList v = new ArrayList();

    public a11(Context context, org.telegram.ui.ActionBar.m2 m2Var) {
        this.e = m2Var;
        this.f = m2Var.getCurrentAccount();
        this.h = context;
        this.c = H(m2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (!MessagesController.getInstance(i10).premiumFeaturesBlocked() || UserConfig.getInstance(i10).isPremium()) {
            return i11 == -1 || MessagesController.getInstance(i10).premiumFeaturesTypesToPosition.get(i11, -1) != -1;
        }
        return false;
    }

    public static z01[] H(final org.telegram.ui.ActionBar.m2 m2Var) {
        z01 z01Var;
        z01 z01Var2;
        z01 z01Var3;
        z01 z01Var4;
        z01 z01Var5;
        z01 z01Var6;
        z01 z01Var7;
        z01 z01Var8;
        z01 z01Var9;
        z01 z01Var10;
        z01 z01Var11;
        z01 z01Var12;
        z01 z01Var13;
        z01 z01Var14;
        z01 z01Var15;
        z01 z01Var16;
        z01 z01Var17;
        z01 z01Var18;
        z01 z01Var19;
        z01 z01Var20;
        z01 z01Var21;
        z01 z01Var22;
        final int currentAccount = m2Var.getCurrentAccount();
        z01 z01Var23 = new z01(LocaleController.getString(R.string.EditName), 500, 0, new jx0(15, m2Var, m2Var.getResourceProvider()));
        final int i10 = 24;
        z01 z01Var24 = new z01(LocaleController.getString(R.string.ChangePhoneNumber), 501, 0, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i11 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i11 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i11)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i11, 13), 700, true);
                                break;
                            } else {
                                i11++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var24.a("tg://settings/edit/change-number");
        final int i11 = 6;
        z01 z01Var25 = new z01(LocaleController.getString(R.string.AddAnotherAccount), 502, 0, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i12));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var25.a("tg://settings/edit/add-account");
        final int i12 = 17;
        final int i13 = 1;
        z01 z01Var26 = new z01(LocaleController.getString(R.string.NotificationsAndSounds), 1, R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var26.a("tg://settings/notifications");
        final int i14 = 29;
        z01 z01Var27 = new z01(2, LocaleController.getString(R.string.NotificationsPrivateChats), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var27.a("tg://settings/notifications/private-chats");
        final int i15 = 11;
        z01 z01Var28 = new z01(3, LocaleController.getString(R.string.NotificationsGroups), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        z01Var28.a("tg://settings/notifications/groups");
        z01 z01Var29 = new z01(4, LocaleController.getString(R.string.NotificationsChannels), LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ki0(7, m2Var));
        z01Var29.a("tg://settings/notifications/channels");
        final int i16 = 19;
        z01 z01Var30 = new z01(5, LocaleController.getString(R.string.VoipNotificationSettings), "callsSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ki0(i16, m2Var));
        z01 z01Var31 = new z01(6, LocaleController.getString(R.string.BadgeNumber), "badgeNumberSection", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i17 = 13;
        z01 z01Var32 = new z01(7, LocaleController.getString(R.string.InAppNotifications), "inappSectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01 z01Var33 = new z01(8, LocaleController.getString(R.string.ContactJoined), "contactJoinedRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new ki0(23, m2Var));
        z01Var33.a("tg://settings/notifications/new-contacts");
        z01 z01Var34 = new z01(9, LocaleController.getString(R.string.PinnedMessages), "pinnedMessageRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var34.a("tg://settings/notifications/pinned-messages");
        z01 z01Var35 = new z01(10, LocaleController.getString(R.string.ResetAllNotifications), "resetNotificationsRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var35.a("tg://settings/notifications/reset");
        z01 z01Var36 = new z01(11, LocaleController.getString(R.string.NotificationsService), "notificationsServiceRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i18 = 18;
        z01 z01Var37 = new z01(12, LocaleController.getString(R.string.NotificationsServiceConnection), "notificationsServiceConnectionRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01 z01Var38 = new z01(13, LocaleController.getString(R.string.RepeatNotifications), "repeatRow", LocaleController.getString(R.string.NotificationsAndSounds), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i19 = 20;
        z01 z01Var39 = new z01(LocaleController.getString(R.string.PrivacySettings), 100, R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i19) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var39.a("tg://settings/privacy");
        final int i20 = 21;
        z01 z01Var40 = new z01(109, LocaleController.getString(R.string.TwoStepVerification), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i20) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        z01 z01Var41 = new z01(124, LocaleController.getString(R.string.AutoDeleteMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i21) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            m2Var.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(m2Var2);
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
                            m2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        z01Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        z01 z01Var42 = new z01(108, LocaleController.getString(R.string.Passcode), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i22) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var42.a("tg://settings/privacy/passcode");
        z01 z01Var43 = null;
        if (SharedConfig.hasEmailLogin) {
            z01Var = z01Var40;
            final int i23 = 25;
            z01Var2 = new z01(125, LocaleController.getString(R.string.EmailLogin), "emailLoginRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.v01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i23) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(LiteMode.FLAGS_CHAT);
                            hc0Var.V(64);
                            break;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(LiteMode.FLAGS_CHAT);
                            hc0Var2.V(128);
                            break;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(LiteMode.FLAGS_CHAT);
                            hc0Var3.V(256);
                            break;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(LiteMode.FLAGS_CHAT);
                            hc0Var4.V(32768);
                            break;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            break;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            break;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            break;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((bc0) arrayList.get(i112)).f == 1) {
                                    hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            break;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
                            break;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            z01Var2.a("tg://settings/privacy/login-email");
        } else {
            z01Var = z01Var40;
            z01Var2 = null;
        }
        final int i24 = 26;
        z01 z01Var44 = new z01(101, LocaleController.getString(R.string.BlockedUsers), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i24) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        z01 z01Var45 = new z01(LocaleController.getString(R.string.SessionsTitle), 110, R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i25) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var45.a("tg://settings/devices");
        final int i26 = 28;
        z01 z01Var46 = new z01(105, LocaleController.getString(R.string.PrivacyPhone), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i26) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        z01 z01Var47 = new z01(102, LocaleController.getString(R.string.PrivacyLastSeen), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        z01 z01Var48 = new z01(103, LocaleController.getString(R.string.PrivacyProfilePhoto), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        z01 z01Var49 = new z01(104, LocaleController.getString(R.string.PrivacyForwards), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        z01 z01Var50 = new z01(122, LocaleController.getString(R.string.PrivacyP2P), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        z01 z01Var51 = new z01(106, LocaleController.getString(R.string.Calls), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        z01 z01Var52 = new z01(107, LocaleController.getString(R.string.PrivacyInvites), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        z01 z01Var53 = new z01(123, LocaleController.getString(R.string.PrivacyVoiceMessages), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.w01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i33) {
                    case 0:
                        if (UserConfig.getInstance(currentAccount).getGlobalTTl() >= 0) {
                            m2Var.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        boolean isPremium = UserConfig.getInstance(currentAccount).isPremium();
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        if (!isPremium) {
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(m2Var2);
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
                            m2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        z01Var53.a("tg://settings/privacy/voice");
        if (MessagesController.getInstance(currentAccount).autoarchiveAvailable) {
            z01Var3 = z01Var53;
            final int i34 = 7;
            z01Var4 = new z01(121, LocaleController.getString(R.string.ArchiveAndMute), "newChatsRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i34) {
                        case 0:
                            m2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            m2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            m2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            m2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                m2Var.presentFragment(new qg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            m2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            m2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            m2Var.presentFragment(new z6());
                            break;
                        case 24:
                            m2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            m2Var.presentFragment(new z6());
                            break;
                        case 27:
                            m2Var.presentFragment(new z6());
                            break;
                        case 28:
                            m2Var.presentFragment(new vu(null));
                            break;
                        default:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            z01Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            z01Var3 = z01Var53;
            z01Var4 = null;
        }
        final int i35 = 8;
        z01 z01Var54 = new z01(112, LocaleController.getString(R.string.DeleteAccountIfAwayFor2), "deleteAccountRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        z01 z01Var55 = new z01(113, LocaleController.getString(R.string.PrivacyPaymentsClear), "paymentsClearRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        z01 z01Var56 = new z01(114, LocaleController.getString(R.string.WebSessionsTitle), LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        z01 z01Var57 = new z01(115, LocaleController.getString(R.string.SyncContactsDelete), "contactsDeleteRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        z01 z01Var58 = new z01(116, LocaleController.getString(R.string.SyncContacts), "contactsSyncRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        z01 z01Var59 = new z01(117, LocaleController.getString(R.string.SuggestContacts), "contactsSuggestRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        z01 z01Var60 = new z01(118, LocaleController.getString(R.string.MapPreviewProvider), "secretMapRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        z01 z01Var61 = new z01(119, LocaleController.getString(R.string.SecretWebPage), "secretWebpageRow", LocaleController.getString(R.string.PrivacySettings), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        z01 z01Var62 = new z01(LocaleController.getString(R.string.Devices), 120, R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var62.a("tg://settings/devices");
        final int i44 = 19;
        z01 z01Var63 = new z01(121, LocaleController.getString(R.string.TerminateAllSessions), "terminateAllSessionsRow", LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        z01 z01Var64 = new z01(122, LocaleController.getString(R.string.LinkDesktopDevice), LocaleController.getString(R.string.Devices), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        z01 z01Var65 = new z01(LocaleController.getString(R.string.DataSettings), 200, R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        z01 z01Var66 = new z01(201, LocaleController.getString(R.string.DataUsage), "usageSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        z01 z01Var67 = new z01(202, LocaleController.getString(R.string.StorageUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        z01 z01Var68 = new z01(VoIPService.ID_INCOMING_CALL_PRENOTIFICATION, LocaleController.getString(R.string.KeepMedia), "keepMediaRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        z01 z01Var69 = new z01(204, LocaleController.getString(R.string.ClearMediaCache), "cacheRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        z01 z01Var70 = new z01(205, LocaleController.getString(R.string.LocalDatabase), "databaseRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.StorageUsage), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        z01 z01Var71 = new z01(206, LocaleController.getString(R.string.NetworkUsage), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.x01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        m2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        m2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        m2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        m2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                            m2Var.presentFragment(new qg0(i122));
                            break;
                        }
                        break;
                    case 7:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        m2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        m2Var.presentFragment(new z6());
                        break;
                    case 24:
                        m2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 26:
                        m2Var.presentFragment(new z6());
                        break;
                    case 27:
                        m2Var.presentFragment(new z6());
                        break;
                    case 28:
                        m2Var.presentFragment(new vu(null));
                        break;
                    default:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        z01Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        z01 z01Var72 = new z01(207, LocaleController.getString(R.string.AutomaticMediaDownload), "mediaDownloadSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i54 = 1;
        z01 z01Var73 = new z01(208, LocaleController.getString(R.string.WhenUsingMobileData), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i55 = 2;
        z01 z01Var74 = new z01(209, LocaleController.getString(R.string.WhenConnectedOnWiFi), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        z01 z01Var75 = new z01(210, LocaleController.getString(R.string.WhenRoaming), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        z01 z01Var76 = new z01(211, LocaleController.getString(R.string.ResetAutomaticMediaDownload), "resetDownloadRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        z01Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        z01 z01Var77 = new z01(215, LocaleController.getString(R.string.Streaming), "streamSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i59 = 7;
        z01 z01Var78 = new z01(216, LocaleController.getString(R.string.EnableStreaming), "enableStreamRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i60 = 8;
        z01 z01Var79 = new z01(217, LocaleController.getString(R.string.Calls), "callsSectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        z01 z01Var80 = new z01(218, LocaleController.getString(R.string.VoipUseLessData), "useLessDataForCallsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        z01Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        z01 z01Var81 = new z01(219, LocaleController.getString(R.string.VoipQuickReplies), "quickRepliesRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i63 = 12;
        z01 z01Var82 = new z01(220, LocaleController.getString(R.string.ProxySettings), LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        z01Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        z01 z01Var83 = new z01(111, LocaleController.getString(R.string.PrivacyDeleteCloudDrafts), "clearDraftsRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        z01Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        z01 z01Var84 = new z01(222, LocaleController.getString(R.string.SaveToGallery), "saveToGallerySectionRow", LocaleController.getString(R.string.DataSettings), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        final int i66 = 15;
        z01 z01Var85 = new z01(223, LocaleController.getString(R.string.SaveToGalleryPrivate), "saveToGalleryPeerRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        z01Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        z01 z01Var86 = new z01(224, LocaleController.getString(R.string.SaveToGalleryGroups), "saveToGalleryGroupsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.y01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        m2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        m2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        m2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 7:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        m2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        m2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                }
            }
        });
        z01Var86.a("tg://settings/data/save-to-photos/groups");
        z01 z01Var87 = new z01(225, LocaleController.getString(R.string.SaveToGalleryChannels), "saveToGalleryChannelsRow", LocaleController.getString(R.string.DataSettings), LocaleController.getString(R.string.SaveToGallery), R.drawable.msg2_data, new ki0(2, m2Var));
        z01Var87.a("tg://settings/data/save-to-photos/channels");
        z01 z01Var88 = new z01(LocaleController.getString(R.string.ChatSettings), 300, R.drawable.msg2_discussion, new ki0(3, m2Var));
        z01Var88.a("tg://settings/appearance/themes");
        z01 z01Var89 = new z01(301, LocaleController.getString(R.string.TextSizeHeader), "textSizeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(4, m2Var));
        z01Var89.a("tg://settings/appearance/text-size");
        z01 z01Var90 = new z01(302, LocaleController.getString(R.string.ChangeChatBackground), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(5, m2Var));
        z01Var90.a("tg://settings/appearance/wallpapers");
        z01 z01Var91 = new z01(303, LocaleController.getString(R.string.SetColor), null, LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ki0(6, m2Var));
        z01 z01Var92 = new z01(304, LocaleController.getString(R.string.ResetChatBackgrounds), "resetRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.ChatBackground), R.drawable.msg2_discussion, new ki0(8, m2Var));
        z01 z01Var93 = new z01(306, LocaleController.getString(R.string.ColorTheme), "themeHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(9, m2Var));
        z01 z01Var94 = new z01(319, LocaleController.getString(R.string.BrowseThemes), null, LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(10, m2Var));
        z01 z01Var95 = new z01(320, LocaleController.getString(R.string.CreateNewTheme), "createNewThemeRow", LocaleController.getString(R.string.ChatSettings), LocaleController.getString(R.string.BrowseThemes), R.drawable.msg2_discussion, new ki0(11, m2Var));
        z01Var95.a("tg://settings/appearance/themes/create");
        z01 z01Var96 = new z01(321, LocaleController.getString(R.string.BubbleRadius), "bubbleRadiusHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(13, m2Var));
        z01Var96.a("tg://settings/appearance/message-corners");
        z01 z01Var97 = new z01(322, LocaleController.getString(R.string.ChatList), "chatListHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(14, m2Var));
        z01 z01Var98 = new z01(323, LocaleController.getString(R.string.ChatListSwipeGesture), "swipeGestureHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(15, m2Var));
        z01 z01Var99 = new z01(324, LocaleController.getString(R.string.AppIcon), "appIconHeaderRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(16, m2Var));
        z01Var99.a("tg://settings/appearance/app-icon");
        z01 z01Var100 = new z01(305, LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(17, m2Var));
        z01 z01Var101 = new z01(328, LocaleController.getString(R.string.NextMediaTap), "nextMediaTapRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(18, m2Var));
        z01Var101.a("tg://settings/appearance/tap-for-next-media");
        z01 z01Var102 = new z01(327, LocaleController.getString(R.string.RaiseToListen), "raiseToListenRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(20, m2Var));
        z01Var102.a("tg://settings/data/raise-to-listen");
        z01 z01Var103 = new z01(310, LocaleController.getString(R.string.RaiseToSpeak), "raiseToSpeakRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(21, m2Var));
        z01Var103.a("tg://settings/data/raise-to-speak");
        z01 z01Var104 = new z01(326, LocaleController.getString(R.string.PauseMusicOnMedia), "pauseOnMediaRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(22, m2Var));
        z01Var104.a("tg://settings/data/pause-music");
        z01 z01Var105 = new z01(325, LocaleController.getString(R.string.MicrophoneForVoiceMessages), "bluetoothScoRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(24, m2Var));
        z01 z01Var106 = new z01(308, LocaleController.getString(R.string.DirectShare), "directShareRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(25, m2Var));
        z01 z01Var107 = new z01(311, LocaleController.getString(R.string.SendByEnter), "sendByEnterRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(26, m2Var));
        z01 z01Var108 = new z01(318, LocaleController.getString(R.string.DistanceUnits), "distanceRow", LocaleController.getString(R.string.ChatSettings), R.drawable.msg2_discussion, new ki0(27, m2Var));
        z01 z01Var109 = new z01(LocaleController.getString(R.string.StickersName), 600, R.drawable.msg2_sticker, new ki0(28, m2Var));
        z01Var109.a("tg://settings/appearance/stickers-and-emoji");
        z01 z01Var110 = new z01(601, LocaleController.getString(R.string.SuggestStickers), "suggestRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new ki0(29, m2Var));
        final int i68 = 0;
        z01 z01Var111 = new z01(602, LocaleController.getString(R.string.FeaturedStickers), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        z01 z01Var112 = new z01(603, LocaleController.getString(R.string.Masks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        z01 z01Var113 = new z01(604, LocaleController.getString(R.string.ArchivedStickers), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        z01 z01Var114 = new z01(605, LocaleController.getString(R.string.ArchivedMasks), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        z01 z01Var115 = new z01(606, LocaleController.getString(R.string.LargeEmoji), "largeEmojiRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        z01 z01Var116 = new z01(607, LocaleController.getString(R.string.LoopAnimatedStickers), "loopRow", LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        z01 z01Var117 = new z01(608, LocaleController.getString(R.string.Emoji), null, LocaleController.getString(R.string.StickersName), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        z01 z01Var118 = new z01(609, LocaleController.getString(R.string.SuggestAnimatedEmoji), "suggestAnimatedEmojiRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        z01 z01Var119 = new z01(610, LocaleController.getString(R.string.FeaturedEmojiPacks), "featuredStickersHeaderRow", LocaleController.getString(R.string.StickersName), LocaleController.getString(R.string.Emoji), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        z01 z01Var120 = new z01(611, LocaleController.getString(R.string.DoubleTapSetting), null, LocaleController.getString(R.string.StickersName), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        z01 z01Var121 = new z01(700, LocaleController.getString(R.string.Filters), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var121.a("tg://settings/folders");
        final int i79 = 21;
        z01 z01Var122 = new z01(701, LocaleController.getString(R.string.CreateNewFilter), "createFilterRow", LocaleController.getString(R.string.Filters), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            z01Var5 = z01Var122;
            z01Var6 = z01Var113;
            z01Var7 = z01Var115;
            z01Var8 = z01Var117;
            final int i80 = 2;
            z01Var9 = new z01(LocaleController.getString(R.string.TelegramPremium), 800, R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.v01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i80) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(LiteMode.FLAGS_CHAT);
                            hc0Var.V(64);
                            break;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(LiteMode.FLAGS_CHAT);
                            hc0Var2.V(128);
                            break;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(LiteMode.FLAGS_CHAT);
                            hc0Var3.V(256);
                            break;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(LiteMode.FLAGS_CHAT);
                            hc0Var4.V(32768);
                            break;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            break;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            break;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            break;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((bc0) arrayList.get(i112)).f == 1) {
                                    hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            break;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
                            break;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            z01Var5 = z01Var122;
            z01Var6 = z01Var113;
            z01Var7 = z01Var115;
            z01Var8 = z01Var117;
            z01Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            z01Var10 = new z01(801, LocaleController.getString(R.string.PremiumPreviewLimits), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.v01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i81) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(LiteMode.FLAGS_CHAT);
                            hc0Var.V(64);
                            break;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(LiteMode.FLAGS_CHAT);
                            hc0Var2.V(128);
                            break;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(LiteMode.FLAGS_CHAT);
                            hc0Var3.V(256);
                            break;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(LiteMode.FLAGS_CHAT);
                            hc0Var4.V(32768);
                            break;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            break;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            break;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            break;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((bc0) arrayList.get(i112)).f == 1) {
                                    hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            break;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
                            break;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            z01Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            z01Var11 = new z01(802, LocaleController.getString(R.string.PremiumPreviewEmoji), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.v01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(LiteMode.FLAGS_CHAT);
                            hc0Var.V(64);
                            break;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(LiteMode.FLAGS_CHAT);
                            hc0Var2.V(128);
                            break;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(LiteMode.FLAGS_CHAT);
                            hc0Var3.V(256);
                            break;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(LiteMode.FLAGS_CHAT);
                            hc0Var4.V(32768);
                            break;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            break;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            break;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            break;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((bc0) arrayList.get(i112)).f == 1) {
                                    hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            break;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
                            break;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            z01Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            z01Var12 = new z01(803, LocaleController.getString(R.string.PremiumPreviewUploads), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            m2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            m2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            m2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            m2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                m2Var.presentFragment(new qg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            m2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            m2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            m2Var.presentFragment(new z6());
                            break;
                        case 24:
                            m2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            m2Var.presentFragment(new z6());
                            break;
                        case 27:
                            m2Var.presentFragment(new z6());
                            break;
                        case 28:
                            m2Var.presentFragment(new vu(null));
                            break;
                        default:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            z01Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            z01Var13 = new z01(804, LocaleController.getString(R.string.PremiumPreviewDownloadSpeed), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            m2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            m2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            m2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            m2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                m2Var.presentFragment(new qg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            m2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            m2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            m2Var.presentFragment(new z6());
                            break;
                        case 24:
                            m2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            m2Var.presentFragment(new z6());
                            break;
                        case 27:
                            m2Var.presentFragment(new z6());
                            break;
                        case 28:
                            m2Var.presentFragment(new vu(null));
                            break;
                        default:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            z01Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            z01Var14 = new z01(805, LocaleController.getString(R.string.PremiumPreviewVoiceToText), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.x01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            m2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            m2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            m2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            m2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 1, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            m2Var.presentFragment(new PrivacyControlActivity(1, true));
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
                                m2Var.presentFragment(new qg0(i122));
                                break;
                            }
                            break;
                        case 7:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            m2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 2, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            m2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            m2Var.presentFragment(new z6());
                            break;
                        case 24:
                            m2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 8, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            break;
                        case 26:
                            m2Var.presentFragment(new z6());
                            break;
                        case 27:
                            m2Var.presentFragment(new z6());
                            break;
                        case 28:
                            m2Var.presentFragment(new vu(null));
                            break;
                        default:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            z01Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            z01Var15 = new z01(806, LocaleController.getString(R.string.PremiumPreviewNoAds), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.y01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            m2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            m2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            m2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 7:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            m2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                    }
                }
            });
        } else {
            z01Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            z01Var16 = new z01(807, LocaleController.getString(R.string.PremiumPreviewReactions), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.y01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            m2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            m2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            m2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 3, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 7:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            m2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            m2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            m2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 4, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                    }
                }
            });
        } else {
            z01Var16 = null;
        }
        z01 z01Var123 = F(currentAccount, 5) ? new z01(808, LocaleController.getString(R.string.PremiumPreviewStickers), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new ki0(12, m2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            z01Var17 = new z01(809, LocaleController.getString(R.string.PremiumPreviewAdvancedChatManagement), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.u01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            m2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            m2Var.presentFragment(new q(1));
                            break;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            m2Var.presentFragment(new d31());
                            break;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            break;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            break;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            break;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            break;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(LiteMode.FLAGS_CHAT);
                            hc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            z01Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            z01Var18 = new z01(810, LocaleController.getString(R.string.PremiumPreviewProfileBadge), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.u01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            m2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            m2Var.presentFragment(new q(1));
                            break;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            m2Var.presentFragment(new d31());
                            break;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            break;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            break;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            break;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            break;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(LiteMode.FLAGS_CHAT);
                            hc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            z01Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            z01Var19 = new z01(811, LocaleController.getString(R.string.PremiumPreviewAnimatedProfiles), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.u01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            m2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            m2Var.presentFragment(new q(1));
                            break;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            m2Var.presentFragment(new d31());
                            break;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            break;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            break;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            break;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            break;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(LiteMode.FLAGS_CHAT);
                            hc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            z01Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            z01Var20 = new z01(812, LocaleController.getString(R.string.PremiumPreviewAppIcon), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.u01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            m2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            m2Var.presentFragment(new q(1));
                            break;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            m2Var.presentFragment(new d31());
                            break;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            break;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            break;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            break;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            break;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(LiteMode.FLAGS_CHAT);
                            hc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            z01Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            z01Var21 = new z01(813, LocaleController.getString(R.string.PremiumPreviewEmojiStatus), LocaleController.getString(R.string.TelegramPremium), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.u01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            m2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            m2Var.presentFragment(new q(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 5:
                            m2Var.presentFragment(new q(1));
                            break;
                        case 6:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            m2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            m2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            m2Var.presentFragment(new d31());
                            break;
                        case 12:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                            x0Var2.B();
                            m2Var3.showDialog(x0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                            x0Var3.B();
                            m2Var4.showDialog(x0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                            rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                            x0Var4.B();
                            m2Var5.showDialog(x0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                            rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                            x0Var5.B();
                            m2Var6.showDialog(x0Var5);
                            break;
                        case 18:
                            m2Var.presentFragment(new hc0());
                            break;
                        case 19:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.V(3);
                            break;
                        case 20:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(3);
                            hc0Var2.V(1);
                            break;
                        case 21:
                            m2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(3);
                            hc0Var3.V(2);
                            break;
                        case 23:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                            break;
                        case 24:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                            break;
                        case 26:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                            break;
                        case 27:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                            hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                            break;
                        case 28:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            hc0Var8.V(LiteMode.FLAGS_CHAT);
                            break;
                        default:
                            hc0 hc0Var9 = new hc0();
                            m2Var.presentFragment(hc0Var9);
                            hc0Var9.W(LiteMode.FLAGS_CHAT);
                            hc0Var9.V(32);
                            break;
                    }
                }
            });
        } else {
            z01Var21 = null;
        }
        final int i93 = 18;
        z01 z01Var124 = new z01(RichMessageLayout.PART_MAX_HEIGHT_DP, LocaleController.getString(R.string.PowerUsage), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i93) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        z01 z01Var125 = new z01(901, LocaleController.getString(R.string.LiteOptionsStickers), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i94) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        z01 z01Var126 = new z01(902, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        z01 z01Var127 = new z01(903, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsStickers), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        z01 z01Var128 = new z01(904, LocaleController.getString(R.string.LiteOptionsEmoji), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        z01 z01Var129 = new z01(905, LocaleController.getString(R.string.LiteOptionsAutoplayKeyboard), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        z01 z01Var130 = new z01(906, LocaleController.getString(R.string.LiteOptionsAutoplayReactions), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        z01 z01Var131 = new z01(907, LocaleController.getString(R.string.LiteOptionsAutoplayChat), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsEmoji), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        z01 z01Var132 = new z01(908, LocaleController.getString(R.string.LiteOptionsChat), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        z01 z01Var133 = new z01(909, LocaleController.getString(R.string.LiteOptionsBackground), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.u01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        m2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        m2Var.presentFragment(new q(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 9, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 5:
                        m2Var.presentFragment(new q(1));
                        break;
                    case 6:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        m2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        m2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        m2Var.presentFragment(new d31());
                        break;
                    case 12:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var3, 6, false);
                        x0Var2.B();
                        m2Var3.showDialog(x0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var3 = new rg.x0(m2Var4, 7, false);
                        x0Var3.B();
                        m2Var4.showDialog(x0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.m2 m2Var5 = m2Var;
                        rg.x0 x0Var4 = new rg.x0(m2Var5, 10, false);
                        x0Var4.B();
                        m2Var5.showDialog(x0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.m2 m2Var6 = m2Var;
                        rg.x0 x0Var5 = new rg.x0(m2Var6, 12, false);
                        x0Var5.B();
                        m2Var6.showDialog(x0Var5);
                        break;
                    case 18:
                        m2Var.presentFragment(new hc0());
                        break;
                    case 19:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.V(3);
                        break;
                    case 20:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(3);
                        hc0Var2.V(1);
                        break;
                    case 21:
                        m2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(3);
                        hc0Var3.V(2);
                        break;
                    case 23:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.V(LiteMode.FLAGS_ANIMATED_EMOJI);
                        break;
                    case 24:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var5.V(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD);
                        break;
                    case 26:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var6.V(LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS);
                        break;
                    case 27:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.W(LiteMode.FLAGS_ANIMATED_EMOJI);
                        hc0Var7.V(LiteMode.FLAG_ANIMATED_EMOJI_CHAT);
                        break;
                    case 28:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        hc0Var8.V(LiteMode.FLAGS_CHAT);
                        break;
                    default:
                        hc0 hc0Var9 = new hc0();
                        m2Var.presentFragment(hc0Var9);
                        hc0Var9.W(LiteMode.FLAGS_CHAT);
                        hc0Var9.V(32);
                        break;
                }
            }
        });
        z01Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        z01 z01Var134 = new z01(910, LocaleController.getString(R.string.LiteOptionsTopics), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i103) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i104 = 1;
        z01 z01Var135 = new z01(911, LocaleController.getString(R.string.LiteOptionsSpoiler), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i104) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        if (SharedConfig.getDevicePerformanceClass() >= 1) {
            final int i105 = 3;
            z01Var22 = new z01(326, LocaleController.getString(R.string.LiteOptionsBlur2), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.v01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i105) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(LiteMode.FLAGS_CHAT);
                            hc0Var.V(64);
                            break;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(LiteMode.FLAGS_CHAT);
                            hc0Var2.V(128);
                            break;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(LiteMode.FLAGS_CHAT);
                            hc0Var3.V(256);
                            break;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(LiteMode.FLAGS_CHAT);
                            hc0Var4.V(32768);
                            break;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            break;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            break;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            break;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i112 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.s;
                                if (i112 >= arrayList.size()) {
                                    break;
                                } else if (((bc0) arrayList.get(i112)).f == 1) {
                                    hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                    break;
                                } else {
                                    i112++;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            break;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
                            break;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            z01Var22 = null;
        }
        final int i106 = 4;
        z01 z01Var136 = new z01(912, LocaleController.getString(R.string.LiteOptionsScale), null, LocaleController.getString(R.string.PowerUsage), LocaleController.getString(R.string.LiteOptionsChat), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i106) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i107 = 5;
        z01 z01Var137 = new z01(913, LocaleController.getString(R.string.LiteOptionsCalls), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i107) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        z01 z01Var138 = new z01(214, LocaleController.getString(R.string.LiteOptionsAutoplayVideo), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i108) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        z01 z01Var139 = new z01(213, LocaleController.getString(R.string.LiteOptionsAutoplayGifs), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i109) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        z01 z01Var140 = new z01(914, LocaleController.getString(R.string.LiteSmoothTransitions), LocaleController.getString(R.string.PowerUsage), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i110) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        z01 z01Var141 = new z01(LocaleController.getString(R.string.Language), 400, R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i111) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i112 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i112 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i112)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i112, 13), 700, true);
                                break;
                            } else {
                                i112++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var141.a("tg://settings/language");
        final int i112 = 11;
        z01 z01Var142 = new z01(405, LocaleController.getString(R.string.ShowTranslateButton), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i112) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i1122)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var142.a("tg://settings/language/show-button");
        if (MessagesController.getInstance(currentAccount).getTranslateController().isContextTranslateEnabled()) {
            final int i113 = 12;
            z01 z01Var143 = new z01(406, LocaleController.getString(R.string.DoNotTranslate), LocaleController.getString(R.string.Language), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.v01
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i113) {
                        case 0:
                            hc0 hc0Var = new hc0();
                            m2Var.presentFragment(hc0Var);
                            hc0Var.W(LiteMode.FLAGS_CHAT);
                            hc0Var.V(64);
                            break;
                        case 1:
                            hc0 hc0Var2 = new hc0();
                            m2Var.presentFragment(hc0Var2);
                            hc0Var2.W(LiteMode.FLAGS_CHAT);
                            hc0Var2.V(128);
                            break;
                        case 2:
                            m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            hc0 hc0Var3 = new hc0();
                            m2Var.presentFragment(hc0Var3);
                            hc0Var3.W(LiteMode.FLAGS_CHAT);
                            hc0Var3.V(256);
                            break;
                        case 4:
                            hc0 hc0Var4 = new hc0();
                            m2Var.presentFragment(hc0Var4);
                            hc0Var4.W(LiteMode.FLAGS_CHAT);
                            hc0Var4.V(32768);
                            break;
                        case 5:
                            hc0 hc0Var5 = new hc0();
                            m2Var.presentFragment(hc0Var5);
                            hc0Var5.V(512);
                            break;
                        case 6:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            hc0 hc0Var6 = new hc0();
                            m2Var.presentFragment(hc0Var6);
                            hc0Var6.V(1024);
                            break;
                        case 8:
                            hc0 hc0Var7 = new hc0();
                            m2Var.presentFragment(hc0Var7);
                            hc0Var7.V(2048);
                            break;
                        case 9:
                            hc0 hc0Var8 = new hc0();
                            m2Var.presentFragment(hc0Var8);
                            int i1122 = 0;
                            while (true) {
                                ArrayList arrayList = hc0Var8.s;
                                if (i1122 >= arrayList.size()) {
                                    break;
                                } else if (((bc0) arrayList.get(i1122)).f == 1) {
                                    hc0Var8.b.e1(new i2.s(hc0Var8, i1122, 13), 700, true);
                                    break;
                                } else {
                                    i1122++;
                                }
                            }
                        case 10:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            m2Var.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                            rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                            x0Var.B();
                            m2Var2.showDialog(x0Var);
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                            m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                            break;
                        case 15:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                            break;
                        case 16:
                            nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                            break;
                        case 17:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            m2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            m2Var.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            m2Var.presentFragment(PasscodeActivity.b0());
                            break;
                        case 23:
                            org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                            rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                            x0Var2.B();
                            m2Var4.showDialog(x0Var2);
                            break;
                        case 24:
                            m2Var.presentFragment(new h(3));
                            break;
                        case 25:
                            m2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            yx0 yx0Var = new yx0();
                            yx0Var.getMessagesController().getBlockedPeers(true);
                            m2Var.presentFragment(yx0Var);
                            break;
                        case 27:
                            m2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            m2Var.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            m2Var.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            z01Var143.a("tg://settings/language/do-not-translate");
            z01Var43 = z01Var143;
        }
        final int i114 = 14;
        z01 z01Var144 = new z01(402, LocaleController.getString(R.string.AskAQuestion), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i114) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i1122)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        z01 z01Var145 = new z01(403, LocaleController.getString(R.string.TelegramFAQ), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i115) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i1122)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var145.a("tg://settings/faq");
        final int i116 = 16;
        z01 z01Var146 = new z01(404, LocaleController.getString(R.string.PrivacyPolicy), LocaleController.getString(R.string.SettingsHelp), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.v01
            @Override // java.lang.Runnable
            public final void run() {
                switch (i116) {
                    case 0:
                        hc0 hc0Var = new hc0();
                        m2Var.presentFragment(hc0Var);
                        hc0Var.W(LiteMode.FLAGS_CHAT);
                        hc0Var.V(64);
                        break;
                    case 1:
                        hc0 hc0Var2 = new hc0();
                        m2Var.presentFragment(hc0Var2);
                        hc0Var2.W(LiteMode.FLAGS_CHAT);
                        hc0Var2.V(128);
                        break;
                    case 2:
                        m2Var.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        hc0 hc0Var3 = new hc0();
                        m2Var.presentFragment(hc0Var3);
                        hc0Var3.W(LiteMode.FLAGS_CHAT);
                        hc0Var3.V(256);
                        break;
                    case 4:
                        hc0 hc0Var4 = new hc0();
                        m2Var.presentFragment(hc0Var4);
                        hc0Var4.W(LiteMode.FLAGS_CHAT);
                        hc0Var4.V(32768);
                        break;
                    case 5:
                        hc0 hc0Var5 = new hc0();
                        m2Var.presentFragment(hc0Var5);
                        hc0Var5.V(512);
                        break;
                    case 6:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        hc0 hc0Var6 = new hc0();
                        m2Var.presentFragment(hc0Var6);
                        hc0Var6.V(1024);
                        break;
                    case 8:
                        hc0 hc0Var7 = new hc0();
                        m2Var.presentFragment(hc0Var7);
                        hc0Var7.V(2048);
                        break;
                    case 9:
                        hc0 hc0Var8 = new hc0();
                        m2Var.presentFragment(hc0Var8);
                        int i1122 = 0;
                        while (true) {
                            ArrayList arrayList = hc0Var8.s;
                            if (i1122 >= arrayList.size()) {
                                break;
                            } else if (((bc0) arrayList.get(i1122)).f == 1) {
                                hc0Var8.b.e1(new i2.s(hc0Var8, i1122, 13), 700, true);
                                break;
                            } else {
                                i1122++;
                            }
                        }
                    case 10:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        m2Var.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        org.telegram.ui.ActionBar.m2 m2Var2 = m2Var;
                        rg.x0 x0Var = new rg.x0(m2Var2, 0, false);
                        x0Var.B();
                        m2Var2.showDialog(x0Var);
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.m2 m2Var3 = m2Var;
                        m2Var3.showDialog(org.telegram.ui.Components.e5.U(m2Var3, null));
                        break;
                    case 15:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.TelegramFaqUrl));
                        break;
                    case 16:
                        nf.f.s(m2Var.getParentActivity(), LocaleController.getString(R.string.PrivacyPolicyUrl));
                        break;
                    case 17:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        m2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        m2Var.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        m2Var.presentFragment(PasscodeActivity.b0());
                        break;
                    case 23:
                        org.telegram.ui.ActionBar.m2 m2Var4 = m2Var;
                        rg.x0 x0Var2 = new rg.x0(m2Var4, 11, false);
                        x0Var2.B();
                        m2Var4.showDialog(x0Var2);
                        break;
                    case 24:
                        m2Var.presentFragment(new h(3));
                        break;
                    case 25:
                        m2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        yx0 yx0Var = new yx0();
                        yx0Var.getMessagesController().getBlockedPeers(true);
                        m2Var.presentFragment(yx0Var);
                        break;
                    case 27:
                        m2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        m2Var.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        m2Var.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        z01Var146.a("tg://settings/privacy-policy");
        return new z01[]{z01Var23, z01Var24, z01Var25, z01Var26, z01Var27, z01Var28, z01Var29, z01Var30, z01Var31, z01Var32, z01Var33, z01Var34, z01Var35, z01Var36, z01Var37, z01Var38, z01Var39, z01Var, z01Var41, z01Var42, z01Var2, z01Var44, z01Var45, z01Var46, z01Var47, z01Var48, z01Var49, z01Var50, z01Var51, z01Var52, z01Var3, z01Var4, z01Var54, z01Var55, z01Var56, z01Var57, z01Var58, z01Var59, z01Var60, z01Var61, z01Var62, z01Var63, z01Var64, z01Var65, z01Var66, z01Var67, z01Var68, z01Var69, z01Var70, z01Var71, z01Var72, z01Var73, z01Var74, z01Var75, z01Var76, z01Var77, z01Var78, z01Var79, z01Var80, z01Var81, z01Var82, z01Var83, z01Var84, z01Var85, z01Var86, z01Var87, z01Var88, z01Var89, z01Var90, z01Var91, z01Var92, z01Var93, z01Var94, z01Var95, z01Var96, z01Var97, z01Var98, z01Var99, z01Var100, z01Var101, z01Var102, z01Var103, z01Var104, z01Var105, z01Var106, z01Var107, z01Var108, z01Var109, z01Var110, z01Var111, z01Var112, z01Var6, z01Var114, z01Var7, z01Var116, z01Var8, z01Var118, z01Var119, z01Var120, z01Var121, z01Var5, z01Var9, z01Var10, z01Var11, z01Var12, z01Var13, z01Var14, z01Var15, z01Var16, z01Var123, z01Var17, z01Var18, z01Var19, z01Var20, z01Var21, z01Var124, z01Var125, z01Var126, z01Var127, z01Var128, z01Var129, z01Var130, z01Var131, z01Var132, z01Var133, z01Var134, z01Var135, z01Var22, z01Var136, z01Var137, z01Var138, z01Var139, z01Var140, z01Var141, z01Var142, z01Var43, z01Var144, z01Var145, z01Var146};
    }

    @Override // org.telegram.ui.Components.vl0
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
            if (obj2 instanceof z01) {
                ((z01) obj2).g = i10;
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
            jx0 jx0Var = new jx0(16, this, str);
            this.x = jx0Var;
            dispatchQueue.postRunnable(jx0Var, 300L);
            return;
        }
        this.w = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.m2 m2Var = this.e;
        if (m2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) m2Var).P.b.getImageReceiver().startAnimation();
                ((ProfileActivity) this.e).P.d.setText(LocaleController.getString(R.string.SettingsNoRecent));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        l();
    }

    public final void J() {
        String[] strArr;
        z01 z01Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            z01[] z01VarArr = this.c;
            if (i10 >= z01VarArr.length) {
                break;
            }
            z01 z01Var2 = z01VarArr[i10];
            if (z01Var2 != null) {
                hashMap.put(Integer.valueOf(z01Var2.f), this.c[i10]);
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
                    } else if (readInt322 == 1 && (z01Var = (z01) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        z01Var.g = readInt32;
                        arrayList.add(z01Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new cf(this));
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
        org.telegram.ui.Cells.y6 y6Var = (org.telegram.ui.Cells.y6) view;
        if (this.w) {
            if (i10 >= this.r.size()) {
                int f7 = com.google.android.gms.internal.vision.e2.f(1, i10, this.r);
                y6Var.a((CharSequence) this.n.get(this.r.size() + f7), ((MessagesController.FaqSearchResult) this.s.get(f7)).path, true, f7 < this.r.size() - 1);
                return;
            } else {
                z01 z01Var = (z01) this.r.get(i10);
                z01 z01Var2 = i10 > 0 ? (z01) this.r.get(i10 - 1) : null;
                y6Var.b((CharSequence) this.n.get(i10), z01Var.d, (z01Var2 == null || z01Var2.e != z01Var.e) ? z01Var.e : 0, i10 < this.r.size() - 1);
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
        if (obj instanceof z01) {
            z01 z01Var3 = (z01) obj;
            y6Var.a(z01Var3.a, z01Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            MessagesController.FaqSearchResult faqSearchResult2 = (MessagesController.FaqSearchResult) obj;
            y6Var.a(faqSearchResult2.title, faqSearchResult2.path, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View m4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.m4(context, 16) : new org.telegram.ui.Cells.v3(context, null) : new org.telegram.ui.Cells.y6(context);
        m4Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.gl0(m4Var);
    }
}
