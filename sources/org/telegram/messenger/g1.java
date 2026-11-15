package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                g0.h3(new mg((h1) this.b, (String) obj, (Runnable) this.c, 7));
                break;
            case 1:
                e3 e3Var = (e3) this.b;
                z10 z10Var = (z10) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    e3Var.f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    e3Var.b = true;
                }
                e3Var.a = false;
                z10Var.a(e3Var);
                break;
            default:
                ez ezVar = (ez) this.b;
                cz czVar = (cz) this.c;
                ezVar.getClass();
                czVar.Q = ((Long) obj).longValue();
                ezVar.r0(czVar);
                break;
        }
    }
}
