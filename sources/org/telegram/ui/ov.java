package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class ov extends FrameLayout {
    public org.telegram.ui.ActionBar.o2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.ml0 d;
    public ai.w0 e;
    public int f;
    public final /* synthetic */ pv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov(pv pvVar, Context context) {
        super(context);
        this.h = pvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        ov ovVar;
        super.setTranslationX(f7);
        pv pvVar = this.h;
        ov[] ovVarArr = pvVar.f;
        if (pvVar.n && (ovVar = ovVarArr[0]) == this) {
            pvVar.e.j(Math.abs(ovVar.getTranslationX()) / ovVarArr[0].getMeasuredWidth(), ovVarArr[1].f);
        }
    }
}
