package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class bv extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.l c;
    public org.telegram.ui.Components.jl0 d;
    public jh.e1 e;
    public int f;
    public final /* synthetic */ cv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(cv cvVar, Context context) {
        super(context);
        this.h = cvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f9) {
        bv bvVar;
        super.setTranslationX(f9);
        cv cvVar = this.h;
        bv[] bvVarArr = cvVar.f;
        if (cvVar.n && (bvVar = bvVarArr[0]) == this) {
            cvVar.e.j(Math.abs(bvVar.getTranslationX()) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f);
        }
    }
}
