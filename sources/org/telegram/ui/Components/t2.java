package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class t2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ t2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                th.b bVar = (th.b) this.d;
                s2 s2Var = (s2) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    s2Var.a(Integer.valueOf(i11), "");
                    break;
                } else {
                    new h4(context, i11, bVar, s2Var).show();
                    break;
                }
            default:
                org.telegram.ui.sm0 sm0Var = (org.telegram.ui.sm0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.hm0 hm0Var = new org.telegram.ui.hm0(sm0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = sm0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && sm0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && sm0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        sm0Var.y0 = tL_paymentSavedCredentialsCard2;
                        hm0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.sm0 sm0Var2 = new org.telegram.ui.sm0(sm0Var.b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, 2, sm0Var.E0, sm0Var.G0, sm0Var.H0, null, sm0Var.x0, sm0Var.I0, sm0Var.U0, null, sm0Var.r0, sm0Var.W0);
                            sm0Var2.c1 = sm0Var.c1;
                            sm0Var2.d1 = sm0Var.d1;
                            sm0Var2.T = hm0Var;
                            sm0Var.presentFragment(sm0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = sm0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.sm0 sm0Var3 = new org.telegram.ui.sm0(sm0Var.b1, sm0Var.C0, sm0Var.N0, sm0Var.O0, 2, sm0Var.E0, sm0Var.G0, sm0Var.H0, null, sm0Var.x0, sm0Var.I0, sm0Var.U0, null, sm0Var.r0, sm0Var.W0);
                        sm0Var3.c1 = sm0Var.c1;
                        sm0Var3.d1 = sm0Var.d1;
                        sm0Var3.F0 = tL_paymentFormMethod;
                        sm0Var3.T = hm0Var;
                        sm0Var.presentFragment(sm0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
