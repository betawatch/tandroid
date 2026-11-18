package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class du extends FrameLayout {
    public org.telegram.ui.ActionBar.h2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.ck0 d;
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
