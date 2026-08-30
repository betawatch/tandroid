package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class oc0 extends tf.h0 {
    public boolean j0;
    public final /* synthetic */ ad0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oc0(ad0 ad0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context, i10, j10, false, f6Var, false, z4, z10);
        this.k0 = ad0Var;
        this.j0 = true;
    }

    @Override // tf.h0
    public final void K() {
        this.k0.r0(null);
    }

    @Override // tf.h0
    public final void N(ArrayList arrayList) {
        int i10;
        ad0 ad0Var = this.k0;
        MessageObject messageObject = ad0Var.y0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    uc0 uc0Var = (uc0) arrayList.get(i11);
                    if (uc0Var != null && !UserObject.isUserSelf(uc0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.j0 && i10 == 1) {
                ad0Var.f0 = ((uc0) arrayList.get(0)).a;
            }
            this.j0 = false;
            ad0Var.W.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
