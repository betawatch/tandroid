package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class di implements mj {
    public final /* synthetic */ ui a;

    public di(ui uiVar) {
        this.a = uiVar;
    }

    @Override // org.telegram.ui.Components.mj
    public final void a(TLRPC.User user, boolean z10, int i7, long j3) {
        org.telegram.ui.bn bnVar = (org.telegram.ui.bn) this.a.a2;
        if (bnVar.u7()) {
            org.telegram.messenger.yy g10 = org.telegram.messenger.yy.g(user, bnVar.l6, bnVar.F5, bnVar.m4, null, null, z10, i7, 0);
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

    @Override // org.telegram.ui.Components.mj
    public final void b(ArrayList arrayList, String str, boolean z10, int i7, long j3, boolean z11) {
        ((org.telegram.ui.bn) this.a.a2).Jb(arrayList, str, z10, i7, j3, z11);
    }
}
