package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
                bi.b bVar = (bi.b) this.d;
                b3 b3Var = (b3) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    b3Var.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new s4(context, i11, bVar, b3Var).show();
                    break;
                }
            default:
                org.telegram.ui.ap0 ap0Var = (org.telegram.ui.ap0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.mo0 mo0Var = new org.telegram.ui.mo0(ap0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = ap0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && ap0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && ap0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        ap0Var.y0 = tL_paymentSavedCredentialsCard2;
                        mo0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.ap0 ap0Var2 = new org.telegram.ui.ap0(ap0Var.b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 2, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.x0, ap0Var.I0, ap0Var.U0, null, ap0Var.r0, ap0Var.W0);
                            ap0Var2.c1 = ap0Var.c1;
                            ap0Var2.d1 = ap0Var.d1;
                            ap0Var2.T = mo0Var;
                            ap0Var.presentFragment(ap0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = ap0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.ap0 ap0Var3 = new org.telegram.ui.ap0(ap0Var.b1, ap0Var.C0, ap0Var.N0, ap0Var.O0, 2, ap0Var.E0, ap0Var.G0, ap0Var.H0, null, ap0Var.x0, ap0Var.I0, ap0Var.U0, null, ap0Var.r0, ap0Var.W0);
                        ap0Var3.c1 = ap0Var.c1;
                        ap0Var3.d1 = ap0Var.d1;
                        ap0Var3.F0 = tL_paymentFormMethod;
                        ap0Var3.T = mo0Var;
                        ap0Var.presentFragment(ap0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
