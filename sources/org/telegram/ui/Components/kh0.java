package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class kh0 extends qj0 {
    public final /* synthetic */ sh0 e3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh0(sh0 sh0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.e3 = sh0Var;
    }

    @Override // org.telegram.ui.Components.qj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i7, int i10) {
        sh0 sh0Var = this.e3;
        m90 m90Var = sh0Var.J;
        if (m90Var != null) {
            m90Var.measure(i7, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0));
        }
        super.onMeasure(i7, i10);
        sh0Var.j();
    }
}
