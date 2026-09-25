package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class q71 implements View.OnLongClickListener {
    public final /* synthetic */ TLRPC.TL_authorization a;
    public final /* synthetic */ x71 b;

    public q71(x71 x71Var, TLRPC.TL_authorization tL_authorization) {
        this.b = x71Var;
        this.a = tL_authorization;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        x71.m(this.b, this.a.country);
        return true;
    }
}
