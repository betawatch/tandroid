package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.qm0 d;
    public ai.w0 e;
    public int f;
    public final /* synthetic */ mv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(mv mvVar, Context context) {
        super(context);
        this.h = mvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        lv lvVar;
        super.setTranslationX(f7);
        mv mvVar = this.h;
        lv[] lvVarArr = mvVar.f;
        if (mvVar.n && (lvVar = lvVarArr[0]) == this) {
            mvVar.e.j(Math.abs(lvVar.getTranslationX()) / lvVarArr[0].getMeasuredWidth(), lvVarArr[1].f);
        }
    }
}
