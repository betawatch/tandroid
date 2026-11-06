package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class uf extends org.telegram.ui.mq0 {
    public boolean a;
    public final /* synthetic */ org.telegram.messenger.gf b;
    public final /* synthetic */ File c;
    public final /* synthetic */ vf d;

    public uf(vf vfVar, org.telegram.messenger.gf gfVar, File file) {
        this.d = vfVar;
        this.b = gfVar;
        this.c = file;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        org.telegram.messenger.ij threadMessage;
        String str;
        org.telegram.ui.an anVar;
        ChatActivityEnterView chatActivityEnterView = this.d.Z1;
        org.telegram.ui.qm qmVar = chatActivityEnterView.V2;
        if (qmVar != null && (anVar = chatActivityEnterView.P2) != null && qmVar.f) {
            anVar.uc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
        org.telegram.messenger.gf gfVar = this.b;
        if (gfVar.b || (str = gfVar.h) == null) {
            String str2 = gfVar.I;
            if (str2 != null) {
                fzVar.c = str2;
            }
        } else {
            fzVar.c = str;
        }
        fzVar.e = gfVar.c;
        fzVar.p = gfVar.d();
        fzVar.o = gfVar.b;
        fzVar.q = gfVar.j();
        fzVar.z = gfVar.m;
        fzVar.A = gfVar.P;
        CharSequence charSequence = gfVar.a;
        fzVar.d = charSequence != null ? charSequence.toString() : null;
        fzVar.i = gfVar.n;
        fzVar.j = gfVar.r;
        fzVar.h = gfVar.x;
        fzVar.k = j20Var;
        fzVar.r = true;
        arrayList.add(fzVar);
        gfVar.e();
        this.a = true;
        boolean h = org.telegram.messenger.gz.h(fzVar.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.R;
        org.telegram.messenger.nj njVar = null;
        long j3 = chatActivityEnterView.Q2;
        org.telegram.messenger.ij ijVar = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.qm qmVar2 = chatActivityEnterView.V2;
        org.telegram.messenger.ij ijVar2 = chatActivityEnterView.Z1;
        org.telegram.ui.an anVar2 = chatActivityEnterView.P2;
        org.telegram.messenger.hw W8 = anVar2 != null ? anVar2.W8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.an anVar3 = chatActivityEnterView.P2;
        if (anVar3 != null) {
            njVar = anVar3.w5;
        }
        org.telegram.messenger.gz.X(cVar, arrayList, j3, ijVar, threadMessage, null, qmVar2, false, false, ijVar2, null, z9, i10, i11, h, null, W8, 0L, false, 0L, sendMonoForumPeerId, njVar, null, false);
        wf wfVar = chatActivityEnterView.Z2;
        if (wfVar != null) {
            wfVar.F(null, true, i10, i11, 0L);
        }
    }
}
