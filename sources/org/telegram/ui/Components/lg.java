package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class lg extends org.telegram.ui.oq0 {
    public boolean a;
    public final /* synthetic */ org.telegram.messenger.ff b;
    public final /* synthetic */ File c;
    public final /* synthetic */ mg d;

    public lg(mg mgVar, org.telegram.messenger.ff ffVar, File file) {
        this.d = mgVar;
        this.b = ffVar;
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
    public final void o(int i7, org.telegram.messenger.f20 f20Var, boolean z10, int i10, int i11, boolean z11) {
        org.telegram.messenger.gj threadMessage;
        String str;
        org.telegram.ui.bn bnVar;
        ChatActivityEnterView chatActivityEnterView = this.d.f2;
        org.telegram.ui.rm rmVar = chatActivityEnterView.L3;
        if (rmVar != null && (bnVar = chatActivityEnterView.F3) != null && rmVar.f) {
            bnVar.yc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.zy zyVar = new org.telegram.messenger.zy();
        org.telegram.messenger.ff ffVar = this.b;
        if (ffVar.b || (str = ffVar.h) == null) {
            String str2 = ffVar.I;
            if (str2 != null) {
                zyVar.c = str2;
            }
        } else {
            zyVar.c = str;
        }
        zyVar.e = ffVar.c;
        zyVar.p = ffVar.d();
        zyVar.o = ffVar.b;
        zyVar.q = ffVar.j();
        zyVar.z = ffVar.m;
        zyVar.A = ffVar.P;
        CharSequence charSequence = ffVar.a;
        zyVar.d = charSequence != null ? charSequence.toString() : null;
        zyVar.i = ffVar.n;
        zyVar.j = ffVar.r;
        zyVar.h = ffVar.x;
        zyVar.k = f20Var;
        zyVar.r = true;
        arrayList.add(zyVar);
        ffVar.e();
        this.a = true;
        boolean h = org.telegram.messenger.az.h(zyVar.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.lj ljVar = null;
        long j3 = chatActivityEnterView.G3;
        org.telegram.messenger.gj gjVar = chatActivityEnterView.J3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.rm rmVar2 = chatActivityEnterView.L3;
        org.telegram.messenger.gj gjVar2 = chatActivityEnterView.P2;
        org.telegram.ui.bn bnVar2 = chatActivityEnterView.F3;
        org.telegram.messenger.cw Y8 = bnVar2 != null ? bnVar2.Y8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.bn bnVar3 = chatActivityEnterView.F3;
        if (bnVar3 != null) {
            ljVar = bnVar3.y5;
        }
        org.telegram.messenger.az.X(cVar, arrayList, j3, gjVar, threadMessage, null, rmVar2, false, false, gjVar2, null, z10, i10, i11, h, null, Y8, 0L, false, 0L, sendMonoForumPeerId, ljVar, null, false);
        ng ngVar = chatActivityEnterView.P3;
        if (ngVar != null) {
            ngVar.H(null, true, i10, i11, 0L);
        }
    }
}
