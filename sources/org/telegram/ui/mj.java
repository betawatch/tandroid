package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class mj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ nj b;

    public mj(nj njVar, boolean z10) {
        this.b = njVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        bo boVar = this.b.b;
        if (z10) {
            TLRPC.User user = boVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                boVar.getMessagesStorage().getMessagesCount(boVar.T5, new lj(1, this, z11));
                return;
            }
        }
        boVar.qa(boVar.d4, z10);
    }
}
