package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class d10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e10 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ b10 d;
    public final /* synthetic */ TLRPC.TL_error e;

    public /* synthetic */ d10(e10 e10Var, b10 b10Var, TLObject tLObject, TLRPC.TL_error tL_error, int i7) {
        this.a = i7;
        this.b = e10Var;
        this.d = b10Var;
        this.c = tLObject;
        this.e = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        boolean z11;
        switch (this.a) {
            case 0:
                f10 f10Var = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z10 = true;
                } else {
                    f10Var.getClass();
                    z10 = false;
                }
                this.d.a(Boolean.valueOf(z10));
                f10Var.getClass();
                break;
            case 1:
                f10 f10Var2 = this.b.i;
                TLObject tLObject = this.c;
                boolean z12 = tLObject instanceof TLRPC.Updates;
                boolean z13 = false;
                if (z12) {
                    mp.u1(f10Var2.a).V3((TLRPC.Updates) tLObject, false);
                }
                kg.f.a(f10Var2.a).b();
                if (z12 && this.e == null) {
                    z13 = true;
                }
                this.d.a(Boolean.valueOf(z13));
                break;
            default:
                f10 f10Var3 = this.b.i;
                if ((this.c instanceof TLRPC.TL_boolTrue) && this.e == null) {
                    z11 = true;
                } else {
                    f10Var3.getClass();
                    z11 = false;
                }
                this.d.a(Boolean.valueOf(z11));
                f10Var3.getClass();
                break;
        }
    }

    public /* synthetic */ d10(e10 e10Var, TLObject tLObject, b10 b10Var, TLRPC.TL_error tL_error) {
        this.a = 1;
        this.b = e10Var;
        this.c = tLObject;
        this.d = b10Var;
        this.e = tL_error;
    }
}
