package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                zh.b bVar = (zh.b) this.d;
                z2 z2Var = (z2) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    z2Var.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new p4(context, i11, bVar, z2Var).show();
                    break;
                }
            default:
                org.telegram.ui.wo0 wo0Var = (org.telegram.ui.wo0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.io0 io0Var = new org.telegram.ui.io0(wo0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = wo0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && wo0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && wo0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        wo0Var.y0 = tL_paymentSavedCredentialsCard2;
                        io0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.wo0 wo0Var2 = new org.telegram.ui.wo0(wo0Var.b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 2, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.x0, wo0Var.I0, wo0Var.U0, null, wo0Var.r0, wo0Var.W0);
                            wo0Var2.c1 = wo0Var.c1;
                            wo0Var2.d1 = wo0Var.d1;
                            wo0Var2.T = io0Var;
                            wo0Var.presentFragment(wo0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = wo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.wo0 wo0Var3 = new org.telegram.ui.wo0(wo0Var.b1, wo0Var.C0, wo0Var.N0, wo0Var.O0, 2, wo0Var.E0, wo0Var.G0, wo0Var.H0, null, wo0Var.x0, wo0Var.I0, wo0Var.U0, null, wo0Var.r0, wo0Var.W0);
                        wo0Var3.c1 = wo0Var.c1;
                        wo0Var3.d1 = wo0Var.d1;
                        wo0Var3.F0 = tL_paymentFormMethod;
                        wo0Var3.T = io0Var;
                        wo0Var.presentFragment(wo0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
