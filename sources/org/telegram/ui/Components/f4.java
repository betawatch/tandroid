package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class f4 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ hb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f4(Context context, hb0 hb0Var, int i7) {
        super(context);
        this.a = i7;
        this.c = hb0Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                e4 e4Var = (e4) this.c;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                e4Var.setItemCount(i11);
                e4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            case 1:
                j4 j4Var = (j4) this.c;
                this.b = true;
                Point point2 = org.telegram.messenger.g0.q;
                int i12 = point2.x > point2.y ? 3 : 5;
                j4Var.setItemCount(i12);
                j4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            default:
                this.b = true;
                this.c.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * 8;
                this.b = false;
                super.onMeasure(i7, i10);
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
