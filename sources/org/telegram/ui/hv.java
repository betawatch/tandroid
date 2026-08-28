package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ hv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i9) {
        this.a = i9;
        this.b = notificationCenterDelegate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        int i10 = 0;
        switch (this.a) {
            case 0:
                dy dyVar = (dy) this.b;
                if (i9 != 0) {
                    if (i9 == 1 && dyVar.a0 != null) {
                        while (true) {
                            cy[] cyVarArr = dyVar.a0;
                            if (i10 >= cyVarArr.length) {
                                break;
                            } else {
                                cy cyVar = cyVarArr[i10];
                                if (cyVar.s == 0 && cyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.r2 Q3 = dy.Q3(dyVar.a0[i10]);
                                    yx yxVar = dyVar.a0[i10].a;
                                    int i11 = yx.r3;
                                    yxVar.z1(true, Q3);
                                }
                                i10++;
                            }
                        }
                    }
                } else {
                    dyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 1:
                eg0 eg0Var = (eg0) this.b;
                if (i9 != 0) {
                    ProfileActivity.H4(eg0Var.R.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.oc.a0(eg0Var.R).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        j3.r0.z(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                wm0 wm0Var = (wm0) this.b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        wm0Var.getClass();
                        break;
                    } else {
                        wm0Var.w = "female";
                        wm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    wm0Var.w = "male";
                    wm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                z71.b0((z71) this.b, i9);
                break;
        }
    }
}
