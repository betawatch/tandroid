package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class y10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ w10 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ y10(z10 z10Var, w10 w10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = z10Var;
        this.d = w10Var;
        this.c = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                a20 a20Var = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    a20Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                a20Var.getClass();
                break;
            case 1:
                a20 a20Var2 = this.b.i;
                TLObject tLObject = this.c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    vp.r1(a20Var2.a).L3((TLRPC.Updates) tLObject, false);
                }
                ag.k.a(a20Var2.a).b();
                if (z12 && this.e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                break;
            default:
                a20 a20Var3 = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z11 = true;
                } else {
                    a20Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                a20Var3.getClass();
                break;
        }
    }

    public /* synthetic */ y10(z10 z10Var, TLObject tLObject, w10 w10Var, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = z10Var;
        this.c = tLObject;
        this.d = w10Var;
        this.e = tL_error;
    }
}
