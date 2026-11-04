package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sf extends org.telegram.ui.eq0 {
    public boolean a;
    public final /* synthetic */ org.telegram.messenger.ye b;
    public final /* synthetic */ File c;
    public final /* synthetic */ tf d;

    public sf(tf tfVar, org.telegram.messenger.ye yeVar, File file) {
        this.d = tfVar;
        this.b = yeVar;
        this.c = file;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        org.telegram.messenger.zi threadMessage;
        String str;
        org.telegram.ui.wm wmVar;
        ChatActivityEnterView chatActivityEnterView = this.d.a2;
        org.telegram.ui.mm mmVar = chatActivityEnterView.W2;
        if (mmVar != null && (wmVar = chatActivityEnterView.Q2) != null && mmVar.f) {
            wmVar.uc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.xy xyVar = new org.telegram.messenger.xy();
        org.telegram.messenger.ye yeVar = this.b;
        if (yeVar.b || (str = yeVar.h) == null) {
            String str2 = yeVar.I;
            if (str2 != null) {
                xyVar.c = str2;
            }
        } else {
            xyVar.c = str;
        }
        xyVar.e = yeVar.c;
        xyVar.p = yeVar.d();
        xyVar.o = yeVar.b;
        xyVar.q = yeVar.j();
        xyVar.z = yeVar.m;
        xyVar.A = yeVar.P;
        CharSequence charSequence = yeVar.a;
        xyVar.d = charSequence != null ? charSequence.toString() : null;
        xyVar.i = yeVar.n;
        xyVar.j = yeVar.r;
        xyVar.h = yeVar.x;
        xyVar.k = b20Var;
        xyVar.r = true;
        arrayList.add(xyVar);
        yeVar.e();
        this.a = true;
        boolean h = org.telegram.messenger.yy.h(xyVar.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.ej ejVar = null;
        long j10 = chatActivityEnterView.R2;
        org.telegram.messenger.zi ziVar = chatActivityEnterView.U2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.mm mmVar2 = chatActivityEnterView.W2;
        org.telegram.messenger.zi ziVar2 = chatActivityEnterView.a2;
        org.telegram.ui.wm wmVar2 = chatActivityEnterView.Q2;
        org.telegram.messenger.zv W8 = wmVar2 != null ? wmVar2.W8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.wm wmVar3 = chatActivityEnterView.Q2;
        if (wmVar3 != null) {
            ejVar = wmVar3.x5;
        }
        org.telegram.messenger.yy.X(cVar, arrayList, j10, ziVar, threadMessage, null, mmVar2, false, false, ziVar2, null, z10, i10, i11, h, null, W8, 0L, false, 0L, sendMonoForumPeerId, ejVar, null, false);
        uf ufVar = chatActivityEnterView.a3;
        if (ufVar != null) {
            ufVar.G(null, true, i10, i11, 0L);
        }
    }
}
