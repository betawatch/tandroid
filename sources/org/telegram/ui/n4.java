package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        switch (this.a) {
            case 0:
                p4 p4Var = (p4) this.b;
                p4Var.getClass();
                wi.e.c.b(i10 == 0 ? ui.h.a : ui.h.b);
                p4Var.b.m(2);
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
                                    org.telegram.ui.Cells.p2 Y3 = cy.Y3(cyVar.e0[i11]);
                                    wx wxVar = cyVar.e0[i11].a;
                                    int i12 = wx.C3;
                                    wxVar.F1(true, Y3);
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
                fg0 fg0Var = (fg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.P4(fg0Var.a0.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.wc.b0(fg0Var.a0).R(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        org.telegram.messenger.t.s(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                in0 in0Var = (in0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        in0Var.getClass();
                        break;
                    } else {
                        in0Var.w = "female";
                        in0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    in0Var.w = "male";
                    in0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                d81.d0((d81) this.b, i10);
                break;
        }
    }
}
