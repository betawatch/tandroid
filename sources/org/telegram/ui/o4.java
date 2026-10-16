package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                q4 q4Var = (q4) this.b;
                q4Var.getClass();
                si.e.c.b(i10 == 0 ? qi.j.a : qi.j.b);
                q4Var.b.m(2);
                break;
            case 1:
                yy yyVar = (yy) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && yyVar.e0 != null) {
                        while (true) {
                            xy[] xyVarArr = yyVar.e0;
                            if (i11 >= xyVarArr.length) {
                                break;
                            } else {
                                xy xyVar = xyVarArr[i11];
                                if (xyVar.s == 0 && xyVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.s2 O3 = yy.O3(yyVar.e0[i11]);
                                    uy uyVar = yyVar.e0[i11].a;
                                    int i12 = uy.t3;
                                    uyVar.A1(true, O3);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    yyVar.getMessagesStorage().readAllDialogs(1);
                    break;
                }
                break;
            case 2:
                zg0 zg0Var = (zg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(zg0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.zc.a0(zg0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
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
                sn0 sn0Var = (sn0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        sn0Var.getClass();
                        break;
                    } else {
                        sn0Var.w = "female";
                        sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    sn0Var.w = "male";
                    sn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                o91.d0((o91) this.b, i10);
                break;
        }
    }
}
