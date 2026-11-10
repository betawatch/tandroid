package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.wd0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final /* synthetic */ class q9 implements v10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ q9(Object obj, Object obj2, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.d = obj2;
        this.b = j3;
    }

    @Override // org.telegram.messenger.v10
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((ai.v0) this.d).a(((w9) this.c).b(this.b), (TLRPC.TL_error) obj2);
                break;
            case 1:
                qp qpVar = (qp) this.c;
                ii.j0 j0Var = (ii.j0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    qpVar.V2(0, this.b, true);
                }
                j0Var.a(bool, tL_error);
                break;
            case 2:
                qp qpVar2 = (qp) this.c;
                ii.j0 j0Var2 = (ii.j0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    qpVar2.V2(0, this.b, true);
                }
                j0Var2.a(bool2, tL_error2);
                break;
            default:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) this.c;
                wd0 wd0Var = (wd0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                u1Var.dismiss();
                long j3 = this.b;
                if (tL_error3 == null) {
                    wd0Var.a(Long.valueOf(j3), auth_authorization, null);
                    break;
                } else {
                    wd0Var.a(Long.valueOf(j3), null, tL_error3.text);
                    break;
                }
        }
    }

    public /* synthetic */ q9(qp qpVar, long j3, v10 v10Var, int i7) {
        this.a = i7;
        this.c = qpVar;
        this.b = j3;
        this.d = v10Var;
    }
}
