package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fc0 extends ig.s0 {
    public boolean m0;
    public final /* synthetic */ rc0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(rc0 rc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, u6Var, false, z10, z11);
        this.n0 = rc0Var;
        this.m0 = true;
    }

    @Override // ig.s0
    public final void K() {
        this.n0.s0(null);
    }

    @Override // ig.s0
    public final void N(ArrayList arrayList) {
        int i10;
        rc0 rc0Var = this.n0;
        MessageObject messageObject = rc0Var.A0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    lc0 lc0Var = (lc0) arrayList.get(i11);
                    if (lc0Var != null && !UserObject.isUserSelf(lc0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                rc0Var.i0 = ((lc0) arrayList.get(0)).a;
            }
            this.m0 = false;
            rc0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
