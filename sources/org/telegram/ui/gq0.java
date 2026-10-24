package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class gq0 extends g.o {
    public final /* synthetic */ mq0 c;

    public gq0(mq0 mq0Var) {
        this.c = mq0Var;
    }

    @Override // g.o
    public final int i(int i10) {
        mq0 mq0Var = this.c;
        if (mq0Var.L.j(i10) == 1 || mq0Var.Y || (mq0Var.J == null && TextUtils.isEmpty(mq0Var.v))) {
            return mq0Var.M.J;
        }
        int i11 = mq0Var.R;
        int i12 = mq0Var.g0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
