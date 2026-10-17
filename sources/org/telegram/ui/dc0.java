package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class dc0 extends hg.s0 {
    public boolean m0;
    public final /* synthetic */ pc0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(pc0 pc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, d6Var, false, z10, z11);
        this.n0 = pc0Var;
        this.m0 = true;
    }

    @Override // hg.s0
    public final void K() {
        this.n0.q0(null);
    }

    @Override // hg.s0
    public final void N(ArrayList arrayList) {
        int i10;
        pc0 pc0Var = this.n0;
        MessageObject messageObject = pc0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    jc0 jc0Var = (jc0) arrayList.get(i11);
                    if (jc0Var != null && !UserObject.isUserSelf(jc0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                pc0Var.i0 = ((jc0) arrayList.get(0)).a;
            }
            this.m0 = false;
            pc0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
