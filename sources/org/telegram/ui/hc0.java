package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hc0 extends pf.h0 {
    public boolean i0;
    public final /* synthetic */ tc0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc0(tc0 tc0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, c6Var, false, z10, z11);
        this.j0 = tc0Var;
        this.i0 = true;
    }

    @Override // pf.h0
    public final void K() {
        this.j0.r0(null);
    }

    @Override // pf.h0
    public final void N(ArrayList arrayList) {
        int i10;
        tc0 tc0Var = this.j0;
        MessageObject messageObject = tc0Var.x0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    nc0 nc0Var = (nc0) arrayList.get(i11);
                    if (nc0Var != null && !UserObject.isUserSelf(nc0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.i0 && i10 == 1) {
                tc0Var.e0 = ((nc0) arrayList.get(0)).a;
            }
            this.i0 = false;
            tc0Var.V.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
