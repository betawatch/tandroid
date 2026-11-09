package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ja0 extends jg.r0 {
    public boolean d0;
    public final /* synthetic */ ra0 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ja0(ra0 ra0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, boolean z10) {
        super(context, i7, j3, false, g6Var, false, z9, z10);
        this.e0 = ra0Var;
        this.d0 = true;
    }

    @Override // jg.r0
    public final void J() {
        this.e0.B0(null);
    }

    @Override // jg.r0
    public final void N(ArrayList arrayList) {
        int i7;
        ra0 ra0Var = this.e0;
        org.telegram.messenger.ij ijVar = ra0Var.D0;
        if (ijVar != null && ijVar.C3()) {
            if (arrayList != null) {
                i7 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    na0 na0Var = (na0) arrayList.get(i10);
                    if (na0Var != null && !org.telegram.messenger.t10.B(na0Var.c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.d0 && i7 == 1) {
                ra0Var.p0 = ((na0) arrayList.get(0)).a;
            }
            this.d0 = false;
            ra0Var.V.setVisibility(i7 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
