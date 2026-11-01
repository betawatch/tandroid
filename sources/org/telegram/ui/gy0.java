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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public class gy0 extends org.telegram.ui.Components.tk0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public fy0[] c;
    public final org.telegram.ui.ActionBar.k2 e;
    public final int f;
    public final Context h;
    public boolean x;
    public hr0 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public gy0(Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        this.e = k2Var;
        this.f = k2Var.getCurrentAccount();
        this.h = context;
        this.c = H(k2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (!org.telegram.messenger.wp.r1(i10).A3() || org.telegram.messenger.e20.i(i10).q()) {
            return i11 == -1 || org.telegram.messenger.wp.r1(i10).N0.get(i11, -1) != -1;
        }
        return false;
    }

    public static fy0[] H(final org.telegram.ui.ActionBar.k2 k2Var) {
        fy0 fy0Var;
        fy0 fy0Var2;
        fy0 fy0Var3;
        fy0 fy0Var4;
        fy0 fy0Var5;
        fy0 fy0Var6;
        fy0 fy0Var7;
        fy0 fy0Var8;
        fy0 fy0Var9;
        fy0 fy0Var10;
        fy0 fy0Var11;
        fy0 fy0Var12;
        fy0 fy0Var13;
        fy0 fy0Var14;
        fy0 fy0Var15;
        fy0 fy0Var16;
        fy0 fy0Var17;
        fy0 fy0Var18;
        fy0 fy0Var19;
        fy0 fy0Var20;
        fy0 fy0Var21;
        fy0 fy0Var22;
        final int currentAccount = k2Var.getCurrentAccount();
        final int i10 = 20;
        fy0 fy0Var23 = new fy0(500, org.telegram.messenger.dd.K0(2131751265), 0, new hr0(i10, k2Var, k2Var.getResourceProvider()));
        final int i11 = 24;
        fy0 fy0Var24 = new fy0(501, org.telegram.messenger.dd.K0(2131752537), 0, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                int i13 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i12) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i13 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i13)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i13, 14), 700, true);
                                break;
                            } else {
                                i13++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var24.a("tg://settings/edit/change-number");
        final int i12 = 6;
        fy0 fy0Var25 = new fy0(502, org.telegram.messenger.dd.K0(2131754468), 0, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i12) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i13 = 0;
                        while (true) {
                            if (i13 >= 4) {
                                i13 = -1;
                            } else if (org.telegram.messenger.e20.i(i13).p()) {
                                i13++;
                            }
                        }
                        if (i13 >= 0) {
                            k2Var.presentFragment(new gf0(i13));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var25.a("tg://settings/edit/add-account");
        final int i13 = 17;
        final int i14 = 1;
        fy0 fy0Var26 = new fy0(1, org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i13) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var26.a("tg://settings/notifications");
        final int i15 = 29;
        fy0 fy0Var27 = new fy0(2, org.telegram.messenger.dd.K0(2131747894), org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var27.a("tg://settings/notifications/private-chats");
        final int i16 = 11;
        fy0 fy0Var28 = new fy0(3, org.telegram.messenger.dd.K0(2131747923), org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        fy0Var28.a("tg://settings/notifications/groups");
        fy0 fy0Var29 = new fy0(4, org.telegram.messenger.dd.K0(2131747937), org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new ah0(7, k2Var));
        fy0Var29.a("tg://settings/notifications/channels");
        final int i17 = 19;
        fy0 fy0Var30 = new fy0(5, org.telegram.messenger.dd.K0(2131743305), "callsSectionRow", org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new ah0(i17, k2Var));
        fy0 fy0Var31 = new fy0(6, org.telegram.messenger.dd.K0(2131753733), "badgeNumberSection", org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i14) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i18 = 13;
        fy0 fy0Var32 = new fy0(7, org.telegram.messenger.dd.K0(2131749228), "inappSectionRow", org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i18) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0 fy0Var33 = new fy0(8, org.telegram.messenger.dd.K0(2131751790), "contactJoinedRow", org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new ah0(23, k2Var));
        fy0Var33.a("tg://settings/notifications/new-contacts");
        fy0 fy0Var34 = new fy0(9, org.telegram.messenger.dd.K0(2131747244), "pinnedMessageRow", org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i11) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var34.a("tg://settings/notifications/pinned-messages");
        fy0 fy0Var35 = new fy0(10, org.telegram.messenger.dd.K0(2131746129), "resetNotificationsRow", org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var35.a("tg://settings/notifications/reset");
        fy0 fy0Var36 = new fy0(11, org.telegram.messenger.dd.K0(2131747892), "notificationsServiceRow", org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i13;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i19 = 18;
        fy0 fy0Var37 = new fy0(12, org.telegram.messenger.dd.K0(2131747891), "notificationsServiceConnectionRow", org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i19;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0 fy0Var38 = new fy0(13, org.telegram.messenger.dd.K0(2131746290), "repeatRow", org.telegram.messenger.dd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i17;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0 fy0Var39 = new fy0(100, org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i10;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var39.a("tg://settings/privacy");
        final int i20 = 21;
        fy0 fy0Var40 = new fy0(org.telegram.messenger.at.u1, org.telegram.messenger.dd.K0(2131743963), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i20;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        fy0 fy0Var41 = new fy0(org.telegram.messenger.at.I1, org.telegram.messenger.dd.K0(2131753850), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i21;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                int i23 = currentAccount;
                switch (i22) {
                    case 0:
                        if (org.telegram.messenger.e20.i(i23).p0 >= 0) {
                            k2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.e20.i(i23).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), null);
                            ebVar.d(R.raw.voip_muted, new String[0]);
                            String L0 = org.telegram.messenger.dd.L0(2131746770, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                            int indexOf = L0.indexOf(42);
                            int lastIndexOf = L0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) L0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new dh.a(a02, 6), indexOf, lastIndexOf - 1, 33);
                            }
                            ebVar.b.setText(spannableStringBuilder);
                            ebVar.b.setSingleLine(false);
                            ebVar.b.setMaxLines(2);
                            a02.b(ebVar, 2750).j();
                            break;
                        } else {
                            k2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        fy0Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        fy0 fy0Var42 = new fy0(org.telegram.messenger.at.t1, org.telegram.messenger.dd.K0(2131747673), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i22;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var42.a("tg://settings/privacy/passcode");
        fy0 fy0Var43 = null;
        if (org.telegram.messenger.uz.m1) {
            fy0Var = fy0Var40;
            final int i23 = 25;
            fy0Var2 = new fy0(org.telegram.messenger.at.J1, org.telegram.messenger.dd.K0(2131751203), "emailLoginRow", org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.by0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i23;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            break;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            break;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            break;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            break;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            break;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((va0) arrayList.get(i132)).f == 1) {
                                    ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                    break;
                                } else {
                                    i132++;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            break;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            break;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            break;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            break;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            break;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            fy0Var2.a("tg://settings/privacy/login-email");
        } else {
            fy0Var = fy0Var40;
            fy0Var2 = null;
        }
        final int i24 = 26;
        fy0 fy0Var44 = new fy0(101, org.telegram.messenger.dd.K0(2131753681), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i24;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        fy0 fy0Var45 = new fy0(org.telegram.messenger.at.v1, org.telegram.messenger.dd.K0(2131745568), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i25;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var45.a("tg://settings/devices");
        final int i26 = 28;
        fy0 fy0Var46 = new fy0(org.telegram.messenger.at.q1, org.telegram.messenger.dd.K0(2131746805), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i26;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        fy0 fy0Var47 = new fy0(org.telegram.messenger.at.n1, org.telegram.messenger.dd.K0(2131746830), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i27;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        fy0 fy0Var48 = new fy0(org.telegram.messenger.at.o1, org.telegram.messenger.dd.K0(2131746792), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i28) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        fy0 fy0Var49 = new fy0(org.telegram.messenger.at.p1, org.telegram.messenger.dd.K0(2131746852), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i29) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        fy0 fy0Var50 = new fy0(org.telegram.messenger.at.G1, org.telegram.messenger.dd.K0(2131746815), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i30) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        fy0 fy0Var51 = new fy0(org.telegram.messenger.at.r1, org.telegram.messenger.dd.K0(2131752596), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i31) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        fy0 fy0Var52 = new fy0(org.telegram.messenger.at.s1, org.telegram.messenger.dd.K0(2131746832), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i32) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        fy0 fy0Var53 = new fy0(org.telegram.messenger.at.H1, org.telegram.messenger.dd.K0(2131746773), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i222 = i33;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                int i232 = currentAccount;
                switch (i222) {
                    case 0:
                        if (org.telegram.messenger.e20.i(i232).p0 >= 0) {
                            k2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.e20.i(i232).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), null);
                            ebVar.d(R.raw.voip_muted, new String[0]);
                            String L0 = org.telegram.messenger.dd.L0(2131746770, null);
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(L0);
                            int indexOf = L0.indexOf(42);
                            int lastIndexOf = L0.lastIndexOf(42);
                            if (indexOf >= 0) {
                                spannableStringBuilder.replace(indexOf, lastIndexOf + 1, (CharSequence) L0.substring(indexOf + 1, lastIndexOf));
                                spannableStringBuilder.setSpan(new dh.a(a02, 6), indexOf, lastIndexOf - 1, 33);
                            }
                            ebVar.b.setText(spannableStringBuilder);
                            ebVar.b.setSingleLine(false);
                            ebVar.b.setMaxLines(2);
                            a02.b(ebVar, 2750).j();
                            break;
                        } else {
                            k2Var2.presentFragment(new PrivacyControlActivity(8, true));
                            break;
                        }
                }
            }
        });
        fy0Var53.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.wp.r1(currentAccount).a4) {
            fy0Var3 = fy0Var53;
            final int i34 = 7;
            fy0Var4 = new fy0(org.telegram.messenger.at.F1, org.telegram.messenger.dd.K0(2131754171), "newChatsRow", org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i34) {
                        case 0:
                            k2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            k2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            k2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            k2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 5:
                            k2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (org.telegram.messenger.e20.i(i132).p()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                k2Var.presentFragment(new gf0(i132));
                                break;
                            }
                            break;
                        case 7:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            k2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                        case 15:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            k2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            k2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            k2Var.presentFragment(new y6());
                            break;
                        case 24:
                            k2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            break;
                        case 26:
                            k2Var.presentFragment(new y6());
                            break;
                        case 27:
                            k2Var.presentFragment(new y6());
                            break;
                        case 28:
                            k2Var.presentFragment(new lu());
                            break;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            fy0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            fy0Var3 = fy0Var53;
            fy0Var4 = null;
        }
        final int i35 = 8;
        fy0 fy0Var54 = new fy0(org.telegram.messenger.at.x1, org.telegram.messenger.dd.K0(2131751597), "deleteAccountRow", org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i35) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        fy0 fy0Var55 = new fy0(org.telegram.messenger.at.y1, org.telegram.messenger.dd.K0(2131746812), "paymentsClearRow", org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i36) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        fy0 fy0Var56 = new fy0(org.telegram.messenger.at.z1, org.telegram.messenger.dd.K0(2131742937), org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i37) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        fy0 fy0Var57 = new fy0(org.telegram.messenger.at.A1, org.telegram.messenger.dd.K0(2131744322), "contactsDeleteRow", org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i38) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        fy0 fy0Var58 = new fy0(org.telegram.messenger.at.B1, org.telegram.messenger.dd.K0(2131744324), "contactsSyncRow", org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i39) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        fy0 fy0Var59 = new fy0(org.telegram.messenger.at.C1, org.telegram.messenger.dd.K0(2131744438), "contactsSuggestRow", org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i40) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        fy0 fy0Var60 = new fy0(org.telegram.messenger.at.D1, org.telegram.messenger.dd.K0(2131748704), "secretMapRow", org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i41) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        fy0 fy0Var61 = new fy0(org.telegram.messenger.at.E1, org.telegram.messenger.dd.K0(2131745701), "secretWebpageRow", org.telegram.messenger.dd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i42) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        fy0 fy0Var62 = new fy0(120, org.telegram.messenger.dd.K0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i43) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var62.a("tg://settings/devices");
        final int i44 = 19;
        fy0 fy0Var63 = new fy0(org.telegram.messenger.at.F1, org.telegram.messenger.dd.K0(2131744233), "terminateAllSessionsRow", org.telegram.messenger.dd.K0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i44) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        fy0 fy0Var64 = new fy0(org.telegram.messenger.at.G1, org.telegram.messenger.dd.K0(2131748927), org.telegram.messenger.dd.K0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i45) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        fy0 fy0Var65 = new fy0(org.telegram.messenger.at.e3, org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i46) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        fy0 fy0Var66 = new fy0(org.telegram.messenger.at.f3, org.telegram.messenger.dd.K0(2131751677), "usageSectionRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i47) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        fy0 fy0Var67 = new fy0(org.telegram.messenger.at.g3, org.telegram.messenger.dd.K0(2131744834), org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i48) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        fy0 fy0Var68 = new fy0(203, org.telegram.messenger.dd.K0(2131749070), "keepMediaRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131744834), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i49) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        fy0 fy0Var69 = new fy0(org.telegram.messenger.at.i3, org.telegram.messenger.dd.K0(2131752075), "cacheRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131744834), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i50) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        fy0 fy0Var70 = new fy0(org.telegram.messenger.at.j3, org.telegram.messenger.dd.K0(2131748784), "databaseRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131744834), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i51) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        fy0 fy0Var71 = new fy0(org.telegram.messenger.at.k3, org.telegram.messenger.dd.K0(2131748312), org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i52) {
                    case 0:
                        k2Var.presentFragment(new PrivacyControlActivity(4, true));
                        break;
                    case 1:
                        k2Var.presentFragment(new PrivacyControlActivity(5, true));
                        break;
                    case 2:
                        k2Var.presentFragment(new PrivacyControlActivity(3, true));
                        break;
                    case 3:
                        k2Var.presentFragment(new PrivacyControlActivity(2, true));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new PrivacyControlActivity(1, true));
                        break;
                    case 6:
                        int i132 = 0;
                        while (true) {
                            if (i132 >= 4) {
                                i132 = -1;
                            } else if (org.telegram.messenger.e20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new gf0(i132));
                            break;
                        }
                        break;
                    case 7:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new SessionsActivity(1));
                        break;
                    case 11:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 12:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 17:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 19:
                        k2Var.presentFragment(new SessionsActivity(0));
                        break;
                    case 20:
                        SessionsActivity sessionsActivity = new SessionsActivity(0);
                        sessionsActivity.V = true;
                        k2Var.presentFragment(sessionsActivity);
                        break;
                    case 21:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 22:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 23:
                        k2Var.presentFragment(new y6());
                        break;
                    case 24:
                        k2Var.presentFragment(new y6());
                        break;
                    case 25:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 26:
                        k2Var.presentFragment(new y6());
                        break;
                    case 27:
                        k2Var.presentFragment(new y6());
                        break;
                    case 28:
                        k2Var.presentFragment(new lu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        fy0Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        fy0 fy0Var72 = new fy0(org.telegram.messenger.at.l3, org.telegram.messenger.dd.K0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i53) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i54 = 1;
        fy0 fy0Var73 = new fy0(208, org.telegram.messenger.dd.K0(2131742910), org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i54) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i55 = 2;
        fy0 fy0Var74 = new fy0(org.telegram.messenger.at.m3, org.telegram.messenger.dd.K0(2131742912), org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i55) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i56 = 3;
        fy0 fy0Var75 = new fy0(org.telegram.messenger.at.n3, org.telegram.messenger.dd.K0(2131742911), org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i56) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i57 = 4;
        fy0 fy0Var76 = new fy0(org.telegram.messenger.at.o3, org.telegram.messenger.dd.K0(2131746128), "resetDownloadRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i57) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        fy0Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        fy0 fy0Var77 = new fy0(org.telegram.messenger.at.s3, org.telegram.messenger.dd.K0(2131744464), "streamSectionRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i58) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i59 = 7;
        fy0 fy0Var78 = new fy0(org.telegram.messenger.at.t3, org.telegram.messenger.dd.K0(2131751145), "enableStreamRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i59) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i60 = 8;
        fy0 fy0Var79 = new fy0(org.telegram.messenger.at.u3, org.telegram.messenger.dd.K0(2131752596), "callsSectionRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i60) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i61 = 9;
        fy0 fy0Var80 = new fy0(org.telegram.messenger.at.v3, org.telegram.messenger.dd.K0(2131743255), "useLessDataForCallsRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i61) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        fy0Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        fy0 fy0Var81 = new fy0(org.telegram.messenger.at.w3, org.telegram.messenger.dd.K0(2131743284), "quickRepliesRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i62) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i63 = 12;
        fy0 fy0Var82 = new fy0(org.telegram.messenger.at.x3, org.telegram.messenger.dd.K0(2131746616), org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i63) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        fy0Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        fy0 fy0Var83 = new fy0(org.telegram.messenger.at.w1, org.telegram.messenger.dd.K0(2131746856), "clearDraftsRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i64) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        fy0Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        fy0 fy0Var84 = new fy0(org.telegram.messenger.at.z3, org.telegram.messenger.dd.K0(2131745946), "saveToGallerySectionRow", org.telegram.messenger.dd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i65) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        final int i66 = 15;
        fy0 fy0Var85 = new fy0(org.telegram.messenger.at.A3, org.telegram.messenger.dd.K0(2131745936), "saveToGalleryPeerRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131745946), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i66) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        fy0Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        fy0 fy0Var86 = new fy0(org.telegram.messenger.at.B3, org.telegram.messenger.dd.K0(2131745943), "saveToGalleryGroupsRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131745946), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i67) {
                    case 0:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 1:
                        k2Var.presentFragment(new DataAutoDownloadActivity(0));
                        break;
                    case 2:
                        k2Var.presentFragment(new DataAutoDownloadActivity(1));
                        break;
                    case 3:
                        k2Var.presentFragment(new DataAutoDownloadActivity(2));
                        break;
                    case 4:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 5:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 6:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 7:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 8:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 9:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 10:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 11:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                        break;
                    case 12:
                        k2Var.presentFragment(new ProxyListActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 14:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 15:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    case 16:
                        k2Var.presentFragment(new DataSettingsActivity());
                        break;
                    default:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                }
            }
        });
        fy0Var86.a("tg://settings/data/save-to-photos/groups");
        fy0 fy0Var87 = new fy0(org.telegram.messenger.at.C3, org.telegram.messenger.dd.K0(2131745945), "saveToGalleryChannelsRow", org.telegram.messenger.dd.K0(2131751678), org.telegram.messenger.dd.K0(2131745946), R.drawable.msg2_data, new ah0(2, k2Var));
        fy0Var87.a("tg://settings/data/save-to-photos/channels");
        fy0 fy0Var88 = new fy0(org.telegram.messenger.at.X4, org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(3, k2Var));
        fy0Var88.a("tg://settings/appearance/themes");
        fy0 fy0Var89 = new fy0(org.telegram.messenger.at.Y4, org.telegram.messenger.dd.K0(2131744216), "textSizeHeaderRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(4, k2Var));
        fy0Var89.a("tg://settings/appearance/text-size");
        fy0 fy0Var90 = new fy0(org.telegram.messenger.at.Z4, org.telegram.messenger.dd.K0(2131752550), org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(5, k2Var));
        fy0Var90.a("tg://settings/appearance/wallpapers");
        fy0 fy0Var91 = new fy0(org.telegram.messenger.at.a5, org.telegram.messenger.dd.K0(2131745555), null, org.telegram.messenger.dd.K0(2131752210), org.telegram.messenger.dd.K0(2131752244), R.drawable.msg2_discussion, new ah0(6, k2Var));
        fy0 fy0Var92 = new fy0(org.telegram.messenger.at.b5, org.telegram.messenger.dd.K0(2131746125), "resetRow", org.telegram.messenger.dd.K0(2131752210), org.telegram.messenger.dd.K0(2131752244), R.drawable.msg2_discussion, new ah0(8, k2Var));
        fy0 fy0Var93 = new fy0(org.telegram.messenger.at.d5, org.telegram.messenger.dd.K0(2131752011), "themeHeaderRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(9, k2Var));
        fy0 fy0Var94 = new fy0(org.telegram.messenger.at.q5, org.telegram.messenger.dd.K0(2131752878), null, org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(10, k2Var));
        fy0 fy0Var95 = new fy0(org.telegram.messenger.at.r5, org.telegram.messenger.dd.K0(2131751713), "createNewThemeRow", org.telegram.messenger.dd.K0(2131752210), org.telegram.messenger.dd.K0(2131752878), R.drawable.msg2_discussion, new ah0(11, k2Var));
        fy0Var95.a("tg://settings/appearance/themes/create");
        fy0 fy0Var96 = new fy0(org.telegram.messenger.at.s5, org.telegram.messenger.dd.K0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(13, k2Var));
        fy0Var96.a("tg://settings/appearance/message-corners");
        fy0 fy0Var97 = new fy0(org.telegram.messenger.at.t5, org.telegram.messenger.dd.K0(2131752225), "chatListHeaderRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(14, k2Var));
        fy0 fy0Var98 = new fy0(org.telegram.messenger.at.u5, org.telegram.messenger.dd.K0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(15, k2Var));
        fy0 fy0Var99 = new fy0(org.telegram.messenger.at.v5, org.telegram.messenger.dd.K0(2131754240), "appIconHeaderRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(16, k2Var));
        fy0Var99.a("tg://settings/appearance/app-icon");
        fy0 fy0Var100 = new fy0(org.telegram.messenger.at.c5, org.telegram.messenger.dd.K0(2131753784), org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(17, k2Var));
        fy0 fy0Var101 = new fy0(org.telegram.messenger.at.z5, org.telegram.messenger.dd.K0(2131748266), "nextMediaTapRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(18, k2Var));
        fy0Var101.a("tg://settings/appearance/tap-for-next-media");
        fy0 fy0Var102 = new fy0(org.telegram.messenger.at.y5, org.telegram.messenger.dd.K0(2131746442), "raiseToListenRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(20, k2Var));
        fy0Var102.a("tg://settings/data/raise-to-listen");
        fy0 fy0Var103 = new fy0(org.telegram.messenger.at.h5, org.telegram.messenger.dd.K0(2131746440), "raiseToSpeakRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(21, k2Var));
        fy0Var103.a("tg://settings/data/raise-to-speak");
        fy0 fy0Var104 = new fy0(org.telegram.messenger.at.x5, org.telegram.messenger.dd.K0(2131747448), "pauseOnMediaRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(22, k2Var));
        fy0Var104.a("tg://settings/data/pause-music");
        fy0 fy0Var105 = new fy0(org.telegram.messenger.at.w5, org.telegram.messenger.dd.K0(2131748454), "bluetoothScoRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(24, k2Var));
        fy0 fy0Var106 = new fy0(org.telegram.messenger.at.f5, org.telegram.messenger.dd.K0(2131751439), "directShareRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(25, k2Var));
        fy0 fy0Var107 = new fy0(org.telegram.messenger.at.i5, org.telegram.messenger.dd.K0(2131745649), "sendByEnterRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(26, k2Var));
        fy0 fy0Var108 = new fy0(org.telegram.messenger.at.p5, org.telegram.messenger.dd.K0(2131751368), "distanceRow", org.telegram.messenger.dd.K0(2131752210), R.drawable.msg2_discussion, new ah0(27, k2Var));
        fy0 fy0Var109 = new fy0(600, org.telegram.messenger.dd.K0(2131744875), R.drawable.msg2_sticker, new ah0(28, k2Var));
        fy0Var109.a("tg://settings/appearance/stickers-and-emoji");
        fy0 fy0Var110 = new fy0(601, org.telegram.messenger.dd.K0(2131744428), "suggestRow", org.telegram.messenger.dd.K0(2131744875), R.drawable.msg2_sticker, new ah0(29, k2Var));
        final int i68 = 0;
        fy0 fy0Var111 = new fy0(602, org.telegram.messenger.dd.K0(2131750834), "featuredStickersHeaderRow", org.telegram.messenger.dd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i68) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        fy0 fy0Var112 = new fy0(603, org.telegram.messenger.dd.K0(2131748694), null, org.telegram.messenger.dd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i69) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        fy0 fy0Var113 = new fy0(604, org.telegram.messenger.dd.K0(2131754128), null, org.telegram.messenger.dd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i70) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        fy0 fy0Var114 = new fy0(605, org.telegram.messenger.dd.K0(2131754133), null, org.telegram.messenger.dd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i71) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        fy0 fy0Var115 = new fy0(606, org.telegram.messenger.dd.K0(2131749044), "largeEmojiRow", org.telegram.messenger.dd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i72) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        fy0 fy0Var116 = new fy0(607, org.telegram.messenger.dd.K0(2131748733), "loopRow", org.telegram.messenger.dd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i73) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        fy0 fy0Var117 = new fy0(608, org.telegram.messenger.dd.K0(2131751197), null, org.telegram.messenger.dd.K0(2131744875), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i74) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        fy0 fy0Var118 = new fy0(609, org.telegram.messenger.dd.K0(2131744442), "suggestAnimatedEmojiRow", org.telegram.messenger.dd.K0(2131744875), org.telegram.messenger.dd.K0(2131751197), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i75) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        fy0 fy0Var119 = new fy0(610, org.telegram.messenger.dd.K0(2131750836), "featuredStickersHeaderRow", org.telegram.messenger.dd.K0(2131744875), org.telegram.messenger.dd.K0(2131751197), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i76) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        fy0 fy0Var120 = new fy0(611, org.telegram.messenger.dd.K0(2131751351), null, org.telegram.messenger.dd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i77) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        fy0 fy0Var121 = new fy0(700, org.telegram.messenger.dd.K0(2131750697), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i78) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var121.a("tg://settings/folders");
        final int i79 = 21;
        fy0 fy0Var122 = new fy0(701, org.telegram.messenger.dd.K0(2131751717), "createFilterRow", org.telegram.messenger.dd.K0(2131750697), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i79) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            fy0Var5 = fy0Var122;
            fy0Var6 = fy0Var113;
            fy0Var7 = fy0Var115;
            final int i80 = 2;
            fy0Var8 = fy0Var117;
            fy0Var9 = new fy0(800, org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.by0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i80;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            break;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            break;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            break;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            break;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            break;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((va0) arrayList.get(i132)).f == 1) {
                                    ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                    break;
                                } else {
                                    i132++;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            break;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            break;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            break;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            break;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            break;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            fy0Var5 = fy0Var122;
            fy0Var6 = fy0Var113;
            fy0Var7 = fy0Var115;
            fy0Var8 = fy0Var117;
            fy0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            fy0Var10 = new fy0(801, org.telegram.messenger.dd.K0(2131747013), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.by0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i81;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            break;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            break;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            break;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            break;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            break;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((va0) arrayList.get(i132)).f == 1) {
                                    ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                    break;
                                } else {
                                    i132++;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            break;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            break;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            break;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            break;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            break;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            fy0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            fy0Var11 = new fy0(802, org.telegram.messenger.dd.K0(2131747022), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.by0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i82;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            break;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            break;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            break;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            break;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            break;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((va0) arrayList.get(i132)).f == 1) {
                                    ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                    break;
                                } else {
                                    i132++;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            break;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            break;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            break;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            break;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            break;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            fy0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            fy0Var12 = new fy0(803, org.telegram.messenger.dd.K0(2131746979), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.dy0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i83) {
                        case 0:
                            k2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            k2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            k2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            k2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 5:
                            k2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (org.telegram.messenger.e20.i(i132).p()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                k2Var.presentFragment(new gf0(i132));
                                break;
                            }
                            break;
                        case 7:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            k2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                        case 15:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            k2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            k2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            k2Var.presentFragment(new y6());
                            break;
                        case 24:
                            k2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            break;
                        case 26:
                            k2Var.presentFragment(new y6());
                            break;
                        case 27:
                            k2Var.presentFragment(new y6());
                            break;
                        case 28:
                            k2Var.presentFragment(new lu());
                            break;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            fy0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            fy0Var13 = new fy0(804, org.telegram.messenger.dd.K0(2131747027), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.dy0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i84) {
                        case 0:
                            k2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            k2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            k2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            k2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 5:
                            k2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (org.telegram.messenger.e20.i(i132).p()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                k2Var.presentFragment(new gf0(i132));
                                break;
                            }
                            break;
                        case 7:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            k2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                        case 15:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            k2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            k2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            k2Var.presentFragment(new y6());
                            break;
                        case 24:
                            k2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            break;
                        case 26:
                            k2Var.presentFragment(new y6());
                            break;
                        case 27:
                            k2Var.presentFragment(new y6());
                            break;
                        case 28:
                            k2Var.presentFragment(new lu());
                            break;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            fy0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            fy0Var14 = new fy0(805, org.telegram.messenger.dd.K0(2131746977), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.dy0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i85) {
                        case 0:
                            k2Var.presentFragment(new PrivacyControlActivity(4, true));
                            break;
                        case 1:
                            k2Var.presentFragment(new PrivacyControlActivity(5, true));
                            break;
                        case 2:
                            k2Var.presentFragment(new PrivacyControlActivity(3, true));
                            break;
                        case 3:
                            k2Var.presentFragment(new PrivacyControlActivity(2, true));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 1, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 5:
                            k2Var.presentFragment(new PrivacyControlActivity(1, true));
                            break;
                        case 6:
                            int i132 = 0;
                            while (true) {
                                if (i132 >= 4) {
                                    i132 = -1;
                                } else if (org.telegram.messenger.e20.i(i132).p()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                k2Var.presentFragment(new gf0(i132));
                                break;
                            }
                            break;
                        case 7:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 8:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 9:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 10:
                            k2Var.presentFragment(new SessionsActivity(1));
                            break;
                        case 11:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 12:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 2, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                        case 15:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 16:
                            k2Var.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 17:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 19:
                            k2Var.presentFragment(new SessionsActivity(0));
                            break;
                        case 20:
                            SessionsActivity sessionsActivity = new SessionsActivity(0);
                            sessionsActivity.V = true;
                            k2Var.presentFragment(sessionsActivity);
                            break;
                        case 21:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 22:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 23:
                            k2Var.presentFragment(new y6());
                            break;
                        case 24:
                            k2Var.presentFragment(new y6());
                            break;
                        case 25:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 8, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            break;
                        case 26:
                            k2Var.presentFragment(new y6());
                            break;
                        case 27:
                            k2Var.presentFragment(new y6());
                            break;
                        case 28:
                            k2Var.presentFragment(new lu());
                            break;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            fy0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            fy0Var15 = new fy0(806, org.telegram.messenger.dd.K0(2131747007), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ey0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i86) {
                        case 0:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            k2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            k2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            k2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 7:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            k2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                    }
                }
            });
        } else {
            fy0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            fy0Var16 = new fy0(807, org.telegram.messenger.dd.K0(2131746998), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ey0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i87) {
                        case 0:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 1:
                            k2Var.presentFragment(new DataAutoDownloadActivity(0));
                            break;
                        case 2:
                            k2Var.presentFragment(new DataAutoDownloadActivity(1));
                            break;
                        case 3:
                            k2Var.presentFragment(new DataAutoDownloadActivity(2));
                            break;
                        case 4:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 5:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 6:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 3, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 7:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 8:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 9:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 10:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 11:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(0, new ArrayList(), null, true));
                            break;
                        case 12:
                            k2Var.presentFragment(new ProxyListActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 14:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 15:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        case 16:
                            k2Var.presentFragment(new DataSettingsActivity());
                            break;
                        default:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 4, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                    }
                }
            });
        } else {
            fy0Var16 = null;
        }
        fy0 fy0Var123 = F(currentAccount, 5) ? new fy0(808, org.telegram.messenger.dd.K0(2131746991), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new ah0(12, k2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            fy0Var17 = new fy0(809, org.telegram.messenger.dd.K0(2131747040), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ay0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i88) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            break;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            break;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            break;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            break;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            break;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            break;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            break;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            break;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            break;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            break;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            break;
                    }
                }
            });
        } else {
            fy0Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            fy0Var18 = new fy0(810, org.telegram.messenger.dd.K0(2131747002), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ay0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i89) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            break;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            break;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            break;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            break;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            break;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            break;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            break;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            break;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            break;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            break;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            break;
                    }
                }
            });
        } else {
            fy0Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            fy0Var19 = new fy0(811, org.telegram.messenger.dd.K0(2131747037), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ay0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i90) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            break;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            break;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            break;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            break;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            break;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            break;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            break;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            break;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            break;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            break;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            break;
                    }
                }
            });
        } else {
            fy0Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            fy0Var20 = new fy0(812, org.telegram.messenger.dd.K0(2131747035), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ay0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i91) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            break;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            break;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            break;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            break;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            break;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            break;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            break;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            break;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            break;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            break;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            break;
                    }
                }
            });
        } else {
            fy0Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            fy0Var21 = new fy0(813, org.telegram.messenger.dd.K0(2131747019), org.telegram.messenger.dd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ay0
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i92) {
                        case 0:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 1:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 2:
                            k2Var.presentFragment(new StickersActivity(1, null));
                            break;
                        case 3:
                            k2Var.presentFragment(new n(0));
                            break;
                        case 4:
                            org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                            kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 5:
                            k2Var.presentFragment(new n(1));
                            break;
                        case 6:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 7:
                            k2Var.presentFragment(new StickersActivity(0, null));
                            break;
                        case 8:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 9:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 10:
                            k2Var.presentFragment(new StickersActivity(5, null));
                            break;
                        case 11:
                            k2Var.presentFragment(new oz0());
                            break;
                        case 12:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 13:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 14:
                            org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                            kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                            i1Var2.K0();
                            k2Var3.showDialog(i1Var2);
                            break;
                        case 15:
                            org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                            kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                            i1Var3.K0();
                            k2Var4.showDialog(i1Var3);
                            break;
                        case 16:
                            org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                            kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                            i1Var4.K0();
                            k2Var5.showDialog(i1Var4);
                            break;
                        case 17:
                            org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                            kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                            i1Var5.K0();
                            k2Var6.showDialog(i1Var5);
                            break;
                        case 18:
                            k2Var.presentFragment(new ab0());
                            break;
                        case 19:
                            ab0 ab0Var = new ab0();
                            k2Var.presentFragment(ab0Var);
                            ab0Var.a0(3);
                            break;
                        case 20:
                            ab0 ab0Var2 = new ab0();
                            k2Var.presentFragment(ab0Var2);
                            ab0Var2.b0(3);
                            ab0Var2.a0(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            ab0 ab0Var3 = new ab0();
                            k2Var.presentFragment(ab0Var3);
                            ab0Var3.b0(3);
                            ab0Var3.a0(2);
                            break;
                        case 23:
                            ab0 ab0Var4 = new ab0();
                            k2Var.presentFragment(ab0Var4);
                            ab0Var4.a0(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            ab0 ab0Var5 = new ab0();
                            k2Var.presentFragment(ab0Var5);
                            ab0Var5.b0(28700);
                            ab0Var5.a0(16388);
                            break;
                        case 26:
                            ab0 ab0Var6 = new ab0();
                            k2Var.presentFragment(ab0Var6);
                            ab0Var6.b0(28700);
                            ab0Var6.a0(8200);
                            break;
                        case 27:
                            ab0 ab0Var7 = new ab0();
                            k2Var.presentFragment(ab0Var7);
                            ab0Var7.b0(28700);
                            ab0Var7.a0(4112);
                            break;
                        case 28:
                            ab0 ab0Var8 = new ab0();
                            k2Var.presentFragment(ab0Var8);
                            ab0Var8.a0(360928);
                            break;
                        default:
                            ab0 ab0Var9 = new ab0();
                            k2Var.presentFragment(ab0Var9);
                            ab0Var9.b0(360928);
                            ab0Var9.a0(32);
                            break;
                    }
                }
            });
        } else {
            fy0Var21 = null;
        }
        final int i93 = 18;
        fy0 fy0Var124 = new fy0(900, org.telegram.messenger.dd.K0(2131747081), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i93) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        fy0 fy0Var125 = new fy0(901, org.telegram.messenger.dd.K0(2131748860), org.telegram.messenger.dd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i94) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        fy0 fy0Var126 = new fy0(902, org.telegram.messenger.dd.K0(2131748872), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748860), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i95) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        fy0 fy0Var127 = new fy0(903, org.telegram.messenger.dd.K0(2131748874), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748860), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i96) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        fy0 fy0Var128 = new fy0(904, org.telegram.messenger.dd.K0(2131748865), org.telegram.messenger.dd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i97) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        fy0 fy0Var129 = new fy0(905, org.telegram.messenger.dd.K0(2131748872), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748865), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i98) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        fy0 fy0Var130 = new fy0(906, org.telegram.messenger.dd.K0(2131748871), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748865), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i99) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        fy0 fy0Var131 = new fy0(907, org.telegram.messenger.dd.K0(2131748874), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748865), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i100) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        fy0 fy0Var132 = new fy0(908, org.telegram.messenger.dd.K0(2131748866), org.telegram.messenger.dd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i101) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        fy0 fy0Var133 = new fy0(909, org.telegram.messenger.dd.K0(2131748869), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.ay0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i102) {
                    case 0:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 1:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 2:
                        k2Var.presentFragment(new StickersActivity(1, null));
                        break;
                    case 3:
                        k2Var.presentFragment(new n(0));
                        break;
                    case 4:
                        org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        kg.i1 i1Var = new kg.i1(k2Var2, 9, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 5:
                        k2Var.presentFragment(new n(1));
                        break;
                    case 6:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 7:
                        k2Var.presentFragment(new StickersActivity(0, null));
                        break;
                    case 8:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 9:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 10:
                        k2Var.presentFragment(new StickersActivity(5, null));
                        break;
                    case 11:
                        k2Var.presentFragment(new oz0());
                        break;
                    case 12:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 13:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 14:
                        org.telegram.ui.ActionBar.k2 k2Var3 = k2Var;
                        kg.i1 i1Var2 = new kg.i1(k2Var3, 6, false);
                        i1Var2.K0();
                        k2Var3.showDialog(i1Var2);
                        break;
                    case 15:
                        org.telegram.ui.ActionBar.k2 k2Var4 = k2Var;
                        kg.i1 i1Var3 = new kg.i1(k2Var4, 7, false);
                        i1Var3.K0();
                        k2Var4.showDialog(i1Var3);
                        break;
                    case 16:
                        org.telegram.ui.ActionBar.k2 k2Var5 = k2Var;
                        kg.i1 i1Var4 = new kg.i1(k2Var5, 10, false);
                        i1Var4.K0();
                        k2Var5.showDialog(i1Var4);
                        break;
                    case 17:
                        org.telegram.ui.ActionBar.k2 k2Var6 = k2Var;
                        kg.i1 i1Var5 = new kg.i1(k2Var6, 12, false);
                        i1Var5.K0();
                        k2Var6.showDialog(i1Var5);
                        break;
                    case 18:
                        k2Var.presentFragment(new ab0());
                        break;
                    case 19:
                        ab0 ab0Var = new ab0();
                        k2Var.presentFragment(ab0Var);
                        ab0Var.a0(3);
                        break;
                    case 20:
                        ab0 ab0Var2 = new ab0();
                        k2Var.presentFragment(ab0Var2);
                        ab0Var2.b0(3);
                        ab0Var2.a0(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        ab0 ab0Var3 = new ab0();
                        k2Var.presentFragment(ab0Var3);
                        ab0Var3.b0(3);
                        ab0Var3.a0(2);
                        break;
                    case 23:
                        ab0 ab0Var4 = new ab0();
                        k2Var.presentFragment(ab0Var4);
                        ab0Var4.a0(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        ab0 ab0Var5 = new ab0();
                        k2Var.presentFragment(ab0Var5);
                        ab0Var5.b0(28700);
                        ab0Var5.a0(16388);
                        break;
                    case 26:
                        ab0 ab0Var6 = new ab0();
                        k2Var.presentFragment(ab0Var6);
                        ab0Var6.b0(28700);
                        ab0Var6.a0(8200);
                        break;
                    case 27:
                        ab0 ab0Var7 = new ab0();
                        k2Var.presentFragment(ab0Var7);
                        ab0Var7.b0(28700);
                        ab0Var7.a0(4112);
                        break;
                    case 28:
                        ab0 ab0Var8 = new ab0();
                        k2Var.presentFragment(ab0Var8);
                        ab0Var8.a0(360928);
                        break;
                    default:
                        ab0 ab0Var9 = new ab0();
                        k2Var.presentFragment(ab0Var9);
                        ab0Var9.b0(360928);
                        ab0Var9.a0(32);
                        break;
                }
            }
        });
        fy0Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        fy0 fy0Var134 = new fy0(910, org.telegram.messenger.dd.K0(2131748857), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i103;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i104 = 1;
        fy0 fy0Var135 = new fy0(911, org.telegram.messenger.dd.K0(2131748861), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i104;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        if (org.telegram.messenger.uz.o() >= 1) {
            final int i105 = 3;
            fy0Var22 = new fy0(org.telegram.messenger.at.x5, org.telegram.messenger.dd.K0(2131748868), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i105;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            break;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            break;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            break;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            break;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            break;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((va0) arrayList.get(i132)).f == 1) {
                                    ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                    break;
                                } else {
                                    i132++;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            break;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            break;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            break;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            break;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            break;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
        } else {
            fy0Var22 = null;
        }
        final int i106 = 4;
        fy0 fy0Var136 = new fy0(912, org.telegram.messenger.dd.K0(2131748862), null, org.telegram.messenger.dd.K0(2131747081), org.telegram.messenger.dd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i106;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        final int i107 = 5;
        fy0 fy0Var137 = new fy0(913, org.telegram.messenger.dd.K0(2131748867), org.telegram.messenger.dd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i107;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        fy0 fy0Var138 = new fy0(org.telegram.messenger.at.r3, org.telegram.messenger.dd.K0(2131748870), org.telegram.messenger.dd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i108;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        fy0 fy0Var139 = new fy0(org.telegram.messenger.at.q3, org.telegram.messenger.dd.K0(2131748873), org.telegram.messenger.dd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i109;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        fy0 fy0Var140 = new fy0(914, org.telegram.messenger.dd.K0(2131748856), org.telegram.messenger.dd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i110;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        fy0 fy0Var141 = new fy0(400, org.telegram.messenger.dd.K0(2131749064), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i111;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var141.a("tg://settings/language");
        final int i112 = 11;
        fy0 fy0Var142 = new fy0(405, org.telegram.messenger.dd.K0(2131745345), org.telegram.messenger.dd.K0(2131749064), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i112;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.wp.r1(currentAccount).S1().s()) {
            final int i113 = 12;
            fy0 fy0Var143 = new fy0(406, org.telegram.messenger.dd.K0(2131751359), org.telegram.messenger.dd.K0(2131749064), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.by0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i113;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            ab0 ab0Var = new ab0();
                            k2Var2.presentFragment(ab0Var);
                            ab0Var.b0(360928);
                            ab0Var.a0(64);
                            break;
                        case 1:
                            ab0 ab0Var2 = new ab0();
                            k2Var2.presentFragment(ab0Var2);
                            ab0Var2.b0(360928);
                            ab0Var2.a0(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            ab0 ab0Var3 = new ab0();
                            k2Var2.presentFragment(ab0Var3);
                            ab0Var3.b0(360928);
                            ab0Var3.a0(256);
                            break;
                        case 4:
                            ab0 ab0Var4 = new ab0();
                            k2Var2.presentFragment(ab0Var4);
                            ab0Var4.b0(360928);
                            ab0Var4.a0(32768);
                            break;
                        case 5:
                            ab0 ab0Var5 = new ab0();
                            k2Var2.presentFragment(ab0Var5);
                            ab0Var5.a0(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            ab0 ab0Var6 = new ab0();
                            k2Var2.presentFragment(ab0Var6);
                            ab0Var6.a0(1024);
                            break;
                        case 8:
                            ab0 ab0Var7 = new ab0();
                            k2Var2.presentFragment(ab0Var7);
                            ab0Var7.a0(2048);
                            break;
                        case 9:
                            ab0 ab0Var8 = new ab0();
                            k2Var2.presentFragment(ab0Var8);
                            while (true) {
                                ArrayList arrayList = ab0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((va0) arrayList.get(i132)).f == 1) {
                                    ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                    break;
                                } else {
                                    i132++;
                                }
                            }
                        case 10:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 11:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 12:
                            k2Var2.presentFragment(new LanguageSelectActivity());
                            break;
                        case 13:
                            kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                            i1Var.K0();
                            k2Var2.showDialog(i1Var);
                            break;
                        case 14:
                            k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                            break;
                        case 15:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                            break;
                        case 17:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 18:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 19:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 20:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 21:
                            k2Var2.presentFragment(new TwoStepVerificationActivity());
                            break;
                        case 22:
                            k2Var2.presentFragment(PasscodeActivity.p0());
                            break;
                        case 23:
                            kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                            i1Var2.K0();
                            k2Var2.showDialog(i1Var2);
                            break;
                        case 24:
                            k2Var2.presentFragment(new f(3));
                            break;
                        case 25:
                            k2Var2.presentFragment(new PrivacySettingsActivity());
                            break;
                        case 26:
                            zu0 zu0Var = new zu0();
                            zu0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(zu0Var);
                            break;
                        case 27:
                            k2Var2.presentFragment(new SessionsActivity(0));
                            break;
                        case 28:
                            k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                            break;
                        default:
                            k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                            break;
                    }
                }
            });
            fy0Var143.a("tg://settings/language/do-not-translate");
            fy0Var43 = fy0Var143;
        }
        final int i114 = 14;
        fy0 fy0Var144 = new fy0(402, org.telegram.messenger.dd.K0(2131753986), org.telegram.messenger.dd.K0(2131745497), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i114;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        fy0 fy0Var145 = new fy0(403, org.telegram.messenger.dd.K0(2131744267), org.telegram.messenger.dd.K0(2131745497), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i115;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var145.a("tg://settings/faq");
        final int i116 = 16;
        fy0 fy0Var146 = new fy0(404, org.telegram.messenger.dd.K0(2131746798), org.telegram.messenger.dd.K0(2131745497), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i116;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        ab0 ab0Var = new ab0();
                        k2Var2.presentFragment(ab0Var);
                        ab0Var.b0(360928);
                        ab0Var.a0(64);
                        break;
                    case 1:
                        ab0 ab0Var2 = new ab0();
                        k2Var2.presentFragment(ab0Var2);
                        ab0Var2.b0(360928);
                        ab0Var2.a0(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        ab0 ab0Var3 = new ab0();
                        k2Var2.presentFragment(ab0Var3);
                        ab0Var3.b0(360928);
                        ab0Var3.a0(256);
                        break;
                    case 4:
                        ab0 ab0Var4 = new ab0();
                        k2Var2.presentFragment(ab0Var4);
                        ab0Var4.b0(360928);
                        ab0Var4.a0(32768);
                        break;
                    case 5:
                        ab0 ab0Var5 = new ab0();
                        k2Var2.presentFragment(ab0Var5);
                        ab0Var5.a0(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        ab0 ab0Var6 = new ab0();
                        k2Var2.presentFragment(ab0Var6);
                        ab0Var6.a0(1024);
                        break;
                    case 8:
                        ab0 ab0Var7 = new ab0();
                        k2Var2.presentFragment(ab0Var7);
                        ab0Var7.a0(2048);
                        break;
                    case 9:
                        ab0 ab0Var8 = new ab0();
                        k2Var2.presentFragment(ab0Var8);
                        while (true) {
                            ArrayList arrayList = ab0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((va0) arrayList.get(i132)).f == 1) {
                                ab0Var8.b.e1(new i2.q(ab0Var8, i132, 14), 700, true);
                                break;
                            } else {
                                i132++;
                            }
                        }
                    case 10:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 11:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 12:
                        k2Var2.presentFragment(new LanguageSelectActivity());
                        break;
                    case 13:
                        kg.i1 i1Var = new kg.i1(k2Var2, 0, false);
                        i1Var.K0();
                        k2Var2.showDialog(i1Var);
                        break;
                    case 14:
                        k2Var2.showDialog(org.telegram.ui.Components.s4.T(k2Var2, null));
                        break;
                    case 15:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.dd.L0(2131746796, null));
                        break;
                    case 17:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 18:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 19:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 20:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 21:
                        k2Var2.presentFragment(new TwoStepVerificationActivity());
                        break;
                    case 22:
                        k2Var2.presentFragment(PasscodeActivity.p0());
                        break;
                    case 23:
                        kg.i1 i1Var2 = new kg.i1(k2Var2, 11, false);
                        i1Var2.K0();
                        k2Var2.showDialog(i1Var2);
                        break;
                    case 24:
                        k2Var2.presentFragment(new f(3));
                        break;
                    case 25:
                        k2Var2.presentFragment(new PrivacySettingsActivity());
                        break;
                    case 26:
                        zu0 zu0Var = new zu0();
                        zu0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(zu0Var);
                        break;
                    case 27:
                        k2Var2.presentFragment(new SessionsActivity(0));
                        break;
                    case 28:
                        k2Var2.presentFragment(new PrivacyControlActivity(6, true));
                        break;
                    default:
                        k2Var2.presentFragment(new PrivacyControlActivity(0, true));
                        break;
                }
            }
        });
        fy0Var146.a("tg://settings/privacy-policy");
        return new fy0[]{fy0Var23, fy0Var24, fy0Var25, fy0Var26, fy0Var27, fy0Var28, fy0Var29, fy0Var30, fy0Var31, fy0Var32, fy0Var33, fy0Var34, fy0Var35, fy0Var36, fy0Var37, fy0Var38, fy0Var39, fy0Var, fy0Var41, fy0Var42, fy0Var2, fy0Var44, fy0Var45, fy0Var46, fy0Var47, fy0Var48, fy0Var49, fy0Var50, fy0Var51, fy0Var52, fy0Var3, fy0Var4, fy0Var54, fy0Var55, fy0Var56, fy0Var57, fy0Var58, fy0Var59, fy0Var60, fy0Var61, fy0Var62, fy0Var63, fy0Var64, fy0Var65, fy0Var66, fy0Var67, fy0Var68, fy0Var69, fy0Var70, fy0Var71, fy0Var72, fy0Var73, fy0Var74, fy0Var75, fy0Var76, fy0Var77, fy0Var78, fy0Var79, fy0Var80, fy0Var81, fy0Var82, fy0Var83, fy0Var84, fy0Var85, fy0Var86, fy0Var87, fy0Var88, fy0Var89, fy0Var90, fy0Var91, fy0Var92, fy0Var93, fy0Var94, fy0Var95, fy0Var96, fy0Var97, fy0Var98, fy0Var99, fy0Var100, fy0Var101, fy0Var102, fy0Var103, fy0Var104, fy0Var105, fy0Var106, fy0Var107, fy0Var108, fy0Var109, fy0Var110, fy0Var111, fy0Var112, fy0Var6, fy0Var114, fy0Var7, fy0Var116, fy0Var8, fy0Var118, fy0Var119, fy0Var120, fy0Var121, fy0Var5, fy0Var9, fy0Var10, fy0Var11, fy0Var12, fy0Var13, fy0Var14, fy0Var15, fy0Var16, fy0Var123, fy0Var17, fy0Var18, fy0Var19, fy0Var20, fy0Var21, fy0Var124, fy0Var125, fy0Var126, fy0Var127, fy0Var128, fy0Var129, fy0Var130, fy0Var131, fy0Var132, fy0Var133, fy0Var134, fy0Var135, fy0Var22, fy0Var136, fy0Var137, fy0Var138, fy0Var139, fy0Var140, fy0Var141, fy0Var142, fy0Var43, fy0Var144, fy0Var145, fy0Var146};
    }

    @Override // org.telegram.ui.Components.tk0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 0;
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
            a1.g.x(1, arrayList);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj2 = arrayList.get(i10);
            if (obj2 instanceof fy0) {
                ((fy0) obj2).g = i10;
            } else if (obj2 instanceof org.telegram.messenger.ip) {
                ((org.telegram.messenger.ip) obj2).d = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.wp.d1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f;
        TLRPC.WebPage webPage = org.telegram.messenger.wp.r1(i10).q2;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.wp.r1(i10).p2);
        }
        if (this.E != null || this.F) {
            return;
        }
        this.F = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = org.telegram.messenger.dd.L0(2131744265, null);
        tL_messages_getWebPage.hash = 0;
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getWebPage, new k(this, 21));
    }

    public final void I(String str) {
        this.D = str;
        if (this.y != null) {
            Utilities.g.a(this.y);
            this.y = null;
        }
        if (!TextUtils.isEmpty(str)) {
            org.telegram.messenger.r5 r5Var = Utilities.g;
            hr0 hr0Var = new hr0(21, this, str);
            this.y = hr0Var;
            r5Var.d(hr0Var, 300L);
            return;
        }
        this.x = false;
        this.r.clear();
        this.s.clear();
        this.n.clear();
        org.telegram.ui.ActionBar.k2 k2Var = this.e;
        if (k2Var instanceof ProfileActivity) {
            try {
                ((ProfileActivity) k2Var).O.b.getImageReceiver().P0(false);
                ((ProfileActivity) this.e).O.d.setText(org.telegram.messenger.dd.L0(2131745495, null));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        f();
    }

    public final void J() {
        String[] strArr;
        fy0 fy0Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            fy0[] fy0VarArr = this.c;
            if (i10 >= fy0VarArr.length) {
                break;
            }
            fy0 fy0Var2 = fy0VarArr[i10];
            if (fy0Var2 != null) {
                hashMap.put(Integer.valueOf(fy0Var2.f), this.c[i10]);
            }
            i10++;
        }
        Set<String> stringSet = org.telegram.messenger.wp.d1().getStringSet("settingsSearchRecent2", null);
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
                            for (int i11 = 0; i11 < readInt323; i11++) {
                                strArr[i11] = serializedData.readString(false);
                            }
                        } else {
                            strArr = null;
                        }
                        org.telegram.messenger.ip ipVar = new org.telegram.messenger.ip(readString, strArr, serializedData.readString(false));
                        ipVar.d = readInt32;
                        arrayList.add(ipVar);
                    } else if (readInt322 == 1 && (fy0Var = (fy0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        fy0Var.g = readInt32;
                        arrayList.add(fy0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new dx0(this, 1));
    }

    @Override // s4.g0
    public final int b() {
        if (this.x) {
            return this.r.size() + (this.s.isEmpty() ? 0 : this.s.size() + 1);
        }
        ArrayList arrayList = this.w;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.d;
        return size + (arrayList2.isEmpty() ? 0 : arrayList2.size() + 1);
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (!this.x) {
            ArrayList arrayList = this.w;
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
    public final void t(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 == 1) {
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.dd.L0(2131745500, null));
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.dd.L0(2131745487, null));
                return;
            }
        }
        org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
        if (this.x) {
            if (i10 >= this.r.size()) {
                int e = sc.e.e(1, i10, this.r);
                z6Var.a((CharSequence) this.n.get(this.r.size() + e), ((org.telegram.messenger.ip) this.s.get(e)).b, true, e < this.r.size() - 1);
                return;
            } else {
                fy0 fy0Var = (fy0) this.r.get(i10);
                fy0 fy0Var2 = i10 > 0 ? (fy0) this.r.get(i10 - 1) : null;
                z6Var.b((CharSequence) this.n.get(i10), fy0Var.d, (fy0Var2 == null || fy0Var2.e != fy0Var.e) ? fy0Var.e : 0, i10 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.w;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= arrayList.size()) {
            int e7 = sc.e.e(1, i10, arrayList);
            org.telegram.messenger.ip ipVar = (org.telegram.messenger.ip) this.d.get(e7);
            z6Var.a(ipVar.a, ipVar.b, true, e7 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof fy0) {
            fy0 fy0Var3 = (fy0) obj;
            z6Var.a(fy0Var3.a, fy0Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof org.telegram.messenger.ip) {
            org.telegram.messenger.ip ipVar2 = (org.telegram.messenger.ip) obj;
            z6Var.a(ipVar2.a, ipVar2.b, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View p4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.p4(context, 16) : new org.telegram.ui.Cells.z3(context, null) : new org.telegram.ui.Cells.z6(context);
        p4Var.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.dk0(p4Var);
    }
}
