package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class bd0 extends hg.s0 {
    public boolean m0;
    public final /* synthetic */ nd0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bd0(nd0 nd0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, c6Var, false, z10, z11);
        this.n0 = nd0Var;
        this.m0 = true;
    }

    @Override // hg.s0
    public final void K() {
        this.n0.q0(null);
    }

    @Override // hg.s0
    public final void N(ArrayList arrayList) {
        int i10;
        nd0 nd0Var = this.n0;
        MessageObject messageObject = nd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    hd0 hd0Var = (hd0) arrayList.get(i11);
                    if (hd0Var != null && !UserObject.isUserSelf(hd0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                nd0Var.i0 = ((hd0) arrayList.get(0)).a;
            }
            this.m0 = false;
            nd0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
