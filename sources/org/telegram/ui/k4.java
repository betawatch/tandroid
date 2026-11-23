package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class k4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k4(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        int i10 = 2;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                yy0 yy0Var = (yy0) this.b;
                yy0Var.getClass();
                aj.e.c.b(i7 == 0 ? yi.g.a : yi.g.b);
                ((l4) yy0Var.c).g(2);
                break;
            case 1:
                bx bxVar = (bx) this.b;
                if (i7 != 0) {
                    if (i7 == 1 && bxVar.f0 != null) {
                        while (true) {
                            ax[] axVarArr = bxVar.f0;
                            if (i11 >= axVarArr.length) {
                                break;
                            } else {
                                ax axVar = axVarArr[i11];
                                if (axVar.s == 0 && axVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.u2 c42 = bx.c4(bxVar.f0[i11]);
                                    xw xwVar = bxVar.f0[i11].a;
                                    int i13 = xw.C3;
                                    xwVar.C1(true, c42);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.tr messagesStorage = bxVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.rp(messagesStorage, i12, i10));
                    break;
                }
                break;
            case 2:
                ce0 ce0Var = (ce0) this.b;
                if (i7 != 0) {
                    ProfileActivity.Y4(ce0Var.h0.getParentActivity(), false);
                    break;
                } else {
                    org.telegram.messenger.s2.a = !org.telegram.messenger.s2.a;
                    org.telegram.messenger.t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.s2.a).commit();
                    org.telegram.ui.Components.kc.b0(ce0Var.h0).Q(R.raw.chats_infotip, 36, org.telegram.messenger.s2.a ? "Logs enabled." : "Logs disabled.").j();
                    if (org.telegram.messenger.s2.a) {
                        i5.c.v(org.telegram.messenger.t0.s, new StringBuilder("app start time = "));
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
                fk0 fk0Var = (fk0) this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        fk0Var.getClass();
                        break;
                    } else {
                        fk0Var.x = "female";
                        fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747375, null));
                        break;
                    }
                } else {
                    fk0Var.x = "male";
                    fk0Var.Z[4].setText(org.telegram.messenger.gd.N0(2131747314, null));
                    break;
                }
        }
    }
}
