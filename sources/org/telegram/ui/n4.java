package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                                    org.telegram.ui.Cells.p2 Y3 = ey.Y3(eyVar.e0[i11]);
                                    zx zxVar = eyVar.e0[i11].a;
                                    int i12 = zx.C3;
                                    zxVar.F1(true, Y3);
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
                hg0 hg0Var = (hg0) this.b;
                if (i10 != 0) {
                    ProfileActivity.P4(hg0Var.a0.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.wc.b0(hg0Var.a0).R(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
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
                kn0 kn0Var = (kn0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        kn0Var.getClass();
                        break;
                    } else {
                        kn0Var.w = "female";
                        kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    kn0Var.w = "male";
                    kn0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                f81.d0((f81) this.b, i10);
                break;
        }
    }
}
