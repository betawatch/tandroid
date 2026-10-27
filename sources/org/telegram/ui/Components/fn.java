package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fn implements nl, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ Utilities.Callback a;

    public /* synthetic */ fn(Utilities.Callback callback) {
        this.a = callback;
    }

    @Override // org.telegram.ui.Components.nl
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        this.a.run(new th.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        Utilities.Callback callback = this.a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
