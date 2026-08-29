package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.b;
                Context context = (Context) this.c;
                lh.b bVar = (lh.b) this.d;
                ih.u uVar = (ih.u) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    uVar.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new o4(context, i11, bVar, uVar).show();
                    break;
                }
            default:
                org.telegram.ui.bo0 bo0Var = (org.telegram.ui.bo0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.on0 on0Var = new org.telegram.ui.on0(bo0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = bo0Var.u0;
                int i12 = (tL_paymentSavedCredentialsCard == null && bo0Var.t0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && bo0Var.t0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        bo0Var.u0 = tL_paymentSavedCredentialsCard2;
                        on0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.bo0 bo0Var2 = new org.telegram.ui.bo0(bo0Var.X0, bo0Var.y0, bo0Var.J0, bo0Var.K0, 2, bo0Var.A0, bo0Var.C0, bo0Var.D0, null, bo0Var.t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.n0, bo0Var.S0);
                            bo0Var2.Y0 = bo0Var.Y0;
                            bo0Var2.Z0 = bo0Var.Z0;
                            bo0Var2.P = on0Var;
                            bo0Var.presentFragment(bo0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = bo0Var.y0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.bo0 bo0Var3 = new org.telegram.ui.bo0(bo0Var.X0, bo0Var.y0, bo0Var.J0, bo0Var.K0, 2, bo0Var.A0, bo0Var.C0, bo0Var.D0, null, bo0Var.t0, bo0Var.E0, bo0Var.Q0, null, bo0Var.n0, bo0Var.S0);
                        bo0Var3.Y0 = bo0Var.Y0;
                        bo0Var3.Z0 = bo0Var.Z0;
                        bo0Var3.B0 = tL_paymentFormMethod;
                        bo0Var3.P = on0Var;
                        bo0Var.presentFragment(bo0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
