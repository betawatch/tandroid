package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.va0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class q8 implements RequestDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ va0 b;
    public final /* synthetic */ l9 c;

    public q8(l9 l9Var, long j3, va0 va0Var) {
        this.c = l9Var;
        this.a = j3;
        this.b = va0Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new p8(this, tLObject, this.a, this.b, 1));
    }
}
