package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ig extends org.telegram.ui.oq0 {
    public boolean a;
    public final /* synthetic */ org.telegram.messenger.ef b;
    public final /* synthetic */ File c;
    public final /* synthetic */ jg d;

    public ig(jg jgVar, org.telegram.messenger.ef efVar, File file) {
        this.d = jgVar;
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
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        org.telegram.messenger.fj threadMessage;
        String str;
        org.telegram.ui.bn bnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.f2;
        org.telegram.ui.rm rmVar = chatActivityEnterView.J3;
        if (rmVar != null && (bnVar = chatActivityEnterView.D3) != null && rmVar.f) {
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
        yyVar.k = e20Var;
        yyVar.r = true;
        arrayList.add(yyVar);
        efVar.e();
        this.a = true;
        boolean h = org.telegram.messenger.zy.h(yyVar.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.kj kjVar = null;
        long j3 = chatActivityEnterView.E3;
        org.telegram.messenger.fj fjVar = chatActivityEnterView.H3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar2 = chatActivityEnterView.J3;
        org.telegram.messenger.fj fjVar2 = chatActivityEnterView.N2;
        org.telegram.ui.bn bnVar2 = chatActivityEnterView.D3;
        org.telegram.messenger.bw Y8 = bnVar2 != null ? bnVar2.Y8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.bn bnVar3 = chatActivityEnterView.D3;
        if (bnVar3 != null) {
            kjVar = bnVar3.y5;
        }
        org.telegram.messenger.zy.X(cVar, arrayList, j3, fjVar, threadMessage, null, rmVar2, false, false, fjVar2, null, z10, i10, i11, h, null, Y8, 0L, false, 0L, sendMonoForumPeerId, kjVar, null, false);
        kg kgVar = chatActivityEnterView.N3;
        if (kgVar != null) {
            kgVar.H(null, true, i10, i11, 0L);
        }
    }
}
