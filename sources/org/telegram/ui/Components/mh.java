package org.telegram.ui.Components;

import android.content.Intent;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class mh implements lj {
    public final /* synthetic */ ci a;

    public mh(ci ciVar) {
        this.a = ciVar;
    }

    @Override // org.telegram.ui.Components.lj
    public final void A() {
        ci ciVar = this.a;
        lj ljVar = ciVar.R1;
        if (ljVar != null) {
            ljVar.A();
            return;
        }
        Object obj = ciVar.Z1;
        if (obj instanceof lj) {
            ((lj) obj).A();
            return;
        }
        if (obj instanceof org.telegram.ui.ek0) {
            org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) obj;
            try {
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                intent.setType("*/*");
                ek0Var.startActivityForResult(intent, 21);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.lj
    public final void S() {
        this.a.p1(true);
    }

    @Override // org.telegram.ui.Components.lj
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z9, int i7, long j3, boolean z10, long j10) {
        ci ciVar = this.a;
        lj ljVar = ciVar.R1;
        if (ljVar != null) {
            ljVar.n(arrayList, str, arrayList2, arrayList3, z9, i7, j3, z10, j10);
            return;
        }
        Object obj = ciVar.Z1;
        if (obj instanceof lj) {
            ((lj) obj).n(arrayList, str, arrayList2, arrayList3, z9, i7, j3, z10, j10);
            return;
        }
        if (obj instanceof org.telegram.ui.ek0) {
            org.telegram.ui.ek0 ek0Var = (org.telegram.ui.ek0) obj;
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.fz fzVar = new org.telegram.messenger.fz();
                fzVar.c = (String) arrayList.get(i10);
                arrayList4.add(fzVar);
            }
            ek0Var.K1(arrayList4);
        }
    }

    @Override // org.telegram.ui.Components.lj
    public final void p(ArrayList arrayList, boolean z9, int i7, long j3) {
        ci ciVar = this.a;
        lj ljVar = ciVar.R1;
        if (ljVar != null) {
            ljVar.p(arrayList, z9, i7, j3);
            return;
        }
        org.telegram.ui.ActionBar.f2 f2Var = ciVar.Z1;
        if (f2Var instanceof org.telegram.ui.cn) {
            ((org.telegram.ui.cn) f2Var).p(arrayList, z9, i7, j3);
        } else if (f2Var instanceof org.telegram.ui.ek0) {
            ((org.telegram.ui.ek0) f2Var).K1(arrayList);
        }
    }
}
