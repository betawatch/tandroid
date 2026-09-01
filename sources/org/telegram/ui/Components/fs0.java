package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class fs0 extends ClippingImageView {
    public final /* synthetic */ tl0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(Context context, qt0 qt0Var) {
        super(context);
        this.O = qt0Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.O.invalidate();
    }
}
