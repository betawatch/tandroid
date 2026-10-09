package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                ai.d dVar = (ai.d) this.d;
                b3 b3Var = (b3) this.e;
                int i11 = iArr[i10];
                if (i11 != 100) {
                    b3Var.run(Integer.valueOf(i11), "");
                    break;
                } else {
                    new s4(context, i11, dVar, b3Var).show();
                    break;
                }
            default:
                org.telegram.ui.vo0 vo0Var = (org.telegram.ui.vo0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.ho0 ho0Var = new org.telegram.ui.ho0(vo0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = vo0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && vo0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && vo0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        vo0Var.y0 = tL_paymentSavedCredentialsCard2;
                        ho0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.vo0 vo0Var2 = new org.telegram.ui.vo0(vo0Var.b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 2, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.x0, vo0Var.I0, vo0Var.U0, null, vo0Var.r0, vo0Var.W0);
                            vo0Var2.c1 = vo0Var.c1;
                            vo0Var2.d1 = vo0Var.d1;
                            vo0Var2.T = ho0Var;
                            vo0Var.presentFragment(vo0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = vo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.vo0 vo0Var3 = new org.telegram.ui.vo0(vo0Var.b1, vo0Var.C0, vo0Var.N0, vo0Var.O0, 2, vo0Var.E0, vo0Var.G0, vo0Var.H0, null, vo0Var.x0, vo0Var.I0, vo0Var.U0, null, vo0Var.r0, vo0Var.W0);
                        vo0Var3.c1 = vo0Var.c1;
                        vo0Var3.d1 = vo0Var.d1;
                        vo0Var3.F0 = tL_paymentFormMethod;
                        vo0Var3.T = ho0Var;
                        vo0Var.presentFragment(vo0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
