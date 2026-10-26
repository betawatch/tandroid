package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                org.telegram.ui.po0 po0Var = (org.telegram.ui.po0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.bo0 bo0Var = new org.telegram.ui.bo0(po0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = po0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && po0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && po0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        po0Var.y0 = tL_paymentSavedCredentialsCard2;
                        bo0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.po0 po0Var2 = new org.telegram.ui.po0(po0Var.b1, po0Var.C0, po0Var.N0, po0Var.O0, 2, po0Var.E0, po0Var.G0, po0Var.H0, null, po0Var.x0, po0Var.I0, po0Var.U0, null, po0Var.r0, po0Var.W0);
                            po0Var2.c1 = po0Var.c1;
                            po0Var2.d1 = po0Var.d1;
                            po0Var2.T = bo0Var;
                            po0Var.presentFragment(po0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = po0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.po0 po0Var3 = new org.telegram.ui.po0(po0Var.b1, po0Var.C0, po0Var.N0, po0Var.O0, 2, po0Var.E0, po0Var.G0, po0Var.H0, null, po0Var.x0, po0Var.I0, po0Var.U0, null, po0Var.r0, po0Var.W0);
                        po0Var3.c1 = po0Var.c1;
                        po0Var3.d1 = po0Var.d1;
                        po0Var3.F0 = tL_paymentFormMethod;
                        po0Var3.T = bo0Var;
                        po0Var.presentFragment(po0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
