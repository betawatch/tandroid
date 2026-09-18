package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
                    new o4(context, i11, dVar, y2Var).show();
                    break;
                }
            default:
                org.telegram.ui.yo0 yo0Var = (org.telegram.ui.yo0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.ko0 ko0Var = new org.telegram.ui.ko0(yo0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = yo0Var.y0;
                int i12 = (tL_paymentSavedCredentialsCard == null && yo0Var.x0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && yo0Var.x0 == null) || i10 != 0) {
                    if (i10 >= i12 && i10 < arrayList.size() + i12) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i10 - i12);
                        yo0Var.y0 = tL_paymentSavedCredentialsCard2;
                        ko0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i10 >= arrayList2.size() - 1) {
                        if (i10 == arrayList2.size() - 1) {
                            org.telegram.ui.yo0 yo0Var2 = new org.telegram.ui.yo0(yo0Var.b1, yo0Var.C0, yo0Var.N0, yo0Var.O0, 2, yo0Var.E0, yo0Var.G0, yo0Var.H0, null, yo0Var.x0, yo0Var.I0, yo0Var.U0, null, yo0Var.r0, yo0Var.W0);
                            yo0Var2.c1 = yo0Var.c1;
                            yo0Var2.d1 = yo0Var.d1;
                            yo0Var2.T = ko0Var;
                            yo0Var.presentFragment(yo0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = yo0Var.C0.additional_methods.get((i10 - arrayList.size()) - i12);
                        org.telegram.ui.yo0 yo0Var3 = new org.telegram.ui.yo0(yo0Var.b1, yo0Var.C0, yo0Var.N0, yo0Var.O0, 2, yo0Var.E0, yo0Var.G0, yo0Var.H0, null, yo0Var.x0, yo0Var.I0, yo0Var.U0, null, yo0Var.r0, yo0Var.W0);
                        yo0Var3.c1 = yo0Var.c1;
                        yo0Var3.d1 = yo0Var.d1;
                        yo0Var3.F0 = tL_paymentFormMethod;
                        yo0Var3.T = ko0Var;
                        yo0Var.presentFragment(yo0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
