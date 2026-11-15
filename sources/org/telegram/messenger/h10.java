package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final /* synthetic */ class h10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i10 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ f10 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ h10(i10 i10Var, f10 f10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = i10Var;
        this.d = f10Var;
        this.c = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                j10 j10Var = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    j10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                j10Var.getClass();
                break;
            case 1:
                j10 j10Var2 = this.b.i;
                TLObject tLObject = this.c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    np.s1(j10Var2.a).O3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(j10Var2.a).b();
                if (z12 && this.e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                break;
            default:
                j10 j10Var3 = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z11 = true;
                } else {
                    j10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                j10Var3.getClass();
                break;
        }
    }

    public /* synthetic */ h10(i10 i10Var, TLObject tLObject, f10 f10Var, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = i10Var;
        this.c = tLObject;
        this.d = f10Var;
        this.e = tL_error;
    }
}
