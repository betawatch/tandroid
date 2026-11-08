package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class k10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l10 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ i10 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ k10(l10 l10Var, i10 i10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = l10Var;
        this.d = i10Var;
        this.c = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z9;
        boolean z10;
        switch (this.a) {
            case 0:
                m10 m10Var = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z9 = true;
                } else {
                    m10Var.getClass();
                    z9 = false;
                }
                this.d.a(Boolean.valueOf(z9));
                m10Var.getClass();
                break;
            case 1:
                m10 m10Var2 = this.b.i;
                TLObject tLObject = this.c;
                boolean z11 = tLObject instanceof TLRPC.Updates;
                boolean z12 = false;
                if (z11) {
                    qp.s1(m10Var2.a).O3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(m10Var2.a).b();
                if (z11 && this.e == null) {
                    z12 = true;
                }
                this.d.a(Boolean.valueOf(z12));
                break;
            default:
                m10 m10Var3 = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    m10Var3.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                m10Var3.getClass();
                break;
        }
    }

    public /* synthetic */ k10(l10 l10Var, TLObject tLObject, i10 i10Var, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = l10Var;
        this.c = tLObject;
        this.d = i10Var;
        this.e = tL_error;
    }
}
