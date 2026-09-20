package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class oh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ai0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ oh0(ai0 ai0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = ai0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ai0 ai0Var = this.b;
                ai0Var.getNotificationCenter().doOnIdle(new oh0(ai0Var, this.c, this.d, 1));
                break;
            default:
                ai0.V(this.b, this.c, this.d);
                break;
        }
    }
}
