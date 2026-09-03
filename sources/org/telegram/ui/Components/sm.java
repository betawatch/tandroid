package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sm implements wk, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ Utilities.Callback a;

    public /* synthetic */ sm(Utilities.Callback callback) {
        this.a = callback;
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        this.a.run(new fh.g(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Utilities.Callback callback = this.a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
