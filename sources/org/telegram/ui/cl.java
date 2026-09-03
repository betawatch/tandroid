package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class cl implements MessagesStorage.IntCallback {
    public final /* synthetic */ xn a;

    public cl(xn xnVar) {
        this.a = xnVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        this.a.G9(i10);
    }
}
