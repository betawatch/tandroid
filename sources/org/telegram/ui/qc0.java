package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class qc0 extends tf.h0 {
    public boolean j0;
    public final /* synthetic */ cd0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qc0(cd0 cd0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.f6 f6Var, boolean z4, boolean z10) {
        super(context, i10, j10, false, f6Var, false, z4, z10);
        this.k0 = cd0Var;
        this.j0 = true;
    }

    @Override // tf.h0
    public final void K() {
        this.k0.r0(null);
    }

    @Override // tf.h0
    public final void N(ArrayList arrayList) {
        int i10;
        cd0 cd0Var = this.k0;
        MessageObject messageObject = cd0Var.y0;
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
            if (this.j0 && i10 == 1) {
                cd0Var.f0 = ((wc0) arrayList.get(0)).a;
            }
            this.j0 = false;
            cd0Var.W.setVisibility(i10 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
