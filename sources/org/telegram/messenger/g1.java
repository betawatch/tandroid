package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                g0.h3(new ng((h1) this.b, (String) obj, (Runnable) this.c, 7));
                break;
            case 1:
                e3 e3Var = (e3) this.b;
                c20 c20Var = (c20) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    e3Var.f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    e3Var.b = true;
                }
                e3Var.a = false;
                c20Var.a(e3Var);
                break;
            default:
                gz gzVar = (gz) this.b;
                ez ezVar = (ez) this.c;
                gzVar.getClass();
                ezVar.Q = ((Long) obj).longValue();
                gzVar.r0(ezVar);
                break;
        }
    }
}
