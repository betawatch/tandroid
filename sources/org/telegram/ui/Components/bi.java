package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bi implements kj {
    public final /* synthetic */ si a;

    public bi(si siVar) {
        this.a = siVar;
    }

    @Override // org.telegram.ui.Components.kj
    public final void a(TLRPC.User user, boolean z10, int i7, long j3) {
        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.a.a2;
        if (bnVar.u7()) {
            org.telegram.messenger.xy g10 = org.telegram.messenger.xy.g(user, bnVar.l6, bnVar.F5, bnVar.m4, null, null, z10, i7, 0);
            g10.K = bnVar.Y8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = bnVar.j9();
            g10.T = bnVar.y5;
            bnVar.getSendMessagesHelper().r0(g10);
            bnVar.L6();
        }
    }

    @Override // org.telegram.ui.Components.kj
    public final void b(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
        ((org.telegram.ui.bn) this.a.a2).Jb(arrayList, str, z10, i7, j3, z11);
    }
}
