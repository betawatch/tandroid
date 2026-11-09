package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                az0 az0Var = (az0) this.b;
                az0Var.getClass();
                xi.e.c.b(i7 == 0 ? vi.f.a : vi.f.b);
                ((l4) az0Var.c).g(2);
                break;
            case 1:
                yw ywVar = (yw) this.b;
                if (i7 != 0) {
                    if (i7 == 1 && ywVar.e0 != null) {
                        while (true) {
                            xw[] xwVarArr = ywVar.e0;
                            if (i10 >= xwVarArr.length) {
                                break;
                            } else {
                                xw xwVar = xwVarArr[i10];
                                if (xwVar.s == 0 && xwVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.t2 c42 = yw.c4(ywVar.e0[i10]);
                                    uw uwVar = ywVar.e0[i10].a;
                                    int i12 = uw.B3;
                                    uwVar.C1(true, c42);
                                }
                                i10++;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.yr messagesStorage = ywVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.tp(messagesStorage, i11, 3));
                    break;
                }
                break;
            case 2:
                de0 de0Var = (de0) this.b;
                if (i7 != 0) {
                    ProfileActivity.Y4(de0Var.g0.getParentActivity(), false);
                    break;
                } else {
                    org.telegram.messenger.r2.a = !org.telegram.messenger.r2.a;
                    org.telegram.messenger.t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.a).commit();
                    org.telegram.ui.Components.hc.a0(de0Var.g0).Q(R.raw.chats_infotip, 36, org.telegram.messenger.r2.a ? "Logs enabled." : "Logs disabled.").j();
                    if (org.telegram.messenger.r2.a) {
                        jg.g.u(org.telegram.messenger.t0.s, new StringBuilder("app start time = "));
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
                dk0 dk0Var = (dk0) this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        dk0Var.getClass();
                        break;
                    } else {
                        dk0Var.x = "female";
                        dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
                        break;
                    }
                } else {
                    dk0Var.x = "male";
                    dk0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
                    break;
                }
        }
    }
}
