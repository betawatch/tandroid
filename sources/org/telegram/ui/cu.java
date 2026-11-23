package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class cu extends FrameLayout {
    public org.telegram.ui.ActionBar.g2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.ek0 d;
    public di.b1 e;
    public int f;
    public final /* synthetic */ du h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cu(du duVar, Context context) {
        super(context);
        this.h = duVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        cu cuVar;
        super.setTranslationX(f10);
        du duVar = this.h;
        cu[] cuVarArr = duVar.f;
        if (duVar.n && (cuVar = cuVarArr[0]) == this) {
            duVar.e.i(Math.abs(cuVar.getTranslationX()) / cuVarArr[0].getMeasuredWidth(), cuVarArr[1].f);
        }
    }
}
