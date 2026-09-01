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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ py b;

    public /* synthetic */ nv(py pyVar, int i10) {
        this.a = i10;
        this.b = pyVar;
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
        mf1 mf1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                py pyVar = this.b;
                pyVar.getClass();
                pyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                py pyVar2 = this.b;
                pyVar2.A4(false, true);
                if (pyVar2.b0 != null) {
                    int i11 = 0;
                    while (true) {
                        oy[] oyVarArr = pyVar2.b0;
                        if (i11 >= oyVarArr.length) {
                            break;
                        } else {
                            if (oyVarArr[i11].getVisibility() == 0) {
                                oy oyVar = pyVar2.b0[i11];
                                if (!oyVar.d.D) {
                                    oyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                py pyVar3 = this.b;
                pyVar3.U.r.requestFocus();
                AndroidUtilities.showKeyboard(pyVar3.U.r);
                break;
            case 4:
                py pyVar4 = this.b;
                pyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", pyVar4.U2);
                pyVar4.presentFragment(new th.n(bundle));
                break;
            case 5:
                py pyVar5 = this.b;
                pyVar5.b0[0].a.requestLayout();
                kx kxVar = pyVar5.C3;
                if (kxVar != null && (kxVar.getFragment() instanceof mf1)) {
                    mf1Var = (mf1) pyVar5.C3.getFragment();
                }
                if (mf1Var != null) {
                    mf1Var.B0();
                }
                pyVar5.G3(false);
                pyVar5.S4();
                yx yxVar = pyVar5.z0;
                if (yxVar != null) {
                    yxVar.invalidate();
                    break;
                }
                break;
            case 6:
                py pyVar6 = this.b;
                pyVar6.getClass();
                pyVar6.presentFragment(new p81(null));
                break;
            case 7:
                py pyVar7 = this.b;
                if (!pyVar7.V2.collapsed_in_dialogs) {
                    pyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(pyVar7.U2, true);
                    pyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                py pyVar8 = this.b;
                if (pyVar8.V2.collapsed_in_dialogs) {
                    pyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(pyVar8.U2, false);
                    pyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                py pyVar9 = this.b;
                pyVar9.getClass();
                pyVar9.presentFragment(new n());
                break;
            case 10:
                this.b.G4();
                break;
            case 11:
                py pyVar10 = this.b;
                if (!py.u4) {
                    py.u4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.k6.N0(string) == null || org.telegram.ui.ActionBar.k6.N0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.k6.N0(string2) == null || !org.telegram.ui.ActionBar.k6.N0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.j6 j6Var = org.telegram.ui.ActionBar.k6.I;
                    if (string.equals(string2)) {
                        if (j6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                            str2 = string2;
                            boolean equals = str.equals(j6Var.m());
                            org.telegram.ui.ActionBar.j6 N0 = !equals ? org.telegram.ui.ActionBar.k6.N0(str2) : org.telegram.ui.ActionBar.k6.N0(str);
                            w0Var = pyVar10.h0;
                            if (w0Var != null) {
                                int[] iArr = {(pyVar10.h0.getIconView().getMeasuredWidth() / 2) + r7, (pyVar10.h0.getIconView().getMeasuredHeight() / 2) + r7};
                                w0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(pyVar10);
                            nv nvVar = new nv(pyVar10, 26);
                            i10 = org.telegram.ui.ActionBar.k6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, nvVar).j();
                                    } catch (Exception e6) {
                                        FileLog.e(e6);
                                    }
                                }
                                org.telegram.ui.ActionBar.k6.o = 0;
                                org.telegram.ui.ActionBar.k6.q1();
                                org.telegram.ui.ActionBar.k6.A();
                                break;
                            }
                        }
                    } else {
                        str2 = string2;
                    }
                    str = string;
                    boolean equals2 = str.equals(j6Var.m());
                    if (!equals2) {
                    }
                    w0Var = pyVar10.h0;
                    if (w0Var != null) {
                    }
                    org.telegram.ui.Components.qc a022 = org.telegram.ui.Components.qc.a0(pyVar10);
                    nv nvVar2 = new nv(pyVar10, 26);
                    i10 = org.telegram.ui.ActionBar.k6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                py pyVar11 = this.b;
                pyVar11.getClass();
                pyVar11.presentFragment(new z60(new Bundle()));
                break;
            case 13:
                py.b0(this.b);
                break;
            case 14:
                this.b.m3();
                break;
            case 15:
                py.q0(this.b);
                break;
            case 16:
                this.b.U4();
                break;
            case 17:
                py pyVar12 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                pyVar12.showAsSheet(new PrivacyControlActivity(11, false), n2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                py pyVar13 = this.b;
                ArrayList arrayList = pyVar13.F2;
                pyVar13.G2 = false;
                if (pyVar13.z2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    pyVar13.z2.v(pyVar13, arrayList2, pyVar13.y1.getFieldText(), false, pyVar13.G2, pyVar13.H2, pyVar13.I2, null);
                    break;
                }
                break;
            case 20:
                py pyVar14 = this.b;
                org.telegram.ui.Components.z4.M(pyVar14.getParentActivity(), -1L, new wx(pyVar14), pyVar14.getResourceProvider());
                break;
            case 21:
                py.x0(this.b);
                break;
            case 22:
                py pyVar15 = this.b;
                pyVar15.getClass();
                if (LaunchActivity.R() != null) {
                    pyVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                this.b.A4(false, true);
                break;
            case 24:
                py pyVar16 = this.b;
                pyVar16.getClass();
                pyVar16.presentFragment(new n());
                break;
            case 25:
                py pyVar17 = this.b;
                pyVar17.getClass();
                pyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                py pyVar18 = this.b;
                pyVar18.getClass();
                pyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                py pyVar19 = this.b;
                pyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(pyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            default:
                py pyVar20 = this.b;
                yx yxVar2 = pyVar20.z0;
                if (yxVar2 == null || !yxVar2.v0) {
                    pyVar20.U.r.getText().clear();
                    AndroidUtilities.hideKeyboard(pyVar20.U.r);
                    pyVar20.U.r.clearFocus();
                    pyVar20.V.b(false);
                    break;
                } else {
                    yxVar2.Q(false);
                    break;
                }
        }
    }
}
