package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class av extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.wk0 d;
    public gh.f1 e;
    public int f;
    public final /* synthetic */ bv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(bv bvVar, Context context) {
        super(context);
        this.h = bvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        av avVar;
        super.setTranslationX(f10);
        bv bvVar = this.h;
        av[] avVarArr = bvVar.f;
        if (bvVar.n && (avVar = avVarArr[0]) == this) {
            bvVar.e.j(Math.abs(avVar.getTranslationX()) / avVarArr[0].getMeasuredWidth(), avVarArr[1].f);
        }
    }
}
