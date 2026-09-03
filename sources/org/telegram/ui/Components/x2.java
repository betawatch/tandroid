package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ x2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                nh.b bVar = (nh.b) this.d;
                kh.t tVar = (kh.t) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    tVar.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new l4(context, i11, bVar, tVar).show();
                    break;
                }
            default:
                org.telegram.ui.lo0 lo0Var = (org.telegram.ui.lo0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.yn0 yn0Var = new org.telegram.ui.yn0(lo0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = lo0Var.v0;
                int i12 = (tL_paymentSavedCredentialsCard == null && lo0Var.u0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && lo0Var.u0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        lo0Var.v0 = tL_paymentSavedCredentialsCard2;
                        yn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.lo0 lo0Var2 = new org.telegram.ui.lo0(lo0Var.Y0, lo0Var.z0, lo0Var.K0, lo0Var.L0, 2, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.u0, lo0Var.F0, lo0Var.R0, null, lo0Var.o0, lo0Var.T0);
                            lo0Var2.Z0 = lo0Var.Z0;
                            lo0Var2.a1 = lo0Var.a1;
                            lo0Var2.Q = yn0Var;
                            lo0Var.presentFragment(lo0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = lo0Var.z0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.lo0 lo0Var3 = new org.telegram.ui.lo0(lo0Var.Y0, lo0Var.z0, lo0Var.K0, lo0Var.L0, 2, lo0Var.B0, lo0Var.D0, lo0Var.E0, null, lo0Var.u0, lo0Var.F0, lo0Var.R0, null, lo0Var.o0, lo0Var.T0);
                        lo0Var3.Z0 = lo0Var.Z0;
                        lo0Var3.a1 = lo0Var.a1;
                        lo0Var3.C0 = tL_paymentFormMethod;
                        lo0Var3.Q = yn0Var;
                        lo0Var.presentFragment(lo0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
