package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class cl implements MessagesStorage.IntCallback {
    public final /* synthetic */ yn a;

    public cl(yn ynVar) {
        this.a = ynVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        this.a.F9(i10);
    }
}
