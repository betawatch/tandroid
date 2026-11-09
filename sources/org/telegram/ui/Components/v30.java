package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v30 extends d40 {
    public final /* synthetic */ p40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v30(p40 p40Var, Context context) {
        super(p40Var, context);
        this.d = p40Var;
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
