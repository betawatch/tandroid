package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class bc0 extends hg.s0 {
    public boolean m0;
    public final /* synthetic */ nc0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc0(nc0 nc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, d6Var, false, z10, z11);
        this.n0 = nc0Var;
        this.m0 = true;
    }

    @Override // hg.s0
    public final void K() {
        this.n0.q0(null);
    }

    @Override // hg.s0
    public final void N(ArrayList arrayList) {
        int i10;
        nc0 nc0Var = this.n0;
        MessageObject messageObject = nc0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    hc0 hc0Var = (hc0) arrayList.get(i11);
                    if (hc0Var != null && !UserObject.isUserSelf(hc0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                nc0Var.i0 = ((hc0) arrayList.get(0)).a;
            }
            this.m0 = false;
            nc0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
