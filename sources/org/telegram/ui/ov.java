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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qy b;

    public /* synthetic */ ov(qy qyVar, int i10) {
        this.a = i10;
        this.b = qyVar;
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
        sf1 sf1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                qy qyVar = this.b;
                qyVar.getClass();
                qyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                qy qyVar2 = this.b;
                qyVar2.A4(false, true);
                if (qyVar2.b0 != null) {
                    int i11 = 0;
                    while (true) {
                        py[] pyVarArr = qyVar2.b0;
                        if (i11 >= pyVarArr.length) {
                            break;
                        } else {
                            if (pyVarArr[i11].getVisibility() == 0) {
                                py pyVar = qyVar2.b0[i11];
                                if (!pyVar.d.D) {
                                    pyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                qy qyVar3 = this.b;
                qyVar3.U.r.requestFocus();
                AndroidUtilities.showKeyboard(qyVar3.U.r);
                break;
            case 4:
                qy qyVar4 = this.b;
                qyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", qyVar4.U2);
                qyVar4.presentFragment(new sh.n(bundle));
                break;
            case 5:
                qy qyVar5 = this.b;
                qyVar5.b0[0].a.requestLayout();
                lx lxVar = qyVar5.C3;
                if (lxVar != null && (lxVar.getFragment() instanceof sf1)) {
                    sf1Var = (sf1) qyVar5.C3.getFragment();
                }
                if (sf1Var != null) {
                    sf1Var.B0();
                }
                qyVar5.G3(false);
                qyVar5.S4();
                zx zxVar = qyVar5.z0;
                if (zxVar != null) {
                    zxVar.invalidate();
                    break;
                }
                break;
            case 6:
                qy qyVar6 = this.b;
                qyVar6.getClass();
                qyVar6.presentFragment(new w81(null));
                break;
            case 7:
                qy qyVar7 = this.b;
                if (!qyVar7.V2.collapsed_in_dialogs) {
                    qyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(qyVar7.U2, true);
                    qyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                qy qyVar8 = this.b;
                if (qyVar8.V2.collapsed_in_dialogs) {
                    qyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(qyVar8.U2, false);
                    qyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                qy qyVar9 = this.b;
                qyVar9.getClass();
                qyVar9.presentFragment(new n());
                break;
            case 10:
                this.b.G4();
                break;
            case 11:
                qy qyVar10 = this.b;
                if (!qy.u4) {
                    qy.u4 = true;
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
                            w0Var = qyVar10.h0;
                            if (w0Var != null) {
                                int[] iArr = {(qyVar10.h0.getIconView().getMeasuredWidth() / 2) + r7, (qyVar10.h0.getIconView().getMeasuredHeight() / 2) + r7};
                                w0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(qyVar10);
                            ov ovVar = new ov(qyVar10, 26);
                            i10 = org.telegram.ui.ActionBar.j6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, ovVar).j();
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
                    w0Var = qyVar10.h0;
                    if (w0Var != null) {
                    }
                    org.telegram.ui.Components.qc a022 = org.telegram.ui.Components.qc.a0(qyVar10);
                    ov ovVar2 = new ov(qyVar10, 26);
                    i10 = org.telegram.ui.ActionBar.j6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                qy qyVar11 = this.b;
                qyVar11.getClass();
                qyVar11.presentFragment(new a70(new Bundle()));
                break;
            case 13:
                qy.b0(this.b);
                break;
            case 14:
                this.b.m3();
                break;
            case 15:
                qy.q0(this.b);
                break;
            case 16:
                this.b.U4();
                break;
            case 17:
                qy qyVar12 = this.b;
                org.telegram.ui.ActionBar.n2 n2Var = new org.telegram.ui.ActionBar.n2();
                n2Var.a = true;
                qyVar12.showAsSheet(new PrivacyControlActivity(11, false), n2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                qy qyVar13 = this.b;
                ArrayList arrayList = qyVar13.F2;
                qyVar13.G2 = false;
                if (qyVar13.z2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    qyVar13.z2.w(qyVar13, arrayList2, qyVar13.y1.getFieldText(), false, qyVar13.G2, qyVar13.H2, qyVar13.I2, null);
                    break;
                }
                break;
            case 20:
                qy qyVar14 = this.b;
                org.telegram.ui.Components.z4.M(qyVar14.getParentActivity(), -1L, new xx(qyVar14), qyVar14.getResourceProvider());
                break;
            case 21:
                qy.x0(this.b);
                break;
            case 22:
                qy qyVar15 = this.b;
                qyVar15.getClass();
                if (LaunchActivity.R() != null) {
                    qyVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                this.b.A4(false, true);
                break;
            case 24:
                qy qyVar16 = this.b;
                qyVar16.getClass();
                qyVar16.presentFragment(new n());
                break;
            case 25:
                qy qyVar17 = this.b;
                qyVar17.getClass();
                qyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                qy qyVar18 = this.b;
                qyVar18.getClass();
                qyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                qy qyVar19 = this.b;
                qyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(qyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            default:
                qy qyVar20 = this.b;
                zx zxVar2 = qyVar20.z0;
                if (zxVar2 == null || !zxVar2.v0) {
                    qyVar20.U.r.getText().clear();
                    AndroidUtilities.hideKeyboard(qyVar20.U.r);
                    qyVar20.U.r.clearFocus();
                    qyVar20.V.b(false);
                    break;
                } else {
                    zxVar2.Q(false);
                    break;
                }
        }
    }
}
