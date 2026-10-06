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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uy b;

    public /* synthetic */ pv(uy uyVar, int i10) {
        this.a = i10;
        this.b = uyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0263  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.v0 v0Var;
        int i10;
        switch (this.a) {
            case 0:
                uy uyVar = this.b;
                uyVar.getClass();
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                long j3 = globalMainSettings.getLong("cache_hint_period", 604800000L);
                if (j3 <= 604800000) {
                    j3 = 2592000000L;
                }
                globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j3).putLong("cache_hint_period", j3).apply();
                uyVar.d5();
                break;
            case 1:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 2:
                uy uyVar2 = this.b;
                uyVar2.getClass();
                uyVar2.presentFragment(new UserInfoActivity());
                break;
            case 3:
                uy uyVar3 = this.b;
                uyVar3.J4(false, true);
                if (uyVar3.e0 != null) {
                    int i11 = 0;
                    while (true) {
                        ty[] tyVarArr = uyVar3.e0;
                        if (i11 >= tyVarArr.length) {
                            break;
                        } else {
                            if (tyVarArr[i11].getVisibility() == 0) {
                                ty tyVar = uyVar3.e0[i11];
                                if (!tyVar.d.G) {
                                    tyVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 4:
                uy uyVar4 = this.b;
                uyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", uyVar4.X2);
                uyVar4.presentFragment(new fi.p(bundle));
                break;
            case 5:
                uy uyVar5 = this.b;
                uyVar5.getClass();
                uyVar5.presentFragment(new y81(null));
                break;
            case 6:
                uy uyVar6 = this.b;
                if (!uyVar6.Y2.collapsed_in_dialogs) {
                    uyVar6.getMessagesController().toggleCommunityCollapsedInDialogs(uyVar6.X2, true);
                    uyVar6.finishFragment();
                    break;
                }
                break;
            case 7:
                uy uyVar7 = this.b;
                if (uyVar7.Y2.collapsed_in_dialogs) {
                    uyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(uyVar7.X2, false);
                    uyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                uy uyVar8 = this.b;
                uyVar8.getClass();
                uyVar8.presentFragment(new l());
                break;
            case 9:
                this.b.P4();
                break;
            case 10:
                uy uyVar9 = this.b;
                if (!uy.v4) {
                    uy.v4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.i6.N0(string) == null || org.telegram.ui.ActionBar.i6.N0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.i6.N0(string2) == null || !org.telegram.ui.ActionBar.i6.N0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.I;
                    if (string.equals(string2)) {
                        if (h6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                            str2 = string2;
                            boolean equals = str.equals(h6Var.m());
                            org.telegram.ui.ActionBar.h6 N0 = !equals ? org.telegram.ui.ActionBar.i6.N0(str2) : org.telegram.ui.ActionBar.i6.N0(str);
                            v0Var = uyVar9.k0;
                            if (v0Var != null) {
                                int[] iArr = {(uyVar9.k0.getIconView().getMeasuredWidth() / 2) + r7, (uyVar9.k0.getIconView().getMeasuredHeight() / 2) + r7};
                                v0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, N0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(uyVar9);
                            pv pvVar = new pv(uyVar9, 25);
                            i10 = org.telegram.ui.ActionBar.i6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, pvVar).j();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                                org.telegram.ui.ActionBar.i6.o = 0;
                                org.telegram.ui.ActionBar.i6.q1();
                                org.telegram.ui.ActionBar.i6.A();
                                break;
                            }
                        }
                    } else {
                        str2 = string2;
                    }
                    str = string;
                    boolean equals2 = str.equals(h6Var.m());
                    if (!equals2) {
                    }
                    v0Var = uyVar9.k0;
                    if (v0Var != null) {
                    }
                    org.telegram.ui.Components.yc a022 = org.telegram.ui.Components.yc.a0(uyVar9);
                    pv pvVar2 = new pv(uyVar9, 25);
                    i10 = org.telegram.ui.ActionBar.i6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 11:
                uy uyVar10 = this.b;
                uyVar10.getClass();
                uyVar10.presentFragment(new d70(new Bundle()));
                break;
            case 12:
                uy.b0(this.b);
                break;
            case 13:
                uy.r0(this.b);
                break;
            case 14:
                this.b.d5();
                break;
            case 15:
                uy uyVar11 = this.b;
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                uyVar11.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                break;
            case 16:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 17:
                uy uyVar12 = this.b;
                ArrayList arrayList = uyVar12.I2;
                uyVar12.J2 = false;
                if (uyVar12.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    uyVar12.C2.u(uyVar12, arrayList2, uyVar12.B1.getFieldText(), false, uyVar12.J2, uyVar12.K2, uyVar12.L2, null);
                    break;
                }
                break;
            case 18:
                uy uyVar13 = this.b;
                org.telegram.ui.Components.e5.M(uyVar13.getParentActivity(), -1L, new yx(uyVar13), uyVar13.getResourceProvider());
                break;
            case 19:
                uy.y0(this.b);
                break;
            case 20:
                uy uyVar14 = this.b;
                uyVar14.getClass();
                if (LaunchActivity.R() != null) {
                    uyVar14.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 21:
                uy uyVar15 = this.b;
                uyVar15.X.r.requestFocus();
                AndroidUtilities.showKeyboard(uyVar15.X.r);
                break;
            case 22:
                this.b.J4(false, true);
                break;
            case 23:
                uy uyVar16 = this.b;
                uyVar16.getClass();
                uyVar16.presentFragment(new l());
                break;
            case 24:
                uy uyVar17 = this.b;
                uyVar17.getClass();
                uyVar17.presentFragment(new FiltersSetupActivity());
                break;
            case 25:
                uy uyVar18 = this.b;
                uyVar18.getClass();
                uyVar18.presentFragment(new ThemeActivity(1));
                break;
            case 26:
                uy uyVar19 = this.b;
                uyVar19.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(uyVar19.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            case 27:
                this.b.getMessagesController().clearSendAsPeers();
                break;
            case 28:
                uy uyVar20 = this.b;
                dy dyVar = uyVar20.C0;
                if (dyVar == null || !dyVar.A0) {
                    uyVar20.X.r.getText().clear();
                    AndroidUtilities.hideKeyboard(uyVar20.X.r);
                    uyVar20.X.r.clearFocus();
                    uyVar20.Y.b(false);
                    break;
                } else {
                    dyVar.S(false);
                    break;
                }
                break;
            default:
                uy uyVar21 = this.b;
                if (uyVar21.R0 != 10) {
                    uyVar21.l4(false);
                }
                if (!uyVar21.L || !uyVar21.g4().G()) {
                    uyVar21.G4(true, true);
                    break;
                } else {
                    uyVar21.E0.h();
                    break;
                }
                break;
        }
    }
}
