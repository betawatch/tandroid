package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c4 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ ac0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c4(Context context, ac0 ac0Var, int i10) {
        super(context);
        this.a = i10;
        this.c = ac0Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                b4 b4Var = (b4) this.c;
                this.b = true;
                Point point = org.telegram.messenger.i0.q;
                int i12 = point.x > point.y ? 3 : 5;
                b4Var.setItemCount(i12);
                b4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 1:
                g4 g4Var = (g4) this.c;
                this.b = true;
                Point point2 = org.telegram.messenger.i0.q;
                int i13 = point2.x > point2.y ? 3 : 5;
                g4Var.setItemCount(i13);
                g4Var.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                this.b = true;
                this.c.getLayoutParams().height = org.telegram.messenger.i0.L(42.0f) * 8;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.a) {
            case 0:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 1:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }
}
