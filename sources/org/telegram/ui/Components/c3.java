package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c3(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                di.b bVar = (di.b) this.d;
                ai.c1 c1Var = (ai.c1) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    c1Var.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new s4(context, i11, bVar, c1Var).show();
                    break;
                }
            default:
                org.telegram.ui.ro0 ro0Var = (org.telegram.ui.ro0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.do0 do0Var = new org.telegram.ui.do0(ro0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = ro0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && ro0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && ro0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        ro0Var.y0 = tL_paymentSavedCredentialsCard2;
                        do0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.ro0 ro0Var2 = new org.telegram.ui.ro0(ro0Var.b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 2, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.x0, ro0Var.I0, ro0Var.U0, null, ro0Var.r0, ro0Var.W0);
                            ro0Var2.c1 = ro0Var.c1;
                            ro0Var2.d1 = ro0Var.d1;
                            ro0Var2.T = do0Var;
                            ro0Var.presentFragment(ro0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = ro0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.ro0 ro0Var3 = new org.telegram.ui.ro0(ro0Var.b1, ro0Var.C0, ro0Var.N0, ro0Var.O0, 2, ro0Var.E0, ro0Var.G0, ro0Var.H0, null, ro0Var.x0, ro0Var.I0, ro0Var.U0, null, ro0Var.r0, ro0Var.W0);
                        ro0Var3.c1 = ro0Var.c1;
                        ro0Var3.d1 = ro0Var.d1;
                        ro0Var3.F0 = tL_paymentFormMethod;
                        ro0Var3.T = do0Var;
                        ro0Var.presentFragment(ro0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
