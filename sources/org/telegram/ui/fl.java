package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
