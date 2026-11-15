package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        int i10 = 0;
        int i11 = 1;
        switch (this.a) {
            case 0:
                vy0 vy0Var = (vy0) this.b;
                vy0Var.getClass();
                aj.e.c.b(i7 == 0 ? yi.h.a : yi.h.b);
                ((l4) vy0Var.c).g(2);
                break;
            case 1:
                yw ywVar = (yw) this.b;
                if (i7 != 0) {
                    if (i7 == 1 && ywVar.f0 != null) {
                        while (true) {
                            xw[] xwVarArr = ywVar.f0;
                            if (i10 >= xwVarArr.length) {
                                break;
                            } else {
                                xw xwVar = xwVarArr[i10];
                                if (xwVar.s == 0 && xwVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.t2 c42 = yw.c4(ywVar.f0[i10]);
                                    uw uwVar = ywVar.f0[i10].a;
                                    int i12 = uw.C3;
                                    uwVar.C1(true, c42);
                                }
                                i10++;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.vr messagesStorage = ywVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.qp(messagesStorage, i11, 3));
                    break;
                }
                break;
            case 2:
                be0 be0Var = (be0) this.b;
                if (i7 != 0) {
                    ProfileActivity.X4(be0Var.h0.getParentActivity(), false);
                    break;
                } else {
                    org.telegram.messenger.r2.a = !org.telegram.messenger.r2.a;
                    org.telegram.messenger.t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.a).commit();
                    org.telegram.ui.Components.cc.a0(be0Var.h0).Q(R.raw.chats_infotip, 36, org.telegram.messenger.r2.a ? "Logs enabled." : "Logs disabled.").j();
                    if (org.telegram.messenger.r2.a) {
                        i5.c.t(org.telegram.messenger.t0.s, new StringBuilder("app start time = "));
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
                ek0 ek0Var = (ek0) this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        ek0Var.getClass();
                        break;
                    } else {
                        ek0Var.x = "female";
                        ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747569, null));
                        break;
                    }
                } else {
                    ek0Var.x = "male";
                    ek0Var.Z[4].setText(org.telegram.messenger.hd.M0(2131747508, null));
                    break;
                }
        }
    }
}
