package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = j8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j8.s(this.b, this.c);
                break;
            case 1:
                j8.w(this.b, this.c);
                break;
            case 2:
                j8.H(this.b, this.c);
                break;
            default:
                j8.I(this.b, this.c);
                break;
        }
    }
}
