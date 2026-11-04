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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class lw0 extends org.telegram.ui.Components.sj0 {
    public String E;
    public TLRPC.WebPage F;
    public boolean G;
    public kw0[] c;
    public final org.telegram.ui.ActionBar.d2 e;
    public final int f;
    public final Context h;
    public boolean x;
    public qv0 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public lw0(Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.e = d2Var;
        this.f = d2Var.getCurrentAccount();
        this.h = context;
        this.c = H(d2Var);
        J();
    }

    public static boolean F(int i3, int i10) {
        if (!org.telegram.messenger.hp.s1(i3).D3() || org.telegram.messenger.h10.i(i3).q()) {
            return i10 == -1 || org.telegram.messenger.hp.s1(i3).O0.get(i10, -1) != -1;
        }
        return false;
    }

    public static kw0[] H(final org.telegram.ui.ActionBar.d2 d2Var) {
        kw0 kw0Var;
        kw0 kw0Var2;
        kw0 kw0Var3;
        kw0 kw0Var4;
        kw0 kw0Var5;
        kw0 kw0Var6;
        kw0 kw0Var7;
        kw0 kw0Var8;
        kw0 kw0Var9;
        kw0 kw0Var10;
        kw0 kw0Var11;
        kw0 kw0Var12;
        kw0 kw0Var13;
        kw0 kw0Var14;
        kw0 kw0Var15;
        kw0 kw0Var16;
        kw0 kw0Var17;
        kw0 kw0Var18;
        kw0 kw0Var19;
        kw0 kw0Var20;
        kw0 kw0Var21;
        kw0 kw0Var22;
        final int currentAccount = d2Var.getCurrentAccount();
        final int i3 = 1;
        kw0 kw0Var23 = new kw0(500, org.telegram.messenger.bd.L0(2131751265), 0, new qv0(i3, d2Var, d2Var.getResourceProvider()));
        final int i10 = 24;
        kw0 kw0Var24 = new kw0(501, org.telegram.messenger.bd.L0(2131752537), 0, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i11 = i10;
                int i12 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i11) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i12 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i12)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i12, 13), 700, true);
                                break;
                            } else {
                                i12++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var24.a("tg://settings/edit/change-number");
        final int i11 = 6;
        kw0 kw0Var25 = new kw0(502, org.telegram.messenger.bd.L0(2131754468), 0, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i12 = 0;
                        while (true) {
                            if (i12 >= 4) {
                                i12 = -1;
                            } else if (org.telegram.messenger.h10.i(i12).p()) {
                                i12++;
                            }
                        }
                        if (i12 >= 0) {
                            d2Var.presentFragment(new xd0(i12));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var25.a("tg://settings/edit/add-account");
        final int i12 = 17;
        kw0 kw0Var26 = new kw0(1, org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var26.a("tg://settings/notifications");
        final int i13 = 29;
        kw0 kw0Var27 = new kw0(2, org.telegram.messenger.bd.L0(2131747886), org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var27.a("tg://settings/notifications/private-chats");
        final int i14 = 11;
        kw0 kw0Var28 = new kw0(3, org.telegram.messenger.bd.L0(2131747915), org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        kw0Var28.a("tg://settings/notifications/groups");
        kw0 kw0Var29 = new kw0(4, org.telegram.messenger.bd.L0(2131747929), org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new nf0(7, d2Var));
        kw0Var29.a("tg://settings/notifications/channels");
        final int i15 = 19;
        kw0 kw0Var30 = new kw0(5, org.telegram.messenger.bd.L0(2131743289), "callsSectionRow", org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new nf0(i15, d2Var));
        kw0 kw0Var31 = new kw0(6, org.telegram.messenger.bd.L0(2131753733), "badgeNumberSection", org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i3) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i16 = 13;
        kw0 kw0Var32 = new kw0(7, org.telegram.messenger.bd.L0(2131749227), "inappSectionRow", org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0 kw0Var33 = new kw0(8, org.telegram.messenger.bd.L0(2131751790), "contactJoinedRow", org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new nf0(23, d2Var));
        kw0Var33.a("tg://settings/notifications/new-contacts");
        kw0 kw0Var34 = new kw0(9, org.telegram.messenger.bd.L0(2131747236), "pinnedMessageRow", org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var34.a("tg://settings/notifications/pinned-messages");
        kw0 kw0Var35 = new kw0(10, org.telegram.messenger.bd.L0(2131746122), "resetNotificationsRow", org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i11;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var35.a("tg://settings/notifications/reset");
        kw0 kw0Var36 = new kw0(11, org.telegram.messenger.bd.L0(2131747884), "notificationsServiceRow", org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i12;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i17 = 18;
        kw0 kw0Var37 = new kw0(12, org.telegram.messenger.bd.L0(2131747883), "notificationsServiceConnectionRow", org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i17;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0 kw0Var38 = new kw0(13, org.telegram.messenger.bd.L0(2131746283), "repeatRow", org.telegram.messenger.bd.L0(2131747930), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i15;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i18 = 20;
        kw0 kw0Var39 = new kw0(100, org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i18;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var39.a("tg://settings/privacy");
        final int i19 = 21;
        kw0 kw0Var40 = new kw0(org.telegram.messenger.hs.u1, org.telegram.messenger.bd.L0(2131743948), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i19;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var40.a("tg://settings/privacy/2sv");
        final int i20 = 0;
        kw0 kw0Var41 = new kw0(org.telegram.messenger.hs.I1, org.telegram.messenger.bd.L0(2131753850), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.hw0
            @Override // java.lang.Runnable
            public final void run() {
                int i21 = i20;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                int i22 = currentAccount;
                switch (i21) {
                    case 0:
                        if (org.telegram.messenger.h10.i(i22).q0 >= 0) {
                            d2Var2.presentFragment(new r4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.h10.i(i22).q()) {
                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(d2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(a02.W(), null);
                            ibVar.d(R.raw.voip_muted, new String[0]);
                            String M0 = org.telegram.messenger.bd.M0(2131746763, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new gi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ibVar.b.setText(spannableStringBuilder);
                            ibVar.b.setSingleLine(false);
                            ibVar.b.setMaxLines(2);
                            a02.b(ibVar, 2750).j();
                            break;
                        } else {
                            d2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        kw0Var41.a("tg://settings/privacy/auto-delete");
        final int i21 = 22;
        kw0 kw0Var42 = new kw0(org.telegram.messenger.hs.t1, org.telegram.messenger.bd.L0(2131747665), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i21;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var42.a("tg://settings/privacy/passcode");
        kw0 kw0Var43 = null;
        if (org.telegram.messenger.az.m1) {
            kw0Var = kw0Var40;
            final int i22 = 25;
            kw0Var2 = new kw0(org.telegram.messenger.hs.J1, org.telegram.messenger.bd.L0(2131751203), "emailLoginRow", org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.gw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i22;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i112) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            break;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            break;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            break;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            break;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            break;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            break;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            break;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((o90) arrayList.get(i122)).f == 1) {
                                    t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            break;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            break;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            break;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            break;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            break;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            kw0Var2.a("tg://settings/privacy/login-email");
        } else {
            kw0Var = kw0Var40;
            kw0Var2 = null;
        }
        final int i23 = 26;
        kw0 kw0Var44 = new kw0(101, org.telegram.messenger.bd.L0(2131753681), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i23;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var44.a("tg://settings/privacy/blocked");
        final int i24 = 27;
        kw0 kw0Var45 = new kw0(org.telegram.messenger.hs.v1, org.telegram.messenger.bd.L0(2131745561), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i24;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var45.a("tg://settings/devices");
        final int i25 = 28;
        kw0 kw0Var46 = new kw0(org.telegram.messenger.hs.q1, org.telegram.messenger.bd.L0(2131746798), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i25;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var46.a("tg://settings/privacy/phone-number/");
        final int i26 = 29;
        kw0 kw0Var47 = new kw0(org.telegram.messenger.hs.n1, org.telegram.messenger.bd.L0(2131746823), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i26;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var47.a("tg://settings/privacy/last-seen");
        final int i27 = 0;
        kw0 kw0Var48 = new kw0(org.telegram.messenger.hs.o1, org.telegram.messenger.bd.L0(2131746785), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i27) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var48.a("tg://settings/privacy/profile-photos");
        final int i28 = 1;
        kw0 kw0Var49 = new kw0(org.telegram.messenger.hs.p1, org.telegram.messenger.bd.L0(2131746845), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var49.a("tg://settings/privacy/forwards");
        final int i29 = 2;
        kw0 kw0Var50 = new kw0(org.telegram.messenger.hs.G1, org.telegram.messenger.bd.L0(2131746808), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var50.a("tg://settings/privacy/calls/p2p");
        final int i30 = 3;
        kw0 kw0Var51 = new kw0(org.telegram.messenger.hs.r1, org.telegram.messenger.bd.L0(2131752596), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var51.a("tg://settings/privacy/calls");
        final int i31 = 5;
        kw0 kw0Var52 = new kw0(org.telegram.messenger.hs.s1, org.telegram.messenger.bd.L0(2131746825), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var52.a("tg://settings/privacy/invites");
        final int i32 = 1;
        kw0 kw0Var53 = new kw0(org.telegram.messenger.hs.H1, org.telegram.messenger.bd.L0(2131746766), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.hw0
            @Override // java.lang.Runnable
            public final void run() {
                int i212 = i32;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                int i222 = currentAccount;
                switch (i212) {
                    case 0:
                        if (org.telegram.messenger.h10.i(i222).q0 >= 0) {
                            d2Var2.presentFragment(new r4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.h10.i(i222).q()) {
                            org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(d2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.ib ibVar = new org.telegram.ui.Components.ib(a02.W(), null);
                            ibVar.d(R.raw.voip_muted, new String[0]);
                            String M0 = org.telegram.messenger.bd.M0(2131746763, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(M0);
                            int indexOf = M0.indexOf(42);
                            int lastIndexOf = M0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) M0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new gi.ka(a02, 5), indexOf, lastIndexOf - 1, 33);
                            }
                            ibVar.b.setText(spannableStringBuilder);
                            ibVar.b.setSingleLine(false);
                            ibVar.b.setMaxLines(2);
                            a02.b(ibVar, 2750).j();
                            break;
                        } else {
                            d2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        kw0Var53.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.hp.s1(currentAccount).Z3) {
            kw0Var3 = kw0Var53;
            final int i33 = 7;
            kw0Var4 = new kw0(org.telegram.messenger.hs.F1, org.telegram.messenger.bd.L0(2131754171), "newChatsRow", org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.iw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i33) {
                        case 0:
                            d2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            d2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            d2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            d2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 5:
                            d2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (org.telegram.messenger.h10.i(i122).p()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                d2Var.presentFragment(new xd0(i122));
                                break;
                            }
                            break;
                        case 7:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            d2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                        case 15:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            d2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            d2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            d2Var.presentFragment(new z6());
                            break;
                        case 24:
                            d2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            break;
                        case 26:
                            d2Var.presentFragment(new z6());
                            break;
                        case 27:
                            d2Var.presentFragment(new z6());
                            break;
                        case 28:
                            d2Var.presentFragment(new ht());
                            break;
                        default:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            kw0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            kw0Var3 = kw0Var53;
            kw0Var4 = null;
        }
        final int i34 = 8;
        kw0 kw0Var54 = new kw0(org.telegram.messenger.hs.x1, org.telegram.messenger.bd.L0(2131751597), "deleteAccountRow", org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i34) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var54.a("tg://settings/privacy/self-destruct");
        final int i35 = 9;
        kw0 kw0Var55 = new kw0(org.telegram.messenger.hs.y1, org.telegram.messenger.bd.L0(2131746805), "paymentsClearRow", org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i36 = 10;
        kw0 kw0Var56 = new kw0(org.telegram.messenger.hs.z1, org.telegram.messenger.bd.L0(2131742921), org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var56.a("tg://settings/privacy/active-websites");
        final int i37 = 11;
        kw0 kw0Var57 = new kw0(org.telegram.messenger.hs.A1, org.telegram.messenger.bd.L0(2131744306), "contactsDeleteRow", org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i38 = 12;
        kw0 kw0Var58 = new kw0(org.telegram.messenger.hs.B1, org.telegram.messenger.bd.L0(2131744308), "contactsSyncRow", org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i39 = 13;
        kw0 kw0Var59 = new kw0(org.telegram.messenger.hs.C1, org.telegram.messenger.bd.L0(2131744422), "contactsSuggestRow", org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i40 = 15;
        kw0 kw0Var60 = new kw0(org.telegram.messenger.hs.D1, org.telegram.messenger.bd.L0(2131748697), "secretMapRow", org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i41 = 16;
        kw0 kw0Var61 = new kw0(org.telegram.messenger.hs.E1, org.telegram.messenger.bd.L0(2131745694), "secretWebpageRow", org.telegram.messenger.bd.L0(2131746779), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i42 = 18;
        kw0 kw0Var62 = new kw0(120, org.telegram.messenger.bd.L0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var62.a("tg://settings/devices");
        final int i43 = 19;
        kw0 kw0Var63 = new kw0(org.telegram.messenger.hs.F1, org.telegram.messenger.bd.L0(2131744218), "terminateAllSessionsRow", org.telegram.messenger.bd.L0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var63.a("tg://settings/devices/terminate-sessions");
        final int i44 = 20;
        kw0 kw0Var64 = new kw0(org.telegram.messenger.hs.G1, org.telegram.messenger.bd.L0(2131748925), org.telegram.messenger.bd.L0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var64.a("tg://settings/devices/link-desktop");
        final int i45 = 21;
        kw0 kw0Var65 = new kw0(org.telegram.messenger.hs.e3, org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var65.a("tg://settings/privacy/data-settings");
        final int i46 = 22;
        kw0 kw0Var66 = new kw0(org.telegram.messenger.hs.f3, org.telegram.messenger.bd.L0(2131751677), "usageSectionRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i47 = 23;
        kw0 kw0Var67 = new kw0(org.telegram.messenger.hs.g3, org.telegram.messenger.bd.L0(2131744826), org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var67.a("tg://settings/data/storage");
        final int i48 = 24;
        kw0 kw0Var68 = new kw0(203, org.telegram.messenger.bd.L0(2131749068), "keepMediaRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131744826), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i49 = 26;
        kw0 kw0Var69 = new kw0(org.telegram.messenger.hs.i3, org.telegram.messenger.bd.L0(2131752075), "cacheRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131744826), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 27;
        kw0 kw0Var70 = new kw0(org.telegram.messenger.hs.j3, org.telegram.messenger.bd.L0(2131748782), "databaseRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131744826), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 28;
        kw0 kw0Var71 = new kw0(org.telegram.messenger.hs.k3, org.telegram.messenger.bd.L0(2131748306), org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.iw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        d2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        d2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        d2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        d2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i122 = 0;
                        while (true) {
                            if (i122 >= 4) {
                                i122 = -1;
                            } else if (org.telegram.messenger.h10.i(i122).p()) {
                                i122++;
                            }
                        }
                        if (i122 >= 0) {
                            d2Var.presentFragment(new xd0(i122));
                            break;
                        }
                        break;
                    case 7:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        d2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.W = true;
                        d2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        d2Var.presentFragment(new z6());
                        break;
                    case 24:
                        d2Var.presentFragment(new z6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 26:
                        d2Var.presentFragment(new z6());
                        break;
                    case 27:
                        d2Var.presentFragment(new z6());
                        break;
                    case 28:
                        d2Var.presentFragment(new ht());
                        break;
                    default:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        kw0Var71.a("tg://settings/data/usage");
        final int i52 = 0;
        kw0 kw0Var72 = new kw0(org.telegram.messenger.hs.l3, org.telegram.messenger.bd.L0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i53 = 1;
        kw0 kw0Var73 = new kw0(208, org.telegram.messenger.bd.L0(2131742894), org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i54 = 2;
        kw0 kw0Var74 = new kw0(org.telegram.messenger.hs.m3, org.telegram.messenger.bd.L0(2131742896), org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i55 = 3;
        kw0 kw0Var75 = new kw0(org.telegram.messenger.hs.n3, org.telegram.messenger.bd.L0(2131742895), org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i56 = 4;
        kw0 kw0Var76 = new kw0(org.telegram.messenger.hs.o3, org.telegram.messenger.bd.L0(2131746121), "resetDownloadRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        kw0Var76.a("tg://settings/data/auto-download/reset");
        final int i57 = 5;
        kw0 kw0Var77 = new kw0(org.telegram.messenger.hs.s3, org.telegram.messenger.bd.L0(2131744448), "streamSectionRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i58 = 7;
        kw0 kw0Var78 = new kw0(org.telegram.messenger.hs.t3, org.telegram.messenger.bd.L0(2131751145), "enableStreamRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i59 = 8;
        kw0 kw0Var79 = new kw0(org.telegram.messenger.hs.u3, org.telegram.messenger.bd.L0(2131752596), "callsSectionRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i60 = 9;
        kw0 kw0Var80 = new kw0(org.telegram.messenger.hs.v3, org.telegram.messenger.bd.L0(2131743239), "useLessDataForCallsRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        kw0Var80.a("tg://settings/data/use-less-data");
        final int i61 = 10;
        kw0 kw0Var81 = new kw0(org.telegram.messenger.hs.w3, org.telegram.messenger.bd.L0(2131743268), "quickRepliesRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i62 = 12;
        kw0 kw0Var82 = new kw0(org.telegram.messenger.hs.x3, org.telegram.messenger.bd.L0(2131746609), org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        kw0Var82.a("tg://settings/data/proxy");
        final int i63 = 13;
        kw0 kw0Var83 = new kw0(org.telegram.messenger.hs.w1, org.telegram.messenger.bd.L0(2131746849), "clearDraftsRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        kw0Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i64 = 14;
        kw0 kw0Var84 = new kw0(org.telegram.messenger.hs.z3, org.telegram.messenger.bd.L0(2131745939), "saveToGallerySectionRow", org.telegram.messenger.bd.L0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        final int i65 = 15;
        kw0 kw0Var85 = new kw0(org.telegram.messenger.hs.A3, org.telegram.messenger.bd.L0(2131745929), "saveToGalleryPeerRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131745939), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        kw0Var85.a("tg://settings/data/save-to-photos/chats");
        final int i66 = 16;
        kw0 kw0Var86 = new kw0(org.telegram.messenger.hs.B3, org.telegram.messenger.bd.L0(2131745936), "saveToGalleryGroupsRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131745939), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.jw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        d2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        d2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        d2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 7:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        d2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        d2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                }
            }
        });
        kw0Var86.a("tg://settings/data/save-to-photos/groups");
        kw0 kw0Var87 = new kw0(org.telegram.messenger.hs.C3, org.telegram.messenger.bd.L0(2131745938), "saveToGalleryChannelsRow", org.telegram.messenger.bd.L0(2131751678), org.telegram.messenger.bd.L0(2131745939), R.drawable.msg2_data, new nf0(2, d2Var));
        kw0Var87.a("tg://settings/data/save-to-photos/channels");
        kw0 kw0Var88 = new kw0(org.telegram.messenger.hs.X4, org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(3, d2Var));
        kw0Var88.a("tg://settings/appearance/themes");
        kw0 kw0Var89 = new kw0(org.telegram.messenger.hs.Y4, org.telegram.messenger.bd.L0(2131744201), "textSizeHeaderRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(4, d2Var));
        kw0Var89.a("tg://settings/appearance/text-size");
        kw0 kw0Var90 = new kw0(org.telegram.messenger.hs.Z4, org.telegram.messenger.bd.L0(2131752550), org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(5, d2Var));
        kw0Var90.a("tg://settings/appearance/wallpapers");
        kw0 kw0Var91 = new kw0(org.telegram.messenger.hs.a5, org.telegram.messenger.bd.L0(2131745548), null, org.telegram.messenger.bd.L0(2131752210), org.telegram.messenger.bd.L0(2131752244), R.drawable.msg2_discussion, new nf0(6, d2Var));
        kw0 kw0Var92 = new kw0(org.telegram.messenger.hs.b5, org.telegram.messenger.bd.L0(2131746118), "resetRow", org.telegram.messenger.bd.L0(2131752210), org.telegram.messenger.bd.L0(2131752244), R.drawable.msg2_discussion, new nf0(8, d2Var));
        kw0 kw0Var93 = new kw0(org.telegram.messenger.hs.d5, org.telegram.messenger.bd.L0(2131752011), "themeHeaderRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(9, d2Var));
        kw0 kw0Var94 = new kw0(org.telegram.messenger.hs.q5, org.telegram.messenger.bd.L0(2131752878), null, org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(10, d2Var));
        kw0 kw0Var95 = new kw0(org.telegram.messenger.hs.r5, org.telegram.messenger.bd.L0(2131751713), "createNewThemeRow", org.telegram.messenger.bd.L0(2131752210), org.telegram.messenger.bd.L0(2131752878), R.drawable.msg2_discussion, new nf0(11, d2Var));
        kw0Var95.a("tg://settings/appearance/themes/create");
        kw0 kw0Var96 = new kw0(org.telegram.messenger.hs.s5, org.telegram.messenger.bd.L0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(13, d2Var));
        kw0Var96.a("tg://settings/appearance/message-corners");
        kw0 kw0Var97 = new kw0(org.telegram.messenger.hs.t5, org.telegram.messenger.bd.L0(2131752225), "chatListHeaderRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(14, d2Var));
        kw0 kw0Var98 = new kw0(org.telegram.messenger.hs.u5, org.telegram.messenger.bd.L0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(15, d2Var));
        kw0 kw0Var99 = new kw0(org.telegram.messenger.hs.v5, org.telegram.messenger.bd.L0(2131754240), "appIconHeaderRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(16, d2Var));
        kw0Var99.a("tg://settings/appearance/app-icon");
        kw0 kw0Var100 = new kw0(org.telegram.messenger.hs.c5, org.telegram.messenger.bd.L0(2131753784), org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(17, d2Var));
        kw0 kw0Var101 = new kw0(org.telegram.messenger.hs.z5, org.telegram.messenger.bd.L0(2131748257), "nextMediaTapRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(18, d2Var));
        kw0Var101.a("tg://settings/appearance/tap-for-next-media");
        kw0 kw0Var102 = new kw0(org.telegram.messenger.hs.y5, org.telegram.messenger.bd.L0(2131746435), "raiseToListenRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(20, d2Var));
        kw0Var102.a("tg://settings/data/raise-to-listen");
        kw0 kw0Var103 = new kw0(org.telegram.messenger.hs.h5, org.telegram.messenger.bd.L0(2131746433), "raiseToSpeakRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(21, d2Var));
        kw0Var103.a("tg://settings/data/raise-to-speak");
        kw0 kw0Var104 = new kw0(org.telegram.messenger.hs.x5, org.telegram.messenger.bd.L0(2131747440), "pauseOnMediaRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(22, d2Var));
        kw0Var104.a("tg://settings/data/pause-music");
        kw0 kw0Var105 = new kw0(org.telegram.messenger.hs.w5, org.telegram.messenger.bd.L0(2131748447), "bluetoothScoRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(24, d2Var));
        kw0 kw0Var106 = new kw0(org.telegram.messenger.hs.f5, org.telegram.messenger.bd.L0(2131751439), "directShareRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(25, d2Var));
        kw0 kw0Var107 = new kw0(org.telegram.messenger.hs.i5, org.telegram.messenger.bd.L0(2131745642), "sendByEnterRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(26, d2Var));
        kw0 kw0Var108 = new kw0(org.telegram.messenger.hs.p5, org.telegram.messenger.bd.L0(2131751368), "distanceRow", org.telegram.messenger.bd.L0(2131752210), R.drawable.msg2_discussion, new nf0(27, d2Var));
        kw0 kw0Var109 = new kw0(600, org.telegram.messenger.bd.L0(2131744867), R.drawable.msg2_sticker, new nf0(28, d2Var));
        kw0Var109.a("tg://settings/appearance/stickers-and-emoji");
        kw0 kw0Var110 = new kw0(601, org.telegram.messenger.bd.L0(2131744412), "suggestRow", org.telegram.messenger.bd.L0(2131744867), R.drawable.msg2_sticker, new nf0(29, d2Var));
        final int i67 = 0;
        kw0 kw0Var111 = new kw0(602, org.telegram.messenger.bd.L0(2131750834), "featuredStickersHeaderRow", org.telegram.messenger.bd.L0(2131744867), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i68 = 2;
        kw0 kw0Var112 = new kw0(603, org.telegram.messenger.bd.L0(2131748687), null, org.telegram.messenger.bd.L0(2131744867), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i69 = 3;
        kw0 kw0Var113 = new kw0(604, org.telegram.messenger.bd.L0(2131754128), null, org.telegram.messenger.bd.L0(2131744867), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i70 = 5;
        kw0 kw0Var114 = new kw0(605, org.telegram.messenger.bd.L0(2131754133), null, org.telegram.messenger.bd.L0(2131744867), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i71 = 6;
        kw0 kw0Var115 = new kw0(606, org.telegram.messenger.bd.L0(2131749042), "largeEmojiRow", org.telegram.messenger.bd.L0(2131744867), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i72 = 7;
        kw0 kw0Var116 = new kw0(607, org.telegram.messenger.bd.L0(2131748730), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748858), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i73 = 8;
        kw0 kw0Var117 = new kw0(608, org.telegram.messenger.bd.L0(2131751197), null, org.telegram.messenger.bd.L0(2131744867), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i74 = 9;
        kw0 kw0Var118 = new kw0(609, org.telegram.messenger.bd.L0(2131744426), "suggestAnimatedEmojiRow", org.telegram.messenger.bd.L0(2131744867), org.telegram.messenger.bd.L0(2131751197), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i75 = 10;
        kw0 kw0Var119 = new kw0(610, org.telegram.messenger.bd.L0(2131750836), "featuredStickersHeaderRow", org.telegram.messenger.bd.L0(2131744867), org.telegram.messenger.bd.L0(2131751197), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i76 = 11;
        kw0 kw0Var120 = new kw0(611, org.telegram.messenger.bd.L0(2131751351), null, org.telegram.messenger.bd.L0(2131744867), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i77 = 12;
        kw0 kw0Var121 = new kw0(700, org.telegram.messenger.bd.L0(2131750697), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var121.a("tg://settings/folders");
        final int i78 = 21;
        kw0 kw0Var122 = new kw0(701, org.telegram.messenger.bd.L0(2131751717), "createFilterRow", org.telegram.messenger.bd.L0(2131750697), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            kw0Var5 = kw0Var122;
            kw0Var6 = kw0Var113;
            kw0Var7 = kw0Var115;
            final int i79 = 2;
            kw0Var8 = kw0Var117;
            kw0Var9 = new kw0(800, org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.gw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i79;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i112) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            break;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            break;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            break;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            break;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            break;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            break;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            break;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((o90) arrayList.get(i122)).f == 1) {
                                    t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            break;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            break;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            break;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            break;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            break;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            kw0Var5 = kw0Var122;
            kw0Var6 = kw0Var113;
            kw0Var7 = kw0Var115;
            kw0Var8 = kw0Var117;
            kw0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i80 = 13;
            kw0Var10 = new kw0(801, org.telegram.messenger.bd.L0(2131747006), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.gw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i80;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i112) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            break;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            break;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            break;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            break;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            break;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            break;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            break;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((o90) arrayList.get(i122)).f == 1) {
                                    t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            break;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            break;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            break;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            break;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            break;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            kw0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i81 = 23;
            kw0Var11 = new kw0(802, org.telegram.messenger.bd.L0(2131747015), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.gw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i81;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i112) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            break;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            break;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            break;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            break;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            break;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            break;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            break;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((o90) arrayList.get(i122)).f == 1) {
                                    t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            break;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            break;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            break;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            break;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            break;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            kw0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i82 = 4;
            kw0Var12 = new kw0(803, org.telegram.messenger.bd.L0(2131746972), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.iw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i82) {
                        case 0:
                            d2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            d2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            d2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            d2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 5:
                            d2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (org.telegram.messenger.h10.i(i122).p()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                d2Var.presentFragment(new xd0(i122));
                                break;
                            }
                            break;
                        case 7:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            d2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                        case 15:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            d2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            d2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            d2Var.presentFragment(new z6());
                            break;
                        case 24:
                            d2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            break;
                        case 26:
                            d2Var.presentFragment(new z6());
                            break;
                        case 27:
                            d2Var.presentFragment(new z6());
                            break;
                        case 28:
                            d2Var.presentFragment(new ht());
                            break;
                        default:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            kw0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i83 = 14;
            kw0Var13 = new kw0(804, org.telegram.messenger.bd.L0(2131747020), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.iw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            d2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            d2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            d2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            d2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 5:
                            d2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (org.telegram.messenger.h10.i(i122).p()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                d2Var.presentFragment(new xd0(i122));
                                break;
                            }
                            break;
                        case 7:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            d2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                        case 15:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            d2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            d2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            d2Var.presentFragment(new z6());
                            break;
                        case 24:
                            d2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            break;
                        case 26:
                            d2Var.presentFragment(new z6());
                            break;
                        case 27:
                            d2Var.presentFragment(new z6());
                            break;
                        case 28:
                            d2Var.presentFragment(new ht());
                            break;
                        default:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            kw0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i84 = 25;
            kw0Var14 = new kw0(805, org.telegram.messenger.bd.L0(2131746970), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.iw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            d2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            d2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            d2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            d2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 1, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 5:
                            d2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i122 = 0;
                            while (true) {
                                if (i122 >= 4) {
                                    i122 = -1;
                                } else if (org.telegram.messenger.h10.i(i122).p()) {
                                    i122++;
                                }
                            }
                            if (i122 >= 0) {
                                d2Var.presentFragment(new xd0(i122));
                                break;
                            }
                            break;
                        case 7:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            d2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 2, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                        case 15:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            d2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            d2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.W = true;
                            d2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            d2Var.presentFragment(new z6());
                            break;
                        case 24:
                            d2Var.presentFragment(new z6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 8, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            break;
                        case 26:
                            d2Var.presentFragment(new z6());
                            break;
                        case 27:
                            d2Var.presentFragment(new z6());
                            break;
                        case 28:
                            d2Var.presentFragment(new ht());
                            break;
                        default:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            kw0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i85 = 6;
            kw0Var15 = new kw0(806, org.telegram.messenger.bd.L0(2131747000), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.jw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            d2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            d2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            d2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 7:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            d2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                    }
                }
            });
        } else {
            kw0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i86 = 17;
            kw0Var16 = new kw0(807, org.telegram.messenger.bd.L0(2131746991), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.jw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            d2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            d2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            d2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 3, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 7:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            d2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            d2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            d2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 4, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                    }
                }
            });
        } else {
            kw0Var16 = null;
        }
        kw0 kw0Var123 = F(currentAccount, 5) ? new kw0(808, org.telegram.messenger.bd.L0(2131746984), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new nf0(12, d2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i87 = 4;
            kw0Var17 = new kw0(809, org.telegram.messenger.bd.L0(2131747033), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.fw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            break;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            break;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            break;
                        case 18:
                            d2Var.presentFragment(new t90());
                            break;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            break;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            break;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            break;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            break;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            break;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            break;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            break;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            break;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            kw0Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i88 = 14;
            kw0Var18 = new kw0(810, org.telegram.messenger.bd.L0(2131746995), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.fw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            break;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            break;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            break;
                        case 18:
                            d2Var.presentFragment(new t90());
                            break;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            break;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            break;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            break;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            break;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            break;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            break;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            break;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            break;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            kw0Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i89 = 15;
            kw0Var19 = new kw0(811, org.telegram.messenger.bd.L0(2131747030), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.fw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            break;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            break;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            break;
                        case 18:
                            d2Var.presentFragment(new t90());
                            break;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            break;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            break;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            break;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            break;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            break;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            break;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            break;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            break;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            kw0Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i90 = 16;
            kw0Var20 = new kw0(812, org.telegram.messenger.bd.L0(2131747028), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.fw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            break;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            break;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            break;
                        case 18:
                            d2Var.presentFragment(new t90());
                            break;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            break;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            break;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            break;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            break;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            break;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            break;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            break;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            break;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            kw0Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i91 = 17;
            kw0Var21 = new kw0(813, org.telegram.messenger.bd.L0(2131747012), org.telegram.messenger.bd.L0(2131744241), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.fw0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            d2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            d2Var.presentFragment(new o(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                            vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 5:
                            d2Var.presentFragment(new o(1));
                            break;
                        case 6:
                            d2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            t90 t90Var = new t90();
                            d2Var.presentFragment(t90Var);
                            t90Var.b0(3);
                            t90Var.a0(2);
                            break;
                        case 8:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            d2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            d2Var.presentFragment(new sx0());
                            break;
                        case 12:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                            vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                            v0Var2.K0();
                            d2Var3.showDialog(v0Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                            vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                            v0Var3.K0();
                            d2Var4.showDialog(v0Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                            vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                            v0Var4.K0();
                            d2Var5.showDialog(v0Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                            vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                            v0Var5.K0();
                            d2Var6.showDialog(v0Var5);
                            break;
                        case 18:
                            d2Var.presentFragment(new t90());
                            break;
                        case 19:
                            t90 t90Var2 = new t90();
                            d2Var.presentFragment(t90Var2);
                            t90Var2.a0(3);
                            break;
                        case 20:
                            t90 t90Var3 = new t90();
                            d2Var.presentFragment(t90Var3);
                            t90Var3.b0(3);
                            t90Var3.a0(1);
                            break;
                        case 21:
                            d2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            t90 t90Var4 = new t90();
                            d2Var.presentFragment(t90Var4);
                            t90Var4.b0(3);
                            t90Var4.a0(2);
                            break;
                        case 23:
                            t90 t90Var5 = new t90();
                            d2Var.presentFragment(t90Var5);
                            t90Var5.a0(28700);
                            break;
                        case 24:
                            d2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            t90 t90Var6 = new t90();
                            d2Var.presentFragment(t90Var6);
                            t90Var6.b0(28700);
                            t90Var6.a0(16388);
                            break;
                        case 26:
                            t90 t90Var7 = new t90();
                            d2Var.presentFragment(t90Var7);
                            t90Var7.b0(28700);
                            t90Var7.a0(8200);
                            break;
                        case 27:
                            t90 t90Var8 = new t90();
                            d2Var.presentFragment(t90Var8);
                            t90Var8.b0(28700);
                            t90Var8.a0(4112);
                            break;
                        case 28:
                            t90 t90Var9 = new t90();
                            d2Var.presentFragment(t90Var9);
                            t90Var9.a0(360928);
                            break;
                        default:
                            t90 t90Var10 = new t90();
                            d2Var.presentFragment(t90Var10);
                            t90Var10.b0(360928);
                            t90Var10.a0(32);
                            break;
                    }
                }
            });
        } else {
            kw0Var21 = null;
        }
        final int i92 = 18;
        kw0 kw0Var124 = new kw0(900, org.telegram.messenger.bd.L0(2131747074), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i92) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var124.a("tg://settings/power-saving");
        final int i93 = 19;
        kw0 kw0Var125 = new kw0(901, org.telegram.messenger.bd.L0(2131748858), org.telegram.messenger.bd.L0(2131747074), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i93) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var125.a("tg://settings/power-saving/stickers");
        final int i94 = 20;
        kw0 kw0Var126 = new kw0(902, org.telegram.messenger.bd.L0(2131748870), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748858), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i94) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i95 = 22;
        kw0 kw0Var127 = new kw0(903, org.telegram.messenger.bd.L0(2131748872), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748858), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i96 = 23;
        kw0 kw0Var128 = new kw0(904, org.telegram.messenger.bd.L0(2131748863), org.telegram.messenger.bd.L0(2131747074), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var128.a("tg://settings/power-saving/emoji");
        final int i97 = 25;
        kw0 kw0Var129 = new kw0(905, org.telegram.messenger.bd.L0(2131748870), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748863), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i98 = 26;
        kw0 kw0Var130 = new kw0(906, org.telegram.messenger.bd.L0(2131748869), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748863), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i99 = 27;
        kw0 kw0Var131 = new kw0(907, org.telegram.messenger.bd.L0(2131748872), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748863), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        final int i100 = 28;
        kw0 kw0Var132 = new kw0(908, org.telegram.messenger.bd.L0(2131748864), org.telegram.messenger.bd.L0(2131747074), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var132.a("tg://settings/power-saving/effects");
        final int i101 = 29;
        kw0 kw0Var133 = new kw0(909, org.telegram.messenger.bd.L0(2131748867), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.fw0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        d2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        d2Var.presentFragment(new o(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        vg.v0 v0Var = new vg.v0(d2Var2, 9, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 5:
                        d2Var.presentFragment(new o(1));
                        break;
                    case 6:
                        d2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        t90 t90Var = new t90();
                        d2Var.presentFragment(t90Var);
                        t90Var.b0(3);
                        t90Var.a0(2);
                        break;
                    case 8:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        d2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        d2Var.presentFragment(new sx0());
                        break;
                    case 12:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.d2 d2Var3 = d2Var;
                        vg.v0 v0Var2 = new vg.v0(d2Var3, 6, false);
                        v0Var2.K0();
                        d2Var3.showDialog(v0Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.d2 d2Var4 = d2Var;
                        vg.v0 v0Var3 = new vg.v0(d2Var4, 7, false);
                        v0Var3.K0();
                        d2Var4.showDialog(v0Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.d2 d2Var5 = d2Var;
                        vg.v0 v0Var4 = new vg.v0(d2Var5, 10, false);
                        v0Var4.K0();
                        d2Var5.showDialog(v0Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.d2 d2Var6 = d2Var;
                        vg.v0 v0Var5 = new vg.v0(d2Var6, 12, false);
                        v0Var5.K0();
                        d2Var6.showDialog(v0Var5);
                        break;
                    case 18:
                        d2Var.presentFragment(new t90());
                        break;
                    case 19:
                        t90 t90Var2 = new t90();
                        d2Var.presentFragment(t90Var2);
                        t90Var2.a0(3);
                        break;
                    case 20:
                        t90 t90Var3 = new t90();
                        d2Var.presentFragment(t90Var3);
                        t90Var3.b0(3);
                        t90Var3.a0(1);
                        break;
                    case 21:
                        d2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        t90 t90Var4 = new t90();
                        d2Var.presentFragment(t90Var4);
                        t90Var4.b0(3);
                        t90Var4.a0(2);
                        break;
                    case 23:
                        t90 t90Var5 = new t90();
                        d2Var.presentFragment(t90Var5);
                        t90Var5.a0(28700);
                        break;
                    case 24:
                        d2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        t90 t90Var6 = new t90();
                        d2Var.presentFragment(t90Var6);
                        t90Var6.b0(28700);
                        t90Var6.a0(16388);
                        break;
                    case 26:
                        t90 t90Var7 = new t90();
                        d2Var.presentFragment(t90Var7);
                        t90Var7.b0(28700);
                        t90Var7.a0(8200);
                        break;
                    case 27:
                        t90 t90Var8 = new t90();
                        d2Var.presentFragment(t90Var8);
                        t90Var8.b0(28700);
                        t90Var8.a0(4112);
                        break;
                    case 28:
                        t90 t90Var9 = new t90();
                        d2Var.presentFragment(t90Var9);
                        t90Var9.a0(360928);
                        break;
                    default:
                        t90 t90Var10 = new t90();
                        d2Var.presentFragment(t90Var10);
                        t90Var10.b0(360928);
                        t90Var10.a0(32);
                        break;
                }
            }
        });
        kw0Var133.a("tg://settings/power-saving/background");
        final int i102 = 0;
        kw0 kw0Var134 = new kw0(910, org.telegram.messenger.bd.L0(2131748855), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i102;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i103 = 1;
        kw0 kw0Var135 = new kw0(911, org.telegram.messenger.bd.L0(2131748859), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i103;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        if (org.telegram.messenger.az.o() >= 1) {
            final int i104 = 3;
            kw0Var22 = new kw0(org.telegram.messenger.hs.x5, org.telegram.messenger.bd.L0(2131748866), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.gw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i112 = i104;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i112) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            break;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            break;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            break;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            break;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            break;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            break;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            break;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((o90) arrayList.get(i122)).f == 1) {
                                    t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            break;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            break;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            break;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            break;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            break;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            kw0Var22 = null;
        }
        final int i105 = 4;
        kw0 kw0Var136 = new kw0(912, org.telegram.messenger.bd.L0(2131748860), null, org.telegram.messenger.bd.L0(2131747074), org.telegram.messenger.bd.L0(2131748864), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i105;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i106 = 5;
        kw0 kw0Var137 = new kw0(913, org.telegram.messenger.bd.L0(2131748865), org.telegram.messenger.bd.L0(2131747074), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i106;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var137.a("tg://settings/power-saving/call-animations");
        final int i107 = 7;
        kw0 kw0Var138 = new kw0(org.telegram.messenger.hs.r3, org.telegram.messenger.bd.L0(2131748868), org.telegram.messenger.bd.L0(2131747074), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i107;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var138.a("tg://settings/power-saving/videos");
        final int i108 = 8;
        kw0 kw0Var139 = new kw0(org.telegram.messenger.hs.q3, org.telegram.messenger.bd.L0(2131748871), org.telegram.messenger.bd.L0(2131747074), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i108;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var139.a("tg://settings/power-saving/gifs");
        final int i109 = 9;
        kw0 kw0Var140 = new kw0(914, org.telegram.messenger.bd.L0(2131748854), org.telegram.messenger.bd.L0(2131747074), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i109;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var140.a("tg://settings/power-saving/transitions");
        final int i110 = 10;
        kw0 kw0Var141 = new kw0(400, org.telegram.messenger.bd.L0(2131749062), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i110;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var141.a("tg://settings/language");
        final int i111 = 11;
        kw0 kw0Var142 = new kw0(405, org.telegram.messenger.bd.L0(2131745337), org.telegram.messenger.bd.L0(2131749062), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i112 = i111;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i112) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.hp.s1(currentAccount).T1().s()) {
            final int i112 = 12;
            kw0 kw0Var143 = new kw0(406, org.telegram.messenger.bd.L0(2131751359), org.telegram.messenger.bd.L0(2131749062), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.gw0
                @Override // java.lang.Runnable
                public final void run() {
                    int i1122 = i112;
                    int i122 = 0;
                    org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                    switch (i1122) {
                        case 0:
                            t90 t90Var = new t90();
                            d2Var2.presentFragment(t90Var);
                            t90Var.b0(360928);
                            t90Var.a0(64);
                            break;
                        case 1:
                            t90 t90Var2 = new t90();
                            d2Var2.presentFragment(t90Var2);
                            t90Var2.b0(360928);
                            t90Var2.a0(128);
                            break;
                        case 2:
                            d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            t90 t90Var3 = new t90();
                            d2Var2.presentFragment(t90Var3);
                            t90Var3.b0(360928);
                            t90Var3.a0(256);
                            break;
                        case 4:
                            t90 t90Var4 = new t90();
                            d2Var2.presentFragment(t90Var4);
                            t90Var4.b0(360928);
                            t90Var4.a0(32768);
                            break;
                        case 5:
                            t90 t90Var5 = new t90();
                            d2Var2.presentFragment(t90Var5);
                            t90Var5.a0(512);
                            break;
                        case 6:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            t90 t90Var6 = new t90();
                            d2Var2.presentFragment(t90Var6);
                            t90Var6.a0(1024);
                            break;
                        case 8:
                            t90 t90Var7 = new t90();
                            d2Var2.presentFragment(t90Var7);
                            t90Var7.a0(2048);
                            break;
                        case 9:
                            t90 t90Var8 = new t90();
                            d2Var2.presentFragment(t90Var8);
                            while (true) {
                                ArrayList arrayList = t90Var8.s;
                                if (i122 >= arrayList.size()) {
                                    break;
                                } else if (((o90) arrayList.get(i122)).f == 1) {
                                    t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                    break;
                                } else {
                                    i122++;
                                }
                            }
                        case 10:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            d2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                            v0Var.K0();
                            d2Var2.showDialog(v0Var);
                            break;
                        case 14:
                            d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                            break;
                        case 15:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                            break;
                        case 16:
                            sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                            break;
                        case 17:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            d2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            d2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            d2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                            v0Var2.K0();
                            d2Var2.showDialog(v0Var2);
                            break;
                        case 24:
                            d2Var2.presentFragment(new g(3));
                            break;
                        case 25:
                            d2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            it0 it0Var = new it0();
                            it0Var.getMessagesController().F0(true);
                            d2Var2.presentFragment(it0Var);
                            break;
                        case 27:
                            d2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            kw0Var143.a("tg://settings/language/do-not-translate");
            kw0Var43 = kw0Var143;
        }
        final int i113 = 14;
        kw0 kw0Var144 = new kw0(402, org.telegram.messenger.bd.L0(2131753986), org.telegram.messenger.bd.L0(2131745489), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1122 = i113;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i1122) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var144.a("tg://settings/ask-question");
        final int i114 = 15;
        kw0 kw0Var145 = new kw0(403, org.telegram.messenger.bd.L0(2131744252), org.telegram.messenger.bd.L0(2131745489), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1122 = i114;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i1122) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var145.a("tg://settings/faq");
        final int i115 = 16;
        kw0 kw0Var146 = new kw0(404, org.telegram.messenger.bd.L0(2131746791), org.telegram.messenger.bd.L0(2131745489), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.gw0
            @Override // java.lang.Runnable
            public final void run() {
                int i1122 = i115;
                int i122 = 0;
                org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                switch (i1122) {
                    case 0:
                        t90 t90Var = new t90();
                        d2Var2.presentFragment(t90Var);
                        t90Var.b0(360928);
                        t90Var.a0(64);
                        break;
                    case 1:
                        t90 t90Var2 = new t90();
                        d2Var2.presentFragment(t90Var2);
                        t90Var2.b0(360928);
                        t90Var2.a0(128);
                        break;
                    case 2:
                        d2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        t90 t90Var3 = new t90();
                        d2Var2.presentFragment(t90Var3);
                        t90Var3.b0(360928);
                        t90Var3.a0(256);
                        break;
                    case 4:
                        t90 t90Var4 = new t90();
                        d2Var2.presentFragment(t90Var4);
                        t90Var4.b0(360928);
                        t90Var4.a0(32768);
                        break;
                    case 5:
                        t90 t90Var5 = new t90();
                        d2Var2.presentFragment(t90Var5);
                        t90Var5.a0(512);
                        break;
                    case 6:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        t90 t90Var6 = new t90();
                        d2Var2.presentFragment(t90Var6);
                        t90Var6.a0(1024);
                        break;
                    case 8:
                        t90 t90Var7 = new t90();
                        d2Var2.presentFragment(t90Var7);
                        t90Var7.a0(2048);
                        break;
                    case 9:
                        t90 t90Var8 = new t90();
                        d2Var2.presentFragment(t90Var8);
                        while (true) {
                            ArrayList arrayList = t90Var8.s;
                            if (i122 >= arrayList.size()) {
                                break;
                            } else if (((o90) arrayList.get(i122)).f == 1) {
                                t90Var8.b.e1(new k2.q(t90Var8, i122, 13), 700, true);
                                break;
                            } else {
                                i122++;
                            }
                        }
                    case 10:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        d2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        vg.v0 v0Var = new vg.v0(d2Var2, 0, false);
                        v0Var.K0();
                        d2Var2.showDialog(v0Var);
                        break;
                    case 14:
                        d2Var2.showDialog(org.telegram.ui.Components.t4.T(d2Var2, null));
                        break;
                    case 15:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131744250, null));
                        break;
                    case 16:
                        sf.c.t(d2Var2.getParentActivity(), org.telegram.messenger.bd.M0(2131746789, null));
                        break;
                    case 17:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        d2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        d2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        d2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        vg.v0 v0Var2 = new vg.v0(d2Var2, 11, false);
                        v0Var2.K0();
                        d2Var2.showDialog(v0Var2);
                        break;
                    case 24:
                        d2Var2.presentFragment(new g(3));
                        break;
                    case 25:
                        d2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        it0 it0Var = new it0();
                        it0Var.getMessagesController().F0(true);
                        d2Var2.presentFragment(it0Var);
                        break;
                    case 27:
                        d2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        d2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        d2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        kw0Var146.a("tg://settings/privacy-policy");
        return new kw0[]{kw0Var23, kw0Var24, kw0Var25, kw0Var26, kw0Var27, kw0Var28, kw0Var29, kw0Var30, kw0Var31, kw0Var32, kw0Var33, kw0Var34, kw0Var35, kw0Var36, kw0Var37, kw0Var38, kw0Var39, kw0Var, kw0Var41, kw0Var42, kw0Var2, kw0Var44, kw0Var45, kw0Var46, kw0Var47, kw0Var48, kw0Var49, kw0Var50, kw0Var51, kw0Var52, kw0Var3, kw0Var4, kw0Var54, kw0Var55, kw0Var56, kw0Var57, kw0Var58, kw0Var59, kw0Var60, kw0Var61, kw0Var62, kw0Var63, kw0Var64, kw0Var65, kw0Var66, kw0Var67, kw0Var68, kw0Var69, kw0Var70, kw0Var71, kw0Var72, kw0Var73, kw0Var74, kw0Var75, kw0Var76, kw0Var77, kw0Var78, kw0Var79, kw0Var80, kw0Var81, kw0Var82, kw0Var83, kw0Var84, kw0Var85, kw0Var86, kw0Var87, kw0Var88, kw0Var89, kw0Var90, kw0Var91, kw0Var92, kw0Var93, kw0Var94, kw0Var95, kw0Var96, kw0Var97, kw0Var98, kw0Var99, kw0Var100, kw0Var101, kw0Var102, kw0Var103, kw0Var104, kw0Var105, kw0Var106, kw0Var107, kw0Var108, kw0Var109, kw0Var110, kw0Var111, kw0Var112, kw0Var6, kw0Var114, kw0Var7, kw0Var116, kw0Var8, kw0Var118, kw0Var119, kw0Var120, kw0Var121, kw0Var5, kw0Var9, kw0Var10, kw0Var11, kw0Var12, kw0Var13, kw0Var14, kw0Var15, kw0Var16, kw0Var123, kw0Var17, kw0Var18, kw0Var19, kw0Var20, kw0Var21, kw0Var124, kw0Var125, kw0Var126, kw0Var127, kw0Var128, kw0Var129, kw0Var130, kw0Var131, kw0Var132, kw0Var133, kw0Var134, kw0Var135, kw0Var22, kw0Var136, kw0Var137, kw0Var138, kw0Var139, kw0Var140, kw0Var141, kw0Var142, kw0Var43, kw0Var144, kw0Var145, kw0Var146};
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return d1Var.f == 0;
    }

    public final void E(Object obj) {
        ArrayList arrayList = this.w;
        int indexOf = arrayList.indexOf(obj);
        if (indexOf >= 0) {
            arrayList.remove(indexOf);
        }
        arrayList.add(0, obj);
        if (!this.x) {
            f();
        }
        if (arrayList.size() > 20) {
            a1.g.y(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Object obj2 = arrayList.get(i3);
            if (obj2 instanceof kw0) {
                ((kw0) obj2).g = i3;
            } else if (obj2 instanceof org.telegram.messenger.to) {
                ((org.telegram.messenger.to) obj2).d = i3;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.hp.e1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i3 = this.f;
        TLRPC.WebPage webPage = org.telegram.messenger.hp.s1(i3).r2;
        this.F = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.hp.s1(i3).q2);
        }
        if (this.F != null || this.G) {
            return;
        }
        this.G = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = org.telegram.messenger.bd.M0(2131744250, null);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i3).sendRequest(tL_messages_getWebPage, new l(this, 21));
    }

    public final void I(String str) {
        this.E = str;
        if (this.y != null) {
            Utilities.g.a(this.y);
            this.y = null;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.p5 p5Var = Utilities.g;
            qv0 qv0Var = new qv0(2, this, str);
            this.y = qv0Var;
            p5Var.e(qv0Var, 300L);
            return;
        }
        this.x = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.d2 d2Var = this.e;
        if (d2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) d2Var).P.b.getImageReceiver().P0(false);
                ((ProfileActivity) this.e).P.d.setText(org.telegram.messenger.bd.M0(2131745487, null));
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        f();
    }

    public final void J() {
        String[] strArr;
        kw0 kw0Var;
        HashMap hashMap = new HashMap();
        int i3 = 0;
        while (true) {
            kw0[] kw0VarArr = this.c;
            if (i3 >= kw0VarArr.length) {
                break;
            }
            kw0 kw0Var2 = kw0VarArr[i3];
            if (kw0Var2 != null) {
                hashMap.put(Integer.valueOf(kw0Var2.f), this.c[i3]);
            }
            i3++;
        }
        Set<String> stringSet = org.telegram.messenger.hp.e1().getStringSet("settingsSearchRecent2", null);
        ArrayList arrayList = this.w;
        if (stringSet != null) {
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(it.next()));
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
                        org.telegram.messenger.to toVar = new org.telegram.messenger.to(readString, strArr, serializedData.readString(false));
                        toVar.d = readInt32;
                        arrayList.add(toVar);
                    } else if (readInt322 == 1 && (kw0Var = (kw0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        kw0Var.g = readInt32;
                        arrayList.add(kw0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new org.telegram.ui.Components.d80(this));
    }

    @Override // u4.h0
    public final int b() {
        if (this.x) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.w;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // u4.h0
    public final int d(int i3) {
        if (!this.x) {
            ArrayList arrayList = this.w;
            if (i3 == 0) {
                if (!arrayList.isEmpty()) {
                    return 2;
                }
            } else if (arrayList.isEmpty() || i3 != arrayList.size() + 1) {
                return 0;
            }
        } else if (i3 < this.r.size() || i3 != this.r.size()) {
            return 0;
        }
        return 1;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10 = d1Var.f;
        View view = d1Var.a;
        if (i10 != 0) {
            if (i10 == 1) {
                ((org.telegram.ui.Cells.x3) view).setText(org.telegram.messenger.bd.M0(2131745492, null));
                return;
            } else {
                if (i10 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.n4) view).setText(org.telegram.messenger.bd.M0(2131745479, null));
                return;
            }
        }
        org.telegram.ui.Cells.u6 u6Var = (org.telegram.ui.Cells.u6) view;
        if (this.x) {
            if (i3 >= this.r.size()) {
                int f10 = k2.p1.f(1, i3, this.r);
                u6Var.a((CharSequence) this.n.get(this.r.size() + f10), ((org.telegram.messenger.to) this.s.get(f10)).b, true, f10 < this.r.size() - 1);
                return;
            } else {
                kw0 kw0Var = (kw0) this.r.get(i3);
                kw0 kw0Var2 = i3 > 0 ? (kw0) this.r.get(i3 - 1) : null;
                u6Var.b((CharSequence) this.n.get(i3), kw0Var.d, (kw0Var2 == null || kw0Var2.e != kw0Var.e) ? kw0Var.e : 0, i3 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.w;
        if (!arrayList.isEmpty()) {
            i3--;
        }
        if (i3 >= arrayList.size()) {
            int f11 = k2.p1.f(1, i3, arrayList);
            org.telegram.messenger.to toVar = (org.telegram.messenger.to) this.d.get(f11);
            u6Var.a(toVar.a, toVar.b, true, f11 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i3);
        if (obj instanceof kw0) {
            kw0 kw0Var3 = (kw0) obj;
            u6Var.a(kw0Var3.a, kw0Var3.d, false, i3 < arrayList.size() - 1);
        } else if (obj instanceof org.telegram.messenger.to) {
            org.telegram.messenger.to toVar2 = (org.telegram.messenger.to) obj;
            u6Var.a(toVar2.a, toVar2.b, true, i3 < arrayList.size() - 1);
        }
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        Context context = this.h;
        View n4Var = i3 != 0 ? i3 != 1 ? new org.telegram.ui.Cells.n4(context, 16) : new org.telegram.ui.Cells.x3(context, null) : new org.telegram.ui.Cells.u6(context);
        n4Var.setLayoutParams(new u4.p0(-1, -2));
        return new org.telegram.ui.Components.bj0(n4Var);
    }
}
