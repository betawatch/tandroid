package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ h8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ g7(h8 h8Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = h8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h8.s(this.b, this.c);
                break;
            case 1:
                h8.w(this.b, this.c);
                break;
            case 2:
                h8.H(this.b, this.c);
                break;
            default:
                h8.I(this.b, this.c);
                break;
        }
    }
}
