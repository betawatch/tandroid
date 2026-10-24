package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                ti.e.c.b(i10 == 0 ? ri.h.a : ri.h.b);
                q4Var.b.m(2);
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
                                    org.telegram.ui.Cells.q2 O3 = ey.O3(eyVar.e0[i11]);
                                    zx zxVar = eyVar.e0[i11].a;
                                    int i12 = zx.w3;
                                    zxVar.F1(true, O3);
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
                    ProfileActivity.J4(hg0Var.a0.getParentActivity(), false);
                    break;
                } else {
                    BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                    ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                    org.telegram.ui.Components.xc.a0(hg0Var.a0).Q(R.raw.chats_infotip, 36, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").j();
                    if (BuildVars.LOGS_ENABLED) {
                        i2.o1.x(new StringBuilder("app start time = "), ApplicationLoader.startTime);
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
                an0 an0Var = (an0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        an0Var.getClass();
                        break;
                    } else {
                        an0Var.w = "female";
                        an0Var.Y[4].setText(LocaleController.getString(R.string.PassportFemale));
                        break;
                    }
                } else {
                    an0Var.w = "male";
                    an0Var.Y[4].setText(LocaleController.getString(R.string.PassportMale));
                    break;
                }
            default:
                c81.d0((c81) this.b, i10);
                break;
        }
    }
}
