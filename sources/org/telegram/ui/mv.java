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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oy b;

    public /* synthetic */ mv(oy oyVar, int i10) {
        this.a = i10;
        this.b = oyVar;
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
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
        kf1 kf1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                oy oyVar = this.b;
                oyVar.getClass();
                oyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                oy oyVar2 = this.b;
                oyVar2.A4(false, true);
                if (oyVar2.b0 != null) {
                    int i11 = 0;
                    while (true) {
                        ny[] nyVarArr = oyVar2.b0;
                        if (i11 >= nyVarArr.length) {
                            break;
                        } else {
                            if (nyVarArr[i11].getVisibility() == 0) {
                                ny nyVar = oyVar2.b0[i11];
                                if (!nyVar.d.D) {
                                    nyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                oy oyVar3 = this.b;
                oyVar3.U.r.requestFocus();
                AndroidUtilities.showKeyboard(oyVar3.U.r);
                break;
            case 4:
                oy oyVar4 = this.b;
                oyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", oyVar4.U2);
                oyVar4.presentFragment(new sh.n(bundle));
                break;
            case 5:
                oy oyVar5 = this.b;
                oyVar5.b0[0].a.requestLayout();
                jx jxVar = oyVar5.C3;
                if (jxVar != null && (jxVar.getFragment() instanceof kf1)) {
                    kf1Var = (kf1) oyVar5.C3.getFragment();
                }
                if (kf1Var != null) {
                    kf1Var.B0();
                }
                oyVar5.G3(false);
                oyVar5.S4();
                xx xxVar = oyVar5.z0;
                if (xxVar != null) {
                    xxVar.invalidate();
                    break;
                }
                break;
            case 6:
                oy oyVar6 = this.b;
                oyVar6.getClass();
                oyVar6.presentFragment(new o81(null));
                break;
            case 7:
                oy oyVar7 = this.b;
                if (!oyVar7.V2.collapsed_in_dialogs) {
                    oyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(oyVar7.U2, true);
                    oyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                oy oyVar8 = this.b;
                if (oyVar8.V2.collapsed_in_dialogs) {
                    oyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(oyVar8.U2, false);
                    oyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                oy oyVar9 = this.b;
                oyVar9.getClass();
                oyVar9.presentFragment(new n());
                break;
            case 10:
                this.b.G4();
                break;
            case 11:
                oy oyVar10 = this.b;
                if (!oy.u4) {
                    oy.u4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.j6.N0(string) == null || org.telegram.ui.ActionBar.j6.N0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.j6.N0(string2) == null || !org.telegram.ui.ActionBar.j6.N0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.i6 i6Var = org.telegram.ui.ActionBar.j6.I;
                    if (string.equals(string2)) {
                        if (i6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                            str2 = string2;
                            boolean equals = str.equals(i6Var.m());
                            org.telegram.ui.ActionBar.i6 N0 = !equals ? org.telegram.ui.ActionBar.j6.N0(str2) : org.telegram.ui.ActionBar.j6.N0(str);
                            w0Var = oyVar10.h0;
                            if (w0Var != null) {
                                int[] iArr = {(oyVar10.h0.getIconView().getMeasuredWidth() / 2) + r7, (oyVar10.h0.getIconView().getMeasuredHeight() / 2) + r7};
                                w0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(oyVar10);
                            mv mvVar = new mv(oyVar10, 26);
                            i10 = org.telegram.ui.ActionBar.j6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, mvVar).j();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                org.telegram.ui.ActionBar.j6.o = 0;
                                org.telegram.ui.ActionBar.j6.q1();
                                org.telegram.ui.ActionBar.j6.A();
                                break;
                            }
                        }
                    } else {
                        str2 = string2;
                    }
                    str = string;
                    boolean equals2 = str.equals(i6Var.m());
                    if (!equals2) {
                    }
                    w0Var = oyVar10.h0;
                    if (w0Var != null) {
                    }
                    org.telegram.ui.Components.qc a022 = org.telegram.ui.Components.qc.a0(oyVar10);
                    mv mvVar2 = new mv(oyVar10, 26);
                    i10 = org.telegram.ui.ActionBar.j6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                oy oyVar11 = this.b;
                oyVar11.getClass();
                oyVar11.presentFragment(new y60(new Bundle()));
                break;
            case 13:
                oy.b0(this.b);
                break;
            case 14:
                this.b.m3();
                break;
            case 15:
                oy.q0(this.b);
                break;
            case 16:
                this.b.U4();
                break;
            case 17:
                oy oyVar12 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                oyVar12.showAsSheet(new PrivacyControlActivity(11, false), n2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                oy oyVar13 = this.b;
                ArrayList arrayList = oyVar13.F2;
                oyVar13.G2 = false;
                if (oyVar13.z2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    oyVar13.z2.w(oyVar13, arrayList2, oyVar13.y1.getFieldText(), false, oyVar13.G2, oyVar13.H2, oyVar13.I2, null);
                    break;
                }
                break;
            case 20:
                oy oyVar14 = this.b;
                org.telegram.ui.Components.z4.M(oyVar14.getParentActivity(), -1L, new vx(oyVar14), oyVar14.getResourceProvider());
                break;
            case 21:
                oy.x0(this.b);
                break;
            case 22:
                oy oyVar15 = this.b;
                oyVar15.getClass();
                if (LaunchActivity.R() != null) {
                    oyVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                this.b.A4(false, true);
                break;
            case 24:
                oy oyVar16 = this.b;
                oyVar16.getClass();
                oyVar16.presentFragment(new n());
                break;
            case 25:
                oy oyVar17 = this.b;
                oyVar17.getClass();
                oyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                oy oyVar18 = this.b;
                oyVar18.getClass();
                oyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                oy oyVar19 = this.b;
                oyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(oyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            default:
                oy oyVar20 = this.b;
                xx xxVar2 = oyVar20.z0;
                if (xxVar2 == null || !xxVar2.v0) {
                    oyVar20.U.r.getText().clear();
                    AndroidUtilities.hideKeyboard(oyVar20.U.r);
                    oyVar20.U.r.clearFocus();
                    oyVar20.V.b(false);
                    break;
                } else {
                    xxVar2.Q(false);
                    break;
                }
        }
    }
}
