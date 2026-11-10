package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class tf extends org.telegram.ui.qq0 {
    public boolean a;
    public final /* synthetic */ org.telegram.messenger.gf b;
    public final /* synthetic */ File c;
    public final /* synthetic */ uf d;

    public tf(uf ufVar, org.telegram.messenger.gf gfVar, File file) {
        this.d = ufVar;
        this.b = gfVar;
        this.c = file;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.qq0, org.telegram.ui.xq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        org.telegram.messenger.ij threadMessage;
        String str;
        org.telegram.ui.cn cnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.Z1;
        org.telegram.ui.sm smVar = chatActivityEnterView.V2;
        if (smVar != null && (cnVar = chatActivityEnterView.P2) != null && smVar.f) {
            cnVar.xc();
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
        org.telegram.ui.sm smVar2 = chatActivityEnterView.V2;
        org.telegram.messenger.ij ijVar2 = chatActivityEnterView.Z1;
        org.telegram.ui.cn cnVar2 = chatActivityEnterView.P2;
        org.telegram.messenger.hw X8 = cnVar2 != null ? cnVar2.X8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.cn cnVar3 = chatActivityEnterView.P2;
        if (cnVar3 != null) {
            njVar = cnVar3.w5;
        }
        org.telegram.messenger.gz.X(cVar, arrayList, j3, ijVar, threadMessage, null, smVar2, false, false, ijVar2, null, z9, i10, i11, h, null, X8, 0L, false, 0L, sendMonoForumPeerId, njVar, null, false);
        vf vfVar = chatActivityEnterView.Z2;
        if (vfVar != null) {
            vfVar.F(null, true, i10, i11, 0L);
        }
    }
}
