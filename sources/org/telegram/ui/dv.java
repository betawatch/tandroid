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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy b;

    public /* synthetic */ dv(dy dyVar, int i9) {
        this.a = i9;
        this.b = dyVar;
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
        int i9;
        we1 we1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                dy dyVar = this.b;
                dyVar.getClass();
                dyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                dy dyVar2 = this.b;
                dyVar2.A4(false, true);
                if (dyVar2.a0 != null) {
                    int i10 = 0;
                    while (true) {
                        cy[] cyVarArr = dyVar2.a0;
                        if (i10 >= cyVarArr.length) {
                            break;
                        } else {
                            if (cyVarArr[i10].getVisibility() == 0) {
                                cy cyVar = dyVar2.a0[i10];
                                if (!cyVar.d.C) {
                                    cyVar.q(false);
                                }
                            }
                            i10++;
                        }
                    }
                }
                break;
            case 3:
                dy dyVar3 = this.b;
                dyVar3.T.r.requestFocus();
                AndroidUtilities.showKeyboard(dyVar3.T.r);
                break;
            case 4:
                dy dyVar4 = this.b;
                dyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", dyVar4.T2);
                dyVar4.presentFragment(new nh.o(bundle));
                break;
            case 5:
                dy dyVar5 = this.b;
                dyVar5.a0[0].a.requestLayout();
                yw ywVar = dyVar5.B3;
                if (ywVar != null && (ywVar.getFragment() instanceof we1)) {
                    we1Var = (we1) dyVar5.B3.getFragment();
                }
                if (we1Var != null) {
                    we1Var.A0();
                }
                dyVar5.G3(false);
                dyVar5.S4();
                mx mxVar = dyVar5.y0;
                if (mxVar != null) {
                    mxVar.invalidate();
                    break;
                }
                break;
            case 6:
                dy dyVar6 = this.b;
                dyVar6.getClass();
                dyVar6.presentFragment(new z71(null));
                break;
            case 7:
                dy dyVar7 = this.b;
                if (!dyVar7.U2.collapsed_in_dialogs) {
                    dyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(dyVar7.T2, true);
                    dyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                dy dyVar8 = this.b;
                if (dyVar8.U2.collapsed_in_dialogs) {
                    dyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(dyVar8.T2, false);
                    dyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                dy dyVar9 = this.b;
                dyVar9.getClass();
                dyVar9.presentFragment(new l());
                break;
            case 10:
                this.b.G4();
                break;
            case 11:
                dy dyVar10 = this.b;
                if (!dy.t4) {
                    dy.t4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.f6.N0(string) == null || org.telegram.ui.ActionBar.f6.N0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.f6.N0(string2) == null || !org.telegram.ui.ActionBar.f6.N0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.e6 e6Var = org.telegram.ui.ActionBar.f6.I;
                    if (string.equals(string2)) {
                        if (e6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                            str2 = string2;
                            boolean equals = str.equals(e6Var.m());
                            org.telegram.ui.ActionBar.e6 N0 = !equals ? org.telegram.ui.ActionBar.f6.N0(str2) : org.telegram.ui.ActionBar.f6.N0(str);
                            w0Var = dyVar10.g0;
                            if (w0Var != null) {
                                int[] iArr = {(dyVar10.g0.getIconView().getMeasuredWidth() / 2) + r7, (dyVar10.g0.getIconView().getMeasuredHeight() / 2) + r7};
                                w0Var.getLocationInWindow(iArr);
                                int i11 = iArr[0];
                                int i12 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(dyVar10);
                            dv dvVar = new dv(dyVar10, 26);
                            i9 = org.telegram.ui.ActionBar.f6.o;
                            if (i9 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i9 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, dvVar).j();
                                    } catch (Exception e10) {
                                        FileLog.e(e10);
                                    }
                                }
                                org.telegram.ui.ActionBar.f6.o = 0;
                                org.telegram.ui.ActionBar.f6.q1();
                                org.telegram.ui.ActionBar.f6.A();
                                break;
                            }
                        }
                    } else {
                        str2 = string2;
                    }
                    str = string;
                    boolean equals2 = str.equals(e6Var.m());
                    if (!equals2) {
                    }
                    w0Var = dyVar10.g0;
                    if (w0Var != null) {
                    }
                    org.telegram.ui.Components.oc a022 = org.telegram.ui.Components.oc.a0(dyVar10);
                    dv dvVar2 = new dv(dyVar10, 26);
                    i9 = org.telegram.ui.ActionBar.f6.o;
                    if (i9 == 0) {
                    }
                }
                break;
            case 12:
                dy dyVar11 = this.b;
                dyVar11.getClass();
                dyVar11.presentFragment(new k60(new Bundle()));
                break;
            case 13:
                dy.a0(this.b);
                break;
            case 14:
                this.b.m3();
                break;
            case 15:
                dy.p0(this.b);
                break;
            case 16:
                this.b.U4();
                break;
            case 17:
                dy dyVar12 = this.b;
                org.telegram.ui.ActionBar.m2 m2Var = new org.telegram.ui.ActionBar.m2();
                m2Var.a = true;
                dyVar12.showAsSheet(new PrivacyControlActivity(11, false), m2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                dy dyVar13 = this.b;
                ArrayList arrayList = dyVar13.E2;
                dyVar13.F2 = false;
                if (dyVar13.y2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i13)).longValue(), 0L));
                    }
                    dyVar13.y2.v(dyVar13, arrayList2, dyVar13.x1.getFieldText(), false, dyVar13.F2, dyVar13.G2, dyVar13.H2, null);
                    break;
                }
                break;
            case 20:
                dy dyVar14 = this.b;
                org.telegram.ui.Components.y4.M(dyVar14.getParentActivity(), -1L, new kx(dyVar14), dyVar14.getResourceProvider());
                break;
            case 21:
                dy.w0(this.b);
                break;
            case 22:
                dy dyVar15 = this.b;
                dyVar15.getClass();
                if (LaunchActivity.R() != null) {
                    dyVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                this.b.A4(false, true);
                break;
            case 24:
                dy dyVar16 = this.b;
                dyVar16.getClass();
                dyVar16.presentFragment(new l());
                break;
            case 25:
                dy dyVar17 = this.b;
                dyVar17.getClass();
                dyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                dy dyVar18 = this.b;
                dyVar18.getClass();
                dyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                dy dyVar19 = this.b;
                dyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(dyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            default:
                dy dyVar20 = this.b;
                mx mxVar2 = dyVar20.y0;
                if (mxVar2 == null || !mxVar2.u0) {
                    dyVar20.T.r.getText().clear();
                    AndroidUtilities.hideKeyboard(dyVar20.T.r);
                    dyVar20.T.r.clearFocus();
                    dyVar20.U.b(false);
                    break;
                } else {
                    mxVar2.Q(false);
                    break;
                }
        }
    }
}
