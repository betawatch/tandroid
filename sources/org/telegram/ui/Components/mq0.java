package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class mq0 extends ClippingImageView {
    public final /* synthetic */ uj0 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mq0(Context context, sr0 sr0Var) {
        super(context);
        this.S = sr0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
