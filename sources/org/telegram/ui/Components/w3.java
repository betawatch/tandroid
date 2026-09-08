package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ vc0 c;
    public final /* synthetic */ vc0 d;
    public final /* synthetic */ vc0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3(Context context, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, int i10) {
        super(context);
        this.a = i10;
        this.c = vc0Var;
        this.d = vc0Var2;
        this.e = vc0Var3;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                v3 v3Var = (v3) this.e;
                u3 u3Var = (u3) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                vc0 vc0Var = this.c;
                vc0Var.setItemCount(i12);
                u3Var.setItemCount(i12);
                v3Var.setItemCount(i12);
                vc0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                u3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                v3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 1:
                z3 z3Var = (z3) this.e;
                x3 x3Var = (x3) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                vc0 vc0Var2 = this.c;
                vc0Var2.setItemCount(i13);
                x3Var.setItemCount(i13);
                z3Var.setItemCount(i13);
                vc0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                z3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                e4 e4Var = (e4) this.e;
                d4 d4Var = (d4) this.d;
                this.b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i14 = point3.x > point3.y ? 3 : 5;
                vc0 vc0Var3 = this.c;
                vc0Var3.setItemCount(i14);
                d4Var.setItemCount(i14);
                e4Var.setItemCount(i14);
                vc0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                d4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                e4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 3:
                h4 h4Var = (h4) this.e;
                g4 g4Var = (g4) this.d;
                this.b = true;
                Point point4 = AndroidUtilities.displaySize;
                int i15 = point4.x > point4.y ? 3 : 5;
                vc0 vc0Var4 = this.c;
                vc0Var4.setItemCount(i15);
                g4Var.setItemCount(i15);
                h4Var.setItemCount(i15);
                vc0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                g4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                h4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 4:
                l4 l4Var = (l4) this.e;
                k4 k4Var = (k4) this.d;
                this.b = true;
                Point point5 = AndroidUtilities.displaySize;
                int i16 = point5.x > point5.y ? 3 : 5;
                k4Var.setItemCount(i16);
                k4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                l4Var.setItemCount(i16);
                l4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                vc0 vc0Var5 = this.c;
                vc0Var5.setItemCount(i16);
                vc0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                v4 v4Var = (v4) this.e;
                u4 u4Var = (u4) this.d;
                this.b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i17 = point6.x > point6.y ? 3 : 5;
                vc0 vc0Var6 = this.c;
                vc0Var6.setItemCount(i17);
                u4Var.setItemCount(i17);
                v4Var.setItemCount(i17);
                vc0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                u4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                v4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
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
            case 2:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 3:
                if (!this.b) {
                    super.requestLayout();
                    break;
                }
                break;
            case 4:
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(Activity activity, k4 k4Var, l4 l4Var, vc0 vc0Var) {
        super(activity);
        this.a = 4;
        this.d = k4Var;
        this.e = l4Var;
        this.c = vc0Var;
        this.b = false;
    }
}
