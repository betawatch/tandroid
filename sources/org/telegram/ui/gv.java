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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gy b;

    public /* synthetic */ gv(gy gyVar, int i10) {
        this.a = i10;
        this.b = gyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0235  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.v0 v0Var;
        int i10;
        we1 we1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                gy gyVar = this.b;
                gyVar.getClass();
                gyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                gy gyVar2 = this.b;
                gyVar2.A4(false, true);
                if (gyVar2.a0 != null) {
                    int i11 = 0;
                    while (true) {
                        fy[] fyVarArr = gyVar2.a0;
                        if (i11 >= fyVarArr.length) {
                            break;
                        } else {
                            if (fyVarArr[i11].getVisibility() == 0) {
                                fy fyVar = gyVar2.a0[i11];
                                if (!fyVar.d.C) {
                                    fyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                gy gyVar3 = this.b;
                gyVar3.T.r.requestFocus();
                AndroidUtilities.showKeyboard(gyVar3.T.r);
                break;
            case 4:
                gy gyVar4 = this.b;
                gyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", gyVar4.T2);
                gyVar4.presentFragment(new oh.o(bundle));
                break;
            case 5:
                gy gyVar5 = this.b;
                gyVar5.a0[0].a.requestLayout();
                bx bxVar = gyVar5.B3;
                if (bxVar != null && (bxVar.getFragment() instanceof we1)) {
                    we1Var = (we1) gyVar5.B3.getFragment();
                }
                if (we1Var != null) {
                    we1Var.B0();
                }
                gyVar5.G3(false);
                gyVar5.S4();
                px pxVar = gyVar5.y0;
                if (pxVar != null) {
                    pxVar.invalidate();
                    break;
                }
                break;
            case 6:
                gy gyVar6 = this.b;
                gyVar6.getClass();
                gyVar6.presentFragment(new x71(null));
                break;
            case 7:
                gy gyVar7 = this.b;
                if (!gyVar7.U2.collapsed_in_dialogs) {
                    gyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(gyVar7.T2, true);
                    gyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                gy gyVar8 = this.b;
                if (gyVar8.U2.collapsed_in_dialogs) {
                    gyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(gyVar8.T2, false);
                    gyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                gy gyVar9 = this.b;
                gyVar9.getClass();
                gyVar9.presentFragment(new m());
                break;
            case 10:
                this.b.G4();
                break;
            case 11:
                gy gyVar10 = this.b;
                if (!gy.t4) {
                    gy.t4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.g6.N0(string) == null || org.telegram.ui.ActionBar.g6.N0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.g6.N0(string2) == null || !org.telegram.ui.ActionBar.g6.N0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = org.telegram.ui.ActionBar.g6.I;
                    if (string.equals(string2)) {
                        if (f6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                            str2 = string2;
                            boolean equals = str.equals(f6Var.m());
                            org.telegram.ui.ActionBar.f6 N0 = !equals ? org.telegram.ui.ActionBar.g6.N0(str2) : org.telegram.ui.ActionBar.g6.N0(str);
                            v0Var = gyVar10.g0;
                            if (v0Var != null) {
                                int[] iArr = {(gyVar10.g0.getIconView().getMeasuredWidth() / 2) + r7, (gyVar10.g0.getIconView().getMeasuredHeight() / 2) + r7};
                                v0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.mc a02 = org.telegram.ui.Components.mc.a0(gyVar10);
                            gv gvVar = new gv(gyVar10, 26);
                            i10 = org.telegram.ui.ActionBar.g6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, gvVar).j();
                                    } catch (Exception e9) {
                                        FileLog.e(e9);
                                    }
                                }
                                org.telegram.ui.ActionBar.g6.o = 0;
                                org.telegram.ui.ActionBar.g6.q1();
                                org.telegram.ui.ActionBar.g6.A();
                                break;
                            }
                        }
                    } else {
                        str2 = string2;
                    }
                    str = string;
                    boolean equals2 = str.equals(f6Var.m());
                    if (!equals2) {
                    }
                    v0Var = gyVar10.g0;
                    if (v0Var != null) {
                    }
                    org.telegram.ui.Components.mc a022 = org.telegram.ui.Components.mc.a0(gyVar10);
                    gv gvVar2 = new gv(gyVar10, 26);
                    i10 = org.telegram.ui.ActionBar.g6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                gy gyVar11 = this.b;
                gyVar11.getClass();
                gyVar11.presentFragment(new o60(new Bundle()));
                break;
            case 13:
                gy.b0(this.b);
                break;
            case 14:
                this.b.m3();
                break;
            case 15:
                gy.q0(this.b);
                break;
            case 16:
                this.b.U4();
                break;
            case 17:
                gy gyVar12 = this.b;
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                gyVar12.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                gy gyVar13 = this.b;
                ArrayList arrayList = gyVar13.E2;
                gyVar13.F2 = false;
                if (gyVar13.y2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    gyVar13.y2.w(gyVar13, arrayList2, gyVar13.x1.getFieldText(), false, gyVar13.F2, gyVar13.G2, gyVar13.H2, null);
                    break;
                }
                break;
            case 20:
                gy gyVar14 = this.b;
                org.telegram.ui.Components.y4.M(gyVar14.getParentActivity(), -1L, new nx(gyVar14), gyVar14.getResourceProvider());
                break;
            case 21:
                gy.x0(this.b);
                break;
            case 22:
                gy gyVar15 = this.b;
                gyVar15.getClass();
                if (LaunchActivity.R() != null) {
                    gyVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                this.b.A4(false, true);
                break;
            case 24:
                gy gyVar16 = this.b;
                gyVar16.getClass();
                gyVar16.presentFragment(new m());
                break;
            case 25:
                gy gyVar17 = this.b;
                gyVar17.getClass();
                gyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                gy gyVar18 = this.b;
                gyVar18.getClass();
                gyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                gy gyVar19 = this.b;
                gyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(gyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            default:
                gy gyVar20 = this.b;
                px pxVar2 = gyVar20.y0;
                if (pxVar2 == null || !pxVar2.u0) {
                    gyVar20.T.r.getText().clear();
                    AndroidUtilities.hideKeyboard(gyVar20.T.r);
                    gyVar20.T.r.clearFocus();
                    gyVar20.U.b(false);
                    break;
                } else {
                    pxVar2.Q(false);
                    break;
                }
        }
    }
}
