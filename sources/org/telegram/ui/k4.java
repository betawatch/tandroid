package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                zy0 zy0Var = (zy0) this.b;
                zy0Var.getClass();
                aj.e.c.b(i7 == 0 ? yi.g.a : yi.g.b);
                ((l4) zy0Var.c).g(2);
                break;
            case 1:
                cx cxVar = (cx) this.b;
                if (i7 != 0) {
                    if (i7 == 1 && cxVar.f0 != null) {
                        while (true) {
                            bx[] bxVarArr = cxVar.f0;
                            if (i11 >= bxVarArr.length) {
                                break;
                            } else {
                                bx bxVar = bxVarArr[i11];
                                if (bxVar.s == 0 && bxVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.t2 c42 = cx.c4(cxVar.f0[i11]);
                                    yw ywVar = cxVar.f0[i11].a;
                                    int i13 = yw.C3;
                                    ywVar.C1(true, c42);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.tr messagesStorage = cxVar.getMessagesStorage();
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
                    org.telegram.ui.Components.lc.b0(ce0Var.h0).Q(R.raw.chats_infotip, 36, org.telegram.messenger.s2.a ? "Logs enabled." : "Logs disabled.").j();
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
                hk0 hk0Var = (hk0) this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        hk0Var.getClass();
                        break;
                    } else {
                        hk0Var.x = "female";
                        hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747376, null));
                        break;
                    }
                } else {
                    hk0Var.x = "male";
                    hk0Var.Z[4].setText(org.telegram.messenger.gd.M0(2131747315, null));
                    break;
                }
        }
    }
}
