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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cy b;

    public /* synthetic */ cv(cy cyVar, int i10) {
        this.a = i10;
        this.b = cyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x026a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
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
                cyVar2.I4(false, true);
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
                cyVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", cyVar3.Y2);
                cyVar3.presentFragment(new ii.o(bundle));
                break;
            case 4:
                cy cyVar4 = this.b;
                cyVar4.getClass();
                cyVar4.presentFragment(new org.telegram.ui.Wallet.m5());
                break;
            case 5:
                cy cyVar5 = this.b;
                cyVar5.getClass();
                cyVar5.presentFragment(new d81(null));
                break;
            case 6:
                cy cyVar6 = this.b;
                if (!cyVar6.Z2.collapsed_in_dialogs) {
                    cyVar6.getMessagesController().toggleCommunityCollapsedInDialogs(cyVar6.Y2, true);
                    cyVar6.finishFragment();
                    break;
                }
                break;
            case 7:
                cy cyVar7 = this.b;
                if (cyVar7.Z2.collapsed_in_dialogs) {
                    cyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(cyVar7.Y2, false);
                    cyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                cy cyVar8 = this.b;
                cyVar8.getClass();
                cyVar8.presentFragment(new k());
                break;
            case 9:
                this.b.O4();
                break;
            case 10:
                cy cyVar9 = this.b;
                if (!cy.y4) {
                    cy.y4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.y6.P0(string) == null || org.telegram.ui.ActionBar.y6.P0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.y6.P0(string2) == null || !org.telegram.ui.ActionBar.y6.P0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.x6 x6Var = org.telegram.ui.ActionBar.y6.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (x6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean equals = str.equals(x6Var.m());
                        org.telegram.ui.ActionBar.x6 P0 = !equals ? org.telegram.ui.ActionBar.y6.P0(str2) : org.telegram.ui.ActionBar.y6.P0(str);
                        w0Var = cyVar9.k0;
                        if (w0Var != null) {
                            int[] iArr = {(cyVar9.k0.getIconView().getMeasuredWidth() / 2) + r7, (cyVar9.k0.getIconView().getMeasuredHeight() / 2) + r7};
                            w0Var.getLocationInWindow(iArr);
                            int i13 = iArr[0];
                            int i14 = iArr[1];
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(cyVar9);
                        cv cvVar = new cv(cyVar9, 27);
                        i10 = org.telegram.ui.ActionBar.y6.o;
                        if (i10 == 0) {
                            if (b02 != null) {
                                try {
                                    b02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, cvVar).j();
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                            }
                            org.telegram.ui.ActionBar.y6.o = 0;
                            org.telegram.ui.ActionBar.y6.t1();
                            org.telegram.ui.ActionBar.y6.A();
                            break;
                        }
                    }
                    str = string;
                    boolean equals2 = str.equals(x6Var.m());
                    if (!equals2) {
                    }
                    w0Var = cyVar9.k0;
                    if (w0Var != null) {
                    }
                    org.telegram.ui.Components.wc b022 = org.telegram.ui.Components.wc.b0(cyVar9);
                    cv cvVar2 = new cv(cyVar9, 27);
                    i10 = org.telegram.ui.ActionBar.y6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 11:
                cy cyVar10 = this.b;
                cyVar10.getClass();
                cyVar10.presentFragment(new ContactsActivity(null));
                break;
            case 12:
                cy cyVar11 = this.b;
                cyVar11.getClass();
                cyVar11.presentFragment(new o9(null));
                break;
            case 13:
                cy cyVar12 = this.b;
                cyVar12.getClass();
                cyVar12.presentFragment(new r60(new Bundle()));
                break;
            case 14:
                cy.X(this.b);
                break;
            case 15:
                cy.q0(this.b);
                break;
            case 16:
                this.b.c5();
                break;
            case 17:
                cy cyVar13 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                p2Var.a = true;
                cyVar13.showAsSheet(new PrivacyControlActivity(11, false), p2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                cy cyVar14 = this.b;
                ArrayList arrayList = cyVar14.I2;
                cyVar14.M2 = true;
                if (cyVar14.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    cyVar14.C2.v(cyVar14, arrayList2, cyVar14.B1.getFieldText(), false, cyVar14.J2, cyVar14.K2, cyVar14.L2, null);
                    break;
                }
                break;
            case 20:
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
                    cyVar15.C2.v(cyVar15, arrayList4, cyVar15.B1.getFieldText(), false, cyVar15.J2, cyVar15.K2, cyVar15.L2, null);
                    break;
                }
                break;
            case 21:
                cy.w0(this.b);
                break;
            case 22:
                cy cyVar16 = this.b;
                cyVar16.getClass();
                if (LaunchActivity.R() != null) {
                    cyVar16.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                cy cyVar17 = this.b;
                cyVar17.X.r.requestFocus();
                AndroidUtilities.showKeyboard(cyVar17.X.r);
                break;
            case 24:
                this.b.I4(false, true);
                break;
            case 25:
                cy cyVar18 = this.b;
                cyVar18.getClass();
                cyVar18.presentFragment(new k());
                break;
            case 26:
                cy cyVar19 = this.b;
                cyVar19.getClass();
                cyVar19.presentFragment(new FiltersSetupActivity());
                break;
            case 27:
                cy cyVar20 = this.b;
                cyVar20.getClass();
                cyVar20.presentFragment(new ThemeActivity(1));
                break;
            case 28:
                cy cyVar21 = this.b;
                cyVar21.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(cyVar21.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            default:
                this.b.getMessagesController().clearSendAsPeers();
                break;
        }
    }
}
