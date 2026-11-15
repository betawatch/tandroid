package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bu extends FrameLayout {
    public org.telegram.ui.ActionBar.e2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.uj0 d;
    public di.c1 e;
    public int f;
    public final /* synthetic */ cu h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(cu cuVar, Context context) {
        super(context);
        this.h = cuVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f10) {
        bu buVar;
        super.setTranslationX(f10);
        cu cuVar = this.h;
        bu[] buVarArr = cuVar.f;
        if (cuVar.n && (buVar = buVarArr[0]) == this) {
            cuVar.e.i(Math.abs(buVar.getTranslationX()) / buVarArr[0].getMeasuredWidth(), buVarArr[1].f);
        }
    }
}
