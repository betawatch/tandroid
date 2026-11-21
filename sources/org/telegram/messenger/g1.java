package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements x10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.x10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                g0.g3(new yf((h1) this.b, (String) obj, (Runnable) this.c, 7));
                break;
            case 1:
                g3 g3Var = (g3) this.b;
                x10 x10Var = (x10) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    g3Var.f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    g3Var.b = true;
                }
                g3Var.a = false;
                x10Var.a(g3Var);
                break;
            default:
                zy zyVar = (zy) this.b;
                xy xyVar = (xy) this.c;
                zyVar.getClass();
                xyVar.Q = ((Long) obj).longValue();
                zyVar.r0(xyVar);
                break;
        }
    }
}
