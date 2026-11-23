package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class kg extends org.telegram.ui.oq0 {
    public boolean a;
    public final /* synthetic */ org.telegram.messenger.ef b;
    public final /* synthetic */ File c;
    public final /* synthetic */ lg d;

    public kg(lg lgVar, org.telegram.messenger.ef efVar, File file) {
        this.d = lgVar;
        this.b = efVar;
        this.c = file;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.d20 d20Var, boolean z10, int i10, int i11, boolean z11) {
        org.telegram.messenger.fj threadMessage;
        String str;
        org.telegram.ui.bn bnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.f2;
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && (bnVar = chatActivityEnterView.F3) != null && rmVar.f) {
            bnVar.yc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.yy yyVar = new org.telegram.messenger.yy();
        org.telegram.messenger.ef efVar = this.b;
        if (efVar.b || (str = efVar.h) == null) {
            String str2 = efVar.I;
            if (str2 != null) {
                yyVar.c = str2;
            }
        } else {
            yyVar.c = str;
        }
        yyVar.e = efVar.c;
        yyVar.p = efVar.d();
        yyVar.o = efVar.b;
        yyVar.q = efVar.j();
        yyVar.z = efVar.m;
        yyVar.A = efVar.P;
        CharSequence charSequence = efVar.a;
        yyVar.d = charSequence != null ? charSequence.toString() : null;
        yyVar.i = efVar.n;
        yyVar.j = efVar.r;
        yyVar.h = efVar.x;
        yyVar.k = d20Var;
        yyVar.r = true;
        arrayList.add(yyVar);
        efVar.e();
        this.a = true;
        boolean h = org.telegram.messenger.zy.h(yyVar.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.kj kjVar = null;
        long j3 = chatActivityEnterView.G3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar2 = chatActivityEnterView.L3;
        org.telegram.messenger.fj fjVar2 = chatActivityEnterView.P2;
        org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
        org.telegram.messenger.bw Y8 = bnVar2 != null ? bnVar2.Y8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.bn bnVar3 = chatActivityEnterView.F3;
        if (bnVar3 != null) {
            kjVar = bnVar3.y5;
        }
        org.telegram.messenger.zy.X(cVar, arrayList, j3, fjVar, threadMessage, null, rmVar2, false, false, fjVar2, null, z10, i10, i11, h, null, Y8, 0L, false, 0L, sendMonoForumPeerId, kjVar, null, false);
        mg mgVar = chatActivityEnterView.P3;
        if (mgVar != null) {
            mgVar.G(null, true, i10, i11, 0L);
        }
    }
}
