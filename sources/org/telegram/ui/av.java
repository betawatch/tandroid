package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class av extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.im0 d;
    public ai.u1 e;
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
            bvVar.e.j(Math.abs(avVar.getTranslationX()) / avVarArr[0].getMeasuredWidth(), avVarArr[1].f);
        }
    }
}
