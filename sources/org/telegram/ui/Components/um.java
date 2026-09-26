package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class um implements cl, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ Utilities.Callback a;

    public /* synthetic */ um(Utilities.Callback callback) {
        this.a = callback;
    }

    @Override // org.telegram.ui.Components.cl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        this.a.run(new rh.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        Utilities.Callback callback = this.a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
