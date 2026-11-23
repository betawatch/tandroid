package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements y10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.y10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                g0.g3(new zf((h1) this.b, (String) obj, (Runnable) this.c, 7));
                break;
            case 1:
                g3 g3Var = (g3) this.b;
                y10 y10Var = (y10) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    g3Var.f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    g3Var.b = true;
                }
                g3Var.a = false;
                y10Var.a(g3Var);
                break;
            default:
                az azVar = (az) this.b;
                yy yyVar = (yy) this.c;
                azVar.getClass();
                yyVar.Q = ((Long) obj).longValue();
                azVar.r0(yyVar);
                break;
        }
    }
}
