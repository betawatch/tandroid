package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class qc0 extends gg.t0 {
    public boolean m0;
    public final /* synthetic */ cd0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc0(cd0 cd0Var, Context context, int i10, long j3, org.telegram.ui.ActionBar.d6 d6Var, boolean z10, boolean z11) {
        super(context, i10, j3, false, d6Var, false, z10, z11);
        this.n0 = cd0Var;
        this.m0 = true;
    }

    @Override // gg.t0
    public final void K() {
        this.n0.r0(null);
    }

    @Override // gg.t0
    public final void N(ArrayList arrayList) {
        int i10;
        cd0 cd0Var = this.n0;
        MessageObject messageObject = cd0Var.B0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    wc0 wc0Var = (wc0) arrayList.get(i11);
                    if (wc0Var != null && !UserObject.isUserSelf(wc0Var.c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                cd0Var.i0 = ((wc0) arrayList.get(0)).a;
            }
            this.m0 = false;
            cd0Var.Z.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
