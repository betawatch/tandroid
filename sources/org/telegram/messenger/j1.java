package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class j1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j1(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                i0.g3(new mg((k1) this.b, (String) obj, (Runnable) this.c, 7));
                break;
            case 1:
                h3 h3Var = (h3) this.b;
                q20 q20Var = (q20) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    h3Var.f = Utilities.z(tL_error.text).intValue();
                } else if (tL_error.text.startsWith("BOOSTS_EMPTY")) {
                    h3Var.b = true;
                }
                h3Var.a = false;
                q20Var.a(h3Var);
                break;
            default:
                qz qzVar = (qz) this.b;
                oz ozVar = (oz) this.c;
                qzVar.getClass();
                ozVar.Q = ((Long) obj).longValue();
                qzVar.r0(ozVar);
                break;
        }
    }
}
