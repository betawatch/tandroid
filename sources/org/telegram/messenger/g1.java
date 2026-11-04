package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class g1 implements u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g1(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                g0.h3(new fg((h1) this.b, (String) obj, (Runnable) this.c, 7));
                break;
            case 1:
                e3 e3Var = (e3) this.b;
                u10 u10Var = (u10) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    e3Var.f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    e3Var.b = true;
                }
                e3Var.a = false;
                u10Var.a(e3Var);
                break;
            default:
                yy yyVar = (yy) this.b;
                wy wyVar = (wy) this.c;
                yyVar.getClass();
                wyVar.Q = ((Long) obj).longValue();
                yyVar.r0(wyVar);
                break;
        }
    }
}
