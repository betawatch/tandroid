package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.b;
                Context context = (Context) this.c;
                fi.b bVar = (fi.b) this.d;
                bi.z zVar = (bi.z) this.e;
                int i10 = iArr[i7];
                if (i10 != 100) {
                    zVar.a(Integer.valueOf(i10), "");
                    break;
                } else {
                    new i4(context, i10, bVar, zVar).show();
                    break;
                }
            default:
                org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.zk0 zk0Var = new org.telegram.ui.zk0(jl0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = jl0Var.z0;
                int i11 = (tL_paymentSavedCredentialsCard == null && jl0Var.y0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && jl0Var.y0 == null) || i7 != 0) {
                    if (i7 >= i11 && i7 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i7 - i11);
                        jl0Var.z0 = tL_paymentSavedCredentialsCard2;
                        zk0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i7 >= arrayList2.size() - 1) {
                        if (i7 == arrayList2.size() - 1) {
                            org.telegram.ui.jl0 jl0Var2 = new org.telegram.ui.jl0(jl0Var.c1, jl0Var.D0, jl0Var.O0, jl0Var.P0, 2, jl0Var.F0, jl0Var.H0, jl0Var.I0, null, jl0Var.y0, jl0Var.J0, jl0Var.V0, null, jl0Var.s0, jl0Var.X0);
                            jl0Var2.d1 = jl0Var.d1;
                            jl0Var2.e1 = jl0Var.e1;
                            jl0Var2.U = zk0Var;
                            jl0Var.presentFragment(jl0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = jl0Var.D0.additional_methods.get((i7 - arrayList.size()) - i11);
                        org.telegram.ui.jl0 jl0Var3 = new org.telegram.ui.jl0(jl0Var.c1, jl0Var.D0, jl0Var.O0, jl0Var.P0, 2, jl0Var.F0, jl0Var.H0, jl0Var.I0, null, jl0Var.y0, jl0Var.J0, jl0Var.V0, null, jl0Var.s0, jl0Var.X0);
                        jl0Var3.d1 = jl0Var.d1;
                        jl0Var3.e1 = jl0Var.e1;
                        jl0Var3.G0 = tL_paymentFormMethod;
                        jl0Var3.U = zk0Var;
                        jl0Var.presentFragment(jl0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
