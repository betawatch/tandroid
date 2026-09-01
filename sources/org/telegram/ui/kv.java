package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class kv extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.tl0 d;
    public mh.d1 e;
    public int f;
    public final /* synthetic */ lv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv(lv lvVar, Context context) {
        super(context);
        this.h = lvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        kv kvVar;
        super.setTranslationX(f10);
        lv lvVar = this.h;
        kv[] kvVarArr = lvVar.f;
        if (lvVar.n && (kvVar = kvVarArr[0]) == this) {
            lvVar.e.j(Math.abs(kvVar.getTranslationX()) / kvVarArr[0].getMeasuredWidth(), kvVarArr[1].f);
        }
    }
}
