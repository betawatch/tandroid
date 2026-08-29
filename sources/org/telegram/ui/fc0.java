package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fc0 extends rf.i0 {
    public boolean i0;
    public final /* synthetic */ rc0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(rc0 rc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, c6Var, false, z10, z11);
        this.j0 = rc0Var;
        this.i0 = true;
    }

    @Override // rf.i0
    public final void K() {
        this.j0.r0(null);
    }

    @Override // rf.i0
    public final void N(ArrayList arrayList) {
        int i10;
        rc0 rc0Var = this.j0;
        MessageObject messageObject = rc0Var.x0;
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
            if (this.i0 && i10 == 1) {
                rc0Var.e0 = ((lc0) arrayList.get(0)).a;
            }
            this.i0 = false;
            rc0Var.V.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
