package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ j7(k8 k8Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = k8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k8.t(this.b, this.c);
                break;
            case 1:
                k8.y(this.b, this.c);
                break;
            case 2:
                k8.I(this.b, this.c);
                break;
            default:
                k8.J(this.b, this.c);
                break;
        }
    }
}
