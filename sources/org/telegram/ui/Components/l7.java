package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ l7(m8 m8Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = m8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m8.u(this.b, this.c);
                break;
            case 1:
                m8.y(this.b, this.c);
                break;
            case 2:
                m8.I(this.b, this.c);
                break;
            default:
                m8.J(this.b, this.c);
                break;
        }
    }
}
