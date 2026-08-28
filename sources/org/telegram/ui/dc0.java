package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserObject;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class dc0 extends of.p0 {
    public boolean i0;
    public final /* synthetic */ pc0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc0(pc0 pc0Var, Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, boolean z10, boolean z11) {
        super(context, i9, j10, false, b6Var, false, z10, z11);
        this.j0 = pc0Var;
        this.i0 = true;
    }

    @Override // of.p0
    public final void K() {
        this.j0.q0(null);
    }

    @Override // of.p0
    public final void N(ArrayList arrayList) {
        int i9;
        pc0 pc0Var = this.j0;
        MessageObject messageObject = pc0Var.x0;
        if (messageObject != null && messageObject.isLiveLocation()) {
            if (arrayList != null) {
                i9 = 0;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    jc0 jc0Var = (jc0) arrayList.get(i10);
                    if (jc0Var != null && !UserObject.isUserSelf(jc0Var.c)) {
                        i9++;
                    }
                }
            } else {
                i9 = 0;
            }
            if (this.i0 && i9 == 1) {
                pc0Var.e0 = ((jc0) arrayList.get(0)).a;
            }
            this.i0 = false;
            pc0Var.V.setVisibility(i9 != 1 ? 8 : 0);
        }
        super.N(arrayList);
    }
}
