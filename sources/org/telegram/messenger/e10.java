package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class e10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f10 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ c10 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ e10(f10 f10Var, c10 c10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = f10Var;
        this.d = c10Var;
        this.c = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                g10 g10Var = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    g10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                g10Var.getClass();
                break;
            case 1:
                g10 g10Var2 = this.b.i;
                TLObject tLObject = this.c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    mp.u1(g10Var2.a).V3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(g10Var2.a).b();
                if (z12 && this.e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                break;
            default:
                g10 g10Var3 = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z11 = true;
                } else {
                    g10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                g10Var3.getClass();
                break;
        }
    }

    public /* synthetic */ e10(f10 f10Var, TLObject tLObject, c10 c10Var, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = f10Var;
        this.c = tLObject;
        this.d = c10Var;
        this.e = tL_error;
    }
}
