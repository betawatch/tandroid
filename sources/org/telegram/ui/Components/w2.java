package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w2(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i9) {
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.b;
                Context context = (Context) this.c;
                ih.b bVar = (ih.b) this.d;
                fh.y yVar = (fh.y) this.e;
                int i10 = iArr[i9];
                if (i10 != 100) {
                    yVar.run(Integer.valueOf(i10), "");
                    break;
                } else {
                    new k4(context, i10, bVar, yVar).show();
                    break;
                }
            default:
                org.telegram.ui.co0 co0Var = (org.telegram.ui.co0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.pn0 pn0Var = new org.telegram.ui.pn0(co0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = co0Var.u0;
                int i11 = (tL_paymentSavedCredentialsCard == null && co0Var.t0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && co0Var.t0 == null) || i9 != 0) {
                    if (i9 >= i11 && i9 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i9 - i11);
                        co0Var.u0 = tL_paymentSavedCredentialsCard2;
                        pn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i9 >= arrayList2.size() - 1) {
                        if (i9 == arrayList2.size() - 1) {
                            org.telegram.ui.co0 co0Var2 = new org.telegram.ui.co0(co0Var.X0, co0Var.y0, co0Var.J0, co0Var.K0, 2, co0Var.A0, co0Var.C0, co0Var.D0, null, co0Var.t0, co0Var.E0, co0Var.Q0, null, co0Var.n0, co0Var.S0);
                            co0Var2.Y0 = co0Var.Y0;
                            co0Var2.Z0 = co0Var.Z0;
                            co0Var2.P = pn0Var;
                            co0Var.presentFragment(co0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = co0Var.y0.additional_methods.get((i9 - arrayList.size()) - i11);
                        org.telegram.ui.co0 co0Var3 = new org.telegram.ui.co0(co0Var.X0, co0Var.y0, co0Var.J0, co0Var.K0, 2, co0Var.A0, co0Var.C0, co0Var.D0, null, co0Var.t0, co0Var.E0, co0Var.Q0, null, co0Var.n0, co0Var.S0);
                        co0Var3.Y0 = co0Var.Y0;
                        co0Var3.Z0 = co0Var.Z0;
                        co0Var3.B0 = tL_paymentFormMethod;
                        co0Var3.P = pn0Var;
                        co0Var.presentFragment(co0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
