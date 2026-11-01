package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class qf extends org.telegram.ui.xr0 {
    public boolean a;
    public final /* synthetic */ org.telegram.messenger.ff b;
    public final /* synthetic */ File c;
    public final /* synthetic */ rf d;

    public qf(rf rfVar, org.telegram.messenger.ff ffVar, File file) {
        this.d = rfVar;
        this.b = ffVar;
        this.c = file;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        org.telegram.messenger.kj threadMessage;
        String str;
        org.telegram.ui.un unVar;
        ChatActivityEnterView chatActivityEnterView = this.d.Z1;
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        if (knVar != null && (unVar = chatActivityEnterView.P2) != null && knVar.f) {
            unVar.pc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.qz qzVar = new org.telegram.messenger.qz();
        org.telegram.messenger.ff ffVar = this.b;
        if (ffVar.b || (str = ffVar.h) == null) {
            String str2 = ffVar.I;
            if (str2 != null) {
                qzVar.c = str2;
            }
        } else {
            qzVar.c = str;
        }
        qzVar.e = ffVar.c;
        qzVar.p = ffVar.d();
        qzVar.o = ffVar.b;
        qzVar.q = ffVar.i();
        qzVar.z = ffVar.m;
        qzVar.A = ffVar.P;
        CharSequence charSequence = ffVar.a;
        qzVar.d = charSequence != null ? charSequence.toString() : null;
        qzVar.i = ffVar.n;
        qzVar.j = ffVar.r;
        qzVar.h = ffVar.x;
        qzVar.k = y20Var;
        qzVar.r = true;
        arrayList.add(qzVar);
        ffVar.e();
        this.a = true;
        boolean h = org.telegram.messenger.rz.h(qzVar.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.R;
        org.telegram.messenger.pj pjVar = null;
        long j10 = chatActivityEnterView.Q2;
        org.telegram.messenger.kj kjVar = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.kn knVar2 = chatActivityEnterView.V2;
        org.telegram.messenger.kj kjVar2 = chatActivityEnterView.Z1;
        org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
        org.telegram.messenger.tw T8 = unVar2 != null ? unVar2.T8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
        if (unVar3 != null) {
            pjVar = unVar3.w5;
        }
        org.telegram.messenger.rz.X(cVar, arrayList, j10, kjVar, threadMessage, null, knVar2, false, false, kjVar2, null, z10, i11, i12, h, null, T8, 0L, false, 0L, sendMonoForumPeerId, pjVar, null, false);
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.E(null, true, i11, i12, 0L);
        }
    }
}
