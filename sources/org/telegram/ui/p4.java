package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                ti.e.c.b(i10 == 0 ? ri.h.a : ri.h.b);
                r4Var.b.m(2);
                break;
            case 1:
                cy cyVar = (cy) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && cyVar.e0 != null) {
                        while (true) {
                            ay[] ayVarArr = cyVar.e0;
                            if (i11 >= ayVarArr.length) {
                                break;
                            } else {
                                ay ayVar = ayVarArr[i11];
                                if (ayVar.s == 0 && ayVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.r2 O3 = cy.O3(cyVar.e0[i11]);
                                    xx xxVar = cyVar.e0[i11].a;
                                    int i12 = xx.t3;
                                    xxVar.A1(true, O3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    cyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 2:
                cg0 cg0Var = (cg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(cg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc.a0(cg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        i2.e.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                vm0 vm0Var = (vm0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        vm0Var.getClass();
                        break;
                    } else {
                        vm0Var.w = "female";
                        vm0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    vm0Var.w = "male";
                    vm0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                x71.d0((x71) this.b, i10);
                break;
        }
    }
}
