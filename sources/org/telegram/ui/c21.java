package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c21 implements View.OnLongClickListener {
    public final /* synthetic */ TLRPC.TL_authorization a;
    public final /* synthetic */ i21 b;

    public c21(i21 i21Var, TLRPC.TL_authorization tL_authorization) {
        this.b = i21Var;
        this.a = tL_authorization;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        i21.I0(this.b, this.a.country);
        return true;
    }
}
