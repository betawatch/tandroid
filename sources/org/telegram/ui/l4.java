package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                zx zxVar = (zx) this.b;
                if (i10 != 0) {
                    if (i10 == 1 && zxVar.e0 != null) {
                        while (true) {
                            yx[] yxVarArr = zxVar.e0;
                            if (i11 >= yxVarArr.length) {
                                break;
                            } else {
                                yx yxVar = yxVarArr[i11];
                                if (yxVar.s == 0 && yxVar.getVisibility() == 0) {
                                    org.telegram.ui.Cells.v2 c42 = zx.c4(zxVar.e0[i11]);
                                    vx vxVar = zxVar.e0[i11].a;
                                    int i13 = vx.B3;
                                    vxVar.C1(true, c42);
                                }
                                i11++;
                            }
                        }
                    }
                } else {
                    org.telegram.messenger.is messagesStorage = zxVar.getMessagesStorage();
                    messagesStorage.a.c(new org.telegram.messenger.zp(messagesStorage, i12, 3));
                    break;
                }
                break;
            case 2:
                ff0 ff0Var = (ff0) this.b;
                if (i10 != 0) {
                    ProfileActivity.V4(ff0Var.a0.getParentActivity(), false);
                    break;
                } else {
                    org.telegram.messenger.v2.a = !org.telegram.messenger.v2.a;
                    org.telegram.messenger.w0.b.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", org.telegram.messenger.v2.a).commit();
                    org.telegram.ui.Components.cc.a0(ff0Var.a0).Q(R.raw.chats_infotip, 36, org.telegram.messenger.v2.a ? "Logs enabled." : "Logs disabled.").j();
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
                jl0 jl0Var = (jl0) this.b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        jl0Var.getClass();
                        break;
                    } else {
                        jl0Var.x = "female";
                        jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747585, null));
                        break;
                    }
                } else {
                    jl0Var.x = "male";
                    jl0Var.Y[4].setText(org.telegram.messenger.dd.L0(2131747524, null));
                    break;
                }
        }
    }
}
