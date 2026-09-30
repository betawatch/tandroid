package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class iv extends FrameLayout {
    public org.telegram.ui.ActionBar.m2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.yl0 d;
    public ai.w0 e;
    public int f;
    public final /* synthetic */ jv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iv(jv jvVar, Context context) {
        super(context);
        this.h = jvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        iv ivVar;
        super.setTranslationX(f7);
        jv jvVar = this.h;
        iv[] ivVarArr = jvVar.f;
        if (jvVar.n && (ivVar = ivVarArr[0]) == this) {
            jvVar.e.j(Math.abs(ivVar.getTranslationX()) / ivVarArr[0].getMeasuredWidth(), ivVarArr[1].f);
        }
    }
}
