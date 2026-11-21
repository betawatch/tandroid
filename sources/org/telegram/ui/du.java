package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class du extends FrameLayout {
    public org.telegram.ui.ActionBar.g2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.ek0 d;
    public di.b1 e;
    public int f;
    public final /* synthetic */ eu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du(eu euVar, Context context) {
        super(context);
        this.h = euVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        du duVar;
        super.setTranslationX(f10);
        eu euVar = this.h;
        du[] duVarArr = euVar.f;
        if (euVar.n && (duVar = duVarArr[0]) == this) {
            euVar.e.i(Math.abs(duVar.getTranslationX()) / duVarArr[0].getMeasuredWidth(), duVarArr[1].f);
        }
    }
}
