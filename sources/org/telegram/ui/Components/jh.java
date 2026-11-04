package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class jh implements vi {
    public final /* synthetic */ bi a;

    public jh(bi biVar) {
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.vi
    public final void a(TLRPC.User user, boolean z10, int i3, long j10) {
        org.telegram.ui.wm wmVar = (org.telegram.ui.wm) this.a.X1;
        if (wmVar.t7()) {
            org.telegram.messenger.wy g7 = org.telegram.messenger.wy.g(user, wmVar.k6, wmVar.E5, wmVar.m4, null, null, z10, i3, 0);
            g7.K = wmVar.W8();
            g7.O = 0L;
            g7.L = false;
            g7.Q = j10;
            g7.R = wmVar.h9();
            g7.T = wmVar.x5;
            wmVar.getSendMessagesHelper().r0(g7);
            wmVar.K6();
        }
    }

    @Override // org.telegram.ui.Components.vi
    public final void b(ArrayList arrayList, String str, boolean z10, int i3, long j10, boolean z11) {
        ((org.telegram.ui.wm) this.a.X1).Fb(arrayList, str, z10, i3, j10, z11);
    }
}
