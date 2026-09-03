package org.telegram.ui;

import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hq0 extends f2.v {
    public final /* synthetic */ mq0 c;

    public hq0(mq0 mq0Var) {
        this.c = mq0Var;
    }

    @Override // f2.v
    public final int i(int i10) {
        mq0 mq0Var = this.c;
        if (mq0Var.I.j(i10) == 1 || mq0Var.V || (mq0Var.G == null && TextUtils.isEmpty(mq0Var.v))) {
            return mq0Var.J.J;
        }
        int i11 = mq0Var.O;
        int i12 = mq0Var.d0;
        return i11 + (i10 % i12 != i12 - 1 ? AndroidUtilities.dp(2.0f) : 0);
    }
}
