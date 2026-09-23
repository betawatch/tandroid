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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class mv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry b;

    public /* synthetic */ mv(ry ryVar, int i10) {
        this.a = i10;
        this.b = ryVar;
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
        wf1 wf1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                ry ryVar = this.b;
                ryVar.getClass();
                ryVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                ry ryVar2 = this.b;
                ryVar2.A4(false, true);
                if (ryVar2.e0 != null) {
                    int i11 = 0;
                    while (true) {
                        qy[] qyVarArr = ryVar2.e0;
                        if (i11 >= qyVarArr.length) {
                            break;
                        } else {
                            if (qyVarArr[i11].getVisibility() == 0) {
                                qy qyVar = ryVar2.e0[i11];
                                if (!qyVar.d.G) {
                                    qyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                ry ryVar3 = this.b;
                ryVar3.X.r.requestFocus();
                AndroidUtilities.showKeyboard(ryVar3.X.r);
                break;
            case 4:
                ry ryVar4 = this.b;
                ryVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", ryVar4.X2);
                ryVar4.presentFragment(new fi.p(bundle));
                break;
            case 5:
                ry ryVar5 = this.b;
                ryVar5.e0[0].a.requestLayout();
                lx lxVar = ryVar5.F3;
                if (lxVar != null && (lxVar.getFragment() instanceof wf1)) {
                    wf1Var = (wf1) ryVar5.F3.getFragment();
                }
                if (wf1Var != null) {
                    wf1Var.B0();
                }
                ryVar5.G3(false);
                ryVar5.S4();
                ay ayVar = ryVar5.C0;
                if (ayVar != null) {
                    ayVar.invalidate();
                    break;
                }
                break;
            case 6:
                ry ryVar6 = this.b;
                ryVar6.getClass();
                ryVar6.presentFragment(new x81(null));
                break;
            case 7:
                ry ryVar7 = this.b;
                if (!ryVar7.Y2.collapsed_in_dialogs) {
                    ryVar7.getMessagesController().toggleCommunityCollapsedInDialogs(ryVar7.X2, true);
                    ryVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                ry ryVar8 = this.b;
                if (ryVar8.Y2.collapsed_in_dialogs) {
                    ryVar8.getMessagesController().toggleCommunityCollapsedInDialogs(ryVar8.X2, false);
                    ryVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                ry ryVar9 = this.b;
                ryVar9.getClass();
                ryVar9.presentFragment(new l());
                break;
            case 10:
                this.b.G4();
                break;
            case 11:
                ry ryVar10 = this.b;
                if (!ry.w4) {
                    ry.w4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.h6.N0(string) == null || org.telegram.ui.ActionBar.h6.N0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.h6.N0(string2) == null || !org.telegram.ui.ActionBar.h6.N0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = org.telegram.ui.ActionBar.h6.I;
                    if (string.equals(string2)) {
                        if (g6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                            str2 = string2;
                            boolean equals = str.equals(g6Var.m());
                            org.telegram.ui.ActionBar.g6 N0 = !equals ? org.telegram.ui.ActionBar.h6.N0(str2) : org.telegram.ui.ActionBar.h6.N0(str);
                            v0Var = ryVar10.k0;
                            if (v0Var != null) {
                                int[] iArr = {(ryVar10.k0.getIconView().getMeasuredWidth() / 2) + r7, (ryVar10.k0.getIconView().getMeasuredHeight() / 2) + r7};
                                v0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(ryVar10);
                            mv mvVar = new mv(ryVar10, 26);
                            i10 = org.telegram.ui.ActionBar.h6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, mvVar).j();
                                    } catch (Exception e) {
                                        FileLog.e(e);
                                    }
                                }
                                org.telegram.ui.ActionBar.h6.o = 0;
                                org.telegram.ui.ActionBar.h6.q1();
                                org.telegram.ui.ActionBar.h6.A();
                                break;
                            }
                        }
                    } else {
                        str2 = string2;
                    }
                    str = string;
                    boolean equals2 = str.equals(g6Var.m());
                    if (!equals2) {
                    }
                    v0Var = ryVar10.k0;
                    if (v0Var != null) {
                    }
                    org.telegram.ui.Components.xc a022 = org.telegram.ui.Components.xc.a0(ryVar10);
                    mv mvVar2 = new mv(ryVar10, 26);
                    i10 = org.telegram.ui.ActionBar.h6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                ry ryVar11 = this.b;
                ryVar11.getClass();
                ryVar11.presentFragment(new b70(new Bundle()));
                break;
            case 13:
                ry.b0(this.b);
                break;
            case 14:
                this.b.m3();
                break;
            case 15:
                ry.r0(this.b);
                break;
            case 16:
                this.b.U4();
                break;
            case 17:
                ry ryVar12 = this.b;
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                ryVar12.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                ry ryVar13 = this.b;
                ArrayList arrayList = ryVar13.I2;
                ryVar13.J2 = false;
                if (ryVar13.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    ryVar13.C2.u(ryVar13, arrayList2, ryVar13.B1.getFieldText(), false, ryVar13.J2, ryVar13.K2, ryVar13.L2, null);
                    break;
                }
                break;
            case 20:
                ry ryVar14 = this.b;
                org.telegram.ui.Components.e5.M(ryVar14.getParentActivity(), -1L, new yx(ryVar14), ryVar14.getResourceProvider());
                break;
            case 21:
                ry.y0(this.b);
                break;
            case 22:
                ry ryVar15 = this.b;
                ryVar15.getClass();
                if (LaunchActivity.R() != null) {
                    ryVar15.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                this.b.A4(false, true);
                break;
            case 24:
                ry ryVar16 = this.b;
                ryVar16.getClass();
                ryVar16.presentFragment(new l());
                break;
            case 25:
                ry ryVar17 = this.b;
                ryVar17.getClass();
                ryVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 26:
                ry ryVar18 = this.b;
                ryVar18.getClass();
                ryVar18.presentFragment(new ThemeActivity(1));
                break;
            case 27:
                ry ryVar19 = this.b;
                ryVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(ryVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 28:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            default:
                ry ryVar20 = this.b;
                ay ayVar2 = ryVar20.C0;
                if (ayVar2 == null || !ayVar2.y0) {
                    ryVar20.X.r.getText().clear();
                    AndroidUtilities.hideKeyboard(ryVar20.X.r);
                    ryVar20.X.r.clearFocus();
                    ryVar20.Y.b(false);
                    break;
                } else {
                    ayVar2.Q(false);
                    break;
                }
        }
    }
}
