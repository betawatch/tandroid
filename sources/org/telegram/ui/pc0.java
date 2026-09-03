package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class pc0 extends uf.h0 {
    public boolean j0;
    public final /* synthetic */ bd0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc0(bd0 bd0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var, boolean z4, boolean z10) {
        super(context, i10, j10, false, g6Var, false, z4, z10);
        this.k0 = bd0Var;
        this.j0 = true;
    }

    @Override // uf.h0
    public final void K() {
        this.k0.r0(null);
    }

    @Override // uf.h0
    public final void N(ArrayList arrayList) {
        int i10;
        bd0 bd0Var = this.k0;
        MessageObject messageObject = bd0Var.y0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    vc0 vc0Var = (vc0) arrayList.get(i11);
                    if (vc0Var != null && !UserObject.isUserSelf(vc0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.j0 && i10 == 1) {
                bd0Var.f0 = ((vc0) arrayList.get(0)).a;
            }
            this.j0 = false;
            bd0Var.W.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
