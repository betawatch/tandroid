package org.telegram.ui;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ cv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0251  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.u0 u0Var;
        int i10;
        re1 re1Var = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                cy cyVar = this.b;
                cyVar.getClass();
                cyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                cy cyVar2 = this.b;
                cyVar2.y4(false, true);
                if (cyVar2.e0 != null) {
                    int i12 = 0;
                    while (true) {
                        ay[] ayVarArr = cyVar2.e0;
                        if (i12 >= ayVarArr.length) {
                            break;
                        } else {
                            if (ayVarArr[i12].getVisibility() == 0) {
                                ay ayVar = cyVar2.e0[i12];
                                if (!ayVar.d.G) {
                                    ayVar.q(false);
                                }
                            }
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                cy cyVar3 = this.b;
                cyVar3.X.r.requestFocus();
                AndroidUtilities.showKeyboard(cyVar3.X.r);
                break;
            case 4:
                cy cyVar4 = this.b;
                cyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cyVar4.Y2);
                cyVar4.presentFragment(new hi.o(bundle));
                break;
            case 5:
                cy cyVar5 = this.b;
                cyVar5.e0[0].a.requestLayout();
                ww wwVar = cyVar5.G3;
                if (wwVar != null && (wwVar.getFragment() instanceof re1)) {
                    re1Var = (re1) cyVar5.G3.getFragment();
                }
                if (re1Var != null) {
                    re1Var.B0();
                }
                cyVar5.E3(false);
                cyVar5.Q4();
                lx lxVar = cyVar5.C0;
                if (lxVar != null) {
                    lxVar.invalidate();
                    break;
                }
                break;
            case 6:
                cy cyVar6 = this.b;
                cyVar6.getClass();
                cyVar6.presentFragment(new x71(null));
                break;
            case 7:
                cy cyVar7 = this.b;
                if (!cyVar7.Z2.collapsed_in_dialogs) {
                    cyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(cyVar7.Y2, true);
                    cyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                cy cyVar8 = this.b;
                if (cyVar8.Z2.collapsed_in_dialogs) {
                    cyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(cyVar8.Y2, false);
                    cyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                cy cyVar9 = this.b;
                cyVar9.getClass();
                cyVar9.presentFragment(new l());
                break;
            case 10:
                this.b.E4();
                break;
            case 11:
                cy cyVar10 = this.b;
                if (!cy.x4) {
                    cy.x4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.h6.O0(string) == null || org.telegram.ui.ActionBar.h6.O0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.h6.O0(string2) == null || !org.telegram.ui.ActionBar.h6.O0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = org.telegram.ui.ActionBar.h6.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (g6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(g6Var.m());
                        org.telegram.ui.ActionBar.g6 O0 = !equals ? org.telegram.ui.ActionBar.h6.O0(str2) : org.telegram.ui.ActionBar.h6.O0(str);
                        u0Var = cyVar10.k0;
                        if (u0Var != null) {
                            int[] iArr = {(cyVar10.k0.getIconView().getMeasuredWidth() / 2) + r7, (cyVar10.k0.getIconView().getMeasuredHeight() / 2) + r7};
                            u0Var.getLocationInWindow(iArr);
                            int i13 = iArr[0];
                            int i14 = iArr[1];
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(cyVar10);
                        cv cvVar = new cv(cyVar10, 26);
                        i10 = org.telegram.ui.ActionBar.h6.o;
                        if (i10 == 0) {
                            if (a02 != null) {
                                try {
                                    a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, cvVar).j();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            org.telegram.ui.ActionBar.h6.o = 0;
                            org.telegram.ui.ActionBar.h6.r1();
                            org.telegram.ui.ActionBar.h6.A();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(g6Var.m());
                    if (!equals2) {
                    }
                    u0Var = cyVar10.k0;
                    if (u0Var != null) {
                    }
                    org.telegram.ui.Components.xc a022 = org.telegram.ui.Components.xc.a0(cyVar10);
                    cv cvVar2 = new cv(cyVar10, 26);
                    i10 = org.telegram.ui.ActionBar.h6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                cy cyVar11 = this.b;
                cyVar11.getClass();
                cyVar11.presentFragment(new l60(new Bundle()));
                break;
            case 13:
                cy.c0(this.b);
                break;
            case 14:
                cy cyVar12 = this.b;
                cyVar12.getClass();
                cyVar12.presentFragment(new org.telegram.ui.Wallet.o5());
                break;
            case 15:
                this.b.j3();
                break;
            case 16:
                cy.q0(this.b);
                break;
            case 17:
                this.b.S4();
                break;
            case 18:
                cy cyVar13 = this.b;
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                cyVar13.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                break;
            case 19:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 20:
                cy cyVar14 = this.b;
                ArrayList arrayList = cyVar14.I2;
                cyVar14.M2 = true;
                if (cyVar14.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    cyVar14.C2.w(cyVar14, arrayList2, cyVar14.B1.getFieldText(), false, cyVar14.J2, cyVar14.K2, cyVar14.L2, null);
                    break;
                }
                break;
            case 21:
                cy cyVar15 = this.b;
                ArrayList arrayList3 = cyVar15.I2;
                cyVar15.J2 = false;
                cyVar15.M2 = false;
                if (cyVar15.C2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        arrayList4.add(MessagesStorage.TopicKey.of(((Long) arrayList3.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    cyVar15.C2.w(cyVar15, arrayList4, cyVar15.B1.getFieldText(), false, cyVar15.J2, cyVar15.K2, cyVar15.L2, null);
                    break;
                }
                break;
            case 22:
                cy.u0(this.b);
                break;
            case 23:
                cy cyVar16 = this.b;
                cyVar16.getClass();
                if (LaunchActivity.R() != null) {
                    cyVar16.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 24:
                this.b.y4(false, true);
                break;
            case 25:
                cy cyVar17 = this.b;
                cyVar17.getClass();
                cyVar17.presentFragment(new l());
                break;
            case 26:
                cy cyVar18 = this.b;
                cyVar18.getClass();
                cyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                cy cyVar19 = this.b;
                cyVar19.getClass();
                cyVar19.presentFragment(new FiltersSetupActivity());
                break;
            case 28:
                cy cyVar20 = this.b;
                cyVar20.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(cyVar20.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            default:
                this.b.getMessagesController().clearSendAsPeers();
                break;
        }
    }
}
