package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class kv extends FrameLayout {
    public org.telegram.ui.ActionBar.p2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.sl0 d;
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
