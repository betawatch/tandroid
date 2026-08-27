package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kv implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate b;

    public /* synthetic */ kv(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.a = i10;
        this.b = notificationCenterDelegate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                gy gyVar = (gy) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && gyVar.a0 != null) {
                        while (true) {
                            fy[] fyVarArr = gyVar.a0;
                            if (i11 >= fyVarArr.length) {
                                break;
                            } else {
                                fy fyVar = fyVarArr[i11];
                                if (fyVar.s == 0 && fyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.p2 Q3 = gy.Q3(gyVar.a0[i11]);
                                    cy cyVar = gyVar.a0[i11].a;
                                    int i12 = cy.r3;
                                    cyVar.z1(true, Q3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    gyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 1:
                hg0 hg0Var = (hg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(hg0Var.R.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.mc.a0(hg0Var.R).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        i0.a.y(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e9) {
                            FileLog.e(e9);
                            return;
                        }
                    }
                }
                break;
            case 2:
                xm0 xm0Var = (xm0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        xm0Var.getClass();
                        break;
                    } else {
                        xm0Var.w = "female";
                        xm0Var.U[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    xm0Var.w = "male";
                    xm0Var.U[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                x71.c0((x71) this.b, i10);
                break;
        }
    }
}
