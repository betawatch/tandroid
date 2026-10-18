package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                r4 r4Var = (r4) this.b;
                r4Var.getClass();
                ti.e.c.b(i10 == 0 ? ri.i.a : ri.i.b);
                r4Var.b.m(2);
                break;
            case 1:
                ey eyVar = (ey) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && eyVar.e0 != null) {
                        while (true) {
                            dy[] dyVarArr = eyVar.e0;
                            if (i11 >= dyVarArr.length) {
                                break;
                            } else {
                                dy dyVar = dyVarArr[i11];
                                if (dyVar.s == 0 && dyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.r2 O3 = ey.O3(eyVar.e0[i11]);
                                    zx zxVar = eyVar.e0[i11].a;
                                    int i12 = zx.t3;
                                    zxVar.A1(true, O3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    eyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 2:
                eg0 eg0Var = (eg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(eg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc.a0(eg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        i2.d.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                        try {
                            FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                }
                break;
            case 3:
                xm0 xm0Var = (xm0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        xm0Var.getClass();
                        break;
                    } else {
                        xm0Var.w = "female";
                        xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    xm0Var.w = "male";
                    xm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                z71.d0((z71) this.b, i10);
                break;
        }
    }
}
