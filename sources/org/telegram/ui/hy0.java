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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class hy0 extends org.telegram.ui.Components.sk0 {
    public String D;
    public TLRPC.WebPage E;
    public boolean F;
    public gy0[] c;
    public final org.telegram.ui.ActionBar.k2 e;
    public final int f;
    public final Context h;
    public boolean x;
    public et0 y;
    public final ArrayList d = new ArrayList();
    public ArrayList n = new ArrayList();
    public ArrayList r = new ArrayList();
    public ArrayList s = new ArrayList();
    public final ArrayList w = new ArrayList();

    public hy0(Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        this.e = k2Var;
        this.f = k2Var.getCurrentAccount();
        this.h = context;
        this.c = H(k2Var);
        J();
    }

    public static boolean F(int i10, int i11) {
        if (!org.telegram.messenger.vp.r1(i10).A3() || org.telegram.messenger.d20.i(i10).q()) {
            return i11 == -1 || org.telegram.messenger.vp.r1(i10).N0.get(i11, -1) != -1;
        }
        return false;
    }

    public static gy0[] H(final org.telegram.ui.ActionBar.k2 k2Var) {
        gy0 gy0Var;
        gy0 gy0Var2;
        gy0 gy0Var3;
        gy0 gy0Var4;
        gy0 gy0Var5;
        gy0 gy0Var6;
        gy0 gy0Var7;
        gy0 gy0Var8;
        gy0 gy0Var9;
        gy0 gy0Var10;
        gy0 gy0Var11;
        gy0 gy0Var12;
        gy0 gy0Var13;
        gy0 gy0Var14;
        gy0 gy0Var15;
        gy0 gy0Var16;
        gy0 gy0Var17;
        gy0 gy0Var18;
        gy0 gy0Var19;
        gy0 gy0Var20;
        gy0 gy0Var21;
        gy0 gy0Var22;
        final int currentAccount = k2Var.getCurrentAccount();
        final int i10 = 19;
        gy0 gy0Var23 = new gy0(500, org.telegram.messenger.cd.K0(2131751265), 0, new et0(i10, k2Var, k2Var.getResourceProvider()));
        final int i11 = 24;
        gy0 gy0Var24 = new gy0(501, org.telegram.messenger.cd.K0(2131752537), 0, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i12 = i11;
                int i13 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i12) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i13 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i13)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i13, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var24.a("tg://settings/edit/change-number");
        final int i12 = 6;
        gy0 gy0Var25 = new gy0(502, org.telegram.messenger.cd.K0(2131754468), 0, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i13).p()) {
                                i13++;
                            }
                        }
                        if (i13 >= 0) {
                            k2Var.presentFragment(new hf0(i13));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var25.a("tg://settings/edit/add-account");
        final int i13 = 17;
        final int i14 = 1;
        gy0 gy0Var26 = new gy0(1, org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var26.a("tg://settings/notifications");
        final int i15 = 29;
        gy0 gy0Var27 = new gy0(2, org.telegram.messenger.cd.K0(2131747894), org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var27.a("tg://settings/notifications/private-chats");
        final int i16 = 11;
        gy0 gy0Var28 = new gy0(3, org.telegram.messenger.cd.K0(2131747923), org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0Var28.a("tg://settings/notifications/groups");
        gy0 gy0Var29 = new gy0(4, org.telegram.messenger.cd.K0(2131747937), org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new ch0(7, k2Var));
        gy0Var29.a("tg://settings/notifications/channels");
        gy0 gy0Var30 = new gy0(5, org.telegram.messenger.cd.K0(2131743305), "callsSectionRow", org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new ch0(i10, k2Var));
        gy0 gy0Var31 = new gy0(6, org.telegram.messenger.cd.K0(2131753733), "badgeNumberSection", org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i17 = 13;
        gy0 gy0Var32 = new gy0(7, org.telegram.messenger.cd.K0(2131749228), "inappSectionRow", org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.by0
            @Override // java.lang.Runnable
            public final void run() {
                switch (i17) {
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0 gy0Var33 = new gy0(8, org.telegram.messenger.cd.K0(2131751790), "contactJoinedRow", org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new ch0(23, k2Var));
        gy0Var33.a("tg://settings/notifications/new-contacts");
        gy0 gy0Var34 = new gy0(9, org.telegram.messenger.cd.K0(2131747244), "pinnedMessageRow", org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var34.a("tg://settings/notifications/pinned-messages");
        gy0 gy0Var35 = new gy0(10, org.telegram.messenger.cd.K0(2131746129), "resetNotificationsRow", org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i12;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var35.a("tg://settings/notifications/reset");
        gy0 gy0Var36 = new gy0(11, org.telegram.messenger.cd.K0(2131747892), "notificationsServiceRow", org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i13;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        final int i18 = 18;
        gy0 gy0Var37 = new gy0(12, org.telegram.messenger.cd.K0(2131747891), "notificationsServiceConnectionRow", org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i18;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0 gy0Var38 = new gy0(13, org.telegram.messenger.cd.K0(2131746290), "repeatRow", org.telegram.messenger.cd.K0(2131747938), R.drawable.msg_notifications, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i10;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        final int i19 = 20;
        gy0 gy0Var39 = new gy0(100, org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i19;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var39.a("tg://settings/privacy");
        final int i20 = 21;
        gy0 gy0Var40 = new gy0(org.telegram.messenger.zs.u1, org.telegram.messenger.cd.K0(2131743963), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i20;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var40.a("tg://settings/privacy/2sv");
        final int i21 = 0;
        gy0 gy0Var41 = new gy0(org.telegram.messenger.zs.I1, org.telegram.messenger.cd.K0(2131753850), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i21;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                int i23 = currentAccount;
                switch (i22) {
                    case 0:
                        if (org.telegram.messenger.d20.i(i23).p0 >= 0) {
                            k2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.d20.i(i23).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), null);
                            ebVar.d(R.raw.voip_muted, new String[0]);
                            String L0 = org.telegram.messenger.cd.L0(2131746770, null);
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
        gy0Var41.a("tg://settings/privacy/auto-delete");
        final int i22 = 22;
        gy0 gy0Var42 = new gy0(org.telegram.messenger.zs.t1, org.telegram.messenger.cd.K0(2131747673), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i22;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var42.a("tg://settings/privacy/passcode");
        gy0 gy0Var43 = null;
        if (org.telegram.messenger.tz.m1) {
            gy0Var = gy0Var40;
            final int i23 = 25;
            gy0Var2 = new gy0(org.telegram.messenger.zs.J1, org.telegram.messenger.cd.K0(2131751203), "emailLoginRow", org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.cy0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i23;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            break;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            break;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            break;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            break;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            break;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((wa0) arrayList.get(i132)).f == 1) {
                                    bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var2.a("tg://settings/privacy/login-email");
        } else {
            gy0Var = gy0Var40;
            gy0Var2 = null;
        }
        final int i24 = 26;
        gy0 gy0Var44 = new gy0(101, org.telegram.messenger.cd.K0(2131753681), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i24;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var44.a("tg://settings/privacy/blocked");
        final int i25 = 27;
        gy0 gy0Var45 = new gy0(org.telegram.messenger.zs.v1, org.telegram.messenger.cd.K0(2131745568), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i25;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var45.a("tg://settings/devices");
        final int i26 = 28;
        gy0 gy0Var46 = new gy0(org.telegram.messenger.zs.q1, org.telegram.messenger.cd.K0(2131746805), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i26;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var46.a("tg://settings/privacy/phone-number/");
        final int i27 = 29;
        gy0 gy0Var47 = new gy0(org.telegram.messenger.zs.n1, org.telegram.messenger.cd.K0(2131746830), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i27;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var47.a("tg://settings/privacy/last-seen");
        final int i28 = 0;
        gy0 gy0Var48 = new gy0(org.telegram.messenger.zs.o1, org.telegram.messenger.cd.K0(2131746792), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var48.a("tg://settings/privacy/profile-photos");
        final int i29 = 1;
        gy0 gy0Var49 = new gy0(org.telegram.messenger.zs.p1, org.telegram.messenger.cd.K0(2131746852), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var49.a("tg://settings/privacy/forwards");
        final int i30 = 2;
        gy0 gy0Var50 = new gy0(org.telegram.messenger.zs.G1, org.telegram.messenger.cd.K0(2131746815), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var50.a("tg://settings/privacy/calls/p2p");
        final int i31 = 3;
        gy0 gy0Var51 = new gy0(org.telegram.messenger.zs.r1, org.telegram.messenger.cd.K0(2131752596), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var51.a("tg://settings/privacy/calls");
        final int i32 = 5;
        gy0 gy0Var52 = new gy0(org.telegram.messenger.zs.s1, org.telegram.messenger.cd.K0(2131746832), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var52.a("tg://settings/privacy/invites");
        final int i33 = 1;
        gy0 gy0Var53 = new gy0(org.telegram.messenger.zs.H1, org.telegram.messenger.cd.K0(2131746773), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg_secret, new Runnable() { // from class: org.telegram.ui.dy0
            @Override // java.lang.Runnable
            public final void run() {
                int i222 = i33;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                int i232 = currentAccount;
                switch (i222) {
                    case 0:
                        if (org.telegram.messenger.d20.i(i232).p0 >= 0) {
                            k2Var2.presentFragment(new p4());
                            break;
                        }
                        break;
                    default:
                        if (!org.telegram.messenger.d20.i(i232).q()) {
                            org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(k2Var2);
                            a02.getClass();
                            org.telegram.ui.Components.eb ebVar = new org.telegram.ui.Components.eb(a02.W(), null);
                            ebVar.d(R.raw.voip_muted, new String[0]);
                            String L0 = org.telegram.messenger.cd.L0(2131746770, null);
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
        gy0Var53.a("tg://settings/privacy/voice");
        if (org.telegram.messenger.vp.r1(currentAccount).a4) {
            gy0Var3 = gy0Var53;
            final int i34 = 7;
            gy0Var4 = new gy0(org.telegram.messenger.zs.F1, org.telegram.messenger.cd.K0(2131754171), "newChatsRow", org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                                } else if (org.telegram.messenger.d20.i(i132).p()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                k2Var.presentFragment(new hf0(i132));
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
                            k2Var.presentFragment(new mu());
                            break;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
            gy0Var4.a("tg://settings/privacy/archive-and-mute");
        } else {
            gy0Var3 = gy0Var53;
            gy0Var4 = null;
        }
        final int i35 = 8;
        gy0 gy0Var54 = new gy0(org.telegram.messenger.zs.x1, org.telegram.messenger.cd.K0(2131751597), "deleteAccountRow", org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var54.a("tg://settings/privacy/self-destruct");
        final int i36 = 9;
        gy0 gy0Var55 = new gy0(org.telegram.messenger.zs.y1, org.telegram.messenger.cd.K0(2131746812), "paymentsClearRow", org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var55.a("tg://settings/privacy/data-settings/clear-payment-info");
        final int i37 = 10;
        gy0 gy0Var56 = new gy0(org.telegram.messenger.zs.z1, org.telegram.messenger.cd.K0(2131742937), org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var56.a("tg://settings/privacy/active-websites");
        final int i38 = 11;
        gy0 gy0Var57 = new gy0(org.telegram.messenger.zs.A1, org.telegram.messenger.cd.K0(2131744322), "contactsDeleteRow", org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var57.a("tg://settings/privacy/data-settings/delete-synced");
        final int i39 = 12;
        gy0 gy0Var58 = new gy0(org.telegram.messenger.zs.B1, org.telegram.messenger.cd.K0(2131744324), "contactsSyncRow", org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var58.a("tg://settings/privacy/data-settings/sync-contacts");
        final int i40 = 13;
        gy0 gy0Var59 = new gy0(org.telegram.messenger.zs.C1, org.telegram.messenger.cd.K0(2131744438), "contactsSuggestRow", org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var59.a("tg://settings/privacy/data-settings/suggest-contacts");
        final int i41 = 15;
        gy0 gy0Var60 = new gy0(org.telegram.messenger.zs.D1, org.telegram.messenger.cd.K0(2131748704), "secretMapRow", org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var60.a("tg://settings/privacy/data-settings/map-provider");
        final int i42 = 16;
        gy0 gy0Var61 = new gy0(org.telegram.messenger.zs.E1, org.telegram.messenger.cd.K0(2131745701), "secretWebpageRow", org.telegram.messenger.cd.K0(2131746786), R.drawable.msg2_secret, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var61.a("tg://settings/privacy/data-settings/link-previews");
        final int i43 = 18;
        gy0 gy0Var62 = new gy0(120, org.telegram.messenger.cd.K0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var62.a("tg://settings/devices");
        final int i44 = 19;
        gy0 gy0Var63 = new gy0(org.telegram.messenger.zs.F1, org.telegram.messenger.cd.K0(2131744233), "terminateAllSessionsRow", org.telegram.messenger.cd.K0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var63.a("tg://settings/devices/terminate-sessions");
        final int i45 = 20;
        gy0 gy0Var64 = new gy0(org.telegram.messenger.zs.G1, org.telegram.messenger.cd.K0(2131748927), org.telegram.messenger.cd.K0(2131751456), R.drawable.msg2_devices, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var64.a("tg://settings/devices/link-desktop");
        final int i46 = 21;
        gy0 gy0Var65 = new gy0(org.telegram.messenger.zs.e3, org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var65.a("tg://settings/privacy/data-settings");
        final int i47 = 22;
        gy0 gy0Var66 = new gy0(org.telegram.messenger.zs.f3, org.telegram.messenger.cd.K0(2131751677), "usageSectionRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i48 = 23;
        gy0 gy0Var67 = new gy0(org.telegram.messenger.zs.g3, org.telegram.messenger.cd.K0(2131744834), org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var67.a("tg://settings/data/storage");
        final int i49 = 24;
        gy0 gy0Var68 = new gy0(203, org.telegram.messenger.cd.K0(2131749070), "keepMediaRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131744834), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i50 = 26;
        gy0 gy0Var69 = new gy0(org.telegram.messenger.zs.i3, org.telegram.messenger.cd.K0(2131752075), "cacheRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131744834), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i51 = 27;
        gy0 gy0Var70 = new gy0(org.telegram.messenger.zs.j3, org.telegram.messenger.cd.K0(2131748784), "databaseRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131744834), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        final int i52 = 28;
        gy0 gy0Var71 = new gy0(org.telegram.messenger.zs.k3, org.telegram.messenger.cd.K0(2131748312), org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.ey0
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
                            } else if (org.telegram.messenger.d20.i(i132).p()) {
                                i132++;
                            }
                        }
                        if (i132 >= 0) {
                            k2Var.presentFragment(new hf0(i132));
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
                        k2Var.presentFragment(new mu());
                        break;
                    default:
                        k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                        break;
                }
            }
        });
        gy0Var71.a("tg://settings/data/usage");
        final int i53 = 0;
        gy0 gy0Var72 = new gy0(org.telegram.messenger.zs.l3, org.telegram.messenger.cd.K0(2131753767), "mediaDownloadSectionRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0 gy0Var73 = new gy0(208, org.telegram.messenger.cd.K0(2131742910), org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0 gy0Var74 = new gy0(org.telegram.messenger.zs.m3, org.telegram.messenger.cd.K0(2131742912), org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0 gy0Var75 = new gy0(org.telegram.messenger.zs.n3, org.telegram.messenger.cd.K0(2131742911), org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0 gy0Var76 = new gy0(org.telegram.messenger.zs.o3, org.telegram.messenger.cd.K0(2131746128), "resetDownloadRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0Var76.a("tg://settings/data/auto-download/reset");
        final int i58 = 5;
        gy0 gy0Var77 = new gy0(org.telegram.messenger.zs.s3, org.telegram.messenger.cd.K0(2131744464), "streamSectionRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0 gy0Var78 = new gy0(org.telegram.messenger.zs.t3, org.telegram.messenger.cd.K0(2131751145), "enableStreamRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0 gy0Var79 = new gy0(org.telegram.messenger.zs.u3, org.telegram.messenger.cd.K0(2131752596), "callsSectionRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0 gy0Var80 = new gy0(org.telegram.messenger.zs.v3, org.telegram.messenger.cd.K0(2131743255), "useLessDataForCallsRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0Var80.a("tg://settings/data/use-less-data");
        final int i62 = 10;
        gy0 gy0Var81 = new gy0(org.telegram.messenger.zs.w3, org.telegram.messenger.cd.K0(2131743284), "quickRepliesRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0 gy0Var82 = new gy0(org.telegram.messenger.zs.x3, org.telegram.messenger.cd.K0(2131746616), org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0Var82.a("tg://settings/data/proxy");
        final int i64 = 13;
        gy0 gy0Var83 = new gy0(org.telegram.messenger.zs.w1, org.telegram.messenger.cd.K0(2131746856), "clearDraftsRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0Var83.a("tg://settings/privacy/data-settings/delete-cloud-drafts");
        final int i65 = 14;
        gy0 gy0Var84 = new gy0(org.telegram.messenger.zs.z3, org.telegram.messenger.cd.K0(2131745946), "saveToGallerySectionRow", org.telegram.messenger.cd.K0(2131751678), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0 gy0Var85 = new gy0(org.telegram.messenger.zs.A3, org.telegram.messenger.cd.K0(2131745936), "saveToGalleryPeerRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131745946), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0Var85.a("tg://settings/data/save-to-photos/chats");
        final int i67 = 16;
        gy0 gy0Var86 = new gy0(org.telegram.messenger.zs.B3, org.telegram.messenger.cd.K0(2131745943), "saveToGalleryGroupsRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131745946), R.drawable.msg2_data, new Runnable() { // from class: org.telegram.ui.fy0
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
        gy0Var86.a("tg://settings/data/save-to-photos/groups");
        gy0 gy0Var87 = new gy0(org.telegram.messenger.zs.C3, org.telegram.messenger.cd.K0(2131745945), "saveToGalleryChannelsRow", org.telegram.messenger.cd.K0(2131751678), org.telegram.messenger.cd.K0(2131745946), R.drawable.msg2_data, new ch0(2, k2Var));
        gy0Var87.a("tg://settings/data/save-to-photos/channels");
        gy0 gy0Var88 = new gy0(org.telegram.messenger.zs.X4, org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(3, k2Var));
        gy0Var88.a("tg://settings/appearance/themes");
        gy0 gy0Var89 = new gy0(org.telegram.messenger.zs.Y4, org.telegram.messenger.cd.K0(2131744216), "textSizeHeaderRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(4, k2Var));
        gy0Var89.a("tg://settings/appearance/text-size");
        gy0 gy0Var90 = new gy0(org.telegram.messenger.zs.Z4, org.telegram.messenger.cd.K0(2131752550), org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(5, k2Var));
        gy0Var90.a("tg://settings/appearance/wallpapers");
        gy0 gy0Var91 = new gy0(org.telegram.messenger.zs.a5, org.telegram.messenger.cd.K0(2131745555), null, org.telegram.messenger.cd.K0(2131752210), org.telegram.messenger.cd.K0(2131752244), R.drawable.msg2_discussion, new ch0(6, k2Var));
        gy0 gy0Var92 = new gy0(org.telegram.messenger.zs.b5, org.telegram.messenger.cd.K0(2131746125), "resetRow", org.telegram.messenger.cd.K0(2131752210), org.telegram.messenger.cd.K0(2131752244), R.drawable.msg2_discussion, new ch0(8, k2Var));
        gy0 gy0Var93 = new gy0(org.telegram.messenger.zs.d5, org.telegram.messenger.cd.K0(2131752011), "themeHeaderRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(9, k2Var));
        gy0 gy0Var94 = new gy0(org.telegram.messenger.zs.q5, org.telegram.messenger.cd.K0(2131752878), null, org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(10, k2Var));
        gy0 gy0Var95 = new gy0(org.telegram.messenger.zs.r5, org.telegram.messenger.cd.K0(2131751713), "createNewThemeRow", org.telegram.messenger.cd.K0(2131752210), org.telegram.messenger.cd.K0(2131752878), R.drawable.msg2_discussion, new ch0(11, k2Var));
        gy0Var95.a("tg://settings/appearance/themes/create");
        gy0 gy0Var96 = new gy0(org.telegram.messenger.zs.s5, org.telegram.messenger.cd.K0(2131752840), "bubbleRadiusHeaderRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(13, k2Var));
        gy0Var96.a("tg://settings/appearance/message-corners");
        gy0 gy0Var97 = new gy0(org.telegram.messenger.zs.t5, org.telegram.messenger.cd.K0(2131752225), "chatListHeaderRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(14, k2Var));
        gy0 gy0Var98 = new gy0(org.telegram.messenger.zs.u5, org.telegram.messenger.cd.K0(2131752222), "swipeGestureHeaderRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(15, k2Var));
        gy0 gy0Var99 = new gy0(org.telegram.messenger.zs.v5, org.telegram.messenger.cd.K0(2131754240), "appIconHeaderRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(16, k2Var));
        gy0Var99.a("tg://settings/appearance/app-icon");
        gy0 gy0Var100 = new gy0(org.telegram.messenger.zs.c5, org.telegram.messenger.cd.K0(2131753784), org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(17, k2Var));
        gy0 gy0Var101 = new gy0(org.telegram.messenger.zs.z5, org.telegram.messenger.cd.K0(2131748266), "nextMediaTapRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(18, k2Var));
        gy0Var101.a("tg://settings/appearance/tap-for-next-media");
        gy0 gy0Var102 = new gy0(org.telegram.messenger.zs.y5, org.telegram.messenger.cd.K0(2131746442), "raiseToListenRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(20, k2Var));
        gy0Var102.a("tg://settings/data/raise-to-listen");
        gy0 gy0Var103 = new gy0(org.telegram.messenger.zs.h5, org.telegram.messenger.cd.K0(2131746440), "raiseToSpeakRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(21, k2Var));
        gy0Var103.a("tg://settings/data/raise-to-speak");
        gy0 gy0Var104 = new gy0(org.telegram.messenger.zs.x5, org.telegram.messenger.cd.K0(2131747448), "pauseOnMediaRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(22, k2Var));
        gy0Var104.a("tg://settings/data/pause-music");
        gy0 gy0Var105 = new gy0(org.telegram.messenger.zs.w5, org.telegram.messenger.cd.K0(2131748454), "bluetoothScoRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(24, k2Var));
        gy0 gy0Var106 = new gy0(org.telegram.messenger.zs.f5, org.telegram.messenger.cd.K0(2131751439), "directShareRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(25, k2Var));
        gy0 gy0Var107 = new gy0(org.telegram.messenger.zs.i5, org.telegram.messenger.cd.K0(2131745649), "sendByEnterRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(26, k2Var));
        gy0 gy0Var108 = new gy0(org.telegram.messenger.zs.p5, org.telegram.messenger.cd.K0(2131751368), "distanceRow", org.telegram.messenger.cd.K0(2131752210), R.drawable.msg2_discussion, new ch0(27, k2Var));
        gy0 gy0Var109 = new gy0(600, org.telegram.messenger.cd.K0(2131744875), R.drawable.msg2_sticker, new ch0(28, k2Var));
        gy0Var109.a("tg://settings/appearance/stickers-and-emoji");
        gy0 gy0Var110 = new gy0(601, org.telegram.messenger.cd.K0(2131744428), "suggestRow", org.telegram.messenger.cd.K0(2131744875), R.drawable.msg2_sticker, new ch0(29, k2Var));
        final int i68 = 0;
        gy0 gy0Var111 = new gy0(602, org.telegram.messenger.cd.K0(2131750834), "featuredStickersHeaderRow", org.telegram.messenger.cd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i69 = 2;
        gy0 gy0Var112 = new gy0(603, org.telegram.messenger.cd.K0(2131748694), null, org.telegram.messenger.cd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i70 = 3;
        gy0 gy0Var113 = new gy0(604, org.telegram.messenger.cd.K0(2131754128), null, org.telegram.messenger.cd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var113.a("tg://settings/appearance/stickers-and-emoji/archived");
        final int i71 = 5;
        gy0 gy0Var114 = new gy0(605, org.telegram.messenger.cd.K0(2131754133), null, org.telegram.messenger.cd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i72 = 6;
        gy0 gy0Var115 = new gy0(606, org.telegram.messenger.cd.K0(2131749044), "largeEmojiRow", org.telegram.messenger.cd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var115.a("tg://settings/appearance/stickers-and-emoji/emoji/large");
        final int i73 = 7;
        gy0 gy0Var116 = new gy0(607, org.telegram.messenger.cd.K0(2131748733), "loopRow", org.telegram.messenger.cd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i74 = 8;
        gy0 gy0Var117 = new gy0(608, org.telegram.messenger.cd.K0(2131751197), null, org.telegram.messenger.cd.K0(2131744875), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var117.a("tg://settings/appearance/stickers-and-emoji/emoji");
        final int i75 = 9;
        gy0 gy0Var118 = new gy0(609, org.telegram.messenger.cd.K0(2131744442), "suggestAnimatedEmojiRow", org.telegram.messenger.cd.K0(2131744875), org.telegram.messenger.cd.K0(2131751197), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var118.a("tg://settings/appearance/stickers-and-emoji/emoji/suggest");
        final int i76 = 10;
        gy0 gy0Var119 = new gy0(610, org.telegram.messenger.cd.K0(2131750836), "featuredStickersHeaderRow", org.telegram.messenger.cd.K0(2131744875), org.telegram.messenger.cd.K0(2131751197), R.drawable.input_smile, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i77 = 11;
        gy0 gy0Var120 = new gy0(611, org.telegram.messenger.cd.K0(2131751351), null, org.telegram.messenger.cd.K0(2131744875), R.drawable.msg2_sticker, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var120.a("tg://settings/appearance/stickers-and-emoji/emoji/quick-reaction");
        final int i78 = 12;
        gy0 gy0Var121 = new gy0(700, org.telegram.messenger.cd.K0(2131750697), null, R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var121.a("tg://settings/folders");
        final int i79 = 21;
        gy0 gy0Var122 = new gy0(701, org.telegram.messenger.cd.K0(2131751717), "createFilterRow", org.telegram.messenger.cd.K0(2131750697), R.drawable.msg2_folder, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var122.a("tg://settings/folders/create");
        if (F(currentAccount, -1)) {
            gy0Var5 = gy0Var122;
            gy0Var6 = gy0Var113;
            gy0Var7 = gy0Var115;
            final int i80 = 2;
            gy0Var8 = gy0Var117;
            gy0Var9 = new gy0(800, org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.cy0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i80;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            break;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            break;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            break;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            break;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            break;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((wa0) arrayList.get(i132)).f == 1) {
                                    bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var5 = gy0Var122;
            gy0Var6 = gy0Var113;
            gy0Var7 = gy0Var115;
            gy0Var8 = gy0Var117;
            gy0Var9 = null;
        }
        if (F(currentAccount, 0)) {
            final int i81 = 13;
            gy0Var10 = new gy0(801, org.telegram.messenger.cd.K0(2131747013), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.cy0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i81;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            break;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            break;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            break;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            break;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            break;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((wa0) arrayList.get(i132)).f == 1) {
                                    bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var10 = null;
        }
        if (F(currentAccount, 11)) {
            final int i82 = 23;
            gy0Var11 = new gy0(802, org.telegram.messenger.cd.K0(2131747022), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.cy0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i82;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            break;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            break;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            break;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            break;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            break;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((wa0) arrayList.get(i132)).f == 1) {
                                    bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var11 = null;
        }
        if (F(currentAccount, 1)) {
            final int i83 = 4;
            gy0Var12 = new gy0(803, org.telegram.messenger.cd.K0(2131746979), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ey0
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
                                } else if (org.telegram.messenger.d20.i(i132).p()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                k2Var.presentFragment(new hf0(i132));
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
                            k2Var.presentFragment(new mu());
                            break;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            gy0Var12 = null;
        }
        if (F(currentAccount, 2)) {
            final int i84 = 14;
            gy0Var13 = new gy0(804, org.telegram.messenger.cd.K0(2131747027), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ey0
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
                                } else if (org.telegram.messenger.d20.i(i132).p()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                k2Var.presentFragment(new hf0(i132));
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
                            k2Var.presentFragment(new mu());
                            break;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            gy0Var13 = null;
        }
        if (F(currentAccount, 8)) {
            final int i85 = 25;
            gy0Var14 = new gy0(805, org.telegram.messenger.cd.K0(2131746977), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.ey0
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
                                } else if (org.telegram.messenger.d20.i(i132).p()) {
                                    i132++;
                                }
                            }
                            if (i132 >= 0) {
                                k2Var.presentFragment(new hf0(i132));
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
                            k2Var.presentFragment(new mu());
                            break;
                        default:
                            k2Var.presentFragment(new NotificationsCustomSettingsActivity(1, new ArrayList(), null, true));
                            break;
                    }
                }
            });
        } else {
            gy0Var14 = null;
        }
        if (F(currentAccount, 3)) {
            final int i86 = 6;
            gy0Var15 = new gy0(806, org.telegram.messenger.cd.K0(2131747007), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.fy0
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
            gy0Var15 = null;
        }
        if (F(currentAccount, 4)) {
            final int i87 = 17;
            gy0Var16 = new gy0(807, org.telegram.messenger.cd.K0(2131746998), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.fy0
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
            gy0Var16 = null;
        }
        gy0 gy0Var123 = F(currentAccount, 5) ? new gy0(808, org.telegram.messenger.cd.K0(2131746991), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new ch0(12, k2Var)) : null;
        if (F(currentAccount, 9)) {
            final int i88 = 4;
            gy0Var17 = new gy0(809, org.telegram.messenger.cd.K0(2131747040), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.by0
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            break;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            break;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            break;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            break;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            break;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            break;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            break;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            break;
                    }
                }
            });
        } else {
            gy0Var17 = null;
        }
        if (F(currentAccount, 6)) {
            final int i89 = 14;
            gy0Var18 = new gy0(810, org.telegram.messenger.cd.K0(2131747002), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.by0
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            break;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            break;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            break;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            break;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            break;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            break;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            break;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            break;
                    }
                }
            });
        } else {
            gy0Var18 = null;
        }
        if (F(currentAccount, 7)) {
            final int i90 = 15;
            gy0Var19 = new gy0(811, org.telegram.messenger.cd.K0(2131747037), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.by0
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            break;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            break;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            break;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            break;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            break;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            break;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            break;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            break;
                    }
                }
            });
        } else {
            gy0Var19 = null;
        }
        if (F(currentAccount, 10)) {
            final int i91 = 16;
            gy0Var20 = new gy0(812, org.telegram.messenger.cd.K0(2131747035), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.by0
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            break;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            break;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            break;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            break;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            break;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            break;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            break;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            break;
                    }
                }
            });
        } else {
            gy0Var20 = null;
        }
        if (F(currentAccount, 12)) {
            final int i92 = 17;
            gy0Var21 = new gy0(813, org.telegram.messenger.cd.K0(2131747019), org.telegram.messenger.cd.K0(2131744256), R.drawable.msg_settings_premium, new Runnable() { // from class: org.telegram.ui.by0
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
                            k2Var.presentFragment(new pz0());
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
                            k2Var.presentFragment(new bb0());
                            break;
                        case 19:
                            bb0 bb0Var = new bb0();
                            k2Var.presentFragment(bb0Var);
                            bb0Var.Z(3);
                            break;
                        case 20:
                            bb0 bb0Var2 = new bb0();
                            k2Var.presentFragment(bb0Var2);
                            bb0Var2.a0(3);
                            bb0Var2.Z(1);
                            break;
                        case 21:
                            k2Var.presentFragment(new FiltersSetupActivity());
                            break;
                        case 22:
                            bb0 bb0Var3 = new bb0();
                            k2Var.presentFragment(bb0Var3);
                            bb0Var3.a0(3);
                            bb0Var3.Z(2);
                            break;
                        case 23:
                            bb0 bb0Var4 = new bb0();
                            k2Var.presentFragment(bb0Var4);
                            bb0Var4.Z(28700);
                            break;
                        case 24:
                            k2Var.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 25:
                            bb0 bb0Var5 = new bb0();
                            k2Var.presentFragment(bb0Var5);
                            bb0Var5.a0(28700);
                            bb0Var5.Z(16388);
                            break;
                        case 26:
                            bb0 bb0Var6 = new bb0();
                            k2Var.presentFragment(bb0Var6);
                            bb0Var6.a0(28700);
                            bb0Var6.Z(8200);
                            break;
                        case 27:
                            bb0 bb0Var7 = new bb0();
                            k2Var.presentFragment(bb0Var7);
                            bb0Var7.a0(28700);
                            bb0Var7.Z(4112);
                            break;
                        case 28:
                            bb0 bb0Var8 = new bb0();
                            k2Var.presentFragment(bb0Var8);
                            bb0Var8.Z(360928);
                            break;
                        default:
                            bb0 bb0Var9 = new bb0();
                            k2Var.presentFragment(bb0Var9);
                            bb0Var9.a0(360928);
                            bb0Var9.Z(32);
                            break;
                    }
                }
            });
        } else {
            gy0Var21 = null;
        }
        final int i93 = 18;
        gy0 gy0Var124 = new gy0(900, org.telegram.messenger.cd.K0(2131747081), null, R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var124.a("tg://settings/power-saving");
        final int i94 = 19;
        gy0 gy0Var125 = new gy0(901, org.telegram.messenger.cd.K0(2131748860), org.telegram.messenger.cd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var125.a("tg://settings/power-saving/stickers");
        final int i95 = 20;
        gy0 gy0Var126 = new gy0(902, org.telegram.messenger.cd.K0(2131748872), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748860), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i96 = 22;
        gy0 gy0Var127 = new gy0(903, org.telegram.messenger.cd.K0(2131748874), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748860), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i97 = 23;
        gy0 gy0Var128 = new gy0(904, org.telegram.messenger.cd.K0(2131748865), org.telegram.messenger.cd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var128.a("tg://settings/power-saving/emoji");
        final int i98 = 25;
        gy0 gy0Var129 = new gy0(905, org.telegram.messenger.cd.K0(2131748872), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748865), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i99 = 26;
        gy0 gy0Var130 = new gy0(906, org.telegram.messenger.cd.K0(2131748871), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748865), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i100 = 27;
        gy0 gy0Var131 = new gy0(907, org.telegram.messenger.cd.K0(2131748874), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748865), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        final int i101 = 28;
        gy0 gy0Var132 = new gy0(908, org.telegram.messenger.cd.K0(2131748866), org.telegram.messenger.cd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var132.a("tg://settings/power-saving/effects");
        final int i102 = 29;
        gy0 gy0Var133 = new gy0(909, org.telegram.messenger.cd.K0(2131748869), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.by0
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
                        k2Var.presentFragment(new pz0());
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
                        k2Var.presentFragment(new bb0());
                        break;
                    case 19:
                        bb0 bb0Var = new bb0();
                        k2Var.presentFragment(bb0Var);
                        bb0Var.Z(3);
                        break;
                    case 20:
                        bb0 bb0Var2 = new bb0();
                        k2Var.presentFragment(bb0Var2);
                        bb0Var2.a0(3);
                        bb0Var2.Z(1);
                        break;
                    case 21:
                        k2Var.presentFragment(new FiltersSetupActivity());
                        break;
                    case 22:
                        bb0 bb0Var3 = new bb0();
                        k2Var.presentFragment(bb0Var3);
                        bb0Var3.a0(3);
                        bb0Var3.Z(2);
                        break;
                    case 23:
                        bb0 bb0Var4 = new bb0();
                        k2Var.presentFragment(bb0Var4);
                        bb0Var4.Z(28700);
                        break;
                    case 24:
                        k2Var.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 25:
                        bb0 bb0Var5 = new bb0();
                        k2Var.presentFragment(bb0Var5);
                        bb0Var5.a0(28700);
                        bb0Var5.Z(16388);
                        break;
                    case 26:
                        bb0 bb0Var6 = new bb0();
                        k2Var.presentFragment(bb0Var6);
                        bb0Var6.a0(28700);
                        bb0Var6.Z(8200);
                        break;
                    case 27:
                        bb0 bb0Var7 = new bb0();
                        k2Var.presentFragment(bb0Var7);
                        bb0Var7.a0(28700);
                        bb0Var7.Z(4112);
                        break;
                    case 28:
                        bb0 bb0Var8 = new bb0();
                        k2Var.presentFragment(bb0Var8);
                        bb0Var8.Z(360928);
                        break;
                    default:
                        bb0 bb0Var9 = new bb0();
                        k2Var.presentFragment(bb0Var9);
                        bb0Var9.a0(360928);
                        bb0Var9.Z(32);
                        break;
                }
            }
        });
        gy0Var133.a("tg://settings/power-saving/background");
        final int i103 = 0;
        gy0 gy0Var134 = new gy0(910, org.telegram.messenger.cd.K0(2131748857), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i103;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0 gy0Var135 = new gy0(911, org.telegram.messenger.cd.K0(2131748861), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i104;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        if (org.telegram.messenger.tz.o() >= 1) {
            final int i105 = 3;
            gy0Var22 = new gy0(org.telegram.messenger.zs.x5, org.telegram.messenger.cd.K0(2131748868), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.cy0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i105;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            break;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            break;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            break;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            break;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            break;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((wa0) arrayList.get(i132)).f == 1) {
                                    bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var22 = null;
        }
        final int i106 = 4;
        gy0 gy0Var136 = new gy0(912, org.telegram.messenger.cd.K0(2131748862), null, org.telegram.messenger.cd.K0(2131747081), org.telegram.messenger.cd.K0(2131748866), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i106;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0 gy0Var137 = new gy0(913, org.telegram.messenger.cd.K0(2131748867), org.telegram.messenger.cd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i107;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var137.a("tg://settings/power-saving/call-animations");
        final int i108 = 7;
        gy0 gy0Var138 = new gy0(org.telegram.messenger.zs.r3, org.telegram.messenger.cd.K0(2131748870), org.telegram.messenger.cd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i108;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var138.a("tg://settings/power-saving/videos");
        final int i109 = 8;
        gy0 gy0Var139 = new gy0(org.telegram.messenger.zs.q3, org.telegram.messenger.cd.K0(2131748873), org.telegram.messenger.cd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i109;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var139.a("tg://settings/power-saving/gifs");
        final int i110 = 9;
        gy0 gy0Var140 = new gy0(914, org.telegram.messenger.cd.K0(2131748856), org.telegram.messenger.cd.K0(2131747081), R.drawable.msg2_battery, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i110;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var140.a("tg://settings/power-saving/transitions");
        final int i111 = 10;
        gy0 gy0Var141 = new gy0(400, org.telegram.messenger.cd.K0(2131749064), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i111;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var141.a("tg://settings/language");
        final int i112 = 11;
        gy0 gy0Var142 = new gy0(405, org.telegram.messenger.cd.K0(2131745345), org.telegram.messenger.cd.K0(2131749064), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i112;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var142.a("tg://settings/language/show-button");
        if (org.telegram.messenger.vp.r1(currentAccount).S1().s()) {
            final int i113 = 12;
            gy0 gy0Var143 = new gy0(406, org.telegram.messenger.cd.K0(2131751359), org.telegram.messenger.cd.K0(2131749064), R.drawable.msg2_language, new Runnable() { // from class: org.telegram.ui.cy0
                @Override // java.lang.Runnable
                public final void run() {
                    int i122 = i113;
                    int i132 = 0;
                    org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                    switch (i122) {
                        case 0:
                            bb0 bb0Var = new bb0();
                            k2Var2.presentFragment(bb0Var);
                            bb0Var.a0(360928);
                            bb0Var.Z(64);
                            break;
                        case 1:
                            bb0 bb0Var2 = new bb0();
                            k2Var2.presentFragment(bb0Var2);
                            bb0Var2.a0(360928);
                            bb0Var2.Z(128);
                            break;
                        case 2:
                            k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                            break;
                        case 3:
                            bb0 bb0Var3 = new bb0();
                            k2Var2.presentFragment(bb0Var3);
                            bb0Var3.a0(360928);
                            bb0Var3.Z(256);
                            break;
                        case 4:
                            bb0 bb0Var4 = new bb0();
                            k2Var2.presentFragment(bb0Var4);
                            bb0Var4.a0(360928);
                            bb0Var4.Z(32768);
                            break;
                        case 5:
                            bb0 bb0Var5 = new bb0();
                            k2Var2.presentFragment(bb0Var5);
                            bb0Var5.Z(512);
                            break;
                        case 6:
                            k2Var2.presentFragment(new NotificationsSettingsActivity());
                            break;
                        case 7:
                            bb0 bb0Var6 = new bb0();
                            k2Var2.presentFragment(bb0Var6);
                            bb0Var6.Z(1024);
                            break;
                        case 8:
                            bb0 bb0Var7 = new bb0();
                            k2Var2.presentFragment(bb0Var7);
                            bb0Var7.Z(2048);
                            break;
                        case 9:
                            bb0 bb0Var8 = new bb0();
                            k2Var2.presentFragment(bb0Var8);
                            while (true) {
                                ArrayList arrayList = bb0Var8.s;
                                if (i132 >= arrayList.size()) {
                                    break;
                                } else if (((wa0) arrayList.get(i132)).f == 1) {
                                    bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                            break;
                        case 16:
                            gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                            k2Var2.presentFragment(PasscodeActivity.o0());
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
                            av0 av0Var = new av0();
                            av0Var.getMessagesController().F0(true);
                            k2Var2.presentFragment(av0Var);
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
            gy0Var143.a("tg://settings/language/do-not-translate");
            gy0Var43 = gy0Var143;
        }
        final int i114 = 14;
        gy0 gy0Var144 = new gy0(402, org.telegram.messenger.cd.K0(2131753986), org.telegram.messenger.cd.K0(2131745497), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i114;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var144.a("tg://settings/ask-question");
        final int i115 = 15;
        gy0 gy0Var145 = new gy0(403, org.telegram.messenger.cd.K0(2131744267), org.telegram.messenger.cd.K0(2131745497), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i115;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var145.a("tg://settings/faq");
        final int i116 = 16;
        gy0 gy0Var146 = new gy0(404, org.telegram.messenger.cd.K0(2131746798), org.telegram.messenger.cd.K0(2131745497), R.drawable.msg2_help, new Runnable() { // from class: org.telegram.ui.cy0
            @Override // java.lang.Runnable
            public final void run() {
                int i122 = i116;
                int i132 = 0;
                org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                switch (i122) {
                    case 0:
                        bb0 bb0Var = new bb0();
                        k2Var2.presentFragment(bb0Var);
                        bb0Var.a0(360928);
                        bb0Var.Z(64);
                        break;
                    case 1:
                        bb0 bb0Var2 = new bb0();
                        k2Var2.presentFragment(bb0Var2);
                        bb0Var2.a0(360928);
                        bb0Var2.Z(128);
                        break;
                    case 2:
                        k2Var2.presentFragment(new PremiumPreviewFragment(0, "settings"));
                        break;
                    case 3:
                        bb0 bb0Var3 = new bb0();
                        k2Var2.presentFragment(bb0Var3);
                        bb0Var3.a0(360928);
                        bb0Var3.Z(256);
                        break;
                    case 4:
                        bb0 bb0Var4 = new bb0();
                        k2Var2.presentFragment(bb0Var4);
                        bb0Var4.a0(360928);
                        bb0Var4.Z(32768);
                        break;
                    case 5:
                        bb0 bb0Var5 = new bb0();
                        k2Var2.presentFragment(bb0Var5);
                        bb0Var5.Z(512);
                        break;
                    case 6:
                        k2Var2.presentFragment(new NotificationsSettingsActivity());
                        break;
                    case 7:
                        bb0 bb0Var6 = new bb0();
                        k2Var2.presentFragment(bb0Var6);
                        bb0Var6.Z(1024);
                        break;
                    case 8:
                        bb0 bb0Var7 = new bb0();
                        k2Var2.presentFragment(bb0Var7);
                        bb0Var7.Z(2048);
                        break;
                    case 9:
                        bb0 bb0Var8 = new bb0();
                        k2Var2.presentFragment(bb0Var8);
                        while (true) {
                            ArrayList arrayList = bb0Var8.s;
                            if (i132 >= arrayList.size()) {
                                break;
                            } else if (((wa0) arrayList.get(i132)).f == 1) {
                                bb0Var8.b.e1(new i2.q(bb0Var8, i132, 14), 700, true);
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
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131744265, null));
                        break;
                    case 16:
                        gf.f.r(k2Var2.getParentActivity(), org.telegram.messenger.cd.L0(2131746796, null));
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
                        k2Var2.presentFragment(PasscodeActivity.o0());
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
                        av0 av0Var = new av0();
                        av0Var.getMessagesController().F0(true);
                        k2Var2.presentFragment(av0Var);
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
        gy0Var146.a("tg://settings/privacy-policy");
        return new gy0[]{gy0Var23, gy0Var24, gy0Var25, gy0Var26, gy0Var27, gy0Var28, gy0Var29, gy0Var30, gy0Var31, gy0Var32, gy0Var33, gy0Var34, gy0Var35, gy0Var36, gy0Var37, gy0Var38, gy0Var39, gy0Var, gy0Var41, gy0Var42, gy0Var2, gy0Var44, gy0Var45, gy0Var46, gy0Var47, gy0Var48, gy0Var49, gy0Var50, gy0Var51, gy0Var52, gy0Var3, gy0Var4, gy0Var54, gy0Var55, gy0Var56, gy0Var57, gy0Var58, gy0Var59, gy0Var60, gy0Var61, gy0Var62, gy0Var63, gy0Var64, gy0Var65, gy0Var66, gy0Var67, gy0Var68, gy0Var69, gy0Var70, gy0Var71, gy0Var72, gy0Var73, gy0Var74, gy0Var75, gy0Var76, gy0Var77, gy0Var78, gy0Var79, gy0Var80, gy0Var81, gy0Var82, gy0Var83, gy0Var84, gy0Var85, gy0Var86, gy0Var87, gy0Var88, gy0Var89, gy0Var90, gy0Var91, gy0Var92, gy0Var93, gy0Var94, gy0Var95, gy0Var96, gy0Var97, gy0Var98, gy0Var99, gy0Var100, gy0Var101, gy0Var102, gy0Var103, gy0Var104, gy0Var105, gy0Var106, gy0Var107, gy0Var108, gy0Var109, gy0Var110, gy0Var111, gy0Var112, gy0Var6, gy0Var114, gy0Var7, gy0Var116, gy0Var8, gy0Var118, gy0Var119, gy0Var120, gy0Var121, gy0Var5, gy0Var9, gy0Var10, gy0Var11, gy0Var12, gy0Var13, gy0Var14, gy0Var15, gy0Var16, gy0Var123, gy0Var17, gy0Var18, gy0Var19, gy0Var20, gy0Var21, gy0Var124, gy0Var125, gy0Var126, gy0Var127, gy0Var128, gy0Var129, gy0Var130, gy0Var131, gy0Var132, gy0Var133, gy0Var134, gy0Var135, gy0Var22, gy0Var136, gy0Var137, gy0Var138, gy0Var139, gy0Var140, gy0Var141, gy0Var142, gy0Var43, gy0Var144, gy0Var145, gy0Var146};
    }

    @Override // org.telegram.ui.Components.sk0
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
            if (obj2 instanceof gy0) {
                ((gy0) obj2).g = i10;
            } else if (obj2 instanceof org.telegram.messenger.hp) {
                ((org.telegram.messenger.hp) obj2).d = i10;
            }
            linkedHashSet.add(obj2.toString());
        }
        org.telegram.messenger.vp.d1().edit().putStringSet("settingsSearchRecent2", linkedHashSet).commit();
    }

    public final void G() {
        int i10 = this.f;
        TLRPC.WebPage webPage = org.telegram.messenger.vp.r1(i10).q2;
        this.E = webPage;
        if (webPage != null) {
            this.d.addAll(org.telegram.messenger.vp.r1(i10).p2);
        }
        if (this.E != null || this.F) {
            return;
        }
        this.F = true;
        TLRPC.TL_messages_getWebPage tL_messages_getWebPage = new TLRPC.TL_messages_getWebPage();
        tL_messages_getWebPage.url = org.telegram.messenger.cd.L0(2131744265, null);
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
            et0 et0Var = new et0(20, this, str);
            this.y = et0Var;
            r5Var.d(et0Var, 300L);
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
                ((ProfileActivity) this.e).O.d.setText(org.telegram.messenger.cd.L0(2131745495, null));
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
        f();
    }

    public final void J() {
        String[] strArr;
        gy0 gy0Var;
        HashMap hashMap = new HashMap();
        int i10 = 0;
        while (true) {
            gy0[] gy0VarArr = this.c;
            if (i10 >= gy0VarArr.length) {
                break;
            }
            gy0 gy0Var2 = gy0VarArr[i10];
            if (gy0Var2 != null) {
                hashMap.put(Integer.valueOf(gy0Var2.f), this.c[i10]);
            }
            i10++;
        }
        Set<String> stringSet = org.telegram.messenger.vp.d1().getStringSet("settingsSearchRecent2", null);
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
                        org.telegram.messenger.hp hpVar = new org.telegram.messenger.hp(readString, strArr, serializedData.readString(false));
                        hpVar.d = readInt32;
                        arrayList.add(hpVar);
                    } else if (readInt322 == 1 && (gy0Var = (gy0) hashMap.get(Integer.valueOf(serializedData.readInt32(false)))) != null) {
                        gy0Var.g = readInt32;
                        arrayList.add(gy0Var);
                    }
                } catch (Exception unused) {
                }
            }
        }
        Collections.sort(arrayList, new ex0(this, 1));
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
                ((org.telegram.ui.Cells.z3) view).setText(org.telegram.messenger.cd.L0(2131745500, null));
                return;
            } else {
                if (i11 != 2) {
                    return;
                }
                ((org.telegram.ui.Cells.p4) view).setText(org.telegram.messenger.cd.L0(2131745487, null));
                return;
            }
        }
        org.telegram.ui.Cells.z6 z6Var = (org.telegram.ui.Cells.z6) view;
        if (this.x) {
            if (i10 >= this.r.size()) {
                int e = sc.e.e(1, i10, this.r);
                z6Var.a((CharSequence) this.n.get(this.r.size() + e), ((org.telegram.messenger.hp) this.s.get(e)).b, true, e < this.r.size() - 1);
                return;
            } else {
                gy0 gy0Var = (gy0) this.r.get(i10);
                gy0 gy0Var2 = i10 > 0 ? (gy0) this.r.get(i10 - 1) : null;
                z6Var.b((CharSequence) this.n.get(i10), gy0Var.d, (gy0Var2 == null || gy0Var2.e != gy0Var.e) ? gy0Var.e : 0, i10 < this.r.size() - 1);
                return;
            }
        }
        ArrayList arrayList = this.w;
        if (!arrayList.isEmpty()) {
            i10--;
        }
        if (i10 >= arrayList.size()) {
            int e7 = sc.e.e(1, i10, arrayList);
            org.telegram.messenger.hp hpVar = (org.telegram.messenger.hp) this.d.get(e7);
            z6Var.a(hpVar.a, hpVar.b, true, e7 < arrayList.size() - 1);
            return;
        }
        Object obj = arrayList.get(i10);
        if (obj instanceof gy0) {
            gy0 gy0Var3 = (gy0) obj;
            z6Var.a(gy0Var3.a, gy0Var3.d, false, i10 < arrayList.size() - 1);
        } else if (obj instanceof org.telegram.messenger.hp) {
            org.telegram.messenger.hp hpVar2 = (org.telegram.messenger.hp) obj;
            z6Var.a(hpVar2.a, hpVar2.b, true, i10 < arrayList.size() - 1);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        Context context = this.h;
        View p4Var = i10 != 0 ? i10 != 1 ? new org.telegram.ui.Cells.p4(context, 16) : new org.telegram.ui.Cells.z3(context, null) : new org.telegram.ui.Cells.z6(context);
        p4Var.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.ck0(p4Var);
    }
}
