package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class l4 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l4(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                l01 l01Var = (l01) this.b;
                l01Var.getClass();
                mi.e.c.b(i10 == 0 ? ki.i.a : ki.i.b);
                ((fg.j) l01Var.c).g(2);
                break;
            case 1:
                ay ayVar = (ay) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && ayVar.e0 != null) {
                        while (true) {
                            zx[] zxVarArr = ayVar.e0;
                            if (i11 >= zxVarArr.length) {
                                break;
                            } else {
                                zx zxVar = zxVarArr[i11];
                                if (zxVar.s == 0 && zxVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.v2 b42 = ay.b4(ayVar.e0[i11]);
                                    wx wxVar = ayVar.e0[i11].a;
                                    int i13 = wx.B3;
                                    wxVar.C1(true, b42);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.hs messagesStorage = ayVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.yp(messagesStorage, i12, 3));
                    break;
                }
                break;
            case 2:
                gf0 gf0Var = (gf0) this.b;
                if (i10 != 0) {
                    ProfileActivity.U4(gf0Var.a0.getParentActivity(), false);
                    break;
                } else {
                    org.telegram.messenger.v2.a = !org.telegram.messenger.v2.a;
                    org.telegram.messenger.w0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.v2.a).commit();
                    org.telegram.ui.Components.cc.a0(gf0Var.a0).Q(R.raw.chats_infotip, 36, org.telegram.messenger.v2.a ? "Logs enabled." : "Logs disabled.").j();
                    if (org.telegram.messenger.v2.a) {
                        i0.a.q(org.telegram.messenger.w0.s, new StringBuilder("app start time = "));
                        try {
                            org.telegram.messenger.f8.b("buildVersion = " + org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0).versionCode);
                            break;
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                            return;
                        }
                    }
                }
                break;
            default:
                ll0 ll0Var = (ll0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        ll0Var.getClass();
                        break;
                    } else {
                        ll0Var.x = "female";
                        ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747585, null));
                        break;
                    }
                } else {
                    ll0Var.x = "male";
                    ll0Var.Y[4].setText(org.telegram.messenger.cd.L0(2131747524, null));
                    break;
                }
        }
    }
}
