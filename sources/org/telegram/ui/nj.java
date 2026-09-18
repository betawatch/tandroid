package org.telegram.ui;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class nj implements MessagesStorage.BooleanCallback {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ oj b;

    public nj(oj ojVar, boolean z10) {
        this.b = ojVar;
        this.a = z10;
    }

    @Override // org.telegram.messenger.MessagesStorage.BooleanCallback
    public final void run(boolean z10) {
        bo boVar = this.b.b;
        if (z10) {
            TLRPC.User user = boVar.f;
            boolean z11 = this.a;
            if (user != null || z11) {
                boVar.getMessagesStorage().getMessagesCount(boVar.T5, new mj(1, this, z11));
                return;
            }
        }
        boVar.qa(boVar.d4, z10);
    }
}
