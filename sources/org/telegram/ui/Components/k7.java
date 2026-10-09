package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ k7(l8 l8Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = l8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l8.u(this.b, this.c);
                break;
            case 1:
                l8.y(this.b, this.c);
                break;
            case 2:
                l8.I(this.b, this.c);
                break;
            default:
                l8.J(this.b, this.c);
                break;
        }
    }
}
