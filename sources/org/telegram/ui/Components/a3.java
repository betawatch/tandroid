package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
                org.telegram.ui.oo0 oo0Var = (org.telegram.ui.oo0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.ao0 ao0Var = new org.telegram.ui.ao0(oo0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = oo0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && oo0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && oo0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        oo0Var.y0 = tL_paymentSavedCredentialsCard2;
                        ao0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.oo0 oo0Var2 = new org.telegram.ui.oo0(oo0Var.b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, 2, oo0Var.E0, oo0Var.G0, oo0Var.H0, null, oo0Var.x0, oo0Var.I0, oo0Var.U0, null, oo0Var.r0, oo0Var.W0);
                            oo0Var2.c1 = oo0Var.c1;
                            oo0Var2.d1 = oo0Var.d1;
                            oo0Var2.T = ao0Var;
                            oo0Var.presentFragment(oo0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = oo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.oo0 oo0Var3 = new org.telegram.ui.oo0(oo0Var.b1, oo0Var.C0, oo0Var.N0, oo0Var.O0, 2, oo0Var.E0, oo0Var.G0, oo0Var.H0, null, oo0Var.x0, oo0Var.I0, oo0Var.U0, null, oo0Var.r0, oo0Var.W0);
                        oo0Var3.c1 = oo0Var.c1;
                        oo0Var3.d1 = oo0Var.d1;
                        oo0Var3.F0 = tL_paymentFormMethod;
                        oo0Var3.T = ao0Var;
                        oo0Var.presentFragment(oo0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
