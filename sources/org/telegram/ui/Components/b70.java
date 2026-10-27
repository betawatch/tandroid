package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class b70 extends nm0 {
    public int f3;
    public final /* synthetic */ o70 g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b70(o70 o70Var, Context context) {
        super(context, null);
        this.g3 = o70Var;
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        o70 o70Var = this.g3;
        b70 b70Var = o70Var.V;
        if (this.f3 != View.MeasureSpec.getSize(i11)) {
            this.f3 = View.MeasureSpec.getSize(i11);
            o70Var.a0 = true;
            b70Var.setPadding(0, 0, 0, 0);
            o70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            int measuredHeight = getMeasuredHeight();
            int i12 = this.f3;
            int i13 = (int) ((i12 / 5.0f) * 2.0f);
            if (i13 < AndroidUtilities.dp(60.0f) + (i12 - measuredHeight)) {
                i13 = this.f3 - measuredHeight;
            }
            o70Var.a0 = true;
            b70Var.setPadding(0, i13, 0, 0);
            o70Var.a0 = false;
            measure(i10, View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
        }
        super.onMeasure(i10, i11);
    }

    @Override // org.telegram.ui.Components.nm0, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.g3.a0) {
            return;
        }
        super.requestLayout();
    }
}
