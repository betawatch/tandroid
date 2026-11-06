package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
                xy0 xy0Var = (xy0) this.b;
                xy0Var.getClass();
                xi.e.c.b(i7 == 0 ? vi.f.a : vi.f.b);
                ((l4) xy0Var.c).g(2);
                break;
            case 1:
                ww wwVar = (ww) this.b;
                if (i7 != 0) {
                    if (i7 == 1 && wwVar.e0 != null) {
                        while (true) {
                            vw[] vwVarArr = wwVar.e0;
                            if (i10 >= vwVarArr.length) {
                                break;
                            } else {
                                vw vwVar = vwVarArr[i10];
                                if (vwVar.s == 0 && vwVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.t2 c42 = ww.c4(wwVar.e0[i10]);
                                    sw swVar = wwVar.e0[i10].a;
                                    int i12 = sw.B3;
                                    swVar.C1(true, c42);
                                }
                                i10++;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.yr messagesStorage = wwVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.tp(messagesStorage, i11, 3));
                    break;
                }
                break;
            case 2:
                be0 be0Var = (be0) this.b;
                if (i7 != 0) {
                    ProfileActivity.V4(be0Var.g0.getParentActivity(), false);
                    break;
                } else {
                    org.telegram.messenger.r2.a = !org.telegram.messenger.r2.a;
                    org.telegram.messenger.t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.a).commit();
                    org.telegram.ui.Components.hc.a0(be0Var.g0).Q(R.raw.chats_infotip, 36, org.telegram.messenger.r2.a ? "Logs enabled." : "Logs disabled.").j();
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
                bk0 bk0Var = (bk0) this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        bk0Var.getClass();
                        break;
                    } else {
                        bk0Var.x = "female";
                        bk0Var.Y[4].setText(org.telegram.messenger.hd.M0(2131747568, null));
                        break;
                    }
                } else {
                    bk0Var.x = "male";
                    bk0Var.Y[4].setText(org.telegram.messenger.hd.M0(2131747507, null));
                    break;
                }
        }
    }
}
