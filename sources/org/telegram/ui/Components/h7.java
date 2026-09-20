package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ h7(i8 i8Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = i8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                i8.s(this.b, this.c);
                break;
            case 1:
                i8.w(this.b, this.c);
                break;
            case 2:
                i8.H(this.b, this.c);
                break;
            default:
                i8.I(this.b, this.c);
                break;
        }
    }
}
