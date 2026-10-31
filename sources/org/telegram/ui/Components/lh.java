package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class lh implements nj {
    public final /* synthetic */ bi a;

    public lh(bi biVar) {
        this.a = biVar;
    }

    @Override // org.telegram.ui.Components.nj
    public final void A() {
        bi biVar = this.a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.A();
            return;
        }
        Object obj = biVar.W1;
        if (obj instanceof nj) {
            ((nj) obj).A();
            return;
        }
        if (obj instanceof org.telegram.ui.ll0) {
            org.telegram.ui.ll0 ll0Var = (org.telegram.ui.ll0) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                ll0Var.startActivityForResult(intent, 21);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.nj
    public final void S() {
        this.a.o1(true);
    }

    @Override // org.telegram.ui.Components.nj
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        bi biVar = this.a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.m(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        Object obj = biVar.W1;
        if (obj instanceof nj) {
            ((nj) obj).m(arrayList, str, arrayList2, arrayList3, z10, i10, j10, z11, j11);
            return;
        }
        if (obj instanceof org.telegram.ui.ll0) {
            org.telegram.ui.ll0 ll0Var = (org.telegram.ui.ll0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.messenger.pz pzVar = new org.telegram.messenger.pz();
                pzVar.c = (String) arrayList.get(i11);
                arrayList4.add(pzVar);
            }
            ll0Var.J1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.nj
    public final void o(ArrayList arrayList, boolean z10, int i10, long j10) {
        bi biVar = this.a;
        nj njVar = biVar.O1;
        if (njVar != null) {
            njVar.o(arrayList, z10, i10, j10);
            return;
        }
        org.telegram.ui.ActionBar.k2 k2Var = biVar.W1;
        if (k2Var instanceof org.telegram.ui.un) {
            ((org.telegram.ui.un) k2Var).o(arrayList, z10, i10, j10);
        } else if (k2Var instanceof org.telegram.ui.ll0) {
            ((org.telegram.ui.ll0) k2Var).J1(arrayList);
        }
    }
}
