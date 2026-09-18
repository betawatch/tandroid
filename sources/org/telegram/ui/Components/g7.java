package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
