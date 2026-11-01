package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class lh implements nj {
    public final /* synthetic */ bi a;

    public lh(bi biVar) {
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.nj
    public final void B() {
        bi biVar = this.a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.B();
            return;
        }
        Object obj = biVar.W1;
        if (obj instanceof nj) {
            ((nj) obj).B();
            return;
        }
        if (obj instanceof org.telegram.ui.jl0) {
            org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                jl0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.nj
    public final void T() {
        this.a.o1(true);
    }

    @Override // org.telegram.ui.Components.nj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        bi biVar = this.a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.n(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        Object obj = biVar.W1;
        if (obj instanceof nj) {
            ((nj) obj).n(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        if (obj instanceof org.telegram.ui.jl0) {
            org.telegram.ui.jl0 jl0Var = (org.telegram.ui.jl0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.messenger.qz qzVar = new org.telegram.messenger.qz();
                qzVar.c = (String) arrayList.get(i11);
                arrayList4.add(qzVar);
            }
            jl0Var.K1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.nj
    public final void p(ArrayList arrayList, boolean z10, int i10, long j10) {
        bi biVar = this.a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.p(arrayList, z10, i10, j10);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) k2Var).p(arrayList, z10, i10, j10);
        } else if (k2Var instanceof org.telegram.ui.jl0) {
            ((org.telegram.ui.jl0) k2Var).K1(arrayList);
        }
    }
}
