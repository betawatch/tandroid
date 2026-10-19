package org.telegram.ui;

import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class kl extends zt0 {
    public final /* synthetic */ qn a;

    public kl(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.ui.zt0, org.telegram.ui.hu0
    public final ju0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        return qn.E1(this.a, messageObject, fileLocation, i10, z10, false);
    }
}
