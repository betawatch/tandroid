package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class av extends FrameLayout {
    public org.telegram.ui.ActionBar.r2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.nm0 d;
    public bi.r1 e;
    public int f;
    public final /* synthetic */ bv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(bv bvVar, Context context) {
        super(context);
        this.h = bvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        av avVar;
        super.setTranslationX(f7);
        bv bvVar = this.h;
        av[] avVarArr = bvVar.f;
        if (bvVar.n && (avVar = avVarArr[0]) == this) {
            bvVar.e.i(Math.abs(avVar.getTranslationX()) / avVarArr[0].getMeasuredWidth(), avVarArr[1].f);
        }
    }
}
