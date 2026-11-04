package org.telegram.ui.Components;

import android.content.Context;
import android.content.DialogInterface;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r2 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ r2(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i3) {
        switch (this.a) {
            case 0:
                int[] iArr = (int[]) this.b;
                Context context = (Context) this.c;
                ei.b bVar = (ei.b) this.d;
                ai.f0 f0Var = (ai.f0) this.e;
                int i10 = iArr[i3];
                if (i10 != 100) {
                    f0Var.a(Integer.valueOf(i10), "");
                    break;
                } else {
                    new i4(context, i10, bVar, f0Var).show();
                    break;
                }
            default:
                org.telegram.ui.dl0 dl0Var = (org.telegram.ui.dl0) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ArrayList arrayList2 = (ArrayList) this.e;
                org.telegram.ui.tk0 tk0Var = new org.telegram.ui.tk0(dl0Var, runnable);
                TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = dl0Var.z0;
                int i11 = (tL_paymentSavedCredentialsCard == null && dl0Var.y0 == null) ? 0 : 1;
                if ((tL_paymentSavedCredentialsCard == null && dl0Var.y0 == null) || i3 != 0) {
                    if (i3 >= i11 && i3 < arrayList.size() + i11) {
                        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i3 - i11);
                        dl0Var.z0 = tL_paymentSavedCredentialsCard2;
                        tk0Var.c(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
                        break;
                    } else if (i3 >= arrayList2.size() - 1) {
                        if (i3 == arrayList2.size() - 1) {
                            org.telegram.ui.dl0 dl0Var2 = new org.telegram.ui.dl0(dl0Var.c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, 2, dl0Var.F0, dl0Var.H0, dl0Var.I0, null, dl0Var.y0, dl0Var.J0, dl0Var.V0, null, dl0Var.s0, dl0Var.X0);
                            dl0Var2.d1 = dl0Var.d1;
                            dl0Var2.e1 = dl0Var.e1;
                            dl0Var2.U = tk0Var;
                            dl0Var.presentFragment(dl0Var2);
                            break;
                        }
                    } else {
                        TLRPC.TL_paymentFormMethod tL_paymentFormMethod = dl0Var.D0.additional_methods.get((i3 - arrayList.size()) - i11);
                        org.telegram.ui.dl0 dl0Var3 = new org.telegram.ui.dl0(dl0Var.c1, dl0Var.D0, dl0Var.O0, dl0Var.P0, 2, dl0Var.F0, dl0Var.H0, dl0Var.I0, null, dl0Var.y0, dl0Var.J0, dl0Var.V0, null, dl0Var.s0, dl0Var.X0);
                        dl0Var3.d1 = dl0Var.d1;
                        dl0Var3.e1 = dl0Var.e1;
                        dl0Var3.G0 = tL_paymentFormMethod;
                        dl0Var3.U = tk0Var;
                        dl0Var.presentFragment(dl0Var3);
                        break;
                    }
                }
                break;
        }
    }
}
