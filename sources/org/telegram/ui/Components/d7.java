package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
