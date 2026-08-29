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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy b;

    public /* synthetic */ ev(fy fyVar, int i10) {
        this.a = i10;
        this.b = fyVar;
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
        ze1 ze1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                fy fyVar = this.b;
                fyVar.getClass();
                fyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                fy fyVar2 = this.b;
                fyVar2.A4(false, true);
                if (fyVar2.a0 != null) {
                    int i11 = 0;
                    while (true) {
                        ey[] eyVarArr = fyVar2.a0;
                        if (i11 >= eyVarArr.length) {
                            break;
                        } else {
                            if (eyVarArr[i11].getVisibility() == 0) {
                                ey eyVar = fyVar2.a0[i11];
                                if (!eyVar.d.C) {
                                    eyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                fy fyVar3 = this.b;
                fyVar3.T.r.requestFocus();
                AndroidUtilities.showKeyboard(fyVar3.T.r);
                break;
            case 4:
                fy fyVar4 = this.b;
                fyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", fyVar4.T2);
                fyVar4.presentFragment(new qh.n(bundle));
                break;
            case 5:
                fy fyVar5 = this.b;
                fyVar5.a0[0].a.requestLayout();
                ax axVar = fyVar5.B3;
                if (axVar != null && (axVar.getFragment() instanceof ze1)) {
                    ze1Var = (ze1) fyVar5.B3.getFragment();
                }
                if (ze1Var != null) {
                    ze1Var.B0();
                }
                fyVar5.G3(false);
                fyVar5.S4();
                ox oxVar = fyVar5.y0;
                if (oxVar != null) {
                    oxVar.invalidate();
                    break;
                }
                break;
            case 6:
                fy fyVar6 = this.b;
                fyVar6.getClass();
                fyVar6.presentFragment(new b81(null));
                break;
            case 7:
                fy fyVar7 = this.b;
                if (!fyVar7.U2.collapsed_in_dialogs) {
                    fyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(fyVar7.T2, true);
                    fyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                fy fyVar8 = this.b;
                if (fyVar8.U2.collapsed_in_dialogs) {
                    fyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(fyVar8.T2, false);
                    fyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                fy fyVar9 = this.b;
                fyVar9.getClass();
                fyVar9.presentFragment(new n());
                break;
            case 10:
                this.b.G4();
                break;
            case 11:
                fy fyVar10 = this.b;
                if (!fy.t4) {
                    fy.t4 = true;
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
                            w0Var = fyVar10.g0;
                            if (w0Var != null) {
                                int[] iArr = {(fyVar10.g0.getIconView().getMeasuredWidth() / 2) + r7, (fyVar10.g0.getIconView().getMeasuredHeight() / 2) + r7};
                                w0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(fyVar10);
                            ev evVar = new ev(fyVar10, 26);
                            i10 = org.telegram.ui.ActionBar.g6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, evVar).j();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
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
                    w0Var = fyVar10.g0;
                    if (w0Var != null) {
                    }
                    org.telegram.ui.Components.tc a022 = org.telegram.ui.Components.tc.a0(fyVar10);
                    ev evVar2 = new ev(fyVar10, 26);
                    i10 = org.telegram.ui.ActionBar.g6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                fy fyVar11 = this.b;
                fyVar11.getClass();
                fyVar11.presentFragment(new m60(new Bundle()));
                break;
            case 13:
                fy.b0(this.b);
                break;
            case 14:
                this.b.m3();
                break;
            case 15:
                fy.q0(this.b);
                break;
            case 16:
                this.b.U4();
                break;
            case 17:
                fy fyVar12 = this.b;
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                fyVar12.showAsSheet(new PrivacyControlActivity(11, false), m2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                fy fyVar13 = this.b;
                ArrayList arrayList = fyVar13.E2;
                fyVar13.F2 = false;
                if (fyVar13.y2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    fyVar13.y2.v(fyVar13, arrayList2, fyVar13.x1.getFieldText(), false, fyVar13.F2, fyVar13.G2, fyVar13.H2, null);
                    break;
                }
                break;
            case 20:
                fy fyVar14 = this.b;
                org.telegram.ui.Components.c5.M(fyVar14.getParentActivity(), -1L, new mx(fyVar14), fyVar14.getResourceProvider());
                break;
            case 21:
                fy.x0(this.b);
                break;
            case 22:
                fy fyVar15 = this.b;
                fyVar15.getClass();
                if (LaunchActivity.R() != null) {
                    fyVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                this.b.A4(false, true);
                break;
            case 24:
                fy fyVar16 = this.b;
                fyVar16.getClass();
                fyVar16.presentFragment(new n());
                break;
            case 25:
                fy fyVar17 = this.b;
                fyVar17.getClass();
                fyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                fy fyVar18 = this.b;
                fyVar18.getClass();
                fyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                fy fyVar19 = this.b;
                fyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(fyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            default:
                fy fyVar20 = this.b;
                ox oxVar2 = fyVar20.y0;
                if (oxVar2 == null || !oxVar2.u0) {
                    fyVar20.T.r.getText().clear();
                    AndroidUtilities.hideKeyboard(fyVar20.T.r);
                    fyVar20.T.r.clearFocus();
                    fyVar20.U.b(false);
                    break;
                } else {
                    oxVar2.Q(false);
                    break;
                }
        }
    }
}
