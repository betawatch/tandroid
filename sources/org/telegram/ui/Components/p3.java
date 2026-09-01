package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class p3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ m3 b;
    public final /* synthetic */ o3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(Context context, m3 m3Var, o3 o3Var) {
        super(context);
        this.b = m3Var;
        this.c = o3Var;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.a = true;
        Point point = AndroidUtilities.displaySize;
        int i12 = point.x > point.y ? 3 : 5;
        m3 m3Var = this.b;
        m3Var.setItemCount(i12);
        o3 o3Var = this.c;
        o3Var.setItemCount(i12);
        m3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        o3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
        this.a = false;
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
