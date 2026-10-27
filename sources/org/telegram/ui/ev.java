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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ev implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ey b;

    public /* synthetic */ ev(ey eyVar, int i10) {
        this.a = i10;
        this.b = eyVar;
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
                ey eyVar = this.b;
                eyVar.getClass();
                eyVar.presentFragment(new UserInfoActivity());
                break;
            case 2:
                ey eyVar2 = this.b;
                eyVar2.I4(false, true);
                if (eyVar2.e0 != null) {
                    int i12 = 0;
                    while (true) {
                        dy[] dyVarArr = eyVar2.e0;
                        if (i12 >= dyVarArr.length) {
                            break;
                        } else {
                            if (dyVarArr[i12].getVisibility() == 0) {
                                dy dyVar = eyVar2.e0[i12];
                                if (!dyVar.d.G) {
                                    dyVar.q(false);
                                }
                            }
                            i12++;
                        }
                    }
                }
                break;
            case 3:
                ey eyVar3 = this.b;
                eyVar3.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("community_id", eyVar3.Y2);
                eyVar3.presentFragment(new ii.o(bundle));
                break;
            case 4:
                ey eyVar4 = this.b;
                eyVar4.getClass();
                eyVar4.presentFragment(new org.telegram.ui.Wallet.m5());
                break;
            case 5:
                ey eyVar5 = this.b;
                eyVar5.getClass();
                eyVar5.presentFragment(new f81(null));
                break;
            case 6:
                ey eyVar6 = this.b;
                if (!eyVar6.Z2.collapsed_in_dialogs) {
                    eyVar6.getMessagesController().toggleCommunityCollapsedInDialogs(eyVar6.Y2, true);
                    eyVar6.finishFragment();
                    break;
                }
                break;
            case 7:
                ey eyVar7 = this.b;
                if (eyVar7.Z2.collapsed_in_dialogs) {
                    eyVar7.getMessagesController().toggleCommunityCollapsedInDialogs(eyVar7.Y2, false);
                    eyVar7.finishFragment();
                    break;
                }
                break;
            case 8:
                ey eyVar8 = this.b;
                eyVar8.getClass();
                eyVar8.presentFragment(new k());
                break;
            case 9:
                this.b.O4();
                break;
            case 10:
                ey eyVar9 = this.b;
                if (!ey.y4) {
                    ey.y4 = true;
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
                        w0Var = eyVar9.k0;
                        if (w0Var != null) {
                            int[] iArr = {(eyVar9.k0.getIconView().getMeasuredWidth() / 2) + r7, (eyVar9.k0.getIconView().getMeasuredHeight() / 2) + r7};
                            w0Var.getLocationInWindow(iArr);
                            int i13 = iArr[0];
                            int i14 = iArr[1];
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, P0, Boolean.FALSE, iArr, -1, Boolean.valueOf(equals), null, null, null, Boolean.TRUE);
                        }
                        org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(eyVar9);
                        ev evVar = new ev(eyVar9, 27);
                        i10 = org.telegram.ui.ActionBar.y6.o;
                        if (i10 == 0) {
                            if (b02 != null) {
                                try {
                                    b02.I(R.raw.auto_night_off, i10 == 3 ? LocaleController.getString("AutoNightSystemModeOff", R.string.AutoNightSystemModeOff) : LocaleController.getString("AutoNightModeOff", R.string.AutoNightModeOff), LocaleController.getString("Settings", R.string.Settings), 5000, false, evVar).j();
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
                    w0Var = eyVar9.k0;
                    if (w0Var != null) {
                    }
                    org.telegram.ui.Components.wc b022 = org.telegram.ui.Components.wc.b0(eyVar9);
                    ev evVar2 = new ev(eyVar9, 27);
                    i10 = org.telegram.ui.ActionBar.y6.o;
                    if (i10 == 0) {
                    }
                }
                break;
            case 11:
                ey eyVar10 = this.b;
                eyVar10.getClass();
                eyVar10.presentFragment(new ContactsActivity(null));
                break;
            case 12:
                ey eyVar11 = this.b;
                eyVar11.getClass();
                eyVar11.presentFragment(new o9(null));
                break;
            case 13:
                ey eyVar12 = this.b;
                eyVar12.getClass();
                eyVar12.presentFragment(new t60(new Bundle()));
                break;
            case 14:
                ey.X(this.b);
                break;
            case 15:
                ey.q0(this.b);
                break;
            case 16:
                this.b.c5();
                break;
            case 17:
                ey eyVar13 = this.b;
                org.telegram.ui.ActionBar.p2 p2Var = new org.telegram.ui.ActionBar.p2();
                p2Var.a = true;
                eyVar13.showAsSheet(new PrivacyControlActivity(11, false), p2Var);
                break;
            case 18:
                this.b.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
                break;
            case 19:
                ey eyVar14 = this.b;
                ArrayList arrayList = eyVar14.I2;
                eyVar14.M2 = true;
                if (eyVar14.C2 != null && !arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    while (i11 < arrayList.size()) {
                        arrayList2.add(MessagesStorage.TopicKey.of(((Long) arrayList.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    eyVar14.C2.v(eyVar14, arrayList2, eyVar14.B1.getFieldText(), false, eyVar14.J2, eyVar14.K2, eyVar14.L2, null);
                    break;
                }
                break;
            case 20:
                ey eyVar15 = this.b;
                ArrayList arrayList3 = eyVar15.I2;
                eyVar15.J2 = false;
                eyVar15.M2 = false;
                if (eyVar15.C2 != null && !arrayList3.isEmpty()) {
                    ArrayList arrayList4 = new ArrayList();
                    while (i11 < arrayList3.size()) {
                        arrayList4.add(MessagesStorage.TopicKey.of(((Long) arrayList3.get(i11)).longValue(), 0L));
                        i11++;
                    }
                    eyVar15.C2.v(eyVar15, arrayList4, eyVar15.B1.getFieldText(), false, eyVar15.J2, eyVar15.K2, eyVar15.L2, null);
                    break;
                }
                break;
            case 21:
                ey.w0(this.b);
                break;
            case 22:
                ey eyVar16 = this.b;
                eyVar16.getClass();
                if (LaunchActivity.R() != null) {
                    eyVar16.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                    break;
                }
                break;
            case 23:
                ey eyVar17 = this.b;
                eyVar17.X.r.requestFocus();
                AndroidUtilities.showKeyboard(eyVar17.X.r);
                break;
            case 24:
                this.b.I4(false, true);
                break;
            case 25:
                ey eyVar18 = this.b;
                eyVar18.getClass();
                eyVar18.presentFragment(new k());
                break;
            case 26:
                ey eyVar19 = this.b;
                eyVar19.getClass();
                eyVar19.presentFragment(new FiltersSetupActivity());
                break;
            case 27:
                ey eyVar20 = this.b;
                eyVar20.getClass();
                eyVar20.presentFragment(new ThemeActivity(1));
                break;
            case 28:
                ey eyVar21 = this.b;
                eyVar21.getMessagesStorage().clearLocalDatabase();
                Toast.makeText(eyVar21.getParentActivity(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
                break;
            default:
                this.b.getMessagesController().clearSendAsPeers();
                break;
        }
    }
}
