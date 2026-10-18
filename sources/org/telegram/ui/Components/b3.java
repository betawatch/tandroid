package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                ci.b bVar = (ci.b) this.d;
                a3 a3Var = (a3) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    a3Var.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new r4(context, i11, bVar, a3Var).show();
                    break;
                }
            default:
                org.telegram.ui.go0 go0Var = (org.telegram.ui.go0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.sn0 sn0Var = new org.telegram.ui.sn0(go0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = go0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && go0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && go0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        go0Var.y0 = tL_paymentSavedCredentialsCard2;
                        sn0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.go0 go0Var2 = new org.telegram.ui.go0(go0Var.b1, go0Var.C0, go0Var.N0, go0Var.O0, 2, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.x0, go0Var.I0, go0Var.U0, null, go0Var.r0, go0Var.W0);
                            go0Var2.c1 = go0Var.c1;
                            go0Var2.d1 = go0Var.d1;
                            go0Var2.T = sn0Var;
                            go0Var.presentFragment(go0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = go0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.go0 go0Var3 = new org.telegram.ui.go0(go0Var.b1, go0Var.C0, go0Var.N0, go0Var.O0, 2, go0Var.E0, go0Var.G0, go0Var.H0, null, go0Var.x0, go0Var.I0, go0Var.U0, null, go0Var.r0, go0Var.W0);
                        go0Var3.c1 = go0Var.c1;
                        go0Var3.d1 = go0Var.d1;
                        go0Var3.F0 = tL_paymentFormMethod;
                        go0Var3.T = sn0Var;
                        go0Var.presentFragment(go0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
