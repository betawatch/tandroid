package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class ag extends org.telegram.ui.mq0 {
    public boolean a;
    public final /* synthetic */ org.telegram.messenger.ff b;
    public final /* synthetic */ File c;
    public final /* synthetic */ bg d;

    public ag(bg bgVar, org.telegram.messenger.ff ffVar, File file) {
        this.d = bgVar;
        this.b = ffVar;
        this.c = file;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        org.telegram.messenger.gj threadMessage;
        String str;
        org.telegram.ui.an anVar;
        ChatActivityEnterView chatActivityEnterView = this.d.f2;
        org.telegram.ui.qm qmVar = chatActivityEnterView.D3;
        if (qmVar != null && (anVar = chatActivityEnterView.x3) != null && qmVar.f) {
            anVar.yc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.dz dzVar = new org.telegram.messenger.dz();
        org.telegram.messenger.ff ffVar = this.b;
        if (ffVar.b || (str = ffVar.h) == null) {
            String str2 = ffVar.I;
            if (str2 != null) {
                dzVar.c = str2;
            }
        } else {
            dzVar.c = str;
        }
        dzVar.e = ffVar.c;
        dzVar.p = ffVar.d();
        dzVar.o = ffVar.b;
        dzVar.q = ffVar.j();
        dzVar.z = ffVar.m;
        dzVar.A = ffVar.P;
        CharSequence charSequence = ffVar.a;
        dzVar.d = charSequence != null ? charSequence.toString() : null;
        dzVar.i = ffVar.n;
        dzVar.j = ffVar.r;
        dzVar.h = ffVar.x;
        dzVar.k = g20Var;
        dzVar.r = true;
        arrayList.add(dzVar);
        ffVar.e();
        this.a = true;
        boolean h = org.telegram.messenger.ez.h(dzVar.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.S;
        org.telegram.messenger.lj ljVar = null;
        long j3 = chatActivityEnterView.y3;
        org.telegram.messenger.gj gjVar = chatActivityEnterView.B3;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.qm qmVar2 = chatActivityEnterView.D3;
        org.telegram.messenger.gj gjVar2 = chatActivityEnterView.H2;
        org.telegram.ui.an anVar2 = chatActivityEnterView.x3;
        org.telegram.messenger.fw Y8 = anVar2 != null ? anVar2.Y8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.an anVar3 = chatActivityEnterView.x3;
        if (anVar3 != null) {
            ljVar = anVar3.x5;
        }
        org.telegram.messenger.ez.X(cVar, arrayList, j3, gjVar, threadMessage, null, qmVar2, false, false, gjVar2, null, z10, i10, i11, h, null, Y8, 0L, false, 0L, sendMonoForumPeerId, ljVar, null, false);
        cg cgVar = chatActivityEnterView.H3;
        if (cgVar != null) {
            cgVar.M(null, true, i10, i11, 0L);
        }
    }
}
