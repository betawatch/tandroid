package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
