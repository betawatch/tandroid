package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class z2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ z2(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
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
                    new q4(context, i10, bVar, zVar).show();
                    break;
                }
            default:
                org.telegram.ui.ml0 ml0Var = (org.telegram.ui.ml0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.cl0 cl0Var = new org.telegram.ui.cl0(ml0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = ml0Var.z0;
                int i11 = (tL_paymentSavedCredentialsCard == null && ml0Var.y0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && ml0Var.y0 == null) || i7 != 0) {
                    if (i7 >= i11 && i7 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i7 - i11);
                        ml0Var.z0 = tL_paymentSavedCredentialsCard2;
                        cl0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i7 >= arrayList2.size() - 1) {
                        if (i7 == arrayList2.size() - 1) {
                            org.telegram.ui.ml0 ml0Var2 = new org.telegram.ui.ml0(ml0Var.c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 2, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.y0, ml0Var.J0, ml0Var.V0, null, ml0Var.s0, ml0Var.X0);
                            ml0Var2.d1 = ml0Var.d1;
                            ml0Var2.e1 = ml0Var.e1;
                            ml0Var2.U = cl0Var;
                            ml0Var.presentFragment(ml0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = ml0Var.D0.additional_methods.get((i7 - arrayList.size()) - i11);
                        org.telegram.ui.ml0 ml0Var3 = new org.telegram.ui.ml0(ml0Var.c1, ml0Var.D0, ml0Var.O0, ml0Var.P0, 2, ml0Var.F0, ml0Var.H0, ml0Var.I0, null, ml0Var.y0, ml0Var.J0, ml0Var.V0, null, ml0Var.s0, ml0Var.X0);
                        ml0Var3.d1 = ml0Var.d1;
                        ml0Var3.e1 = ml0Var.e1;
                        ml0Var3.G0 = tL_paymentFormMethod;
                        ml0Var3.U = cl0Var;
                        ml0Var.presentFragment(ml0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
