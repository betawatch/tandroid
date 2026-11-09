package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class mh implements wi {
    public final /* synthetic */ di a;

    public mh(di diVar) {
        this.a = diVar;
    }

    @Override // org.telegram.ui.Components.wi
    public final void a(TLRPC.User user, boolean z9, int i7, long j3) {
        org.telegram.ui.cn cnVar = (org.telegram.ui.cn) this.a.W1;
        if (cnVar.u7()) {
            org.telegram.messenger.ez g10 = org.telegram.messenger.ez.g(user, cnVar.j6, cnVar.D5, cnVar.l4, null, null, z9, i7, 0);
            g10.K = cnVar.X8();
            g10.O = 0L;
            g10.L = false;
            g10.Q = j3;
            g10.R = cnVar.i9();
            g10.T = cnVar.w5;
            cnVar.getSendMessagesHelper().r0(g10);
            cnVar.L6();
        }
    }

    @Override // org.telegram.ui.Components.wi
    public final void b(ArrayList arrayList, String str, boolean z9, int i7, long j3, boolean z10) {
        ((org.telegram.ui.cn) this.a.W1).Ib(arrayList, str, z9, i7, j3, z10);
    }
}
