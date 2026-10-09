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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ov implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ty b;

    public /* synthetic */ ov(ty tyVar, int i10) {
        this.a = i10;
        this.b = tyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a5  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.ActionBar.v0 v0Var;
        int i10;
        fg1 fg1Var = null;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(this.b.currentAccount).deleteUserPhoto(null);
                break;
            case 1:
                ty tyVar = this.b;
                tyVar.getClass();
                tyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                ty tyVar2 = this.b;
                tyVar2.x4(false, true);
                if (tyVar2.e0 != null) {
                    int i11 = 0;
                    while (true) {
                        sy[] syVarArr = tyVar2.e0;
                        if (i11 >= syVarArr.length) {
                            break;
                        } else {
                            if (syVarArr[i11].getVisibility() == 0) {
                                sy syVar = tyVar2.e0[i11];
                                if (!syVar.d.G) {
                                    syVar.q(false);
                                }
                            }
                            i11++;
                        }
                    }
                }
                break;
            case 3:
                ty tyVar3 = this.b;
                tyVar3.X.r.requestFocus();
                AndroidUtilities.showKeyboard(tyVar3.X.r);
                break;
            case 4:
                ty tyVar4 = this.b;
                tyVar4.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", tyVar4.X2);
                tyVar4.presentFragment(new fi.p(bundle));
                break;
            case 5:
                ty tyVar5 = this.b;
                tyVar5.e0[0].a.requestLayout();
                nx nxVar = tyVar5.F3;
                if (nxVar != null && (nxVar.getFragment() instanceof fg1)) {
                    fg1Var = (fg1) tyVar5.F3.getFragment();
                }
                if (fg1Var != null) {
                    fg1Var.B0();
                }
                tyVar5.D3(false);
                tyVar5.P4();
                dy dyVar = tyVar5.C0;
                if (dyVar != null) {
                    dyVar.invalidate();
                    break;
                }
                break;
            case 6:
                ty tyVar6 = this.b;
                tyVar6.getClass();
                tyVar6.presentFragment(new i91(null));
                break;
            case 7:
                ty tyVar7 = this.b;
                if (!tyVar7.Y2.collapsed_in_dialogs) {
                    tyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(tyVar7.X2, true);
                    tyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                ty tyVar8 = this.b;
                if (tyVar8.Y2.collapsed_in_dialogs) {
                    tyVar8.getMessagesController().toggleCommunityCollapsedInDialogs(tyVar8.X2, false);
                    tyVar8.finishFragment();
                    break;
                }
                break;
            case 9:
                ty tyVar9 = this.b;
                tyVar9.getClass();
                tyVar9.presentFragment(new l());
                break;
            case 10:
                this.b.D4();
                break;
            case 11:
                ty tyVar10 = this.b;
                if (!ty.w4) {
                    ty.w4 = true;
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (org.telegram.ui.ActionBar.i6.O0(string) == null || org.telegram.ui.ActionBar.i6.O0(string).q()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (org.telegram.ui.ActionBar.i6.O0(string2) == null || !org.telegram.ui.ActionBar.i6.O0(string2).q()) {
                        string2 = "Dark Blue";
                    }
                    org.telegram.ui.ActionBar.h6 h6Var = org.telegram.ui.ActionBar.i6.I;
                    if (string.equals(string2)) {
                        if (h6Var.q() || string.equals("Dark Blue") || string.equals("Night")) {
                            str2 = string2;
                            boolean equals = str.equals(h6Var.m());
                            org.telegram.ui.ActionBar.h6 O0 = !equals ? org.telegram.ui.ActionBar.i6.O0(str2) : org.telegram.ui.ActionBar.i6.O0(str);
                            v0Var = tyVar10.k0;
                            if (v0Var != null) {
                                int[] iArr = {(tyVar10.k0.getIconView().getMeasuredWidth() / 2) + r7, (tyVar10.k0.getIconView().getMeasuredHeight() / 2) + r7};
                                v0Var.getLocationInWindow(iArr);
                                int i12 = iArr[0];
                                int i13 = iArr[1];
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                            }
                            org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(tyVar10);
                            ov ovVar = new ov(tyVar10, 27);
                            i10 = org.telegram.ui.ActionBar.i6.o;
                            if (i10 == 0) {
                                if (a02 != null) {
                                    try {
                                        a02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, ovVar).j();
                                    } catch (Exception e7) {
                                        FileLog.e(e7);
                                    }
                                }
                                org.telegram.ui.ActionBar.i6.o = 0;
                                org.telegram.ui.ActionBar.i6.r1();
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
                    v0Var = tyVar10.k0;
                    if (v0Var != null) {
                    }
                    org.telegram.ui.Components.ad a022 = org.telegram.ui.Components.ad.a0(tyVar10);
                    ov ovVar2 = new ov(tyVar10, 27);
                    i10 = org.telegram.ui.ActionBar.i6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 12:
                ty tyVar11 = this.b;
                tyVar11.getClass();
                tyVar11.presentFragment(new c70(new Bundle()));
                break;
            case 13:
                ty.Z(this.b);
                break;
            case 14:
                ty tyVar12 = this.b;
                tyVar12.getClass();
                tyVar12.presentFragment(new org.telegram.ui.Wallet.a5());
                break;
            case 15:
                this.b.j3();
                break;
            case 16:
                ty.q0(this.b);
                break;
            case 17:
                this.b.R4();
                break;
            case 18:
                ty tyVar13 = this.b;
                org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                l2Var.a = true;
                tyVar13.showAsSheet(new PrivacyControlActivity(11, false), l2Var);
                break;
            case 19:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 20:
                ty tyVar14 = this.b;
                ArrayList arrayList = tyVar14.I2;
                tyVar14.J2 = false;
                if (tyVar14.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i14)).longValue(), 0L));
                    }
                    tyVar14.C2.w(tyVar14, arrayList2, tyVar14.B1.getFieldText(), false, tyVar14.J2, tyVar14.K2, tyVar14.L2, null);
                    break;
                }
                break;
            case 21:
                ty tyVar15 = this.b;
                org.telegram.ui.Components.g5.L(tyVar15.getParentActivity(), -1L, new ay(tyVar15), tyVar15.getResourceProvider());
                break;
            case 22:
                ty.v0(this.b);
                break;
            case 23:
                ty tyVar16 = this.b;
                tyVar16.getClass();
                if (LaunchActivity.R() != null) {
                    tyVar16.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 24:
                this.b.x4(false, true);
                break;
            case 25:
                ty tyVar17 = this.b;
                tyVar17.getClass();
                tyVar17.presentFragment(new l());
                break;
            case 26:
                ty tyVar18 = this.b;
                tyVar18.getClass();
                tyVar18.presentFragment(new FiltersSetupActivity());
                break;
            case 27:
                ty tyVar19 = this.b;
                tyVar19.getClass();
                tyVar19.presentFragment(new ThemeActivity(1));
                break;
            case 28:
                ty tyVar20 = this.b;
                tyVar20.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(tyVar20.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            default:
                this.b.getMessagesController().clearSendAsPeers();
                break;
        }
    }
}
