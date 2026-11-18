package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class l4 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ sb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l4(Context context, sb0 sb0Var, int i7) {
        super(context);
        this.a = i7;
        this.c = sb0Var;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        switch (this.a) {
            case 0:
                k4 k4Var = (k4) this.c;
                this.b = true;
                Point point = org.telegram.messenger.g0.q;
                int i11 = point.x > point.y ? 3 : 5;
                k4Var.setItemCount(i11);
                k4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i11;
                this.b = false;
                super.onMeasure(i7, i10);
                break;
            default:
                p4 p4Var = (p4) this.c;
                this.b = true;
                Point point2 = org.telegram.messenger.g0.q;
                int i12 = point2.x > point2.y ? 3 : 5;
                p4Var.setItemCount(i12);
                p4Var.getLayoutParams().height = org.telegram.messenger.g0.L(42.0f) * i12;
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
            default:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
        }
    }
}
