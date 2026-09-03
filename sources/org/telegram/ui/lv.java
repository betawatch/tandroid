package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class lv extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.rl0 d;
    public lh.e1 e;
    public int f;
    public final /* synthetic */ mv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv(mv mvVar, Context context) {
        super(context);
        this.h = mvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        lv lvVar;
        super.setTranslationX(f10);
        mv mvVar = this.h;
        lv[] lvVarArr = mvVar.f;
        if (mvVar.n && (lvVar = lvVarArr[0]) == this) {
            mvVar.e.j(Math.abs(lvVar.getTranslationX()) / lvVarArr[0].getMeasuredWidth(), lvVarArr[1].f);
        }
    }
}
