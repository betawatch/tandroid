package org.telegram.ui.Components;

import java.io.File;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class qf extends org.telegram.ui.yr0 {
    public boolean a;
    public final /* synthetic */ org.telegram.messenger.ef b;
    public final /* synthetic */ File c;
    public final /* synthetic */ rf d;

    public qf(rf rfVar, org.telegram.messenger.ef efVar, File file) {
        this.d = rfVar;
        this.b = efVar;
        this.c = file;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void G() {
        if (this.a) {
            return;
        }
        try {
            this.c.delete();
        } catch (Throwable unused) {
        }
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean g() {
        return false;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final void o(int i10, org.telegram.messenger.x20 x20Var, boolean z10, int i11, int i12, boolean z11) {
        org.telegram.messenger.jj threadMessage;
        String str;
        org.telegram.ui.un unVar;
        ChatActivityEnterView chatActivityEnterView = this.d.Z1;
        org.telegram.ui.kn knVar = chatActivityEnterView.V2;
        if (knVar != null && (unVar = chatActivityEnterView.P2) != null && knVar.f) {
            unVar.kc();
            return;
        }
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
        org.telegram.messenger.ef efVar = this.b;
        if (efVar.b || (str = efVar.h) == null) {
            String str2 = efVar.I;
            if (str2 != null) {
                pzVar.c = str2;
            }
        } else {
            pzVar.c = str;
        }
        pzVar.e = efVar.c;
        pzVar.p = efVar.d();
        pzVar.o = efVar.b;
        pzVar.q = efVar.i();
        pzVar.z = efVar.m;
        pzVar.A = efVar.P;
        CharSequence charSequence = efVar.a;
        pzVar.d = charSequence != null ? charSequence.toString() : null;
        pzVar.i = efVar.n;
        pzVar.j = efVar.r;
        pzVar.h = efVar.x;
        pzVar.k = x20Var;
        pzVar.r = true;
        arrayList.add(pzVar);
        efVar.e();
        this.a = true;
        boolean h = org.telegram.messenger.qz.h(pzVar.d);
        org.telegram.messenger.c cVar = chatActivityEnterView.R;
        org.telegram.messenger.oj ojVar = null;
        long j10 = chatActivityEnterView.Q2;
        org.telegram.messenger.jj jjVar = chatActivityEnterView.T2;
        threadMessage = chatActivityEnterView.getThreadMessage();
        org.telegram.ui.kn knVar2 = chatActivityEnterView.V2;
        org.telegram.messenger.jj jjVar2 = chatActivityEnterView.Z1;
        org.telegram.ui.un unVar2 = chatActivityEnterView.P2;
        org.telegram.messenger.sw P8 = unVar2 != null ? unVar2.P8() : null;
        long sendMonoForumPeerId = chatActivityEnterView.getSendMonoForumPeerId();
        org.telegram.ui.un unVar3 = chatActivityEnterView.P2;
        if (unVar3 != null) {
            ojVar = unVar3.w5;
        }
        org.telegram.messenger.qz.X(cVar, arrayList, j10, jjVar, threadMessage, null, knVar2, false, false, jjVar2, null, z10, i11, i12, h, null, P8, 0L, false, 0L, sendMonoForumPeerId, ojVar, null, false);
        sf sfVar = chatActivityEnterView.Z2;
        if (sfVar != null) {
            sfVar.E(null, true, i11, i12, 0L);
        }
    }
}
