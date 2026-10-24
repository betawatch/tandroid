package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class gc0 extends hg.s0 {
    public boolean m0;
    public final /* synthetic */ sc0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc0(sc0 sc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, g6Var, false, z10, z11);
        this.n0 = sc0Var;
        this.m0 = true;
    }

    @Override // hg.s0
    public final void K() {
        this.n0.r0(null);
    }

    @Override // hg.s0
    public final void N(ArrayList arrayList) {
        int i10;
        sc0 sc0Var = this.n0;
        MessageObject messageObject = sc0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    mc0 mc0Var = (mc0) arrayList.get(i11);
                    if (mc0Var != null && !UserObject.isUserSelf(mc0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                sc0Var.i0 = ((mc0) arrayList.get(0)).a;
            }
            this.m0 = false;
            sc0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
