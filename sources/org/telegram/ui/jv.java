package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class jv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.ml0 d;
    public ai.w0 e;
    public int f;
    public final /* synthetic */ kv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv(kv kvVar, Context context) {
        super(context);
        this.h = kvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        jv jvVar;
        super.setTranslationX(f7);
        kv kvVar = this.h;
        jv[] jvVarArr = kvVar.f;
        if (kvVar.n && (jvVar = jvVarArr[0]) == this) {
            kvVar.e.j(Math.abs(jvVar.getTranslationX()) / jvVarArr[0].getMeasuredWidth(), jvVarArr[1].f);
        }
    }
}
