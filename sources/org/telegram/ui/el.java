package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class el extends rt0 {
    public final /* synthetic */ qn a;

    public el(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.rt0, org.telegram.ui.zt0
    public final bu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i9, boolean z10, boolean z11) {
        return qn.A1(this.a, messageObject, fileLocation, i9, z10, false);
    }
}
