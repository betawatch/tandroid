package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.af0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class r9 implements j20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r9(Object obj, Object obj2, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.d = obj2;
        this.b = j10;
    }

    @Override // org.telegram.messenger.j20
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((org.telegram.ui.Components.s2) this.d).a(((x9) this.c).b(this.b), (TLRPC.TL_error) obj2);
                break;
            case 1:
                vp vpVar = (vp) this.c;
                yh.c0 c0Var = (yh.c0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    vpVar.T2(0, this.b, true);
                }
                c0Var.a(bool, tL_error);
                break;
            case 2:
                vp vpVar2 = (vp) this.c;
                yh.c0 c0Var2 = (yh.c0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    vpVar2.T2(0, this.b, true);
                }
                c0Var2.a(bool2, tL_error2);
                break;
            default:
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.c;
                af0 af0Var = (af0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                x1Var.dismiss();
                long j10 = this.b;
                if (tL_error3 == null) {
                    af0Var.a(Long.valueOf(j10), auth_authorization, null);
                    break;
                } else {
                    af0Var.a(Long.valueOf(j10), null, tL_error3.text);
                    break;
                }
        }
    }

    public /* synthetic */ r9(vp vpVar, long j10, j20 j20Var, int i10) {
        this.a = i10;
        this.c = vpVar;
        this.b = j10;
        this.d = j20Var;
    }
}
