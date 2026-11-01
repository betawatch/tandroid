package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class z10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a20 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ x10 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ z10(a20 a20Var, x10 x10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = a20Var;
        this.d = x10Var;
        this.c = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                b20 b20Var = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    b20Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                b20Var.getClass();
                break;
            case 1:
                b20 b20Var2 = this.b.i;
                TLObject tLObject = this.c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    wp.r1(b20Var2.a).L3((TLRPC.Updates) tLObject, false);
                }
                ag.k.a(b20Var2.a).b();
                if (z12 && this.e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                break;
            default:
                b20 b20Var3 = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z11 = true;
                } else {
                    b20Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                b20Var3.getClass();
                break;
        }
    }

    public /* synthetic */ z10(a20 a20Var, TLObject tLObject, x10 x10Var, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = a20Var;
        this.c = tLObject;
        this.d = x10Var;
        this.e = tL_error;
    }
}
