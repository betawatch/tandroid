package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class jv extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.sl0 d;
    public lh.e1 e;
    public int f;
    public final /* synthetic */ kv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(kv kvVar, Context context) {
        super(context);
        this.h = kvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        jv jvVar;
        super.setTranslationX(f10);
        kv kvVar = this.h;
        jv[] jvVarArr = kvVar.f;
        if (kvVar.n && (jvVar = jvVarArr[0]) == this) {
            kvVar.e.j(Math.abs(jvVar.getTranslationX()) / jvVarArr[0].getMeasuredWidth(), jvVarArr[1].f);
        }
    }
}
