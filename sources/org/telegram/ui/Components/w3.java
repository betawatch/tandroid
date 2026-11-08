package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class w3 extends LinearLayout {
    public boolean a;
    public final /* synthetic */ hb0 b;
    public final /* synthetic */ hb0 c;
    public final /* synthetic */ hb0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Context context, hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3) {
        super(context);
        this.b = hb0Var;
        this.c = hb0Var2;
        this.d = hb0Var3;
        this.a = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        this.a = true;
        Point point = org.telegram.messenger.g0.q;
        int i11 = point.x > point.y ? 3 : 5;
        hb0 hb0Var = this.b;
        hb0Var.setItemCount(i11);
        hb0 hb0Var2 = this.c;
        hb0Var2.setItemCount(i11);
        hb0 hb0Var3 = this.d;
        hb0Var3.setItemCount(i11);
        hb0Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        hb0Var2.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        hb0Var3.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
        this.a = false;
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.a) {
            return;
        }
        super.requestLayout();
    }
}
