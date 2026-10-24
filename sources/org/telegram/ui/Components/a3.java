package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                ci.b bVar = (ci.b) this.d;
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
                org.telegram.ui.io0 io0Var = (org.telegram.ui.io0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.un0 un0Var = new org.telegram.ui.un0(io0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = io0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && io0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && io0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        io0Var.y0 = tL_paymentSavedCredentialsCard2;
                        un0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.io0 io0Var2 = new org.telegram.ui.io0(io0Var.b1, io0Var.C0, io0Var.N0, io0Var.O0, 2, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.x0, io0Var.I0, io0Var.U0, null, io0Var.r0, io0Var.W0);
                            io0Var2.c1 = io0Var.c1;
                            io0Var2.d1 = io0Var.d1;
                            io0Var2.T = un0Var;
                            io0Var.presentFragment(io0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = io0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.io0 io0Var3 = new org.telegram.ui.io0(io0Var.b1, io0Var.C0, io0Var.N0, io0Var.O0, 2, io0Var.E0, io0Var.G0, io0Var.H0, null, io0Var.x0, io0Var.I0, io0Var.U0, null, io0Var.r0, io0Var.W0);
                        io0Var3.c1 = io0Var.c1;
                        io0Var3.d1 = io0Var.d1;
                        io0Var3.F0 = tL_paymentFormMethod;
                        io0Var3.T = un0Var;
                        io0Var.presentFragment(io0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
