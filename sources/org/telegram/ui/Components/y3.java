package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class y3 extends LinearLayout {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ ud0 c;
    public final /* synthetic */ ud0 d;
    public final /* synthetic */ ud0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3(Context context, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, int i10) {
        super(context);
        this.a = i10;
        this.c = ud0Var;
        this.d = ud0Var2;
        this.e = ud0Var3;
        this.b = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                x3 x3Var = (x3) this.e;
                w3 w3Var = (w3) this.d;
                this.b = true;
                Point point = AndroidUtilities.displaySize;
                int i12 = point.x > point.y ? 3 : 5;
                ud0 ud0Var = this.c;
                ud0Var.setItemCount(i12);
                w3Var.setItemCount(i12);
                x3Var.setItemCount(i12);
                ud0Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                w3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                x3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i12;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 1:
                b4 b4Var = (b4) this.e;
                z3 z3Var = (z3) this.d;
                this.b = true;
                Point point2 = AndroidUtilities.displaySize;
                int i13 = point2.x > point2.y ? 3 : 5;
                ud0 ud0Var2 = this.c;
                ud0Var2.setItemCount(i13);
                z3Var.setItemCount(i13);
                b4Var.setItemCount(i13);
                ud0Var2.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                z3Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                b4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i13;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 2:
                g4 g4Var = (g4) this.e;
                f4 f4Var = (f4) this.d;
                this.b = true;
                Point point3 = AndroidUtilities.displaySize;
                int i14 = point3.x > point3.y ? 3 : 5;
                ud0 ud0Var3 = this.c;
                ud0Var3.setItemCount(i14);
                f4Var.setItemCount(i14);
                g4Var.setItemCount(i14);
                ud0Var3.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                f4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                g4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i14;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 3:
                j4 j4Var = (j4) this.e;
                i4 i4Var = (i4) this.d;
                this.b = true;
                Point point4 = AndroidUtilities.displaySize;
                int i15 = point4.x > point4.y ? 3 : 5;
                ud0 ud0Var4 = this.c;
                ud0Var4.setItemCount(i15);
                i4Var.setItemCount(i15);
                j4Var.setItemCount(i15);
                ud0Var4.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                i4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                j4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i15;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            case 4:
                n4 n4Var = (n4) this.e;
                m4 m4Var = (m4) this.d;
                this.b = true;
                Point point5 = AndroidUtilities.displaySize;
                int i16 = point5.x > point5.y ? 3 : 5;
                m4Var.setItemCount(i16);
                m4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                n4Var.setItemCount(i16);
                n4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                ud0 ud0Var5 = this.c;
                ud0Var5.setItemCount(i16);
                ud0Var5.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i16;
                this.b = false;
                super.onMeasure(i10, i11);
                break;
            default:
                x4 x4Var = (x4) this.e;
                w4 w4Var = (w4) this.d;
                this.b = true;
                Point point6 = AndroidUtilities.displaySize;
                int i17 = point6.x > point6.y ? 3 : 5;
                ud0 ud0Var6 = this.c;
                ud0Var6.setItemCount(i17);
                w4Var.setItemCount(i17);
                x4Var.setItemCount(i17);
                ud0Var6.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                w4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
                x4Var.getLayoutParams().height = AndroidUtilities.dp(42.0f) * i17;
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
    public y3(Activity activity, m4 m4Var, n4 n4Var, ud0 ud0Var) {
        super(activity);
        this.a = 4;
        this.d = m4Var;
        this.e = n4Var;
        this.c = ud0Var;
        this.b = false;
    }
}
