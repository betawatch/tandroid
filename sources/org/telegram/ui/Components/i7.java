package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8 b;
    public final /* synthetic */ TLRPC.TL_error c;

    public /* synthetic */ i7(j8 j8Var, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = j8Var;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j8.s(this.b, this.c);
                break;
            case 1:
                j8.w(this.b, this.c);
                break;
            case 2:
                j8.H(this.b, this.c);
                break;
            default:
                j8.I(this.b, this.c);
                break;
        }
    }
}
