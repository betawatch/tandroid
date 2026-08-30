package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class d7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ d7(c8 c8Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = c8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                c8.s(this.b, this.c);
                break;
            case 1:
                c8.w(this.b, this.c);
                break;
            case 2:
                c8.G(this.b, this.c);
                break;
            default:
                c8.H(this.b, this.c);
                break;
        }
    }
}
