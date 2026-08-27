package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ c7(b8 b8Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = b8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                b8.t(this.b, this.c);
                break;
            case 1:
                b8.x(this.b, this.c);
                break;
            case 2:
                b8.H(this.b, this.c);
                break;
            default:
                b8.I(this.b, this.c);
                break;
        }
    }
}
