package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class bu extends FrameLayout {
    public org.telegram.ui.ActionBar.f2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.k c;
    public org.telegram.ui.Components.qj0 d;
    public bi.q1 e;
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
