package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                bi.b bVar = (bi.b) this.d;
                z2 z2Var = (z2) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    z2Var.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new q4(context, i11, bVar, z2Var).show();
                    break;
                }
            default:
                org.telegram.ui.xo0 xo0Var = (org.telegram.ui.xo0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.jo0 jo0Var = new org.telegram.ui.jo0(xo0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = xo0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && xo0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && xo0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        xo0Var.y0 = tL_paymentSavedCredentialsCard2;
                        jo0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.xo0 xo0Var2 = new org.telegram.ui.xo0(xo0Var.b1, xo0Var.C0, xo0Var.N0, xo0Var.O0, 2, xo0Var.E0, xo0Var.G0, xo0Var.H0, null, xo0Var.x0, xo0Var.I0, xo0Var.U0, null, xo0Var.r0, xo0Var.W0);
                            xo0Var2.c1 = xo0Var.c1;
                            xo0Var2.d1 = xo0Var.d1;
                            xo0Var2.T = jo0Var;
                            xo0Var.presentFragment(xo0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = xo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.xo0 xo0Var3 = new org.telegram.ui.xo0(xo0Var.b1, xo0Var.C0, xo0Var.N0, xo0Var.O0, 2, xo0Var.E0, xo0Var.G0, xo0Var.H0, null, xo0Var.x0, xo0Var.I0, xo0Var.U0, null, xo0Var.r0, xo0Var.W0);
                        xo0Var3.c1 = xo0Var.c1;
                        xo0Var3.d1 = xo0Var.d1;
                        xo0Var3.F0 = tL_paymentFormMethod;
                        xo0Var3.T = jo0Var;
                        xo0Var.presentFragment(xo0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
