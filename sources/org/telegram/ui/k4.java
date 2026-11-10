package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                bz0 bz0Var = (bz0) this.b;
                bz0Var.getClass();
                xi.e.c.b(i7 == 0 ? vi.f.a : vi.f.b);
                ((l4) bz0Var.c).g(2);
                break;
            case 1:
                zw zwVar = (zw) this.b;
                if (i7 != 0) {
                    if (i7 == 1 && zwVar.e0 != null) {
                        while (true) {
                            yw[] ywVarArr = zwVar.e0;
                            if (i10 >= ywVarArr.length) {
                                break;
                            } else {
                                yw ywVar = ywVarArr[i10];
                                if (ywVar.s == 0 && ywVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.t2 c42 = zw.c4(zwVar.e0[i10]);
                                    vw vwVar = zwVar.e0[i10].a;
                                    int i12 = vw.B3;
                                    vwVar.C1(true, c42);
                                }
                                i10++;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.yr messagesStorage = zwVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.tp(messagesStorage, i11, 3));
                    break;
                }
                break;
            case 2:
                ee0 ee0Var = (ee0) this.b;
                if (i7 != 0) {
                    ProfileActivity.Y4(ee0Var.g0.getParentActivity(), false);
                    break;
                } else {
                    org.telegram.messenger.r2.a = !org.telegram.messenger.r2.a;
                    org.telegram.messenger.t0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.r2.a).commit();
                    org.telegram.ui.Components.gc.a0(ee0Var.g0).Q(R.raw.chats_infotip, 36, org.telegram.messenger.r2.a ? "Logs enabled." : "Logs disabled.").j();
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
                ek0 ek0Var = (ek0) this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        ek0Var.getClass();
                        break;
                    } else {
                        ek0Var.x = "female";
                        ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747569, null));
                        break;
                    }
                } else {
                    ek0Var.x = "male";
                    ek0Var.Y[4].setText(org.telegram.messenger.id.M0(2131747508, null));
                    break;
                }
        }
    }
}
