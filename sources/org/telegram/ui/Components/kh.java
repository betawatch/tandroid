package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class kh implements vi {
    public final /* synthetic */ bi a;

    public kh(bi biVar) {
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.vi
    public final void a(TLRPC.User user, boolean z10, int i10, long j10) {
        org.telegram.ui.un unVar = (org.telegram.ui.un) this.a.W1;
        if (unVar.r7()) {
            org.telegram.messenger.pz g10 = org.telegram.messenger.pz.g(user, unVar.j6, unVar.D5, unVar.l4, null, null, z10, i10, 0);
            g10.K = unVar.T8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j10;
            g10.R = unVar.e9();
            g10.T = unVar.w5;
            unVar.getSendMessagesHelper().r0(g10);
            unVar.I6();
        }
    }

    @Override // org.telegram.ui.Components.vi
    public final void b(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        ((org.telegram.ui.un) this.a.W1).Ab(arrayList, str, z10, i10, j10, z11);
    }
}
