package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements r20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.r20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                i0.g3(new ng((k1) this.b, (String) obj, (Runnable) this.c, 7));
                break;
            case 1:
                h3 h3Var = (h3) this.b;
                r20 r20Var = (r20) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    h3Var.f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    h3Var.b = true;
                }
                h3Var.a = false;
                r20Var.a(h3Var);
                break;
            default:
                rz rzVar = (rz) this.b;
                pz pzVar = (pz) this.c;
                rzVar.getClass();
                pzVar.Q = ((Long) obj).longValue();
                rzVar.r0(pzVar);
                break;
        }
    }
}
