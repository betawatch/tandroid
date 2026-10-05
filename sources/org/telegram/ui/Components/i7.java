package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
                j8.F(this.b, this.c);
                break;
            default:
                j8.G(this.b, this.c);
                break;
        }
    }
}
