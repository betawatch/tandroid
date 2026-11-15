package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class th implements dj {
    public final /* synthetic */ ki a;

    public th(ki kiVar) {
        this.a = kiVar;
    }

    @Override // org.telegram.ui.Components.dj
    public final void a(TLRPC.User user, boolean z10, int i7, long j3) {
        org.telegram.ui.an anVar = (org.telegram.ui.an) this.a.a2;
        if (anVar.u7()) {
            org.telegram.messenger.cz g10 = org.telegram.messenger.cz.g(user, anVar.k6, anVar.E5, anVar.m4, null, null, z10, i7, 0);
            g10.K = anVar.Y8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = anVar.j9();
            g10.T = anVar.x5;
            anVar.getSendMessagesHelper().r0(g10);
            anVar.L6();
        }
    }

    @Override // org.telegram.ui.Components.dj
    public final void c(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
        ((org.telegram.ui.an) this.a.a2).Jb(arrayList, str, z10, i7, j3, z11);
    }
}
