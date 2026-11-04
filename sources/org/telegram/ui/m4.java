package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m4(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        int i10 = 0;
        int i11 = 1;
        switch (this.a) {
            case 0:
                ny0 ny0Var = (ny0) this.b;
                ny0Var.getClass();
                xi.e.c.b(i3 == 0 ? vi.h.a : vi.h.b);
                ((n4) ny0Var.c).g(2);
                break;
            case 1:
                uw uwVar = (uw) this.b;
                if (i3 != 0) {
                    if (i3 == 1 && uwVar.f0 != null) {
                        while (true) {
                            tw[] twVarArr = uwVar.f0;
                            if (i10 >= twVarArr.length) {
                                break;
                            } else {
                                tw twVar = twVarArr[i10];
                                if (twVar.s == 0 && twVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.t2 c42 = uw.c4(uwVar.f0[i10]);
                                    pw pwVar = uwVar.f0[i10].a;
                                    int i12 = pw.C3;
                                    pwVar.C1(true, c42);
                                }
                                i10++;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.qr messagesStorage = uwVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.kp(messagesStorage, i11, 3));
                    break;
                }
                break;
            case 2:
                wd0 wd0Var = (wd0) this.b;
                if (i3 != 0) {
                    ProfileActivity.V4(wd0Var.b0.getParentActivity(), false);
                    break;
                } else {
                    org.telegram.messenger.r2.a = !org.telegram.messenger.r2.a;
                    org.telegram.messenger.t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.a).commit();
                    org.telegram.ui.Components.fc.a0(wd0Var.b0).Q(R.raw.chats_infotip, 36, org.telegram.messenger.r2.a ? "Logs enabled." : "Logs disabled.").j();
                    if (org.telegram.messenger.r2.a) {
                        k2.p1.r(org.telegram.messenger.t0.s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.a8.b("buildVersion = " + org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                            return;
                        }
                    }
                }
                break;
            default:
                yj0 yj0Var = (yj0) this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        yj0Var.getClass();
                        break;
                    } else {
                        yj0Var.x = "female";
                        yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747577, null));
                        break;
                    }
                } else {
                    yj0Var.x = "male";
                    yj0Var.Z[4].setText(org.telegram.messenger.bd.M0(2131747516, null));
                    break;
                }
        }
    }
}
