package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class mh implements wi {
    public final /* synthetic */ di a;

    public mh(di diVar) {
        this.a = diVar;
    }

    @Override // org.telegram.ui.Components.wi
    public final void a(TLRPC.User user, boolean z9, int i7, long j3) {
        org.telegram.ui.an anVar = (org.telegram.ui.an) this.a.W1;
        if (anVar.t7()) {
            org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g(user, anVar.j6, anVar.D5, anVar.l4, null, null, z9, i7, 0);
            g10.K = anVar.W8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = anVar.h9();
            g10.T = anVar.w5;
            anVar.getSendMessagesHelper().r0(g10);
            anVar.K6();
        }
    }

    @Override // org.telegram.ui.Components.wi
    public final void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
        ((org.telegram.ui.an) this.a.W1).Fb(arrayList, str, z9, i7, j3, z10);
    }
}
