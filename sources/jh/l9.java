package jh;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class l9 extends zf.r0 {
    public final /* synthetic */ m9 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(m9 m9Var, Context context, float f10) {
        super(context, f10);
        this.M = m9Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        View view = this.M.c;
        if (view != null) {
            view.invalidate();
        }
    }
}
