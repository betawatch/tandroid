package org.telegram.ui.Components;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a50 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ c50 b;

    public /* synthetic */ a50(c50 c50Var, int i3) {
        this.a = i3;
        this.b = c50Var;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.h3(new e7((Object) this.b, (Object) tL_error, (Object) tLObject, 13));
                break;
            default:
                org.telegram.messenger.g0.h3(new cl(29, this.b, tL_error));
                break;
        }
    }
}
