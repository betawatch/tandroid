package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class bv extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.mm0 d;
    public ai.u1 e;
    public int f;
    public final /* synthetic */ cv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(cv cvVar, Context context) {
        super(context);
        this.h = cvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        bv bvVar;
        super.setTranslationX(f7);
        cv cvVar = this.h;
        bv[] bvVarArr = cvVar.f;
        if (cvVar.n && (bvVar = bvVarArr[0]) == this) {
            cvVar.e.i(Math.abs(bvVar.getTranslationX()) / bvVarArr[0].getMeasuredWidth(), bvVarArr[1].f);
        }
    }
}
