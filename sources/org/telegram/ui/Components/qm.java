package org.telegram.ui.Components;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qm implements uk, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ Utilities.Callback a;

    public /* synthetic */ qm(Utilities.Callback callback) {
        this.a = callback;
    }

    @Override // org.telegram.ui.Components.uk
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        this.a.run(new eh.g(messageMedia));
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        Utilities.Callback callback = this.a;
        if (callback != null) {
            callback.run(Boolean.FALSE);
        }
    }
}
