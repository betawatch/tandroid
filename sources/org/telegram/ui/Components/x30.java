package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class x30 extends f40 {
    public final /* synthetic */ r40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x30(r40 r40Var, Context context) {
        super(r40Var, context);
        this.d = r40Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f10) {
        super.setRotationY(f10);
        this.d.invalidate();
    }
}
