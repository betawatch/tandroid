package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class dv extends FrameLayout {
    public org.telegram.ui.ActionBar.n2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.zk0 d;
    public hh.f1 e;
    public int f;
    public final /* synthetic */ ev h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv(ev evVar, Context context) {
        super(context);
        this.h = evVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        dv dvVar;
        super.setTranslationX(f10);
        ev evVar = this.h;
        dv[] dvVarArr = evVar.f;
        if (evVar.n && (dvVar = dvVarArr[0]) == this) {
            evVar.e.j(Math.abs(dvVar.getTranslationX()) / dvVarArr[0].getMeasuredWidth(), dvVarArr[1].f);
        }
    }
}
