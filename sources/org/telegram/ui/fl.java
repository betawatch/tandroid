package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fl implements MessagesStorage.IntCallback {
    public final /* synthetic */ bo a;

    public fl(bo boVar) {
        this.a = boVar;
    }

    @Override // org.telegram.messenger.MessagesStorage.IntCallback
    public final void run(int i10) {
        this.a.G9(i10);
    }
}
