package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tm implements bl, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ Utilities.Callback a;

    public /* synthetic */ tm(Utilities.Callback callback) {
        this.a = callback;
    }

    @Override // org.telegram.ui.Components.bl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        this.a.run(new rh.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        Utilities.Callback callback = this.a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
