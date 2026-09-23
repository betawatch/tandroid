package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
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
                y2 y2Var = (y2) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    y2Var.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new q4(context, i11, dVar, y2Var).show();
                    break;
                }
            default:
                org.telegram.ui.qo0 qo0Var = (org.telegram.ui.qo0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.co0 co0Var = new org.telegram.ui.co0(qo0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = qo0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && qo0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && qo0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        qo0Var.y0 = tL_paymentSavedCredentialsCard2;
                        co0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.qo0 qo0Var2 = new org.telegram.ui.qo0(qo0Var.b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 2, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.x0, qo0Var.I0, qo0Var.U0, null, qo0Var.r0, qo0Var.W0);
                            qo0Var2.c1 = qo0Var.c1;
                            qo0Var2.d1 = qo0Var.d1;
                            qo0Var2.T = co0Var;
                            qo0Var.presentFragment(qo0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = qo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.qo0 qo0Var3 = new org.telegram.ui.qo0(qo0Var.b1, qo0Var.C0, qo0Var.N0, qo0Var.O0, 2, qo0Var.E0, qo0Var.G0, qo0Var.H0, null, qo0Var.x0, qo0Var.I0, qo0Var.U0, null, qo0Var.r0, qo0Var.W0);
                        qo0Var3.c1 = qo0Var.c1;
                        qo0Var3.d1 = qo0Var.d1;
                        qo0Var3.F0 = tL_paymentFormMethod;
                        qo0Var3.T = co0Var;
                        qo0Var.presentFragment(qo0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
