package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class km implements sk, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ Utilities.Callback a;

    public /* synthetic */ km(Utilities.Callback callback) {
        this.a = callback;
    }

    @Override // org.telegram.ui.Components.sk
    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        this.a.run(new zg.f(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        Utilities.Callback callback = this.a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
