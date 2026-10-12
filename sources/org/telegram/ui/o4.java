package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
                si.e.c.b(i10 == 0 ? ri.j.a : ri.j.b);
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
                                    org.telegram.ui.Cells.s2 N3 = yy.N3(yyVar.e0[i11]);
                                    uy uyVar = yyVar.e0[i11].a;
                                    int i12 = uy.t3;
                                    uyVar.A1(true, N3);
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
                ah0 ah0Var = (ah0) this.b;
                if (i10 != 0) {
                    ProfileActivity.H4(ah0Var.V.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.zc.a0(ah0Var.V).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.q.s(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                un0 un0Var = (un0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        un0Var.getClass();
                        break;
                    } else {
                        un0Var.w = "female";
                        un0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    un0Var.w = "male";
                    un0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                o91.d0((o91) this.b, i10);
                break;
        }
    }
}
