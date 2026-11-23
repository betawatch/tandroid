package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class f10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g10 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ d10 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ f10(g10 g10Var, d10 d10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = g10Var;
        this.d = d10Var;
        this.c = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                h10 h10Var = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    h10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                h10Var.getClass();
                break;
            case 1:
                h10 h10Var2 = this.b.i;
                TLObject tLObject = this.c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    np.u1(h10Var2.a).V3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(h10Var2.a).b();
                if (z12 && this.e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                break;
            default:
                h10 h10Var3 = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z11 = true;
                } else {
                    h10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                h10Var3.getClass();
                break;
        }
    }

    public /* synthetic */ f10(g10 g10Var, TLObject tLObject, d10 d10Var, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = g10Var;
        this.c = tLObject;
        this.d = d10Var;
        this.e = tL_error;
    }
}
