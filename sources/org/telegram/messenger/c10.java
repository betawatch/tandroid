package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d10 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ a10 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ c10(d10 d10Var, a10 a10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i3) {
        this.a = i3;
        this.b = d10Var;
        this.d = a10Var;
        this.c = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                e10 e10Var = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    e10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                e10Var.getClass();
                break;
            case 1:
                e10 e10Var2 = this.b.i;
                TLObject tLObject = this.c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    hp.s1(e10Var2.a).O3((TLRPC.Updates) tLObject, false);
                }
                lg.f.a(e10Var2.a).b();
                if (z12 && this.e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                break;
            default:
                e10 e10Var3 = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z11 = true;
                } else {
                    e10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                e10Var3.getClass();
                break;
        }
    }

    public /* synthetic */ c10(d10 d10Var, TLObject tLObject, a10 a10Var, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = d10Var;
        this.c = tLObject;
        this.d = a10Var;
        this.e = tL_error;
    }
}
