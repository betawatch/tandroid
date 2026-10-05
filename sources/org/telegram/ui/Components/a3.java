package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                ai.d dVar = (ai.d) this.d;
                z2 z2Var = (z2) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    z2Var.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new q4(context, i11, dVar, z2Var).show();
                    break;
                }
            default:
                org.telegram.ui.so0 so0Var = (org.telegram.ui.so0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.eo0 eo0Var = new org.telegram.ui.eo0(so0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = so0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && so0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && so0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        so0Var.y0 = tL_paymentSavedCredentialsCard2;
                        eo0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.so0 so0Var2 = new org.telegram.ui.so0(so0Var.b1, so0Var.C0, so0Var.N0, so0Var.O0, 2, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.x0, so0Var.I0, so0Var.U0, null, so0Var.r0, so0Var.W0);
                            so0Var2.c1 = so0Var.c1;
                            so0Var2.d1 = so0Var.d1;
                            so0Var2.T = eo0Var;
                            so0Var.presentFragment(so0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = so0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.so0 so0Var3 = new org.telegram.ui.so0(so0Var.b1, so0Var.C0, so0Var.N0, so0Var.O0, 2, so0Var.E0, so0Var.G0, so0Var.H0, null, so0Var.x0, so0Var.I0, so0Var.U0, null, so0Var.r0, so0Var.W0);
                        so0Var3.c1 = so0Var.c1;
                        so0Var3.d1 = so0Var.d1;
                        so0Var3.F0 = tL_paymentFormMethod;
                        so0Var3.T = eo0Var;
                        so0Var.presentFragment(so0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
