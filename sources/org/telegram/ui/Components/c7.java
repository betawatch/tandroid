package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ c7(c8 c8Var, TLRPC.TL_error tL_error, int i9) {
        this.a = i9;
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
