package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ iv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                fy fyVar = (fy) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && fyVar.a0 != null) {
                        while (true) {
                            ey[] eyVarArr = fyVar.a0;
                            if (i11 >= eyVarArr.length) {
                                break;
                            } else {
                                ey eyVar = eyVarArr[i11];
                                if (eyVar.s == 0 && eyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.p2 Q3 = fy.Q3(fyVar.a0[i11]);
                                    ay ayVar = fyVar.a0[i11].a;
                                    int i12 = ay.r3;
                                    ayVar.z1(true, Q3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    fyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 1:
                eg0 eg0Var = (eg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(eg0Var.R.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.tc.a0(eg0Var.R).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        j7.l1.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return;
                        }
                    }
                }
                break;
            case 2:
                vm0 vm0Var = (vm0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        vm0Var.getClass();
                        break;
                    } else {
                        vm0Var.w = "female";
                        vm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    vm0Var.w = "male";
                    vm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                b81.c0((b81) this.b, i10);
                break;
        }
    }
}
