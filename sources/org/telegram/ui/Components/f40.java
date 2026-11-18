package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class f40 extends n40 {
    public final /* synthetic */ z40 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(z40 z40Var, Context context) {
        super(z40Var, context);
        this.d = z40Var;
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
